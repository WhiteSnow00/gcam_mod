import com.google.android.camera.experimental2021.ExperimentalKeys;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jll
{
    public static final CaptureRequest$Key a;
    public static final CaptureRequest$Key b;
    public static final CaptureRequest$Key c;
    public static final CaptureResult$Key d;
    public static final CaptureResult$Key e;
    public static final CaptureResult$Key f;
    public static final CaptureRequest$Key g;
    public static final CaptureResult$Key h;
    public static final CaptureRequest$Key i;
    public static final CameraCharacteristics$Key j;
    public static final CameraCharacteristics$Key k;
    public static final CaptureRequest$Key l;
    private static final boolean m;
    
    static {
        m = jlm.e(7);
        final boolean a2 = a(1);
        final CaptureRequest$Key captureRequest$Key = null;
        CaptureRequest$Key request_MANUAL_AWB_CONTROL_MODE;
        if (a2) {
            request_MANUAL_AWB_CONTROL_MODE = ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_MODE;
        }
        else {
            request_MANUAL_AWB_CONTROL_MODE = null;
        }
        a = request_MANUAL_AWB_CONTROL_MODE;
        if (a(1)) {
            final CaptureResult$Key result_MANUAL_AWB_CONTROL_MODE = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_MODE;
        }
        CaptureRequest$Key request_MANUAL_AWB_CONTROL_FACTORS;
        if (a(1)) {
            request_MANUAL_AWB_CONTROL_FACTORS = ExperimentalKeys.REQUEST_MANUAL_AWB_CONTROL_FACTORS;
        }
        else {
            request_MANUAL_AWB_CONTROL_FACTORS = null;
        }
        b = request_MANUAL_AWB_CONTROL_FACTORS;
        if (a(1)) {
            final CaptureResult$Key result_MANUAL_AWB_CONTROL_FACTORS = ExperimentalKeys.RESULT_MANUAL_AWB_CONTROL_FACTORS;
        }
        if (a(2)) {
            final CaptureResult$Key result_BABY_MODE_ENABLED = ExperimentalKeys.RESULT_BABY_MODE_ENABLED;
        }
        if (a(3)) {
            final CaptureRequest$Key request_DYNAMIC_PROFILING_ENABLED = ExperimentalKeys.REQUEST_DYNAMIC_PROFILING_ENABLED;
        }
        if (a(3)) {
            final CaptureResult$Key result_DYNAMIC_PROFILING_ENABLED = ExperimentalKeys.RESULT_DYNAMIC_PROFILING_ENABLED;
        }
        CaptureRequest$Key request_MOTION_DEBLUR_ENABLED;
        if (a(4)) {
            request_MOTION_DEBLUR_ENABLED = ExperimentalKeys.REQUEST_MOTION_DEBLUR_ENABLED;
        }
        else {
            request_MOTION_DEBLUR_ENABLED = null;
        }
        c = request_MOTION_DEBLUR_ENABLED;
        CaptureResult$Key result_MOTION_DEBLUR_ENABLED;
        if (a(4)) {
            result_MOTION_DEBLUR_ENABLED = ExperimentalKeys.RESULT_MOTION_DEBLUR_ENABLED;
        }
        else {
            result_MOTION_DEBLUR_ENABLED = null;
        }
        d = result_MOTION_DEBLUR_ENABLED;
        CaptureResult$Key result_MOTION_DEBLUR_VALID_PHYSICAL_RESULT;
        if (a(4)) {
            result_MOTION_DEBLUR_VALID_PHYSICAL_RESULT = ExperimentalKeys.RESULT_MOTION_DEBLUR_VALID_PHYSICAL_RESULT;
        }
        else {
            result_MOTION_DEBLUR_VALID_PHYSICAL_RESULT = null;
        }
        e = result_MOTION_DEBLUR_VALID_PHYSICAL_RESULT;
        if (a(5)) {
            final CaptureRequest$Key request_SIMPLE_COMPUTER_VISION_MODE_ENABLE = ExperimentalKeys.REQUEST_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(6)) {
            final CaptureResult$Key result_SIMPLE_COMPUTER_VISION_MODE_ENABLE = ExperimentalKeys.RESULT_SIMPLE_COMPUTER_VISION_MODE_ENABLE;
        }
        if (a(7)) {
            final CaptureRequest$Key request_FACE_AUTH_USE_CASE = ExperimentalKeys.REQUEST_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACE_AUTH_USE_CASE = ExperimentalKeys.RESULT_FACE_AUTH_USE_CASE;
        }
        if (a(7)) {
            final CaptureRequest$Key request_FACEAUTH_FACE_REGIONS = ExperimentalKeys.REQUEST_FACEAUTH_FACE_REGIONS;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACEAUTH_FACE_REGIONS = ExperimentalKeys.RESULT_FACEAUTH_FACE_REGIONS;
        }
        if (a(8)) {
            final CaptureRequest$Key request_FAMILIAR_FACE_TRUETONE = ExperimentalKeys.REQUEST_FAMILIAR_FACE_TRUETONE;
        }
        CaptureResult$Key result_FAMILIAR_FACE_TRUETONE;
        if (a(8)) {
            result_FAMILIAR_FACE_TRUETONE = ExperimentalKeys.RESULT_FAMILIAR_FACE_TRUETONE;
        }
        else {
            result_FAMILIAR_FACE_TRUETONE = null;
        }
        f = result_FAMILIAR_FACE_TRUETONE;
        CaptureRequest$Key request_LOOKAHEAD_EIS_MODE_ENABLED;
        if (a(9)) {
            request_LOOKAHEAD_EIS_MODE_ENABLED = ExperimentalKeys.REQUEST_LOOKAHEAD_EIS_MODE_ENABLED;
        }
        else {
            request_LOOKAHEAD_EIS_MODE_ENABLED = null;
        }
        g = request_LOOKAHEAD_EIS_MODE_ENABLED;
        if (a(9)) {
            final CaptureResult$Key result_LOOKAHEAD_EIS_MODE_ENABLED = ExperimentalKeys.RESULT_LOOKAHEAD_EIS_MODE_ENABLED;
        }
        if (a(10)) {
            final CaptureRequest$Key request_DISTANCE_WATER_LEVEL = ExperimentalKeys.REQUEST_DISTANCE_WATER_LEVEL;
        }
        if (a(10)) {
            final CaptureResult$Key result_DISTANCE_WATER_LEVEL = ExperimentalKeys.RESULT_DISTANCE_WATER_LEVEL;
        }
        if (a(11)) {
            final CaptureRequest$Key request_DEBUG_UI_ENABLED = ExperimentalKeys.REQUEST_DEBUG_UI_ENABLED;
        }
        if (a(11)) {
            final CaptureResult$Key result_DEBUG_UI_ENABLED = ExperimentalKeys.RESULT_DEBUG_UI_ENABLED;
        }
        CaptureResult$Key result_AF_DEBUG_UI_BLOB;
        if (a(11)) {
            result_AF_DEBUG_UI_BLOB = ExperimentalKeys.RESULT_AF_DEBUG_UI_BLOB;
        }
        else {
            result_AF_DEBUG_UI_BLOB = null;
        }
        h = result_AF_DEBUG_UI_BLOB;
        CaptureRequest$Key request_OIS_JITTER_MODE_ENABLED;
        if (a(12)) {
            request_OIS_JITTER_MODE_ENABLED = ExperimentalKeys.REQUEST_OIS_JITTER_MODE_ENABLED;
        }
        else {
            request_OIS_JITTER_MODE_ENABLED = null;
        }
        i = request_OIS_JITTER_MODE_ENABLED;
        if (a(12)) {
            final CaptureResult$Key result_OIS_JITTER_MODE_ENABLED = ExperimentalKeys.RESULT_OIS_JITTER_MODE_ENABLED;
        }
        if (a(13)) {
            final CaptureRequest$Key request_GCAM_AE_MOTION_METERING_OPTIONS = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        if (a(13)) {
            final CaptureResult$Key result_GCAM_AE_MOTION_METERING_OPTIONS = ExperimentalKeys.RESULT_GCAM_AE_MOTION_METERING_OPTIONS;
        }
        if (a(14)) {
            final CaptureRequest$Key request_SEGMENTATION_MASK_PORTRAIT_REQUESTED = ExperimentalKeys.REQUEST_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        }
        if (a(14)) {
            final CaptureResult$Key result_SEGMENTATION_MASK_PORTRAIT_REQUESTED = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT_REQUESTED;
        }
        if (a(14)) {
            final CaptureResult$Key result_SEGMENTATION_MASK_PORTRAIT = ExperimentalKeys.RESULT_SEGMENTATION_MASK_PORTRAIT;
        }
        CameraCharacteristics$Key characteristics_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE;
        if (a(15)) {
            characteristics_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE = ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE;
        }
        else {
            characteristics_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE = null;
        }
        j = characteristics_FLOAT_SENSOR_INFO_SENSITIVITY_RANGE;
        CameraCharacteristics$Key characteristics_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY;
        if (a(15)) {
            characteristics_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY = ExperimentalKeys.CHARACTERISTICS_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY;
        }
        else {
            characteristics_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY = null;
        }
        k = characteristics_FLOAT_SENSOR_MAX_ANALOG_SENSITIVITY;
        CaptureRequest$Key request_MOTION_DEBLUR_FOLLOWER_ENABLED;
        if (a(16)) {
            request_MOTION_DEBLUR_FOLLOWER_ENABLED = ExperimentalKeys.REQUEST_MOTION_DEBLUR_FOLLOWER_ENABLED;
        }
        else {
            request_MOTION_DEBLUR_FOLLOWER_ENABLED = captureRequest$Key;
        }
        l = request_MOTION_DEBLUR_FOLLOWER_ENABLED;
        if (a(16)) {
            final CaptureResult$Key result_MOTION_DEBLUR_FOLLOWER_ENABLED = ExperimentalKeys.RESULT_MOTION_DEBLUR_FOLLOWER_ENABLED;
        }
    }
    
    public static boolean a(final int n) {
        final boolean m = jll.m;
        boolean b = false;
        if (m) {
            try {
                if (n <= ExperimentalKeys.getLibraryVersion()) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
}
