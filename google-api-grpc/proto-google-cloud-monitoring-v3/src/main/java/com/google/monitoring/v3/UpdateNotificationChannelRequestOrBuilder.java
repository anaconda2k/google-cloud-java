// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public interface UpdateNotificationChannelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateNotificationChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>.google.monitoring.v3.NotificationChannel notification_channel = 3;</code>
   */
  boolean hasNotificationChannel();
  /**
   * <pre>
   * A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>.google.monitoring.v3.NotificationChannel notification_channel = 3;</code>
   */
  com.google.monitoring.v3.NotificationChannel getNotificationChannel();
  /**
   * <pre>
   * A description of the changes to be applied to the specified
   * notification channel. The description must provide a definition for
   * fields to be updated; the names of these fields should also be
   * included in the `update_mask`.
   * </pre>
   *
   * <code>.google.monitoring.v3.NotificationChannel notification_channel = 3;</code>
   */
  com.google.monitoring.v3.NotificationChannelOrBuilder getNotificationChannelOrBuilder();
}
