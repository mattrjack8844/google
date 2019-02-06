/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.data.v2.models;

import static com.google.common.truth.Truth.assertThat;

import com.google.bigtable.v2.Cell;
import com.google.bigtable.v2.Column;
import com.google.bigtable.v2.Family;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.ByteString;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RowTest {

  @Test
  public void compareTest() {
    Row row1 =
        Row.create(
            ByteString.copyFromUtf8("key1"),
            ImmutableList.of(
                RowCell.create(
                    "family",
                    ByteString.EMPTY,
                    1000,
                    ImmutableList.<String>of(),
                    ByteString.copyFromUtf8("value"))));
    Row row2 =
        Row.create(
            ByteString.copyFromUtf8("key2"),
            ImmutableList.of(
                RowCell.create(
                    "family",
                    ByteString.EMPTY,
                    1000,
                    ImmutableList.<String>of(),
                    ByteString.copyFromUtf8("value"))));
    Row row2b =
        Row.create(
            ByteString.copyFromUtf8("key2"),
            ImmutableList.of(
                RowCell.create(
                    "family2",
                    ByteString.EMPTY,
                    1000,
                    ImmutableList.<String>of(),
                    ByteString.copyFromUtf8("value"))));

    assertThat(Row.compareByKey().compare(row1, row2)).isEqualTo(-1);
    assertThat(Row.compareByKey().compare(row2, row1)).isEqualTo(1);

    // Comparator only cares about row keys
    assertThat(Row.compareByKey().compare(row2, row2b)).isEqualTo(0);
  }

  @Test
  public void serializationTest() throws IOException, ClassNotFoundException {
    Row expected =
        Row.create(
            ByteString.copyFromUtf8("key1"),
            ImmutableList.of(
                RowCell.create(
                    "family",
                    ByteString.EMPTY,
                    1000,
                    ImmutableList.<String>of(),
                    ByteString.copyFromUtf8("value"))));

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(expected);
    oos.close();

    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
    assertThat(ois.readObject()).isEqualTo(expected);
  }

  @Test
  public void getFamilyCellsTest() {
    ByteString col1 = ByteString.copyFromUtf8("col1");
    ByteString col2 = ByteString.copyFromUtf8("col2");

    List<String> labels = ImmutableList.of();
    ByteString value = ByteString.EMPTY;

    Row row =
        Row.create(
            ByteString.copyFromUtf8("ignored-key"),
            ImmutableList.of(
                RowCell.create("family1", col1, 1_000, labels, value),
                RowCell.create("family1", col2, 1_000, labels, value),
                RowCell.create("family2", col1, 1_000, labels, value),
                RowCell.create("family4", col1, 1_000, labels, value)));

    assertThat(row.getCells("family1"))
        .containsExactly(
            RowCell.create("family1", col1, 1_000, labels, value),
            RowCell.create("family1", col2, 1_000, labels, value))
        .inOrder();

    assertThat(row.getCells("family2"))
        .containsExactly(RowCell.create("family2", col1, 1_000, labels, value));

    assertThat(row.getCells("family3")).isEmpty();

    assertThat(row.getCells("family4"))
        .containsExactly(RowCell.create("family4", col1, 1_000, labels, value));
  }

  @Test
  public void getQualifierCellsTest() {
    ByteString col1 = ByteString.copyFromUtf8("col1");
    ByteString col2 = ByteString.copyFromUtf8("col2");

    List<String> labels = ImmutableList.of();
    ByteString value = ByteString.EMPTY;

    Row row =
        Row.create(
            ByteString.copyFromUtf8("ignored-key"),
            ImmutableList.of(
                RowCell.create("family1", col1, 1_000, labels, value),
                RowCell.create("family1", col2, 2_000, labels, value),
                RowCell.create("family1", col2, 1_000, labels, value),
                RowCell.create("family2", col1, 1_000, labels, value),
                RowCell.create("family4", col1, 1_000, labels, value)));

    assertThat(row.getCells("family1", col1))
        .containsExactly(RowCell.create("family1", col1, 1_000, labels, value));

    assertThat(row.getCells("family1", col2))
        .containsExactly(
            RowCell.create("family1", col2, 1_000, labels, value),
            RowCell.create("family1", col2, 2_000, labels, value));

    assertThat(row.getCells("family2", col1))
        .containsExactly(RowCell.create("family2", col1, 1_000, labels, value));

    assertThat(row.getCells("family2", col2)).isEmpty();

    assertThat(row.getCells("family3", col1)).isEmpty();
    assertThat(row.getCells("family3", col2)).isEmpty();

    assertThat(row.getCells("family4", col1))
        .containsExactly(RowCell.create("family4", col1, 1_000, labels, value));
  }

  @Test
  public void testFromProtoWithEmptyRow() {
    com.google.bigtable.v2.Row rowProto = com.google.bigtable.v2.Row.getDefaultInstance();
    Row row = Row.fromProto(rowProto);
    assertThat(row.getKey()).isEqualTo(ByteString.EMPTY);
    assertThat(row.getCells()).isEmpty();
  }

  @Test
  public void testFromProto() {
    ByteString rowKey = ByteString.copyFromUtf8("test-key");
    ByteString qualifier1 = ByteString.copyFromUtf8("qualifier1");
    ByteString qualifier2 = ByteString.copyFromUtf8("qualifier2");
    ByteString value = ByteString.copyFromUtf8("test-value");
    String family1 = "firstFamily";
    String family2 = "secondFamily";
    String label = "label";

    com.google.bigtable.v2.Row rowProto =
        com.google.bigtable.v2.Row.newBuilder()
            .setKey(rowKey)
            .addFamilies(
                Family.newBuilder()
                    .setName(family2)
                    .addColumns(
                        Column.newBuilder()
                            .setQualifier(qualifier1)
                            .addCells(
                                Cell.newBuilder()
                                    .setValue(value)
                                    .setTimestampMicros(98765)
                                    .addLabels(label)
                                    .build())
                            .build()))
            .addFamilies(
                Family.newBuilder()
                    .setName(family1)
                    .addColumns(
                        Column.newBuilder()
                            .setQualifier(qualifier1)
                            .addCells(
                                Cell.newBuilder()
                                    .setValue(value)
                                    .setTimestampMicros(12345)
                                    .addLabels(label)
                                    .build())
                            .build())
                    .addColumns(
                        Column.newBuilder()
                            .setQualifier(qualifier2)
                            .addCells(
                                Cell.newBuilder()
                                    .setValue(value)
                                    .setTimestampMicros(54321)
                                    .addLabels(label)
                                    .build())
                            .build())
                    .build())
            .build();
    Row row = Row.fromProto(rowProto);

    List<String> labels = ImmutableList.of(label);
    assertThat(row.getKey()).isEqualTo(rowKey);
    assertThat(row.getCells(family1))
        .containsExactly(
            RowCell.create(family1, qualifier1, 12345, labels, value),
            RowCell.create(family1, qualifier2, 54321, labels, value));
    assertThat(row.getCells(family2))
        .containsExactly(RowCell.create(family2, qualifier1, 98765, labels, value));
  }
}
