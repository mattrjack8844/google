// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2;

public interface RatingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.Rating)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The total number of ratings. This value is independent of the value of
   * [rating_histogram][google.cloud.retail.v2.Rating.rating_histogram].
   *
   * This value must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>int32 rating_count = 1;</code>
   * @return The ratingCount.
   */
  int getRatingCount();

  /**
   * <pre>
   * The average rating of the [Product][google.cloud.retail.v2.Product].
   *
   * The rating is scaled at 1-5. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>float average_rating = 2;</code>
   * @return The averageRating.
   */
  float getAverageRating();

  /**
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   * @return A list containing the ratingHistogram.
   */
  java.util.List<java.lang.Integer> getRatingHistogramList();
  /**
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   * @return The count of ratingHistogram.
   */
  int getRatingHistogramCount();
  /**
   * <pre>
   * List of rating counts per rating value (index = rating - 1). The list is
   * empty if there is no rating. If the list is non-empty, its size is
   * always 5. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * For example, [41, 14, 13, 47, 303]. It means that the
   * [Product][google.cloud.retail.v2.Product] got 41 ratings with 1 star, 14
   * ratings with 2 star, and so on.
   * </pre>
   *
   * <code>repeated int32 rating_histogram = 3;</code>
   * @param index The index of the element to return.
   * @return The ratingHistogram at the given index.
   */
  int getRatingHistogram(int index);
}
