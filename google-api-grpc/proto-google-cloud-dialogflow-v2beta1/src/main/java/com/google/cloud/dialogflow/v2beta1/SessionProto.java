// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public final class SessionProto {
  private SessionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/sessio" +
      "n.proto\022\037google.cloud.dialogflow.v2beta1" +
      "\032\034google/api/annotations.proto\032-google/c" +
      "loud/dialogflow/v2beta1/context.proto\032,g" +
      "oogle/cloud/dialogflow/v2beta1/intent.pr" +
      "oto\0329google/cloud/dialogflow/v2beta1/ses" +
      "sion_entity_type.proto\032\034google/protobuf/" +
      "struct.proto\032\027google/rpc/status.proto\032\030g" +
      "oogle/type/latlng.proto\"\305\001\n\023DetectIntent" +
      "Request\022\017\n\007session\030\001 \001(\t\022F\n\014query_params" +
      "\030\002 \001(\01320.google.cloud.dialogflow.v2beta1" +
      ".QueryParameters\022@\n\013query_input\030\003 \001(\0132+." +
      "google.cloud.dialogflow.v2beta1.QueryInp" +
      "ut\022\023\n\013input_audio\030\005 \001(\014\"\233\001\n\024DetectIntent" +
      "Response\022\023\n\013response_id\030\001 \001(\t\022B\n\014query_r" +
      "esult\030\002 \001(\0132,.google.cloud.dialogflow.v2" +
      "beta1.QueryResult\022*\n\016webhook_status\030\003 \001(" +
      "\0132\022.google.rpc.Status\"\237\002\n\017QueryParameter" +
      "s\022\021\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002 \001" +
      "(\0132\023.google.type.LatLng\022:\n\010contexts\030\003 \003(" +
      "\0132(.google.cloud.dialogflow.v2beta1.Cont" +
      "ext\022\026\n\016reset_contexts\030\004 \001(\010\022P\n\024session_e" +
      "ntity_types\030\005 \003(\01322.google.cloud.dialogf" +
      "low.v2beta1.SessionEntityType\022(\n\007payload" +
      "\030\006 \001(\0132\027.google.protobuf.Struct\"\332\001\n\nQuer" +
      "yInput\022I\n\014audio_config\030\001 \001(\01321.google.cl" +
      "oud.dialogflow.v2beta1.InputAudioConfigH" +
      "\000\022:\n\004text\030\002 \001(\0132*.google.cloud.dialogflo" +
      "w.v2beta1.TextInputH\000\022<\n\005event\030\003 \001(\0132+.g" +
      "oogle.cloud.dialogflow.v2beta1.EventInpu" +
      "tH\000B\007\n\005input\"\307\004\n\013QueryResult\022\022\n\nquery_te" +
      "xt\030\001 \001(\t\022\025\n\rlanguage_code\030\017 \001(\t\022%\n\035speec" +
      "h_recognition_confidence\030\002 \001(\002\022\016\n\006action" +
      "\030\003 \001(\t\022+\n\nparameters\030\004 \001(\0132\027.google.prot" +
      "obuf.Struct\022#\n\033all_required_params_prese" +
      "nt\030\005 \001(\010\022\030\n\020fulfillment_text\030\006 \001(\t\022M\n\024fu" +
      "lfillment_messages\030\007 \003(\0132/.google.cloud." +
      "dialogflow.v2beta1.Intent.Message\022\026\n\016web" +
      "hook_source\030\010 \001(\t\0220\n\017webhook_payload\030\t \001" +
      "(\0132\027.google.protobuf.Struct\022A\n\017output_co" +
      "ntexts\030\n \003(\0132(.google.cloud.dialogflow.v" +
      "2beta1.Context\0227\n\006intent\030\013 \001(\0132\'.google." +
      "cloud.dialogflow.v2beta1.Intent\022#\n\033inten" +
      "t_detection_confidence\030\014 \001(\002\0220\n\017diagnost" +
      "ic_info\030\016 \001(\0132\027.google.protobuf.Struct\"\350" +
      "\001\n\034StreamingDetectIntentRequest\022\017\n\007sessi" +
      "on\030\001 \001(\t\022F\n\014query_params\030\002 \001(\01320.google." +
      "cloud.dialogflow.v2beta1.QueryParameters" +
      "\022@\n\013query_input\030\003 \001(\0132+.google.cloud.dia" +
      "logflow.v2beta1.QueryInput\022\030\n\020single_utt" +
      "erance\030\004 \001(\010\022\023\n\013input_audio\030\006 \001(\014\"\375\001\n\035St" +
      "reamingDetectIntentResponse\022\023\n\013response_" +
      "id\030\001 \001(\t\022W\n\022recognition_result\030\002 \001(\0132;.g" +
      "oogle.cloud.dialogflow.v2beta1.Streaming" +
      "RecognitionResult\022B\n\014query_result\030\003 \001(\0132" +
      ",.google.cloud.dialogflow.v2beta1.QueryR" +
      "esult\022*\n\016webhook_status\030\004 \001(\0132\022.google.r" +
      "pc.Status\"\217\002\n\032StreamingRecognitionResult" +
      "\022]\n\014message_type\030\001 \001(\0162G.google.cloud.di" +
      "alogflow.v2beta1.StreamingRecognitionRes" +
      "ult.MessageType\022\022\n\ntranscript\030\002 \001(\t\022\020\n\010i" +
      "s_final\030\003 \001(\010\022\022\n\nconfidence\030\004 \001(\002\"X\n\013Mes" +
      "sageType\022\034\n\030MESSAGE_TYPE_UNSPECIFIED\020\000\022\016" +
      "\n\nTRANSCRIPT\020\001\022\033\n\027END_OF_SINGLE_UTTERANC" +
      "E\020\002\"\242\001\n\020InputAudioConfig\022F\n\016audio_encodi" +
      "ng\030\001 \001(\0162..google.cloud.dialogflow.v2bet" +
      "a1.AudioEncoding\022\031\n\021sample_rate_hertz\030\002 " +
      "\001(\005\022\025\n\rlanguage_code\030\003 \001(\t\022\024\n\014phrase_hin" +
      "ts\030\004 \003(\t\"0\n\tTextInput\022\014\n\004text\030\001 \001(\t\022\025\n\rl" +
      "anguage_code\030\002 \001(\t\"^\n\nEventInput\022\014\n\004name" +
      "\030\001 \001(\t\022+\n\nparameters\030\002 \001(\0132\027.google.prot" +
      "obuf.Struct\022\025\n\rlanguage_code\030\003 \001(\t*\373\001\n\rA" +
      "udioEncoding\022\036\n\032AUDIO_ENCODING_UNSPECIFI" +
      "ED\020\000\022\034\n\030AUDIO_ENCODING_LINEAR_16\020\001\022\027\n\023AU" +
      "DIO_ENCODING_FLAC\020\002\022\030\n\024AUDIO_ENCODING_MU" +
      "LAW\020\003\022\026\n\022AUDIO_ENCODING_AMR\020\004\022\031\n\025AUDIO_E" +
      "NCODING_AMR_WB\020\005\022\033\n\027AUDIO_ENCODING_OGG_O" +
      "PUS\020\006\022)\n%AUDIO_ENCODING_SPEEX_WITH_HEADE" +
      "R_BYTE\020\0072\310\003\n\010Sessions\022\236\002\n\014DetectIntent\0224" +
      ".google.cloud.dialogflow.v2beta1.DetectI" +
      "ntentRequest\0325.google.cloud.dialogflow.v" +
      "2beta1.DetectIntentResponse\"\240\001\202\323\344\223\002\231\001\";/" +
      "v2beta1/{session=projects/*/agent/sessio" +
      "ns/*}:detectIntent:\001*ZW\"R/v2beta1/{sessi" +
      "on=projects/*/agent/environments/*/users" +
      "/*/sessions/*}:detectIntent:\001*\022\232\001\n\025Strea" +
      "mingDetectIntent\022=.google.cloud.dialogfl" +
      "ow.v2beta1.StreamingDetectIntentRequest\032" +
      ">.google.cloud.dialogflow.v2beta1.Stream" +
      "ingDetectIntentResponse(\0010\001B\252\001\n#com.goog" +
      "le.cloud.dialogflow.v2beta1B\014SessionProt" +
      "oP\001ZIgoogle.golang.org/genproto/googleap" +
      "is/cloud/dialogflow/v2beta1;dialogflow\370\001" +
      "\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2beta1" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor,
        new java.lang.String[] { "Session", "QueryParams", "QueryInput", "InputAudio", });
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor,
        new java.lang.String[] { "ResponseId", "QueryResult", "WebhookStatus", });
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor,
        new java.lang.String[] { "TimeZone", "GeoLocation", "Contexts", "ResetContexts", "SessionEntityTypes", "Payload", });
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor,
        new java.lang.String[] { "AudioConfig", "Text", "Event", "Input", });
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor,
        new java.lang.String[] { "QueryText", "LanguageCode", "SpeechRecognitionConfidence", "Action", "Parameters", "AllRequiredParamsPresent", "FulfillmentText", "FulfillmentMessages", "WebhookSource", "WebhookPayload", "OutputContexts", "Intent", "IntentDetectionConfidence", "DiagnosticInfo", });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor,
        new java.lang.String[] { "Session", "QueryParams", "QueryInput", "SingleUtterance", "InputAudio", });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor,
        new java.lang.String[] { "ResponseId", "RecognitionResult", "QueryResult", "WebhookStatus", });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor,
        new java.lang.String[] { "MessageType", "Transcript", "IsFinal", "Confidence", });
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_InputAudioConfig_descriptor,
        new java.lang.String[] { "AudioEncoding", "SampleRateHertz", "LanguageCode", "PhraseHints", });
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor,
        new java.lang.String[] { "Text", "LanguageCode", });
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor,
        new java.lang.String[] { "Name", "Parameters", "LanguageCode", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
