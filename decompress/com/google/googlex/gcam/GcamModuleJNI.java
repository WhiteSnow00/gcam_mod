// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GcamModuleJNI
{
    public static final native void AeMetadata_exposure_compensation_set(final long p0, final AeMetadata p1, final float p2);
    
    public static final native void AeMetadata_lock_set(final long p0, final AeMetadata p1, final boolean p2);
    
    public static final native long AeMetadata_metering_rectangles_get(final long p0, final AeMetadata p1);
    
    public static final native void AeMetadata_mode_set(final long p0, final AeMetadata p1, final int p2);
    
    public static final native void AeMetadata_precapture_trigger_set(final long p0, final AeMetadata p1, final int p2);
    
    public static final native void AeMetadata_state_set(final long p0, final AeMetadata p1, final int p2);
    
    public static final native void AeModeResult_final_tet_set(final long p0, final AeModeResult p1, final float p2);
    
    public static final native void AeModeResult_ideal_tet_set(final long p0, final AeModeResult p1, final float p2);
    
    public static final native void AeModeResult_log_scene_brightness_set(final long p0, final AeModeResult p1, final float p2);
    
    public static final native boolean AeResults_Check(final long p0, final AeResults p1);
    
    public static final native float AeResults_FinalTet(final long p0, final AeResults p1, final int p2);
    
    public static final native float AeResults_LogSceneBrightness(final long p0, final AeResults p1);
    
    public static final native void AeResults_mode_result_set(final long p0, final AeResults p1, final long[] p2);
    
    public static final native void AeResults_portrait_result_set(final long p0, final AeResults p1, final long p2, final AeModeResult p3);
    
    public static final native void AeResults_predicted_image_brightness_set(final long p0, final AeResults p1, final float p2);
    
    public static final native void AeResults_pure_fraction_of_pixels_from_long_exposure_set(final long p0, final AeResults p1, final float p2);
    
    public static final native void AeResults_safe_underexposure_set(final long p0, final AeResults p1, final float p2);
    
    public static final native void AeResults_weighted_fraction_of_pixels_from_long_exposure_set(final long p0, final AeResults p1, final float p2);
    
    public static final native long AeShotParams_crop_get(final long p0, final AeShotParams p1);
    
    public static final native void AeShotParams_crop_set(final long p0, final AeShotParams p1, final long p2, final NormalizedRect p3);
    
    public static final native void AeShotParams_exposure_compensation_set(final long p0, final AeShotParams p1, final float p2);
    
    public static final native long AeShotParams_merged_crop_get(final long p0, final AeShotParams p1);
    
    public static final native void AeShotParams_merged_crop_set(final long p0, final AeShotParams p1, final long p2, final NormalizedRect p3);
    
    public static final native void AeShotParams_relighting_expected_set(final long p0, final AeShotParams p1, final boolean p2);
    
    public static final native void AeShotParams_spoofed_touch_rectangle_set(final long p0, final AeShotParams p1, final boolean p2);
    
    public static final native void AeShotParams_target_height_set(final long p0, final AeShotParams p1, final int p2);
    
    public static final native void AeShotParams_target_width_set(final long p0, final AeShotParams p1, final int p2);
    
    public static final native void AeShotParams_ux_mode_set(final long p0, final AeShotParams p1, final int p2);
    
    public static final native long AeShotParams_weighted_metering_areas_get(final long p0, final AeShotParams p1);
    
    public static final native long AfMetadata_metering_rectangles_get(final long p0, final AfMetadata p1);
    
    public static final native void AfMetadata_mode_set(final long p0, final AfMetadata p1, final int p2);
    
    public static final native void AfMetadata_state_set(final long p0, final AfMetadata p1, final int p2);
    
    public static final native void AfMetadata_trigger_set(final long p0, final AfMetadata p1, final int p2);
    
    public static final native void ApplySensorBinning__SWIG_0(final int p0, final boolean p1, final boolean p2, final long p3, final FrameMetadata p4);
    
    public static final native boolean ApplySensorBinning__SWIG_1(final int p0, final long p1, final StaticMetadata p2);
    
    public static final native void AwbInfo_FixLegacyRgbGains(final long p0, final AwbInfo p1);
    
    public static final native boolean AwbInfo_IsValid(final long p0, final AwbInfo p1);
    
    public static final native float[] AwbInfo_gains_get(final long p0, final AwbInfo p1);
    
    public static final native void AwbInfo_gains_set(final long p0, final AwbInfo p1, final float[] p2);
    
    public static final native float[] AwbInfo_rgb2rgb_get(final long p0, final AwbInfo p1);
    
    public static final native void AwbInfo_rgb2rgb_set(final long p0, final AwbInfo p1, final float[] p2);
    
    public static final native void AwbMetadata_lock_set(final long p0, final AwbMetadata p1, final boolean p2);
    
    public static final native long AwbMetadata_metering_rectangles_get(final long p0, final AwbMetadata p1);
    
    public static final native void AwbMetadata_mode_set(final long p0, final AwbMetadata p1, final int p2);
    
    public static final native void AwbMetadata_state_set(final long p0, final AwbMetadata p1, final int p2);
    
    public static final native boolean BoolVector_get(final long p0, final BoolVector p1, final int p2);
    
    public static final native long BoolVector_size(final long p0, final BoolVector p1);
    
    public static final native void BuildPayloadBurstSpecOptions_max_exposure_time_ms_set(final long p0, final BuildPayloadBurstSpecOptions p1, final float p2);
    
    public static final native void BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(final long p0, final BuildPayloadBurstSpecOptions p1, final float p2);
    
    public static final native void BuildPayloadBurstSpecOptions_shasta_zsl_set(final long p0, final BuildPayloadBurstSpecOptions p1, final boolean p2);
    
    public static final native float BurstSpec_TotalCaptureTimeMs__SWIG_0(final long p0, final BurstSpec p1, final float p2, final boolean p3);
    
    public static final native long BurstSpec_frame_requests_get(final long p0, final BurstSpec p1);
    
    public static final native void BurstSpec_frame_requests_set(final long p0, final BurstSpec p1, final long p2, final FrameRequestVector p3);
    
    public static final native void ClientShotMetadata_location_set(final long p0, final ClientShotMetadata p1, final long p2, final LocationData p3);
    
    public static final native long DEBUG_SAVE_INPUT_METERING_get();
    
    public static final native long DEBUG_SAVE_INPUT_PAYLOAD_get();
    
    public static final native long DEBUG_SAVE_TEXT_get();
    
    public static final native long DebugParams_image_saver_params_get(final long p0, final DebugParams p1);
    
    public static final native void DebugParams_image_saver_params_set(final long p0, final DebugParams p1, final long p2, final ImageSaverParams p3);
    
    public static final native void DebugParams_save_bitmask_set(final long p0, final DebugParams p1, final long p2);
    
    public static final native int DegreesToImageRotation(final int p0);
    
    public static final native long DeserializeFromBytes(final long p0, final long p1);
    
    public static final native boolean DirtyLensHistory_AddRawScore(final long p0, final DirtyLensHistory p1, final float p2);
    
    public static final native void DirtyLensHistory_Reset(final long p0, final DirtyLensHistory p1);
    
    public static final native void DirtyLensHistory_frame_influence_decay_rate__set(final long p0, final DirtyLensHistory p1, final float p2);
    
    public static final native void DirtyLensHistory_initial_score__set(final long p0, final DirtyLensHistory p1, final float p2);
    
    public static final native void DirtyLensHistory_max_photo_count__set(final long p0, final DirtyLensHistory p1, final int p2);
    
    public static final native long DirtyLensHistory_raw_score_history__get(final long p0, final DirtyLensHistory p1);
    
    public static final native void DirtyLensHistory_raw_score_history__set(final long p0, final DirtyLensHistory p1, final long p2, final FloatDeque p3);
    
    public static final native void DirtyLensHistory_weighted_score_threshold__set(final long p0, final DirtyLensHistory p1, final float p2);
    
    public static final native void DngColorCalibrationVector_add(final long p0, final DngColorCalibrationVector p1, final long p2, final DngColorCalibration p3);
    
    public static final native void DngColorCalibration_illuminant_set(final long p0, final DngColorCalibration p1, final int p2);
    
    public static final native void DngColorCalibration_model_rgb_to_device_rgb_set(final long p0, final DngColorCalibration p1, final float[] p2);
    
    public static final native void DngColorCalibration_xyz_to_model_rgb_set(final long p0, final DngColorCalibration p1, final float[] p2);
    
    public static final native void FaceInfoVector_add(final long p0, final FaceInfoVector p1, final long p2, final FaceInfo p3);
    
    public static final native void FaceInfo_Landmark_x_set(final long p0, final FaceInfo$Landmark p1, final float p2);
    
    public static final native void FaceInfo_Landmark_y_set(final long p0, final FaceInfo$Landmark p1, final float p2);
    
    public static final native void FaceInfo_confidence_set(final long p0, final FaceInfo p1, final float p2);
    
    public static final native void FaceInfo_familiarity_set(final long p0, final FaceInfo p1, final float p2);
    
    public static final native long FaceInfo_landmarks_get(final long p0, final FaceInfo p1);
    
    public static final native void FaceInfo_pos_x_set(final long p0, final FaceInfo p1, final float p2);
    
    public static final native void FaceInfo_pos_y_set(final long p0, final FaceInfo p1, final float p2);
    
    public static final native void FaceInfo_size_set(final long p0, final FaceInfo p1, final float p2);
    
    public static final native float FloatDeque_getitem(final long p0, final FloatDeque p1, final int p2);
    
    public static final native void FloatDeque_push_back(final long p0, final FloatDeque p1, final float p2);
    
    public static final native long FloatDeque_size(final long p0, final FloatDeque p1);
    
    public static final native void FloatVector_add(final long p0, final FloatVector p1, final float p2);
    
    public static final native float FloatVector_get(final long p0, final FloatVector p1, final int p2);
    
    public static final native boolean FloatVector_isEmpty(final long p0, final FloatVector p1);
    
    public static final native long FloatVector_size(final long p0, final FloatVector p1);
    
    public static final native float FrameMetadata_actual_analog_gain_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_actual_analog_gain_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native float FrameMetadata_actual_exposure_time_ms_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_actual_exposure_time_ms_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native long FrameMetadata_ae_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_ae_results_set(final long p0, final FrameMetadata p1, final long p2, final AeResults p3);
    
    public static final native long FrameMetadata_af_get(final long p0, final FrameMetadata p1);
    
    public static final native float FrameMetadata_applied_digital_gain_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_applied_digital_gain_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native long FrameMetadata_awb_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_black_levels_bayer_set(final long p0, final FrameMetadata p1, final float[] p2);
    
    public static final native void FrameMetadata_control_mode_set(final long p0, final FrameMetadata p1, final int p2);
    
    public static final native void FrameMetadata_dng_noise_model_bayer_set(final long p0, final FrameMetadata p1, final long p2, final NoiseModel p3);
    
    public static final native void FrameMetadata_exposure_time_boost_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native void FrameMetadata_f_number_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native long FrameMetadata_faces_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_flash_set(final long p0, final FrameMetadata p1, final int p2);
    
    public static final native void FrameMetadata_focal_length_mm_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native void FrameMetadata_focus_distance_diopters_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native long FrameMetadata_geometric_calibration_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_geometric_calibration_set(final long p0, final FrameMetadata p1, final long p2, final GeometricCalibrationVector p3);
    
    public static final native void FrameMetadata_gyro_samples_set(final long p0, final FrameMetadata p1, final long p2, final GyroSampleVector p3);
    
    public static final native void FrameMetadata_isp_metadata_set(final long p0, final FrameMetadata p1, final long p2, final IspAwbMetadata p3);
    
    public static final native void FrameMetadata_lens_state_set(final long p0, final FrameMetadata p1, final int p2);
    
    public static final native long FrameMetadata_live_hdr_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_live_hdr_set(final long p0, final FrameMetadata p1, final long p2, final LiveHdrMetadata p3);
    
    public static final native long FrameMetadata_mesh_warp_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_mesh_warp_set(final long p0, final FrameMetadata p1, final long p2, final MeshWarp p3);
    
    public static final native void FrameMetadata_ois_metadata_set(final long p0, final FrameMetadata p1, final long p2, final OisMetadata p3);
    
    public static final native float FrameMetadata_post_raw_digital_gain_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_post_raw_digital_gain_set(final long p0, final FrameMetadata p1, final float p2);
    
    public static final native void FrameMetadata_scene_flicker_set(final long p0, final FrameMetadata p1, final long p2, final SceneFlicker p3);
    
    public static final native int FrameMetadata_sensor_id_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_sensor_id_set(final long p0, final FrameMetadata p1, final int p2);
    
    public static final native void FrameMetadata_sensor_temp_set(final long p0, final FrameMetadata p1, final int p2);
    
    public static final native void FrameMetadata_timestamp_faces_ns_set(final long p0, final FrameMetadata p1, final long p2);
    
    public static final native void FrameMetadata_timestamp_ns_set(final long p0, final FrameMetadata p1, final long p2);
    
    public static final native void FrameMetadata_was_black_level_locked_set(final long p0, final FrameMetadata p1, final boolean p2);
    
    public static final native long FrameMetadata_wb_get(final long p0, final FrameMetadata p1);
    
    public static final native void FrameMetadata_wb_set(final long p0, final FrameMetadata p1, final long p2, final AwbInfo p3);
    
    public static final native void FrameRequestVector_add(final long p0, final FrameRequestVector p1, final long p2, final FrameRequest p3);
    
    public static final native long FrameRequestVector_get(final long p0, final FrameRequestVector p1, final int p2);
    
    public static final native boolean FrameRequestVector_isEmpty(final long p0, final FrameRequestVector p1);
    
    public static final native long FrameRequestVector_size(final long p0, final FrameRequestVector p1);
    
    public static final native long FrameRequest_awb_get(final long p0, final FrameRequest p1);
    
    public static final native float FrameRequest_desired_analog_gain_get(final long p0, final FrameRequest p1);
    
    public static final native float FrameRequest_desired_digital_gain_get(final long p0, final FrameRequest p1);
    
    public static final native float FrameRequest_desired_exposure_time_ms_get(final long p0, final FrameRequest p1);
    
    public static final native boolean FrameRequest_try_to_lock_black_level_get(final long p0, final FrameRequest p1);
    
    public static final native void Gcam_AbortShot(final long p0, final Gcam p1, final int p2);
    
    public static final native boolean Gcam_AllSensorIdsUnique(final long p0, final Gcam p1);
    
    public static final native void Gcam_BeginPayloadFrames(final long p0, final Gcam p1, final int p2, final long p3, final BurstSpec p4);
    
    public static final native long Gcam_BuildAfBurstSpec(final long p0, final Gcam p1, final int p2, final long p3, final RawReadView p4, final long p5, final FrameMetadata p6, final long p7, final SpatialGainMap p8);
    
    public static final native long Gcam_BuildPayloadBurstSpec(final long p0, final Gcam p1, final int p2, final long p3, final RawReadView p4, final long p5, final FrameMetadata p6, final long p7, final SpatialGainMap p8, final long p9, final BuildPayloadBurstSpecOptions p10);
    
    public static final native boolean Gcam_ClaimFrameForBinning(final long p0, final Gcam p1, final long p2, final FrameMetadataKey p3);
    
    public static final native long Gcam_ComputeAeResults(final long p0, final StaticMetadata p1, final long p2, final Tuning p3, final long p4, final AeShotParams p5, final long p6, final RawReadView p7, final long p8, final FrameMetadata p9, final long p10, final SpatialGainMap p11, final boolean p12);
    
    public static final native void Gcam_ConfigureViewfinderProcessing(final long p0, final Gcam p1, final long p2, final ViewfinderProcessingOptions p3);
    
    public static final native long Gcam_Create(final long p0, final InitParams p1, final long p2, final StaticMetadataVector p3);
    
    public static final native boolean Gcam_EndPayloadFrames(final long p0, final Gcam p1, final int p2, final long p3, final ClientShotMetadata p4);
    
    public static final native boolean Gcam_EndShotCapture(final long p0, final Gcam p1, final int p2);
    
    public static final native void Gcam_EndZslPayloadFrames(final long p0, final Gcam p1, final int p2);
    
    public static final native int Gcam_FindFirstCamera(final long p0, final Gcam p1, final int p2);
    
    public static final native void Gcam_FlushTemporalBinning(final long p0, final Gcam p1, final int p2);
    
    public static final native void Gcam_FlushViewfinder(final long p0, final Gcam p1, final int p2);
    
    public static final native long Gcam_GenerateRgbImage(final long p0, final StaticMetadata p1, final long p2, final ShotParams p3, final long p4, final FrameMetadata p5, final long p6, final SpatialGainMap p7, final long p8, final RawWriteView p9, final int p10, final long p11, final ThreadPoolConfig p12, final long p13, final GenerateRgbImageOptions p14);
    
    public static final native long Gcam_GetLatestViewfinderResults(final long p0, final Gcam p1, final int p2);
    
    public static final native int Gcam_GetNumCameras(final long p0, final Gcam p1);
    
    public static final native long Gcam_GetStaticMetadata(final long p0, final Gcam p1, final int p2);
    
    public static final native long Gcam_GetTuning(final long p0, final Gcam p1, final int p2);
    
    public static final native boolean Gcam_LimitShotCpuUsage(final long p0, final Gcam p1, final int p2, final float p3);
    
    public static final native boolean Gcam_LockFrameFromFutureBinning(final long p0, final Gcam p1, final long p2, final FrameMetadataKey p3);
    
    public static final native boolean Gcam_OverrideFrameMetadata(final long p0, final Gcam p1, final long p2, final FrameMetadataKey p3, final long p4, final FrameMetadata p5);
    
    public static final native int Gcam_StartShotCapture(final long p0, final Gcam p1, final int p2, final long p3, final ShotParams p4, final long p5, final ShotCallbacks p6, final int p7, final long p8, final PostviewParams p9, final long p10, final DebugParams p11);
    
    public static final native void GenerateRgbImageOptions_actual_number_of_frames_set(final long p0, final GenerateRgbImageOptions p1, final int p2);
    
    public static final native void GenerateRgbImageOptions_expected_number_of_frames_set(final long p0, final GenerateRgbImageOptions p1, final int p2);
    
    public static final native void GenerateRgbImageOptions_verbose_set(final long p0, final GenerateRgbImageOptions p1, final boolean p2);
    
    public static final native void GeometricCalibrationVector_add(final long p0, final GeometricCalibrationVector p1, final long p2, final GeometricCalibration p3);
    
    public static final native boolean GeometricCalibrationVector_isEmpty(final long p0, final GeometricCalibrationVector p1);
    
    public static final native void GeometricCalibration_active_rectangle_set(final long p0, final GeometricCalibration p1, final int[] p2);
    
    public static final native float[] GeometricCalibration_lens_distortion_extended_get(final long p0, final GeometricCalibration p1);
    
    public static final native void GeometricCalibration_lens_distortion_extended_set(final long p0, final GeometricCalibration p1, final float[] p2);
    
    public static final native float[] GeometricCalibration_lens_distortion_get(final long p0, final GeometricCalibration p1);
    
    public static final native void GeometricCalibration_lens_distortion_set(final long p0, final GeometricCalibration p1, final float[] p2);
    
    public static final native float[] GeometricCalibration_lens_intrinsic_calibration_get(final long p0, final GeometricCalibration p1);
    
    public static final native void GeometricCalibration_lens_intrinsic_calibration_set(final long p0, final GeometricCalibration p1, final float[] p2);
    
    public static final native void GeometricCalibration_lens_pose_rotation_set(final long p0, final GeometricCalibration p1, final float[] p2);
    
    public static final native void GeometricCalibration_lens_pose_translation_set(final long p0, final GeometricCalibration p1, final float[] p2);
    
    public static final native void GeometricCalibration_quality_set(final long p0, final GeometricCalibration p1, final int p2);
    
    public static final native void GeometricCalibration_valid_rectangle_set(final long p0, final GeometricCalibration p1, final int[] p2);
    
    public static final native String GetVersion();
    
    public static final native long GrayReadViewU8_data(final long p0, final GrayReadViewU8 p1);
    
    public static final native int GrayReadViewU8_height(final long p0, final GrayReadViewU8 p1);
    
    public static final native int GrayReadViewU8_width(final long p0, final GrayReadViewU8 p1);
    
    public static final native int GrayReadViewU8_x_stride(final long p0, final GrayReadViewU8 p1);
    
    public static final native int GrayReadViewU8_y_stride(final long p0, final GrayReadViewU8 p1);
    
    public static final native void GyroSampleVector_add(final long p0, final GyroSampleVector p1, final long p2, final GyroSample p3);
    
    public static final native void GyroSample_timestamp_ns_set(final long p0, final GyroSample p1, final long p2);
    
    public static final native void GyroSample_x_set(final long p0, final GyroSample p1, final float p2);
    
    public static final native void GyroSample_y_set(final long p0, final GyroSample p1, final float p2);
    
    public static final native void GyroSample_z_set(final long p0, final GyroSample p1, final float p2);
    
    public static final native int ImageRotationToDegrees(final int p0);
    
    public static final native String ImageSaverParams_dest_folder_get(final long p0, final ImageSaverParams p1);
    
    public static final native void ImageSaverParams_dest_folder_set(final long p0, final ImageSaverParams p1, final String p2);
    
    public static final native void InitParams_allow_unknown_devices_set(final long p0, final InitParams p1, final boolean p2);
    
    public static final native void InitParams_capture_threads_set(final long p0, final InitParams p1, final long p2, final ThreadPoolConfig p3);
    
    public static final native int InitParams_execute_finish_on_get(final long p0, final InitParams p1);
    
    public static final native void InitParams_execute_finish_on_set(final long p0, final InitParams p1, final int p2);
    
    public static final native void InitParams_execute_postview_on_set(final long p0, final InitParams p1, final int p2);
    
    public static final native long InitParams_finish_threads_get(final long p0, final InitParams p1);
    
    public static final native void InitParams_finish_threads_set(final long p0, final InitParams p1, final long p2, final ThreadPoolConfig p3);
    
    public static final native void InitParams_max_payload_frames_set(final long p0, final InitParams p1, final int p2);
    
    public static final native void InitParams_merge_threads_set(final long p0, final InitParams p1, final long p2, final ThreadPoolConfig p3);
    
    public static final native void InitParams_serialized_cache_dir_set(final long p0, final InitParams p1, final String p2);
    
    public static final native void InitParams_simultaneous_merge_and_finish_set(final long p0, final InitParams p1, final boolean p2);
    
    public static final native long InterleavedImageU16_read_view(final long p0, final InterleavedImageU16 p1);
    
    public static final native long InterleavedImageU16_write_view(final long p0, final InterleavedImageU16 p1);
    
    public static final native boolean InterleavedImageU8_empty(final long p0, final InterleavedImageU8 p1);
    
    public static final native int InterleavedImageU8_height(final long p0, final InterleavedImageU8 p1);
    
    public static final native long InterleavedImageU8_read_view(final long p0, final InterleavedImageU8 p1);
    
    public static final native int InterleavedImageU8_width(final long p0, final InterleavedImageU8 p1);
    
    public static final native long InterleavedImageU8_write_view(final long p0, final InterleavedImageU8 p1);
    
    public static final native int InterleavedReadViewU8_c_stride(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedReadViewU8_channels(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native long InterleavedReadViewU8_data(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedReadViewU8_height(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedReadViewU8_width(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedReadViewU8_x_stride(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedReadViewU8_y_stride(final long p0, final InterleavedReadViewU8 p1);
    
    public static final native int InterleavedWriteViewU8_channels(final long p0, final InterleavedWriteViewU8 p1);
    
    public static final native int InterleavedWriteViewU8_height(final long p0, final InterleavedWriteViewU8 p1);
    
    public static final native long InterleavedWriteViewU8_read_view(final long p0, final InterleavedWriteViewU8 p1);
    
    public static final native int InterleavedWriteViewU8_width(final long p0, final InterleavedWriteViewU8 p1);
    
    public static final native boolean IsRgb8(final int p0);
    
    public static final native void JpgEncodeOptions_quality_set(final long p0, final JpgEncodeOptions p1, final int p2);
    
    public static final native void JpgEncodeOptions_shot_metadata_set(final long p0, final JpgEncodeOptions p1, final long p2, final ShotMetadata p3);
    
    public static final native void LandmarkMap_set(final long p0, final LandmarkMap p1, final int p2, final long p3, final FaceInfo$Landmark p4);
    
    public static final native void LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_manual_ec_short_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_manual_long_tet_override_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_manual_portrait_tet_override_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_manual_short_tet_override_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_max_hdr_ratio_override_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_metering_interval_ms_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_motion_magnitude_pix_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_night_factor_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_viewfinder_long_tet_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_viewfinder_portrait_tet_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LiveHdrMetadata_viewfinder_short_tet_set(final long p0, final LiveHdrMetadata p1, final float p2);
    
    public static final native void LocationData_altitude_set(final long p0, final LocationData p1, final double p2);
    
    public static final native void LocationData_degree_of_precision_set(final long p0, final LocationData p1, final double p2);
    
    public static final native void LocationData_latitude_set(final long p0, final LocationData p1, final double p2);
    
    public static final native void LocationData_longitude_set(final long p0, final LocationData p1, final double p2);
    
    public static final native void LocationData_processing_method_set(final long p0, final LocationData p1, final String p2);
    
    public static final native void LocationData_timestamp_unix_set(final long p0, final LocationData p1, final long p2);
    
    public static final native int MeshTranslation_x_get(final long p0, final MeshTranslation p1);
    
    public static final native int MeshTranslation_y_get(final long p0, final MeshTranslation p1);
    
    public static final native long MeshWarp_TranslationHint(final long p0, final MeshWarp p1);
    
    public static final native int MeshWarp_grid_cols_get(final long p0, final MeshWarp p1);
    
    public static final native void MeshWarp_grid_cols_set(final long p0, final MeshWarp p1, final int p2);
    
    public static final native int MeshWarp_grid_rows_get(final long p0, final MeshWarp p1);
    
    public static final native void MeshWarp_grid_rows_set(final long p0, final MeshWarp p1, final int p2);
    
    public static final native long MeshWarp_mesh_warp_crop_region_get(final long p0, final MeshWarp p1);
    
    public static final native void MeshWarp_mesh_warp_crop_region_set(final long p0, final MeshWarp p1, final long p2, final PixelRect p3);
    
    public static final native long MeshWarp_mesh_warp_data_get(final long p0, final MeshWarp p1);
    
    public static final native void MeshWarp_mesh_warp_data_set(final long p0, final MeshWarp p1, final long p2, final FloatVector p3);
    
    public static final native void MeshWarp_mesh_warp_dst_region_set(final long p0, final MeshWarp p1, final long p2, final PixelRect p3);
    
    public static final native long NoiseModel_FromShotReadNoise__SWIG_0(final long p0, final FloatVector p1, final long p2, final FloatVector p3);
    
    public static final native boolean NormalizedRect_IsEmpty(final long p0, final NormalizedRect p1);
    
    public static final native void NormalizedRect_x0_set(final long p0, final NormalizedRect p1, final float p2);
    
    public static final native void NormalizedRect_x1_set(final long p0, final NormalizedRect p1, final float p2);
    
    public static final native void NormalizedRect_y0_set(final long p0, final NormalizedRect p1, final float p2);
    
    public static final native void NormalizedRect_y1_set(final long p0, final NormalizedRect p1, final float p2);
    
    public static final native void OisMetadata_lens_optical_stabilization_mode_set(final long p0, final OisMetadata p1, final int p2);
    
    public static final native long OisMetadata_ois_positions_get(final long p0, final OisMetadata p1);
    
    public static final native void OisMetadata_timestamp_ois_clock_ns_set(final long p0, final OisMetadata p1, final long p2);
    
    public static final native void OisPositionVector_add(final long p0, final OisPositionVector p1, final long p2, final OisPosition p3);
    
    public static final native void OisPosition_shift_pixel_x_set(final long p0, final OisPosition p1, final float p2);
    
    public static final native void OisPosition_shift_pixel_y_set(final long p0, final OisPosition p1, final float p2);
    
    public static final native void OisPosition_timestamp_ns_set(final long p0, final OisPosition p1, final long p2);
    
    public static final native float PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(final long p0, final PhysicalStabilityParams p1);
    
    public static final native long PhysicalStabilityParams_thresholds_get(final long p0, final PhysicalStabilityParams p1);
    
    public static final native float PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(final long p0, final PhysicalStabilityThresholds p1);
    
    public static final native float PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(final long p0, final PhysicalStabilityThresholds p1);
    
    public static final native void PixelRectVector_add(final long p0, final PixelRectVector p1, final long p2, final PixelRect p3);
    
    public static final native long PixelRectVector_size(final long p0, final PixelRectVector p1);
    
    public static final native int PixelRect_height(final long p0, final PixelRect p1);
    
    public static final native int PixelRect_width(final long p0, final PixelRect p1);
    
    public static final native int PixelRect_x0_get(final long p0, final PixelRect p1);
    
    public static final native void PixelRect_x0_set(final long p0, final PixelRect p1, final int p2);
    
    public static final native void PixelRect_x1_set(final long p0, final PixelRect p1, final int p2);
    
    public static final native int PixelRect_y0_get(final long p0, final PixelRect p1);
    
    public static final native void PixelRect_y0_set(final long p0, final PixelRect p1, final int p2);
    
    public static final native void PixelRect_y1_set(final long p0, final PixelRect p1, final int p2);
    
    public static final native void PortraitOutputs_dynamic_depth_result_ptr_set(final long p0, final PortraitOutputs p1, final long p2);
    
    public static final native long PortraitRequest_ae_results_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_allow_raw_blur_front_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_allow_raw_blur_rear_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_apply_portrait_matting_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_depth_processing_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native void PortraitRequest_embed_gdepth_metadata_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_execute_finish_on_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native long PortraitRequest_faces_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_faces_set(final long p0, final PortraitRequest p1, final long p2, final PixelRectVector p3);
    
    public static final native long PortraitRequest_frame_metadata_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_frame_metadata_set(final long p0, final PortraitRequest p1, final long p2, final StringFrameMetadataMap p3);
    
    public static final native long PortraitRequest_gain_map_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_horizontal_flip_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native int PortraitRequest_image_rotation_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_image_rotation_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native boolean PortraitRequest_manually_rotate_xmp_jpg_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_manually_rotate_xmp_jpg_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_opencl_cache_directory_set(final long p0, final PortraitRequest p1, final String p2);
    
    public static final native void PortraitRequest_output_format_primary_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native void PortraitRequest_output_height_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native void PortraitRequest_output_width_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native void PortraitRequest_portrait_raw_path_set(final long p0, final PortraitRequest p1, final String p2);
    
    public static final native void PortraitRequest_post_resample_sharpening_set(final long p0, final PortraitRequest p1, final float p2);
    
    public static final native void PortraitRequest_relighting_option_set(final long p0, final PortraitRequest p1, final int p2);
    
    public static final native void PortraitRequest_shot_prefix_set(final long p0, final PortraitRequest p1, final String p2);
    
    public static final native long PortraitRequest_static_metadata_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_static_metadata_set(final long p0, final PortraitRequest p1, final long p2, final StringStaticMetadataMap p3);
    
    public static final native boolean PortraitRequest_use_gpu_resample_get(final long p0, final PortraitRequest p1);
    
    public static final native void PortraitRequest_use_internal_rectiface_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PortraitRequest_use_spotlight_enhance_set(final long p0, final PortraitRequest p1, final boolean p2);
    
    public static final native void PostviewParams_pixel_format_set(final long p0, final PostviewParams p1, final int p2);
    
    public static final native void PostviewParams_target_height_set(final long p0, final PostviewParams p1, final int p2);
    
    public static final native void PostviewParams_target_width_set(final long p0, final PostviewParams p1, final int p2);
    
    public static final native void QcColorCalibration_IlluminantData_bg_ratio_set(final long p0, final QcColorCalibration$IlluminantData p1, final float p2);
    
    public static final native void QcColorCalibration_IlluminantData_rg_ratio_set(final long p0, final QcColorCalibration$IlluminantData p1, final float p2);
    
    public static final native void QcColorCalibration_grgb_ratio_set(final long p0, final QcColorCalibration p1, final float p2);
    
    public static final native void QcColorCalibration_illuminant_data_set(final long p0, final QcColorCalibration p1, final long p2, final QcIlluminantVector p3);
    
    public static final native void QcIlluminantVector_add(final long p0, final QcIlluminantVector p1, final long p2, final QcColorCalibration$IlluminantData p3);
    
    public static final native long RawImage_SWIGUpcast(final long p0);
    
    public static final native boolean RawReadView_empty(final long p0, final RawReadView p1);
    
    public static final native long RawWriteView_SWIGUpcast(final long p0);
    
    public static final native boolean RotateShotMetadata__SWIG_1(final long p0, final ShotMetadata p1, final int p2);
    
    public static final native void SceneFlicker_confidence_set(final long p0, final SceneFlicker p1, final float p2);
    
    public static final native void SceneFlicker_frequency_set(final long p0, final SceneFlicker p1, final float p2);
    
    public static final native boolean ShotLogData_aborted_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_actual_range_compression_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_ae_confidence_long_exposure_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_ae_confidence_short_exposure_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_ae_confidence_single_exposure_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_base_frame_index_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_base_frame_snr_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_base_frame_temporal_binning_factor_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_base_frame_timestamp_ns_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_capture_time_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_cpu_usage_factor_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_earliest_psl_frame_timestamp_ns_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_executed_finish_on_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_final_image_callback_time_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_final_payload_frame_sharpness_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_finish_process_time_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_hot_pixels_in_base_frame_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_hot_pixels_in_total_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_ideal_range_compression_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_jpeg_callback_time_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_jpeg_encode_time_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_log_scene_brightness_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_long_exp_adjustment_factor_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_max_exposure_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_merge_process_time_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_merged_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_merged_frame_snr_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_merged_raw_callback_time_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_metering_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_metering_frame_timestamp_ns_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_number_gyro_samples_used_for_metering_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_original_payload_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_payload_focus_distance_diopters_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_payload_frame_scene_motion_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_percentage_valid_gyro_samples_used_for_metering_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_percentage_valid_motion_samples_in_10_samples_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_percentage_valid_motion_samples_in_20_samples_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_postview_callback_time_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_preview_focus_distance_diopters_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_psaf_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_scene_motion_10_sample_std_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_scene_motion_20_sample_std_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_scene_motion_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_shasta_captured_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native boolean ShotLogData_shasta_enabled_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_shasta_exposure_time_ratio_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_shasta_merged_frame_count_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_shasta_tet_ratio_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_short_exp_adjustment_factor_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_sky_contrast_enhancement_strength_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_sky_darkening_strength_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_sky_mask_ratio_get(final long p0, final ShotLogData p1);
    
    public static final native boolean ShotLogData_sky_segmentation_failed_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_sky_segmentation_total_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native boolean ShotLogData_sky_segmentation_used_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_sky_snr_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_std_angular_speed_rad_per_sec_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_max_run_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_mean_run_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_min_run_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_target_exposure_time_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_temporal_binning_target_tet_ms_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_time_to_postview_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_time_to_shot_get(final long p0, final ShotLogData p1);
    
    public static final native int ShotLogData_ux_mode_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotLogData_was_payload_frame_merged_get(final long p0, final ShotLogData p1);
    
    public static final native float ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(final long p0, final ShotLogData p1);
    
    public static final native boolean ShotLogData_zsl_get(final long p0, final ShotLogData p1);
    
    public static final native long ShotMetadata_ae_results_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_client_shot_metadata_set(final long p0, final ShotMetadata p1, final long p2, final ClientShotMetadata p3);
    
    public static final native void ShotMetadata_exposure_compensation_set(final long p0, final ShotMetadata p1, final float p2);
    
    public static final native void ShotMetadata_flash_mode_set(final long p0, final ShotMetadata p1, final int p2);
    
    public static final native long ShotMetadata_frame_metadata_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_frame_metadata_set(final long p0, final ShotMetadata p1, final long p2, final FrameMetadata p3);
    
    public static final native long ShotMetadata_gain_map_rggb_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_gain_map_rggb_set(final long p0, final ShotMetadata p1, final long p2, final InterleavedImageF p3);
    
    public static final native int ShotMetadata_icc_profile_get(final long p0, final ShotMetadata p1);
    
    public static final native int ShotMetadata_image_rotation_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_image_rotation_set(final long p0, final ShotMetadata p1, final int p2);
    
    public static final native String ShotMetadata_makernote_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_makernote_set(final long p0, final ShotMetadata p1, final String p2);
    
    public static final native String ShotMetadata_software_suffix_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_software_suffix_set(final long p0, final ShotMetadata p1, final String p2);
    
    public static final native long ShotMetadata_static_metadata_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_static_metadata_set(final long p0, final ShotMetadata p1, final long p2, final StaticMetadata p3);
    
    public static final native long ShotMetadata_timestamp_unix_us_get(final long p0, final ShotMetadata p1);
    
    public static final native void ShotMetadata_wb_mode_set(final long p0, final ShotMetadata p1, final int p2);
    
    public static final native String ShotMetadata_xmp_metadata_extended_get(final long p0, final ShotMetadata p1);
    
    public static final native String ShotMetadata_xmp_metadata_main_get(final long p0, final ShotMetadata p1);
    
    public static final native boolean ShotParams_GcamAwbDesired(final long p0, final ShotParams p1);
    
    public static final native long ShotParams_ae_get(final long p0, final ShotParams p1);
    
    public static final native void ShotParams_ae_set(final long p0, final ShotParams p1, final long p2, final AeShotParams p3);
    
    public static final native void ShotParams_allow_base_frame_reuse_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_allow_sabre_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_allow_spatial_rgb_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_allow_temporal_binning_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_base_frame_override_index_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_compress_merged_dng_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_device_is_on_tripod_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_downsample_by_2_before_merge_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_flash_mode_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_force_wb_set(final long p0, final ShotParams p1, final long p2, final AwbInfo p3);
    
    public static final native void ShotParams_icc_output_profile_override_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_image_rotation_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_manually_rotate_final_jpg_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_merge_method_override_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_motion_ef_enabled_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_nonzsl_extended_base_frame_selection_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native int ShotParams_nonzsl_frame_count_override_get(final long p0, final ShotParams p1);
    
    public static final native void ShotParams_nonzsl_frame_count_override_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_optimize_sky_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_previous_viewfinder_tet_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_previous_viewfinder_wb_set(final long p0, final ShotParams p1, final long p2, final AwbInfo p3);
    
    public static final native void ShotParams_psaf_frame_count_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_psaf_log_scene_brightness_threshold_override_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_psaf_max_exposure_time_ms_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_recompute_wb_on_base_frame_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_rerun_face_detection_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_resampling_method_override_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_save_merged_dng_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_shasta_enabled_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_shasta_factor_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_shasta_force_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void ShotParams_shutter_press_down_timestamp_ns_set(final long p0, final ShotParams p1, final long p2);
    
    public static final native void ShotParams_shutter_press_up_timestamp_ns_set(final long p0, final ShotParams p1, final long p2);
    
    public static final native void ShotParams_software_suffix_set(final long p0, final ShotParams p1, final String p2);
    
    public static final native void ShotParams_tripod_max_exposure_time_ms_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_tripod_max_total_capture_time_ms_set(final long p0, final ShotParams p1, final float p2);
    
    public static final native void ShotParams_wb_mode_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_zsl_base_frame_index_hint_set(final long p0, final ShotParams p1, final int p2);
    
    public static final native void ShotParams_zsl_set(final long p0, final ShotParams p1, final boolean p2);
    
    public static final native void SpatialGainMap_WriteRggb(final long p0, final SpatialGainMap p1, final int p2, final int p3, final int p4, final float p5);
    
    public static final native long SpatialGainMap_gain_map(final long p0, final SpatialGainMap p1);
    
    public static final native void StaticMetadataVector_add(final long p0, final StaticMetadataVector p1, final long p2, final StaticMetadata p3);
    
    public static final native long StaticMetadata_active_area_get(final long p0, final StaticMetadata p1);
    
    public static final native void StaticMetadata_active_area_set(final long p0, final StaticMetadata p1, final long p2, final PixelRect p3);
    
    public static final native void StaticMetadata_available_f_numbers_set(final long p0, final StaticMetadata p1, final long p2, final FloatVector p3);
    
    public static final native void StaticMetadata_available_focal_lengths_mm_set(final long p0, final StaticMetadata p1, final long p2, final FloatVector p3);
    
    public static final native void StaticMetadata_bayer_pattern_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_device_os_version_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_device_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_dng_color_calibration_set(final long p0, final StaticMetadata p1, final long p2, final DngColorCalibrationVector p3);
    
    public static final native void StaticMetadata_exposure_time_range_ms_set(final long p0, final StaticMetadata p1, final float[] p2);
    
    public static final native void StaticMetadata_frame_raw_max_height_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_frame_raw_max_width_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_frame_readout_time_ms_set(final long p0, final StaticMetadata p1, final float p2);
    
    public static final native void StaticMetadata_hardware_revision_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_has_flash_set(final long p0, final StaticMetadata p1, final boolean p2);
    
    public static final native void StaticMetadata_has_ois_set(final long p0, final StaticMetadata p1, final boolean p2);
    
    public static final native void StaticMetadata_iso_range_set(final long p0, final StaticMetadata p1, final float[] p2);
    
    public static final native int StaticMetadata_lens_facing_get(final long p0, final StaticMetadata p1);
    
    public static final native void StaticMetadata_lens_facing_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_make_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_max_analog_iso_set(final long p0, final StaticMetadata p1, final float p2);
    
    public static final native void StaticMetadata_model_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_optically_black_regions_set(final long p0, final StaticMetadata p1, final long p2, final PixelRectVector p3);
    
    public static final native void StaticMetadata_pixel_array_height_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_pixel_array_width_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_qc_color_calibration_set(final long p0, final StaticMetadata p1, final long p2, final QcColorCalibration p3);
    
    public static final native void StaticMetadata_raw_bits_per_pixel_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native int StaticMetadata_sensor_id_get(final long p0, final StaticMetadata p1);
    
    public static final native void StaticMetadata_sensor_id_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StaticMetadata_sensor_physical_height_mm_set(final long p0, final StaticMetadata p1, final float p2);
    
    public static final native void StaticMetadata_sensor_physical_width_mm_set(final long p0, final StaticMetadata p1, final float p2);
    
    public static final native void StaticMetadata_software_set(final long p0, final StaticMetadata p1, final String p2);
    
    public static final native void StaticMetadata_white_level_set(final long p0, final StaticMetadata p1, final int p2);
    
    public static final native void StringAeResultsMap_set(final long p0, final StringAeResultsMap p1, final String p2, final long p3, final AeResults p4);
    
    public static final native void StringFrameMetadataMap_set(final long p0, final StringFrameMetadataMap p1, final String p2, final long p3, final FrameMetadata p4);
    
    public static final native void StringRawReadViewMap_set(final long p0, final StringRawReadViewMap p1, final String p2, final long p3, final RawReadView p4);
    
    public static final native void StringSpatialGainMap_set(final long p0, final StringSpatialGainMap p1, final String p2, final long p3, final SpatialGainMap p4);
    
    public static final native void StringStaticMetadataMap_set(final long p0, final StringStaticMetadataMap p1, final String p2, final long p3, final StaticMetadata p4);
    
    public static final native void ThreadPoolConfig_count_set(final long p0, final ThreadPoolConfig p1, final int p2);
    
    public static final native void ThreadPoolConfig_priority_set(final long p0, final ThreadPoolConfig p1, final long p2, final ThreadPriority p3);
    
    public static final native void ThreadPriority_explicitly_set_set(final long p0, final ThreadPriority p1, final boolean p2);
    
    public static final native void ThreadPriority_value_set(final long p0, final ThreadPriority p1, final int p2);
    
    public static final native long Tuning_physical_stability_params_get(final long p0, final Tuning p1);
    
    public static final native long Union(final long p0, final NormalizedRect p1, final long p2, final NormalizedRect p3);
    
    public static final native void ViewfinderProcessingOptions_process_motion_set(final long p0, final ViewfinderProcessingOptions p1, final boolean p2);
    
    public static final native void ViewfinderProcessingOptions_save_motion_trace_set(final long p0, final ViewfinderProcessingOptions p1, final boolean p2);
    
    public static final native void ViewfinderProcessingOptions_verbose_set(final long p0, final ViewfinderProcessingOptions p1, final boolean p2);
    
    public static final native float ViewfinderResults_gyro_speed_rad_per_sec_get(final long p0, final ViewfinderResults p1);
    
    public static final native void WeightedNormalizedRectVector_add(final long p0, final WeightedNormalizedRectVector p1, final long p2, final WeightedNormalizedRect p3);
    
    public static final native long WeightedNormalizedRectVector_size(final long p0, final WeightedNormalizedRectVector p1);
    
    public static final native long WeightedNormalizedRect_rect_get(final long p0, final WeightedNormalizedRect p1);
    
    public static final native void WeightedNormalizedRect_rect_set(final long p0, final WeightedNormalizedRect p1, final long p2, final NormalizedRect p3);
    
    public static final native void WeightedNormalizedRect_weight_set(final long p0, final WeightedNormalizedRect p1, final float p2);
    
    public static final native void WeightedPixelRectVector_add(final long p0, final WeightedPixelRectVector p1, final long p2, final WeightedPixelRect p3);
    
    public static final native long WeightedPixelRect_rect_get(final long p0, final WeightedPixelRect p1);
    
    public static final native void WeightedPixelRect_weight_set(final long p0, final WeightedPixelRect p1, final float p2);
    
    public static final native long YuvImage_SWIGUpcast(final long p0);
    
    public static final native long YuvReadView_chroma_read_view(final long p0, final YuvReadView p1);
    
    public static final native int YuvReadView_height(final long p0, final YuvReadView p1);
    
    public static final native long YuvReadView_luma_read_view(final long p0, final YuvReadView p1);
    
    public static final native int YuvReadView_width(final long p0, final YuvReadView p1);
    
    public static final native int YuvReadView_yuv_format(final long p0, final YuvReadView p1);
    
    public static final native void YuvWriteView_FastCrop(final long p0, final YuvWriteView p1, final int p2, final int p3, final int p4, final int p5);
    
    public static final native long YuvWriteView_SWIGUpcast(final long p0);
    
    public static final native void delete_AeModeResult(final long p0);
    
    public static final native void delete_AeResults(final long p0);
    
    public static final native void delete_AeShotParams(final long p0);
    
    public static final native void delete_AwbInfo(final long p0);
    
    public static final native void delete_BuildPayloadBurstSpecOptions(final long p0);
    
    public static final native void delete_BurstSpec(final long p0);
    
    public static final native void delete_ClientShotMetadata(final long p0);
    
    public static final native void delete_DebugParams(final long p0);
    
    public static final native void delete_DirtyLensHistory(final long p0);
    
    public static final native void delete_DngColorCalibration(final long p0);
    
    public static final native void delete_DngColorCalibrationVector(final long p0);
    
    public static final native void delete_FaceInfo(final long p0);
    
    public static final native void delete_FaceInfo_Landmark(final long p0);
    
    public static final native void delete_FloatDeque(final long p0);
    
    public static final native void delete_FloatVector(final long p0);
    
    public static final native void delete_FrameMetadata(final long p0);
    
    public static final native void delete_FrameMetadataKey(final long p0);
    
    public static final native void delete_FrameRequestVector(final long p0);
    
    public static final native void delete_Gcam(final long p0);
    
    public static final native void delete_GenerateRgbImageOptions(final long p0);
    
    public static final native void delete_GeometricCalibration(final long p0);
    
    public static final native void delete_GeometricCalibrationVector(final long p0);
    
    public static final native void delete_GrayReadViewU8(final long p0);
    
    public static final native void delete_GyroSample(final long p0);
    
    public static final native void delete_GyroSampleVector(final long p0);
    
    public static final native void delete_ImageSaverParams(final long p0);
    
    public static final native void delete_InitParams(final long p0);
    
    public static final native void delete_InterleavedImageU16(final long p0);
    
    public static final native void delete_InterleavedImageU8(final long p0);
    
    public static final native void delete_InterleavedReadViewU16(final long p0);
    
    public static final native void delete_InterleavedReadViewU8(final long p0);
    
    public static final native void delete_InterleavedWriteViewU16(final long p0);
    
    public static final native void delete_InterleavedWriteViewU8(final long p0);
    
    public static final native void delete_IspAwbMetadata(final long p0);
    
    public static final native void delete_JpgEncodeOptions(final long p0);
    
    public static final native void delete_LiveHdrMetadata(final long p0);
    
    public static final native void delete_LocationData(final long p0);
    
    public static final native void delete_MeshTranslation(final long p0);
    
    public static final native void delete_MeshWarp(final long p0);
    
    public static final native void delete_NoiseModel(final long p0);
    
    public static final native void delete_NormalizedRect(final long p0);
    
    public static final native void delete_OisMetadata(final long p0);
    
    public static final native void delete_OisPosition(final long p0);
    
    public static final native void delete_PixelRect(final long p0);
    
    public static final native void delete_PixelRectVector(final long p0);
    
    public static final native void delete_PortraitDepthArguments(final long p0);
    
    public static final native void delete_PortraitOutputs(final long p0);
    
    public static final native void delete_PortraitRequest(final long p0);
    
    public static final native void delete_PostviewParams(final long p0);
    
    public static final native void delete_QcColorCalibration(final long p0);
    
    public static final native void delete_QcColorCalibration_IlluminantData(final long p0);
    
    public static final native void delete_QcIlluminantVector(final long p0);
    
    public static final native void delete_RawImage(final long p0);
    
    public static final native void delete_RawReadView(final long p0);
    
    public static final native void delete_RawWriteView(final long p0);
    
    public static final native void delete_SceneFlicker(final long p0);
    
    public static final native void delete_ShotCallbacks(final long p0);
    
    public static final native void delete_ShotLogData(final long p0);
    
    public static final native void delete_ShotMetadata(final long p0);
    
    public static final native void delete_ShotParams(final long p0);
    
    public static final native void delete_SpatialGainMap(final long p0);
    
    public static final native void delete_StaticMetadata(final long p0);
    
    public static final native void delete_StaticMetadataVector(final long p0);
    
    public static final native void delete_StringFrameMetadataMap(final long p0);
    
    public static final native void delete_StringRawReadViewMap(final long p0);
    
    public static final native void delete_StringStaticMetadataMap(final long p0);
    
    public static final native void delete_ThreadPoolConfig(final long p0);
    
    public static final native void delete_ThreadPriority(final long p0);
    
    public static final native void delete_ViewfinderProcessingOptions(final long p0);
    
    public static final native void delete_ViewfinderResults(final long p0);
    
    public static final native void delete_WeightedNormalizedRect(final long p0);
    
    public static final native void delete_WeightedPixelRect(final long p0);
    
    public static final native void delete_YuvImage(final long p0);
    
    public static final native void delete_YuvReadView(final long p0);
    
    public static final native void delete_YuvWriteView(final long p0);
    
    public static final native long kInvalidAllocationId_get();
    
    public static final native int kInvalidShotId_get();
    
    public static final native String kRequestCameraPrimary_get();
    
    public static final native String kRequestCameraSecondaryTele_get();
    
    public static final native String kRequestCameraSecondaryWide_get();
    
    public static final native int kSensorTempUnknown_get();
    
    public static final native long new_AeMetadata();
    
    public static final native long new_AeModeResult();
    
    public static final native long new_AeResults();
    
    public static final native long new_AeShotParams__SWIG_0();
    
    public static final native long new_AeShotParams__SWIG_1(final long p0, final AeShotParams p1);
    
    public static final native long new_AfMetadata();
    
    public static final native long new_AwbInfo__SWIG_0();
    
    public static final native long new_AwbInfo__SWIG_1(final long p0, final AwbInfo p1);
    
    public static final native long new_AwbMetadata();
    
    public static final native long new_BoolVector__SWIG_0();
    
    public static final native long new_BuildPayloadBurstSpecOptions__SWIG_0();
    
    public static final native long new_BuildPayloadBurstSpecOptions__SWIG_1(final long p0, final BuildPayloadBurstSpecOptions p1);
    
    public static final native long new_BurstSpec();
    
    public static final native long new_ClientShotMetadata();
    
    public static final native long new_DebugParams();
    
    public static final native long new_DirtyLensHistory();
    
    public static final native long new_DngColorCalibration();
    
    public static final native long new_DngColorCalibrationVector__SWIG_0();
    
    public static final native long new_FaceInfo();
    
    public static final native long new_FaceInfoVector__SWIG_0();
    
    public static final native long new_FaceInfo_Landmark();
    
    public static final native long new_FloatDeque__SWIG_0();
    
    public static final native long new_FloatVector__SWIG_0();
    
    public static final native long new_FrameMetadata();
    
    public static final native long new_FrameMetadataKey(final long p0, final int p1);
    
    public static final native long new_FrameRequest();
    
    public static final native long new_FrameRequestVector__SWIG_0();
    
    public static final native long new_GenerateRgbImageOptions();
    
    public static final native long new_GeometricCalibration();
    
    public static final native long new_GeometricCalibrationVector__SWIG_0();
    
    public static final native long new_GrayReadViewU8__SWIG_0();
    
    public static final native long new_GyroSample();
    
    public static final native long new_GyroSampleVector__SWIG_0();
    
    public static final native long new_ImageSaverParams();
    
    public static final native long new_InitParams();
    
    public static final native long new_InterleavedImageF();
    
    public static final native long new_InterleavedImageU16__SWIG_0();
    
    public static final native long new_InterleavedImageU16__SWIG_1(final int p0, final int p1, final int p2);
    
    public static final native long new_InterleavedImageU8__SWIG_0();
    
    public static final native long new_InterleavedImageU8__SWIG_1(final int p0, final int p1, final int p2);
    
    public static final native long new_InterleavedReadViewU16__SWIG_0();
    
    public static final native long new_InterleavedReadViewU8__SWIG_0();
    
    public static final native long new_InterleavedWriteViewU16__SWIG_0();
    
    public static final native long new_InterleavedWriteViewU16__SWIG_1(final int p0, final int p1, final int p2, final long p3, final int p4);
    
    public static final native long new_InterleavedWriteViewU8__SWIG_0();
    
    public static final native long new_InterleavedWriteViewU8__SWIG_1(final int p0, final int p1, final int p2, final long p3, final int p4);
    
    public static final native long new_IspAwbMetadata();
    
    public static final native long new_JpgEncodeOptions();
    
    public static final native long new_LandmarkMap__SWIG_0();
    
    public static final native long new_LiveHdrMetadata();
    
    public static final native long new_LocationData();
    
    public static final native long new_MeshTranslation();
    
    public static final native long new_MeshWarp();
    
    public static final native long new_NormalizedRect();
    
    public static final native long new_OisMetadata();
    
    public static final native long new_OisPosition();
    
    public static final native long new_OisPositionVector__SWIG_0();
    
    public static final native long new_PhysicalStabilityParams();
    
    public static final native long new_PhysicalStabilityThresholds();
    
    public static final native long new_PixelRect();
    
    public static final native long new_PixelRectVector__SWIG_0();
    
    public static final native long new_PortraitDepthArguments(final long p0, final InterleavedReadViewU16 p1, final long p2, final StringRawReadViewMap p3);
    
    public static final native long new_PortraitOutputs();
    
    public static final native long new_PortraitRequest();
    
    public static final native long new_PostviewParams();
    
    public static final native long new_QcColorCalibration();
    
    public static final native long new_QcColorCalibration_IlluminantData();
    
    public static final native long new_QcIlluminantVector__SWIG_0();
    
    public static final native long new_RawImage__SWIG_0();
    
    public static final native long new_RawImage__SWIG_1(final int p0, final int p1, final int p2);
    
    public static final native long new_RawWriteView__SWIG_0();
    
    public static final native long new_RawWriteView__SWIG_1(final int p0, final int p1, final int p2, final int p3, final long p4);
    
    public static final native long new_SceneFlicker();
    
    public static final native long new_ShotCallbacks();
    
    public static final native long new_ShotLogData();
    
    public static final native long new_ShotMetadata__SWIG_0();
    
    public static final native long new_ShotParams__SWIG_0();
    
    public static final native long new_ShotParams__SWIG_1(final long p0, final ShotParams p1);
    
    public static final native long new_SpatialGainMap__SWIG_0();
    
    public static final native long new_SpatialGainMap__SWIG_1(final long p0, final InterleavedImageF p1, final boolean p2);
    
    public static final native long new_SpatialGainMap__SWIG_2(final int p0, final int p1, final boolean p2);
    
    public static final native long new_StaticMetadataVector__SWIG_0();
    
    public static final native long new_StaticMetadata__SWIG_0();
    
    public static final native long new_StaticMetadata__SWIG_1(final long p0, final StaticMetadata p1);
    
    public static final native long new_StringAeResultsMap__SWIG_0();
    
    public static final native long new_StringFrameMetadataMap__SWIG_0();
    
    public static final native long new_StringRawReadViewMap__SWIG_0();
    
    public static final native long new_StringSpatialGainMap__SWIG_0();
    
    public static final native long new_StringStaticMetadataMap__SWIG_0();
    
    public static final native long new_ThreadPoolConfig();
    
    public static final native long new_ThreadPriority();
    
    public static final native long new_ViewfinderProcessingOptions__SWIG_0();
    
    public static final native long new_ViewfinderProcessingOptions__SWIG_1(final long p0, final ViewfinderProcessingOptions p1);
    
    public static final native long new_ViewfinderResults();
    
    public static final native long new_WeightedNormalizedRect();
    
    public static final native long new_WeightedNormalizedRectVector__SWIG_0();
    
    public static final native long new_WeightedPixelRect();
    
    public static final native long new_WeightedPixelRectVector__SWIG_0();
    
    public static final native long new_YuvImage__SWIG_0();
    
    public static final native long new_YuvImage__SWIG_2(final int p0, final int p1, final int p2);
    
    public static final native long new_YuvReadView__SWIG_2(final int p0, final int p1, final int p2, final long p3, final int p4, final int p5, final int p6, final long p7, final int p8);
    
    public static final native long new_YuvReadView__SWIG_3();
    
    public static final native long new_YuvWriteView__SWIG_0();
    
    public static final native long new_YuvWriteView__SWIG_3(final int p0, final int p1, final int p2, final long p3, final int p4, final int p5, final int p6, final long p7, final int p8);
}
