import com.google.android.camera.experimental2020.ExperimentalKeys;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlk
{
    public static final CaptureRequest$Key a;
    public static final CaptureRequest$Key b;
    public static final CameraCharacteristics$Key c;
    public static final CaptureRequest$Key d;
    public static final CaptureResult$Key e;
    public static final CaptureResult$Key f;
    public static final CaptureResult$Key g;
    public static final CaptureRequest$Key h;
    public static final CaptureResult$Key i;
    public static final CaptureResult$Key j;
    public static final CaptureResult$Key k;
    public static final CaptureRequest$Key l;
    public static final CaptureResult$Key m;
    public static final CaptureResult$Key n;
    public static final CaptureResult$Key o;
    public static final CaptureRequest$Key p;
    public static final CaptureRequest$Key q;
    public static final CaptureResult$Key r;
    private static final boolean s;
    private static final boolean t;
    
    static {
        jlm.e(5);
        s = jlm.e(6);
        final boolean b2 = t = jlm.e(7);
        if (a(1)) {
            final CaptureRequest$Key request_FAMILIAR_FACE = ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        }
        else if (b2) {
            final CaptureRequest$Key request_FAMILIAR_FACE2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE;
        }
        if (a(1)) {
            final CaptureResult$Key result_FAMILIAR_FACE = ExperimentalKeys.RESULT_FAMILIAR_FACE;
        }
        else if (b2) {
            final CaptureResult$Key result_FAMILIAR_FACE2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE;
        }
        if (a(1)) {
            final CaptureRequest$Key request_FAMILIAR_FACE_ENABLED = ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        }
        else if (b2) {
            final CaptureRequest$Key request_FAMILIAR_FACE_ENABLED2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FAMILIAR_FACE_ENABLED;
        }
        if (a(1)) {
            final CaptureResult$Key result_FAMILIAR_FACE_ENABLED = ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_FAMILIAR_FACE_ENABLED2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FAMILIAR_FACE_ENABLED;
        }
        final boolean a2 = a(2);
        final CaptureResult$Key captureResult$Key = null;
        CaptureRequest$Key a3;
        if (a2) {
            a3 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        }
        else if (b2) {
            a3 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS;
        }
        else {
            a3 = null;
        }
        a = a3;
        if (a(2)) {
            final CaptureResult$Key result_FLASHLIGHT_BRIGHTNESS = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        }
        else if (b2) {
            final CaptureResult$Key result_FLASHLIGHT_BRIGHTNESS2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS;
        }
        CaptureRequest$Key b3;
        if (a(2)) {
            b3 = ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        else if (b2) {
            b3 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        else {
            b3 = null;
        }
        b = b3;
        if (a(2)) {
            final CaptureResult$Key result_FLASHLIGHT_BRIGHTNESS_ENABLED = ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_FLASHLIGHT_BRIGHTNESS_ENABLED2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLASHLIGHT_BRIGHTNESS_ENABLED;
        }
        CameraCharacteristics$Key c2;
        if (a(2)) {
            c2 = ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        }
        else if (b2) {
            c2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FLASHLIGHT_BRIGHTNESS_LEVEL_MAX;
        }
        else {
            c2 = null;
        }
        c = c2;
        CaptureRequest$Key d2;
        if (a(4)) {
            d2 = ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        }
        else if (b2) {
            d2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SMOOTHY_MODE;
        }
        else {
            d2 = null;
        }
        d = d2;
        if (a(4)) {
            final CaptureResult$Key result_SMOOTHY_MODE = ExperimentalKeys.RESULT_SMOOTHY_MODE;
        }
        else if (b2) {
            final CaptureResult$Key result_SMOOTHY_MODE2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SMOOTHY_MODE;
        }
        CaptureResult$Key e2;
        if (a(5)) {
            e2 = ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        }
        else if (b2) {
            e2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_DETECTION_TIMESTAMP;
        }
        else {
            e2 = null;
        }
        e = e2;
        if (a(7)) {
            final CameraCharacteristics$Key characteristics_FACE_ATTRIBUTE_AVAILABLE_IDS = ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        }
        else if (b2) {
            final CameraCharacteristics$Key characteristics_FACE_ATTRIBUTE_AVAILABLE_IDS2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_ATTRIBUTE_AVAILABLE_IDS;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_COUNT = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        }
        else if (b2) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_COUNT2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_COUNT;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_IDS = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        }
        else if (b2) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_IDS2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_IDS;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_SCORES = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        }
        else if (b2) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_SCORES2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_SCORES;
        }
        if (a(7)) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_VALUE = ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        }
        else if (b2) {
            final CaptureResult$Key result_FACE_ATTRIBUTE_VALUE2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ATTRIBUTE_VALUE;
        }
        if (a(6)) {
            final CaptureResult$Key result_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY = ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        if (a(6)) {
            final CaptureResult$Key result_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY = ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        if (a(6)) {
            final CaptureResult$Key result_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY = ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        if (a(6)) {
            final CaptureResult$Key result_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY = ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        if (a(6)) {
            final CaptureResult$Key result_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY = ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        CaptureResult$Key f2;
        if (a(8)) {
            f2 = ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        }
        else if (b2) {
            f2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_FREQ_HIGH_RES;
        }
        else {
            f2 = null;
        }
        f = f2;
        CaptureResult$Key g2;
        if (a(8)) {
            g2 = ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        }
        else if (b2) {
            g2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLICKER_CONF_HIGH_RES;
        }
        else {
            g2 = null;
        }
        g = g2;
        CaptureRequest$Key h2;
        if (a(9)) {
            h2 = ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        }
        else if (b2) {
            h2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_LOGGING_STATS_ENABLED;
        }
        else {
            h2 = null;
        }
        h = h2;
        if (a(9)) {
            final CaptureResult$Key result_3A_LOGGING_STATS_ENABLED = ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_3A_LOGGING_STATS_ENABLED2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_LOGGING_STATS_ENABLED;
        }
        CaptureResult$Key i2;
        if (a(9)) {
            i2 = ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        }
        else if (b2) {
            i2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_LOGGING_STATS_BLOB;
        }
        else {
            i2 = null;
        }
        i = i2;
        CaptureResult$Key j2;
        if (a(9)) {
            j2 = ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        }
        else if (b2) {
            j2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_LOGGING_STATS_BLOB;
        }
        else {
            j2 = null;
        }
        j = j2;
        CaptureResult$Key k2;
        if (a(9)) {
            k2 = ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        }
        else if (b2) {
            k2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_LOGGING_STATS_BLOB;
        }
        else {
            k2 = null;
        }
        k = k2;
        CaptureRequest$Key l2;
        if (a(9)) {
            l2 = ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        }
        else if (b2) {
            l2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_VIDEO_METADATA_ENABLED;
        }
        else {
            l2 = null;
        }
        l = l2;
        if (a(9)) {
            final CaptureResult$Key result_3A_VIDEO_METADATA_ENABLED = ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_3A_VIDEO_METADATA_ENABLED2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_VIDEO_METADATA_ENABLED;
        }
        CaptureResult$Key m2;
        if (a(9)) {
            m2 = ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        }
        else if (b2) {
            m2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AEC_VIDEO_DEBUG_BLOB;
        }
        else {
            m2 = null;
        }
        m = m2;
        CaptureResult$Key n2;
        if (a(9)) {
            n2 = ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        }
        else if (b2) {
            n2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_VIDEO_DEBUG_BLOB;
        }
        else {
            n2 = null;
        }
        n = n2;
        CaptureResult$Key o2;
        if (a(9)) {
            o2 = ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        }
        else if (b2) {
            o2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AWB_VIDEO_DEBUG_BLOB;
        }
        else {
            o2 = null;
        }
        o = o2;
        if (a(10)) {
            final CaptureResult$Key result_STOKES_THERMAL_STATUS = ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        }
        else if (b2) {
            final CaptureResult$Key result_STOKES_THERMAL_STATUS2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_STOKES_THERMAL_STATUS;
        }
        CaptureRequest$Key p2;
        if (a(11)) {
            p2 = ExperimentalKeys.REQUEST_EIS_MODE;
        }
        else if (b2) {
            p2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_EIS_MODE;
        }
        else {
            p2 = null;
        }
        p = p2;
        if (a(11)) {
            final CaptureResult$Key result_EIS_MODE = ExperimentalKeys.RESULT_EIS_MODE;
        }
        else if (b2) {
            final CaptureResult$Key result_EIS_MODE2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_EIS_MODE;
        }
        CaptureRequest$Key q2;
        if (a(12)) {
            q2 = ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        }
        else if (b2) {
            q2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SKIP_3A_PROCESS;
        }
        else {
            q2 = null;
        }
        q = q2;
        if (a(12)) {
            final CaptureResult$Key result_SKIP_3A_PROCESS = ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        }
        else if (b2) {
            final CaptureResult$Key result_SKIP_3A_PROCESS2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SKIP_3A_PROCESS;
        }
        CaptureResult$Key r2;
        if (a(13)) {
            r2 = ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        }
        else if (b2) {
            r2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FLOAT_SENSOR_SENSITIVITY;
        }
        else {
            r2 = captureResult$Key;
        }
        r = r2;
    }
    
    public static boolean a(final int n) {
        final boolean s = jlk.s;
        boolean b = false;
        if (s) {
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
