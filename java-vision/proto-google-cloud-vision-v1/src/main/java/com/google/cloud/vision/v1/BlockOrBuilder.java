// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/text_annotation.proto

package com.google.cloud.vision.v1;

public interface BlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.Block)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Additional information detected for the block.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  boolean hasProperty();
  /**
   * <pre>
   * Additional information detected for the block.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1.TextAnnotation.TextProperty getProperty();
  /**
   * <pre>
   * Additional information detected for the block.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   * <pre>
   * The bounding box for the block.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   * * when the text is horizontal it might look like:
   *         0----1
   *         |    |
   *         3----2
   * * when it's rotated 180 degrees around the top-left corner it becomes:
   *         2----3
   *         |    |
   *         1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  boolean hasBoundingBox();
  /**
   * <pre>
   * The bounding box for the block.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   * * when the text is horizontal it might look like:
   *         0----1
   *         |    |
   *         3----2
   * * when it's rotated 180 degrees around the top-left corner it becomes:
   *         2----3
   *         |    |
   *         1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1.BoundingPoly getBoundingBox();
  /**
   * <pre>
   * The bounding box for the block.
   * The vertices are in the order of top-left, top-right, bottom-right,
   * bottom-left. When a rotation of the bounding box is detected the rotation
   * is represented as around the top-left corner as defined when the text is
   * read in the 'natural' orientation.
   * For example:
   * * when the text is horizontal it might look like:
   *         0----1
   *         |    |
   *         3----2
   * * when it's rotated 180 degrees around the top-left corner it becomes:
   *         2----3
   *         |    |
   *         1----0
   *   and the vertice order will still be (0, 1, 2, 3).
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_box = 2;</code>
   */
  com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingBoxOrBuilder();

  /**
   * <pre>
   * List of paragraphs in this block (if this blocks is of type text).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Paragraph paragraphs = 3;</code>
   */
  java.util.List<com.google.cloud.vision.v1.Paragraph> 
      getParagraphsList();
  /**
   * <pre>
   * List of paragraphs in this block (if this blocks is of type text).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Paragraph paragraphs = 3;</code>
   */
  com.google.cloud.vision.v1.Paragraph getParagraphs(int index);
  /**
   * <pre>
   * List of paragraphs in this block (if this blocks is of type text).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Paragraph paragraphs = 3;</code>
   */
  int getParagraphsCount();
  /**
   * <pre>
   * List of paragraphs in this block (if this blocks is of type text).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Paragraph paragraphs = 3;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.ParagraphOrBuilder> 
      getParagraphsOrBuilderList();
  /**
   * <pre>
   * List of paragraphs in this block (if this blocks is of type text).
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Paragraph paragraphs = 3;</code>
   */
  com.google.cloud.vision.v1.ParagraphOrBuilder getParagraphsOrBuilder(
      int index);

  /**
   * <pre>
   * Detected block type (text, image etc) for this block.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Block.BlockType block_type = 4;</code>
   */
  int getBlockTypeValue();
  /**
   * <pre>
   * Detected block type (text, image etc) for this block.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.Block.BlockType block_type = 4;</code>
   */
  com.google.cloud.vision.v1.Block.BlockType getBlockType();

  /**
   * <pre>
   * Confidence of the OCR results on the block. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5;</code>
   */
  float getConfidence();
}
