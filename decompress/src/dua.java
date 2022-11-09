import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.BoolVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotLogData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dua
{
    public nzk a;
    
    public dua(final ShotLogData shotLogData, int n) {
        this.a = nzk.ax;
        final okt m = nzk.ax.m();
        final float shotLogData_ae_confidence_short_exposure_get = GcamModuleJNI.ShotLogData_ae_confidence_short_exposure_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk = (nzk)m.b;
        nzk.a |= 0x2;
        nzk.d = shotLogData_ae_confidence_short_exposure_get;
        final float shotLogData_ae_confidence_long_exposure_get = GcamModuleJNI.ShotLogData_ae_confidence_long_exposure_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk2 = (nzk)m.b;
        nzk2.a |= 0x4;
        nzk2.e = shotLogData_ae_confidence_long_exposure_get;
        final float shotLogData_ae_confidence_single_exposure_get = GcamModuleJNI.ShotLogData_ae_confidence_single_exposure_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk3 = (nzk)m.b;
        nzk3.a |= 0x8;
        nzk3.f = shotLogData_ae_confidence_single_exposure_get;
        final float shotLogData_ideal_range_compression_get = GcamModuleJNI.ShotLogData_ideal_range_compression_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk4 = (nzk)m.b;
        nzk4.a |= 0x10;
        nzk4.g = shotLogData_ideal_range_compression_get;
        final float shotLogData_actual_range_compression_get = GcamModuleJNI.ShotLogData_actual_range_compression_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk5 = (nzk)m.b;
        nzk5.a |= 0x20;
        nzk5.h = shotLogData_actual_range_compression_get;
        final float shotLogData_pure_fraction_of_pixels_from_long_exposure_get = GcamModuleJNI.ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk6 = (nzk)m.b;
        nzk6.a |= 0x20000000;
        nzk6.E = shotLogData_pure_fraction_of_pixels_from_long_exposure_get;
        final float shotLogData_weighted_fraction_of_pixels_from_long_exposure_get = GcamModuleJNI.ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk7 = (nzk)m.b;
        nzk7.a |= 0x40000000;
        nzk7.F = shotLogData_weighted_fraction_of_pixels_from_long_exposure_get;
        final float shotLogData_short_exp_adjustment_factor_get = GcamModuleJNI.ShotLogData_short_exp_adjustment_factor_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk8 = (nzk)m.b;
        nzk8.a |= 0x80;
        nzk8.i = shotLogData_short_exp_adjustment_factor_get;
        final float shotLogData_long_exp_adjustment_factor_get = GcamModuleJNI.ShotLogData_long_exp_adjustment_factor_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk9 = (nzk)m.b;
        nzk9.a |= 0x100;
        nzk9.j = shotLogData_long_exp_adjustment_factor_get;
        final float shotLogData_log_scene_brightness_get = GcamModuleJNI.ShotLogData_log_scene_brightness_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk10 = (nzk)m.b;
        nzk10.a |= 0x200;
        nzk10.k = shotLogData_log_scene_brightness_get;
        final int shotLogData_metering_frame_count_get = GcamModuleJNI.ShotLogData_metering_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk11 = (nzk)m.b;
        nzk11.a |= 0x400;
        nzk11.l = shotLogData_metering_frame_count_get;
        final int shotLogData_original_payload_frame_count_get = GcamModuleJNI.ShotLogData_original_payload_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk12 = (nzk)m.b;
        nzk12.a |= 0x800;
        nzk12.m = shotLogData_original_payload_frame_count_get;
        final int shotLogData_base_frame_index_get = GcamModuleJNI.ShotLogData_base_frame_index_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk13 = (nzk)m.b;
        nzk13.a |= 0x1000;
        nzk13.n = shotLogData_base_frame_index_get;
        final long shotLogData_base_frame_timestamp_ns_get = GcamModuleJNI.ShotLogData_base_frame_timestamp_ns_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk14 = (nzk)m.b;
        nzk14.c |= 0x800;
        nzk14.au = shotLogData_base_frame_timestamp_ns_get;
        final long shotLogData_metering_frame_timestamp_ns_get = GcamModuleJNI.ShotLogData_metering_frame_timestamp_ns_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk15 = (nzk)m.b;
        nzk15.c |= 0x1000;
        nzk15.av = shotLogData_metering_frame_timestamp_ns_get;
        final long shotLogData_earliest_psl_frame_timestamp_ns_get = GcamModuleJNI.ShotLogData_earliest_psl_frame_timestamp_ns_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk16 = (nzk)m.b;
        nzk16.c |= 0x2000;
        nzk16.aw = shotLogData_earliest_psl_frame_timestamp_ns_get;
        final int shotLogData_merged_frame_count_get = GcamModuleJNI.ShotLogData_merged_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk17 = (nzk)m.b;
        nzk17.a |= 0x2000;
        nzk17.o = shotLogData_merged_frame_count_get;
        final boolean shotLogData_zsl_get = GcamModuleJNI.ShotLogData_zsl_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk18 = (nzk)m.b;
        nzk18.a |= 0x40000;
        nzk18.s = shotLogData_zsl_get;
        final float shotLogData_time_to_shot_get = GcamModuleJNI.ShotLogData_time_to_shot_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk19 = (nzk)m.b;
        nzk19.a |= 0x8000;
        nzk19.p = shotLogData_time_to_shot_get;
        final float shotLogData_time_to_postview_get = GcamModuleJNI.ShotLogData_time_to_postview_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk20 = (nzk)m.b;
        nzk20.a |= 0x10000;
        nzk20.q = shotLogData_time_to_postview_get;
        final boolean h = n == 1;
        nzk20.b |= 0x1;
        nzk20.H = h;
        final boolean r = shotLogData.a() == 1;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk21 = (nzk)m.b;
        nzk21.a |= 0x20000;
        nzk21.r = r;
        final float shotLogData_capture_time_get = GcamModuleJNI.ShotLogData_capture_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk22 = (nzk)m.b;
        nzk22.a |= 0x80000;
        nzk22.v = shotLogData_capture_time_get;
        final float shotLogData_postview_callback_time_get = GcamModuleJNI.ShotLogData_postview_callback_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk23 = (nzk)m.b;
        nzk23.a |= 0x100000;
        nzk23.w = shotLogData_postview_callback_time_get;
        final float shotLogData_merge_process_time_get = GcamModuleJNI.ShotLogData_merge_process_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk24 = (nzk)m.b;
        nzk24.a |= 0x200000;
        nzk24.x = shotLogData_merge_process_time_get;
        final float shotLogData_merged_raw_callback_time_get = GcamModuleJNI.ShotLogData_merged_raw_callback_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk25 = (nzk)m.b;
        nzk25.a |= 0x400000;
        nzk25.y = shotLogData_merged_raw_callback_time_get;
        final float shotLogData_finish_process_time_get = GcamModuleJNI.ShotLogData_finish_process_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk26 = (nzk)m.b;
        nzk26.a |= 0x800000;
        nzk26.z = shotLogData_finish_process_time_get;
        final float shotLogData_final_image_callback_time_get = GcamModuleJNI.ShotLogData_final_image_callback_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk27 = (nzk)m.b;
        nzk27.a |= 0x1000000;
        nzk27.A = shotLogData_final_image_callback_time_get;
        final float shotLogData_jpeg_encode_time_get = GcamModuleJNI.ShotLogData_jpeg_encode_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk28 = (nzk)m.b;
        nzk28.a |= 0x2000000;
        nzk28.B = shotLogData_jpeg_encode_time_get;
        final float shotLogData_jpeg_callback_time_get = GcamModuleJNI.ShotLogData_jpeg_callback_time_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk29 = (nzk)m.b;
        nzk29.a |= 0x4000000;
        nzk29.C = shotLogData_jpeg_callback_time_get;
        final boolean shotLogData_aborted_get = GcamModuleJNI.ShotLogData_aborted_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk30 = (nzk)m.b;
        nzk30.a |= 0x10000000;
        nzk30.D = shotLogData_aborted_get;
        final float shotLogData_cpu_usage_factor_get = GcamModuleJNI.ShotLogData_cpu_usage_factor_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk31 = (nzk)m.b;
        nzk31.a |= Integer.MIN_VALUE;
        nzk31.G = shotLogData_cpu_usage_factor_get;
        switch (GcamModuleJNI.ShotLogData_ux_mode_get(shotLogData.a, shotLogData)) {
            default: {
                n = 1;
                break;
            }
            case 4: {
                n = 5;
                break;
            }
            case 3: {
                n = 4;
                break;
            }
            case 2: {
                n = 3;
                break;
            }
            case 1: {
                n = 2;
                break;
            }
        }
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk32 = (nzk)m.b;
        nzk32.I = n - 1;
        nzk32.b |= 0x8;
        final float shotLogData_scene_motion_pix_per_ms_get = GcamModuleJNI.ShotLogData_scene_motion_pix_per_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk33 = (nzk)m.b;
        nzk33.b |= 0x10;
        nzk33.J = shotLogData_scene_motion_pix_per_ms_get;
        final float shotLogData_scene_motion_20_sample_std_pix_per_ms_get = GcamModuleJNI.ShotLogData_scene_motion_20_sample_std_pix_per_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk34 = (nzk)m.b;
        nzk34.b |= 0x80;
        nzk34.L = shotLogData_scene_motion_20_sample_std_pix_per_ms_get;
        final float shotLogData_scene_motion_10_sample_std_pix_per_ms_get = GcamModuleJNI.ShotLogData_scene_motion_10_sample_std_pix_per_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk35 = (nzk)m.b;
        nzk35.b |= 0x100;
        nzk35.M = shotLogData_scene_motion_10_sample_std_pix_per_ms_get;
        final float shotLogData_percentage_valid_motion_samples_in_20_samples_get = GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_20_samples_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk36 = (nzk)m.b;
        nzk36.b |= 0x200;
        nzk36.N = shotLogData_percentage_valid_motion_samples_in_20_samples_get;
        final float shotLogData_percentage_valid_motion_samples_in_10_samples_get = GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_10_samples_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk37 = (nzk)m.b;
        nzk37.b |= 0x400;
        nzk37.O = shotLogData_percentage_valid_motion_samples_in_10_samples_get;
        n = GcamModuleJNI.ShotLogData_number_gyro_samples_used_for_metering_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk38 = (nzk)m.b;
        nzk38.b |= 0x800;
        nzk38.P = n;
        final float shotLogData_std_angular_speed_rad_per_sec_get = GcamModuleJNI.ShotLogData_std_angular_speed_rad_per_sec_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk39 = (nzk)m.b;
        nzk39.b |= 0x1000;
        nzk39.Q = shotLogData_std_angular_speed_rad_per_sec_get;
        final float shotLogData_percentage_valid_gyro_samples_used_for_metering_get = GcamModuleJNI.ShotLogData_percentage_valid_gyro_samples_used_for_metering_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk40 = (nzk)m.b;
        nzk40.b |= 0x2000;
        nzk40.R = shotLogData_percentage_valid_gyro_samples_used_for_metering_get;
        final float shotLogData_max_exposure_time_ms_get = GcamModuleJNI.ShotLogData_max_exposure_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk41 = (nzk)m.b;
        nzk41.b |= 0x40;
        nzk41.K = shotLogData_max_exposure_time_ms_get;
        final float shotLogData_base_frame_snr_get = GcamModuleJNI.ShotLogData_base_frame_snr_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk42 = (nzk)m.b;
        nzk42.b |= 0x4000;
        nzk42.S = shotLogData_base_frame_snr_get;
        final float shotLogData_merged_frame_snr_get = GcamModuleJNI.ShotLogData_merged_frame_snr_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk43 = (nzk)m.b;
        nzk43.c |= 0x10;
        nzk43.an = shotLogData_merged_frame_snr_get;
        n = GcamModuleJNI.ShotLogData_base_frame_temporal_binning_factor_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk44 = (nzk)m.b;
        nzk44.b |= 0x8000;
        nzk44.T = n;
        final float shotLogData_temporal_binning_mean_run_time_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_mean_run_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk45 = (nzk)m.b;
        nzk45.b |= 0x10000;
        nzk45.U = shotLogData_temporal_binning_mean_run_time_ms_get;
        final float shotLogData_temporal_binning_min_run_time_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_min_run_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk46 = (nzk)m.b;
        nzk46.b |= 0x20000;
        nzk46.V = shotLogData_temporal_binning_min_run_time_ms_get;
        final float shotLogData_temporal_binning_max_run_time_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_max_run_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk47 = (nzk)m.b;
        nzk47.b |= 0x40000;
        nzk47.W = shotLogData_temporal_binning_max_run_time_ms_get;
        final float shotLogData_temporal_binning_target_exposure_time_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_target_exposure_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk48 = (nzk)m.b;
        nzk48.b |= 0x80000;
        nzk48.X = shotLogData_temporal_binning_target_exposure_time_ms_get;
        final float shotLogData_temporal_binning_target_tet_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_target_tet_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk49 = (nzk)m.b;
        nzk49.b |= 0x100000;
        nzk49.Y = shotLogData_temporal_binning_target_tet_ms_get;
        final float shotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk50 = (nzk)m.b;
        nzk50.b |= 0x200000;
        nzk50.Z = shotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get;
        final float shotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get = GcamModuleJNI.ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk51 = (nzk)m.b;
        nzk51.b |= 0x400000;
        nzk51.aa = shotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get;
        n = GcamModuleJNI.ShotLogData_psaf_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk52 = (nzk)m.b;
        nzk52.b |= 0x800000;
        nzk52.ac = n;
        final float shotLogData_preview_focus_distance_diopters_get = GcamModuleJNI.ShotLogData_preview_focus_distance_diopters_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk53 = (nzk)m.b;
        nzk53.b |= 0x1000000;
        nzk53.ad = shotLogData_preview_focus_distance_diopters_get;
        final float shotLogData_payload_focus_distance_diopters_get = GcamModuleJNI.ShotLogData_payload_focus_distance_diopters_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk54 = (nzk)m.b;
        nzk54.b |= 0x2000000;
        nzk54.ae = shotLogData_payload_focus_distance_diopters_get;
        final boolean shotLogData_sky_segmentation_used_get = GcamModuleJNI.ShotLogData_sky_segmentation_used_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk55 = (nzk)m.b;
        nzk55.b |= 0x4000000;
        nzk55.af = shotLogData_sky_segmentation_used_get;
        final boolean shotLogData_sky_segmentation_failed_get = GcamModuleJNI.ShotLogData_sky_segmentation_failed_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk56 = (nzk)m.b;
        nzk56.c |= 0x4;
        nzk56.al = shotLogData_sky_segmentation_failed_get;
        n = GcamModuleJNI.ShotLogData_sky_segmentation_total_time_ms_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk57 = (nzk)m.b;
        nzk57.b |= 0x8000000;
        nzk57.ag = n;
        final float shotLogData_sky_mask_ratio_get = GcamModuleJNI.ShotLogData_sky_mask_ratio_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk58 = (nzk)m.b;
        nzk58.b |= 0x10000000;
        nzk58.ah = shotLogData_sky_mask_ratio_get;
        final float shotLogData_sky_darkening_strength_get = GcamModuleJNI.ShotLogData_sky_darkening_strength_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk59 = (nzk)m.b;
        nzk59.b |= 0x40000000;
        nzk59.ai = shotLogData_sky_darkening_strength_get;
        final float shotLogData_sky_contrast_enhancement_strength_get = GcamModuleJNI.ShotLogData_sky_contrast_enhancement_strength_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk60 = (nzk)m.b;
        nzk60.c |= 0x8;
        nzk60.am = shotLogData_sky_contrast_enhancement_strength_get;
        final float shotLogData_sky_snr_get = GcamModuleJNI.ShotLogData_sky_snr_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk61 = (nzk)m.b;
        nzk61.c |= 0x20;
        nzk61.ao = shotLogData_sky_snr_get;
        n = GcamModuleJNI.ShotLogData_hot_pixels_in_base_frame_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk62 = (nzk)m.b;
        nzk62.c |= 0x1;
        nzk62.aj = n;
        n = GcamModuleJNI.ShotLogData_hot_pixels_in_total_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk63 = (nzk)m.b;
        nzk63.c |= 0x2;
        nzk63.ak = n;
        final boolean shotLogData_shasta_enabled_get = GcamModuleJNI.ShotLogData_shasta_enabled_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk64 = (nzk)m.b;
        nzk64.c |= 0x40;
        nzk64.ap = shotLogData_shasta_enabled_get;
        n = GcamModuleJNI.ShotLogData_shasta_captured_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk65 = (nzk)m.b;
        nzk65.c |= 0x80;
        nzk65.aq = n;
        n = GcamModuleJNI.ShotLogData_shasta_merged_frame_count_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk66 = (nzk)m.b;
        nzk66.c |= 0x100;
        nzk66.ar = n;
        final float shotLogData_shasta_exposure_time_ratio_get = GcamModuleJNI.ShotLogData_shasta_exposure_time_ratio_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk67 = (nzk)m.b;
        nzk67.c |= 0x200;
        nzk67.as = shotLogData_shasta_exposure_time_ratio_get;
        final float shotLogData_shasta_tet_ratio_get = GcamModuleJNI.ShotLogData_shasta_tet_ratio_get(shotLogData.a, shotLogData);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzk nzk68 = (nzk)m.b;
        nzk68.c |= 0x400;
        nzk68.at = shotLogData_shasta_tet_ratio_get;
        FloatVector b;
        float a;
        nzk nzk69;
        ole t;
        for (b = shotLogData.b(), n = 0; n < b.b(); ++n) {
            a = b.a(n);
            if (m.c) {
                m.m();
                m.c = false;
            }
            nzk69 = (nzk)m.b;
            t = nzk69.t;
            if (!t.c()) {
                nzk69.t = oky.w(t);
            }
            nzk69.t.g(a);
        }
        final long shotLogData_was_payload_frame_merged_get = GcamModuleJNI.ShotLogData_was_payload_frame_merged_get(shotLogData.a, shotLogData);
        BoolVector boolVector;
        if (shotLogData_was_payload_frame_merged_get == 0L) {
            boolVector = null;
        }
        else {
            boolVector = new BoolVector(shotLogData_was_payload_frame_merged_get);
        }
        boolean boolVector_get;
        nzk nzk70;
        ola u;
        int size;
        int n2;
        for (n = 0; n < GcamModuleJNI.BoolVector_size(boolVector.a, boolVector); ++n) {
            boolVector_get = GcamModuleJNI.BoolVector_get(boolVector.a, boolVector, n);
            if (m.c) {
                m.m();
                m.c = false;
            }
            nzk70 = (nzk)m.b;
            u = nzk70.u;
            if (!u.c()) {
                size = u.size();
                if (size == 0) {
                    n2 = 10;
                }
                else {
                    n2 = size + size;
                }
                nzk70.u = u.d(n2);
            }
            nzk70.u.f(boolVector_get);
        }
        final long shotLogData_payload_frame_scene_motion_pix_per_ms_get = GcamModuleJNI.ShotLogData_payload_frame_scene_motion_pix_per_ms_get(shotLogData.a, shotLogData);
        FloatVector floatVector;
        if (shotLogData_payload_frame_scene_motion_pix_per_ms_get == 0L) {
            floatVector = null;
        }
        else {
            floatVector = new FloatVector(shotLogData_payload_frame_scene_motion_pix_per_ms_get, false);
        }
        float a2;
        nzk nzk71;
        ole ab;
        for (n = 0; n < floatVector.b(); ++n) {
            a2 = floatVector.a(n);
            if (m.c) {
                m.m();
                m.c = false;
            }
            nzk71 = (nzk)m.b;
            ab = nzk71.ab;
            if (!ab.c()) {
                nzk71.ab = oky.w(ab);
            }
            nzk71.ab.g(a2);
        }
        this.a = (nzk)m.h();
    }
}
