import com.google.android.camera.experimental2017.ExperimentalKeys;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CameraCharacteristics$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlh
{
    public static final CameraCharacteristics$Key a;
    public static final CaptureRequest$Key b;
    public static final CaptureResult$Key c;
    public static final CaptureResult$Key d;
    @Deprecated
    public static final CaptureResult$Key e;
    @Deprecated
    public static final CaptureResult$Key f;
    public static final CaptureResult$Key g;
    public static final CaptureResult$Key h;
    public static final CaptureResult$Key i;
    public static final CaptureRequest$Key j;
    public static final CaptureRequest$Key k;
    public static final CameraCharacteristics$Key l;
    public static final CameraCharacteristics$Key m;
    public static final CameraCharacteristics$Key n;
    public static final CameraCharacteristics$Key o;
    public static final CaptureRequest$Key p;
    public static final Integer q;
    public static final CaptureResult$Key r;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    
    static {
        final boolean b2 = s = jlm.e(2);
        final boolean b3 = t = jlm.e(3);
        final boolean b4 = u = jlm.e(4);
        final boolean b5 = v = jlm.e(5);
        final boolean b6 = w = jlm.e(6);
        final boolean b7 = x = jlm.e(7);
        if (b2) {
            final CaptureRequest$Key experimental_STATS_HISTOGRAM_MODE = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM_MODE;
        }
        if (b2) {
            final CameraCharacteristics$Key experimental_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_AVAILABLE_HISTOGRAM_BUCKET_COUNTS;
        }
        if (b2) {
            final CaptureRequest$Key experimental_STATS_HISTOGRM_BUCKET_COUNT = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRM_BUCKET_COUNT;
        }
        if (b2) {
            final CaptureResult$Key experimental_STATS_HISTOGRAM = ExperimentalKeys.EXPERIMENTAL_STATS_HISTOGRAM;
        }
        final CaptureResult$Key captureResult$Key = null;
        CameraCharacteristics$Key experimental_SENSOR_EEPROM_INFORMATION;
        if (b2) {
            experimental_SENSOR_EEPROM_INFORMATION = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_INFORMATION;
        }
        else {
            experimental_SENSOR_EEPROM_INFORMATION = null;
        }
        a = experimental_SENSOR_EEPROM_INFORMATION;
        if (b2 && g()) {
            final CameraCharacteristics$Key experimental_SENSOR_PD_DIMENSIONS = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_DIMENSIONS;
        }
        CaptureRequest$Key experimental_SENSOR_PD_ENABLE;
        if (b2 && g()) {
            experimental_SENSOR_PD_ENABLE = ExperimentalKeys.EXPERIMENTAL_SENSOR_PD_ENABLE;
        }
        else {
            experimental_SENSOR_PD_ENABLE = null;
        }
        b = experimental_SENSOR_PD_ENABLE;
        if (b2) {
            final CaptureRequest$Key experimental_CONTROL_TRACKING_AF_TRIGGER = ExperimentalKeys.EXPERIMENTAL_CONTROL_TRACKING_AF_TRIGGER;
        }
        if (b2) {
            final CaptureResult$Key experimental_CONTROL_AF_REGIONS_CONFIDENCE = ExperimentalKeys.EXPERIMENTAL_CONTROL_AF_REGIONS_CONFIDENCE;
        }
        if (b2) {
            final CaptureResult$Key experimental_STATS_OIS_FRAME_TIMESTAMP_VSYNC = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_VSYNC;
        }
        CaptureResult$Key experimental_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME;
        if (b2) {
            experimental_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME;
        }
        else {
            experimental_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME = null;
        }
        c = experimental_STATS_OIS_FRAME_TIMESTAMP_BOOTTIME;
        CaptureResult$Key experimental_STATS_OIS_TIMESTAMPS_BOOTTIME;
        if (b2) {
            experimental_STATS_OIS_TIMESTAMPS_BOOTTIME = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_TIMESTAMPS_BOOTTIME;
        }
        else {
            experimental_STATS_OIS_TIMESTAMPS_BOOTTIME = null;
        }
        d = experimental_STATS_OIS_TIMESTAMPS_BOOTTIME;
        CaptureResult$Key experimental_STATS_OIS_SHIFT_X;
        if (b2) {
            experimental_STATS_OIS_SHIFT_X = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_X;
        }
        else {
            experimental_STATS_OIS_SHIFT_X = null;
        }
        e = experimental_STATS_OIS_SHIFT_X;
        CaptureResult$Key experimental_STATS_OIS_SHIFT_Y;
        if (b2) {
            experimental_STATS_OIS_SHIFT_Y = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_Y;
        }
        else {
            experimental_STATS_OIS_SHIFT_Y = null;
        }
        f = experimental_STATS_OIS_SHIFT_Y;
        CaptureResult$Key experimental_STATS_OIS_SHIFT_PIXEL_X;
        if (b2 && e()) {
            experimental_STATS_OIS_SHIFT_PIXEL_X = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_X;
        }
        else {
            experimental_STATS_OIS_SHIFT_PIXEL_X = null;
        }
        g = experimental_STATS_OIS_SHIFT_PIXEL_X;
        CaptureResult$Key experimental_STATS_OIS_SHIFT_PIXEL_Y;
        if (b2 && e()) {
            experimental_STATS_OIS_SHIFT_PIXEL_Y = ExperimentalKeys.EXPERIMENTAL_STATS_OIS_SHIFT_PIXEL_Y;
        }
        else {
            experimental_STATS_OIS_SHIFT_PIXEL_Y = null;
        }
        h = experimental_STATS_OIS_SHIFT_PIXEL_Y;
        CaptureResult$Key experimental_CONTROL_EXP_TIME_BOOST;
        if (b2 && a()) {
            experimental_CONTROL_EXP_TIME_BOOST = ExperimentalKeys.EXPERIMENTAL_CONTROL_EXP_TIME_BOOST;
        }
        else {
            experimental_CONTROL_EXP_TIME_BOOST = null;
        }
        i = experimental_CONTROL_EXP_TIME_BOOST;
        if (c()) {
            final CaptureResult$Key experimental_REQUEST_NEXT_STILL_INTENT_REQUEST_READY = ExperimentalKeys.EXPERIMENTAL_REQUEST_NEXT_STILL_INTENT_REQUEST_READY;
        }
        if (c()) {
            final CaptureRequest$Key experimental_REQUEST_POSTVIEW = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW;
        }
        if (c()) {
            final CaptureResult$Key experimental_REQUEST_POSTVIEW_CONFIG = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_CONFIG;
        }
        if (c()) {
            final CaptureResult$Key experimental_REQUEST_POSTVIEW_DATA = ExperimentalKeys.EXPERIMENTAL_REQUEST_POSTVIEW_DATA;
        }
        CaptureRequest$Key experimental_CONTINUOUS_ZSL_CAPTURE;
        if (c()) {
            experimental_CONTINUOUS_ZSL_CAPTURE = ExperimentalKeys.EXPERIMENTAL_CONTINUOUS_ZSL_CAPTURE;
        }
        else {
            experimental_CONTINUOUS_ZSL_CAPTURE = null;
        }
        j = experimental_CONTINUOUS_ZSL_CAPTURE;
        CaptureRequest$Key k2;
        if (b2 && b()) {
            k2 = ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        }
        else if (b3 && b()) {
            k2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DISABLE_HDRPLUS;
        }
        else if (b4) {
            k2 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        }
        else if (b5) {
            k2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        }
        else if (b6) {
            k2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        }
        else if (b7) {
            k2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_DISABLE_HDRPLUS;
        }
        else {
            k2 = null;
        }
        k = k2;
        if (h()) {
            final CaptureResult$Key experimental_CONTROL_SCENE_DISTANCE = ExperimentalKeys.EXPERIMENTAL_CONTROL_SCENE_DISTANCE;
        }
        if (b2 && f()) {
            final CameraCharacteristics$Key experimental_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_RIGHT_GAIN_MAP;
        }
        if (b2 && f()) {
            final CameraCharacteristics$Key experimental_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_LEFT_GAIN_MAP;
        }
        if (b2 && f()) {
            final CameraCharacteristics$Key experimental_SENSOR_EEPROM_PDAF_DCC = ExperimentalKeys.EXPERIMENTAL_SENSOR_EEPROM_PDAF_DCC;
        }
        CameraCharacteristics$Key l2;
        if (b2 && i()) {
            l2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else if (b3 && i()) {
            l2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else if (b4) {
            l2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else if (b5) {
            l2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else if (b6) {
            l2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else if (b7) {
            l2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_NUM_LIGHTS;
        }
        else {
            l2 = null;
        }
        l = l2;
        CameraCharacteristics$Key m2;
        if (b2 && i()) {
            m2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else if (b3 && i()) {
            m2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else if (b4) {
            m2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else if (b5) {
            m2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else if (b6) {
            m2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else if (b7) {
            m2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_R_OVER_G_RATIOS;
        }
        else {
            m2 = null;
        }
        m = m2;
        CameraCharacteristics$Key n2;
        if (b2 && i()) {
            n2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else if (b3 && i()) {
            n2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else if (b4) {
            n2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else if (b5) {
            n2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else if (b6) {
            n2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else if (b7) {
            n2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_B_OVER_G_RATIOS;
        }
        else {
            n2 = null;
        }
        n = n2;
        CameraCharacteristics$Key o2;
        if (b2 && i()) {
            o2 = ExperimentalKeys.NEXUS_EXPERIMENTAL_2017_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else if (b3 && i()) {
            o2 = com.google.android.camera.experimental2018.ExperimentalKeys.NEXUS_EXPERIMENTAL_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else if (b4) {
            o2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else if (b5) {
            o2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else if (b6) {
            o2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else if (b7) {
            o2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_EEPROM_WB_CALIB_GR_OVER_GB_RATIO;
        }
        else {
            o2 = null;
        }
        o = o2;
        CaptureRequest$Key p2;
        if (b2 && d()) {
            p2 = ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        }
        else if (b3 && d()) {
            p2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_MOTION_DETECTION_ENABLE;
        }
        else if (b4) {
            p2 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        }
        else if (b5) {
            p2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        }
        else if (b6) {
            p2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        }
        else if (b7) {
            p2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_STATS_MOTION_DETECTION_ENABLE;
        }
        else {
            p2 = null;
        }
        p = p2;
        q = 1;
        if (b2 && d()) {
            final CaptureResult$Key experimental_STATS_CAMERA_MOTION_X = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        }
        else if (b3 && d()) {
            final CaptureResult$Key experimental_STATS_CAMERA_MOTION_X2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_X;
        }
        else if (b4) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_X = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        else if (b5) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_X2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        else if (b6) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_X3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        else if (b7) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_X4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_X;
        }
        if (b2 && d()) {
            final CaptureResult$Key experimental_STATS_CAMERA_MOTION_Y = ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        }
        else if (b3 && d()) {
            final CaptureResult$Key experimental_STATS_CAMERA_MOTION_Y2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_CAMERA_MOTION_Y;
        }
        else if (b4) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_Y = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        else if (b5) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_Y2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        else if (b6) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_Y3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        else if (b7) {
            final CaptureResult$Key result_STATS_CAMERA_MOTION_Y4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_CAMERA_MOTION_Y;
        }
        CaptureResult$Key r2;
        if (b2 && d()) {
            r2 = ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        }
        else if (b3 && d()) {
            r2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_STATS_SUBJECT_MOTION;
        }
        else if (b4) {
            r2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        else if (b5) {
            r2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        else if (b6) {
            r2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        else if (b7) {
            r2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STATS_SUBJECT_MOTION;
        }
        else {
            r2 = captureResult$Key;
        }
        r = r2;
    }
    
    private static boolean a() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 2) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean b() {
        final boolean s = jlh.s;
        boolean b = true;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 5) {
                    return b;
                }
                b = false;
                return b;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                return false;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                return false;
            }
        }
        if (jlh.t && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() >= 3) {
            return b;
        }
        b = false;
        return b;
    }
    
    private static boolean c() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 4) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean d() {
        final boolean s = jlh.s;
        boolean b = true;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 9) {
                    return b;
                }
                b = false;
                return b;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                return false;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                return false;
            }
        }
        if (jlh.t && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() >= 4) {
            return b;
        }
        b = false;
        return b;
    }
    
    private static boolean e() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 3) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean f() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 7) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean g() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() > 0) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean h() {
        final boolean s = jlh.s;
        boolean b = false;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 6) {
                    b = true;
                }
            }
            catch (final NoSuchMethodError noSuchMethodError) {}
            catch (final NoSuchFieldError noSuchFieldError) {}
        }
        return b;
    }
    
    private static boolean i() {
        final boolean s = jlh.s;
        boolean b = true;
        if (s) {
            try {
                if (ExperimentalKeys.getLibraryVersion() >= 10) {
                    return b;
                }
                b = false;
                return b;
            }
            catch (final NoSuchMethodError noSuchMethodError) {
                return false;
            }
            catch (final NoSuchFieldError noSuchFieldError) {
                return false;
            }
        }
        if (jlh.t && com.google.android.camera.experimental2018.ExperimentalKeys.getLibraryVersion() > 0) {
            return b;
        }
        b = false;
        return b;
    }
}
