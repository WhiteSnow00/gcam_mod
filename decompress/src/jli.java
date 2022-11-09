import com.google.android.camera.experimental2018.ExperimentalKeys;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CaptureResult$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jli
{
    public static final CaptureResult$Key a;
    public static final CameraCharacteristics$Key b;
    public static final CameraCharacteristics$Key c;
    public static final CameraCharacteristics$Key d;
    public static final CameraCharacteristics$Key e;
    public static final CameraCharacteristics$Key f;
    public static final CaptureRequest$Key g;
    public static final CaptureResult$Key h;
    public static final CaptureResult$Key i;
    public static final CaptureResult$Key j;
    public static final CameraCharacteristics$Key k;
    public static final CaptureResult$Key l;
    public static final CaptureResult$Key m;
    public static final CaptureResult$Key n;
    public static final CaptureResult$Key o;
    public static final CaptureResult$Key p;
    public static final CaptureResult$Key q;
    public static final CaptureRequest$Key r;
    public static final CaptureRequest$Key s;
    public static final CaptureResult$Key t;
    private static final boolean u;
    private static final boolean v;
    private static final boolean w;
    private static final boolean x;
    private static final boolean y;
    
    static {
        u = jlm.e(3);
        final boolean b2 = v = jlm.e(4);
        final boolean b3 = w = jlm.e(5);
        final boolean b4 = x = jlm.e(6);
        final boolean b5 = y = jlm.e(7);
        final boolean a2 = a(2);
        final CaptureResult$Key captureResult$Key = null;
        CaptureResult$Key a3;
        if (a2) {
            a3 = ExperimentalKeys.EXPERIMENTAL_FOCUS_OBJ_TOO_CLOSE;
        }
        else if (b2) {
            a3 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        }
        else if (b3) {
            a3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        }
        else if (b4) {
            a3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        }
        else if (b5) {
            a3 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FOCUS_OBJ_TOO_CLOSE;
        }
        else {
            a3 = null;
        }
        a = a3;
        if (a(5)) {
            final CaptureResult$Key experimental_3A_SPECTRAL_DATA = ExperimentalKeys.EXPERIMENTAL_3A_SPECTRAL_DATA;
        }
        CameraCharacteristics$Key b6;
        if (a(6)) {
            b6 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        else if (jlk.a(6)) {
            b6 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        else if (b5) {
            b6 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_COEFFICIENTS_HIGH_QUALITY;
        }
        else {
            b6 = null;
        }
        b = b6;
        CameraCharacteristics$Key c2;
        if (a(6)) {
            c2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        else if (jlk.a(6)) {
            c2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        else if (b5) {
            c2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_OPTICAL_CENTER_HIGH_QUALITY;
        }
        else {
            c2 = null;
        }
        c = c2;
        CameraCharacteristics$Key d2;
        if (a(6)) {
            d2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        else if (jlk.a(6)) {
            d2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        else if (b5) {
            d2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_NORMALIZATION_HIGH_QUALITY;
        }
        else {
            d2 = null;
        }
        d = d2;
        CameraCharacteristics$Key e2;
        if (a(6)) {
            e2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        else if (jlk.a(6)) {
            e2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        else if (b5) {
            e2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_ACTIVE_RECTANGLE_HIGH_QUALITY;
        }
        else {
            e2 = null;
        }
        e = e2;
        CameraCharacteristics$Key f2;
        if (a(6)) {
            f2 = ExperimentalKeys.EXPERIMENTAL_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        else if (jlk.a(6)) {
            f2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        else if (b5) {
            f2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_LENS_DISTORTION_VALID_RECTANGLE_HIGH_QUALITY;
        }
        else {
            f2 = null;
        }
        f = f2;
        if (a(13)) {
            final CameraCharacteristics$Key nexus_EXPERIMENTAL_FRONT_STEREO_CAL = ExperimentalKeys.NEXUS_EXPERIMENTAL_FRONT_STEREO_CAL;
        }
        if (a(7)) {
            final CaptureRequest$Key experimental_REQUEST_BAYER_GRID_STATS = ExperimentalKeys.EXPERIMENTAL_REQUEST_BAYER_GRID_STATS;
        }
        if (a(7)) {
            final CaptureResult$Key experimental_BAYER_GRID_STATS = ExperimentalKeys.EXPERIMENTAL_BAYER_GRID_STATS;
        }
        if (a(8)) {
            final CaptureResult$Key experimental_THERMAL_INFO = ExperimentalKeys.EXPERIMENTAL_THERMAL_INFO;
        }
        CaptureRequest$Key g2;
        if (a(9)) {
            g2 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_ENABLED;
        }
        else if (b2) {
            g2 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        }
        else if (b3) {
            g2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        }
        else if (b4) {
            g2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        }
        else if (b5) {
            g2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_3A_METADATA_ENABLED;
        }
        else {
            g2 = null;
        }
        g = g2;
        CaptureResult$Key h2;
        if (a(9)) {
            h2 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AEC;
        }
        else if (b2) {
            h2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        }
        else if (b3) {
            h2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        }
        else if (b4) {
            h2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        }
        else if (b5) {
            h2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AEC;
        }
        else {
            h2 = null;
        }
        h = h2;
        CaptureResult$Key i2;
        if (a(9)) {
            i2 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AF;
        }
        else if (b2) {
            i2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AF;
        }
        else if (b3) {
            i2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AF;
        }
        else if (b4) {
            i2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AF;
        }
        else if (b5) {
            i2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AF;
        }
        else {
            i2 = null;
        }
        i = i2;
        CaptureResult$Key j2;
        if (a(9)) {
            j2 = ExperimentalKeys.EXPERIMENTAL_3A_METADATA_AWB;
        }
        else if (b2) {
            j2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        }
        else if (b3) {
            j2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        }
        else if (b4) {
            j2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        }
        else if (b5) {
            j2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_3A_METADATA_AWB;
        }
        else {
            j2 = null;
        }
        j = j2;
        CameraCharacteristics$Key k2;
        if (a(12)) {
            k2 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_AVAILABLE_IDS;
        }
        else if (b2) {
            k2 = com.google.android.camera.experimental2019.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        }
        else if (b3) {
            k2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        }
        else if (b4) {
            k2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        }
        else if (b5) {
            k2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_FACE_LANDMARK_AVAILABLE_IDS;
        }
        else {
            k2 = null;
        }
        k = k2;
        CaptureResult$Key l2;
        if (a(12)) {
            l2 = ExperimentalKeys.EXPERIMENTAL_FACE_SKIPFRAME;
        }
        else if (b2) {
            l2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        }
        else if (b3) {
            l2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        }
        else if (b4) {
            l2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        }
        else if (b5) {
            l2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_SKIPFRAME;
        }
        else {
            l2 = null;
        }
        l = l2;
        CaptureResult$Key m2;
        if (a(12)) {
            m2 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_COUNT;
        }
        else if (b2) {
            m2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        }
        else if (b3) {
            m2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        }
        else if (b4) {
            m2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        }
        else if (b5) {
            m2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_COUNT;
        }
        else {
            m2 = null;
        }
        m = m2;
        CaptureResult$Key n2;
        if (a(12)) {
            n2 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_IDS;
        }
        else if (b2) {
            n2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        }
        else if (b3) {
            n2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        }
        else if (b4) {
            n2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        }
        else if (b5) {
            n2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_IDS;
        }
        else {
            n2 = null;
        }
        n = n2;
        CaptureResult$Key o2;
        if (a(12)) {
            o2 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_XY;
        }
        else if (b2) {
            o2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        }
        else if (b3) {
            o2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        }
        else if (b4) {
            o2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        }
        else if (b5) {
            o2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_XY;
        }
        else {
            o2 = null;
        }
        o = o2;
        CaptureResult$Key p2;
        if (a(12)) {
            p2 = ExperimentalKeys.EXPERIMENTAL_FACE_LANDMARK_DEPTH;
        }
        else if (b2) {
            p2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        }
        else if (b3) {
            p2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        }
        else if (b4) {
            p2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        }
        else if (b5) {
            p2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_LANDMARK_DEPTH;
        }
        else {
            p2 = null;
        }
        p = p2;
        CaptureResult$Key q2;
        if (a(12)) {
            q2 = ExperimentalKeys.EXPERIMENTAL_FACE_ORIENTATION;
        }
        else if (b2) {
            q2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        }
        else if (b3) {
            q2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        }
        else if (b4) {
            q2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        }
        else if (b5) {
            q2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_FACE_ORIENTATION;
        }
        else {
            q2 = null;
        }
        q = q2;
        CaptureRequest$Key experimental_PD_BACK_CAL_INDEX;
        if (a(11)) {
            experimental_PD_BACK_CAL_INDEX = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_INDEX;
        }
        else {
            experimental_PD_BACK_CAL_INDEX = null;
        }
        r = experimental_PD_BACK_CAL_INDEX;
        if (a(11)) {
            final CaptureResult$Key experimental_PD_BACK_CAL_DATA = ExperimentalKeys.EXPERIMENTAL_PD_BACK_CAL_DATA;
        }
        CaptureRequest$Key s2;
        if (a(16)) {
            s2 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB_ENABLED;
        }
        else if (b2) {
            s2 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        }
        else if (b3) {
            s2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        }
        else if (b4) {
            s2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        }
        else if (b5) {
            s2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AWB_ENABLED;
        }
        else {
            s2 = null;
        }
        s = s2;
        CaptureResult$Key t2;
        if (a(16)) {
            t2 = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AWB;
        }
        else if (b2) {
            t2 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        else if (b3) {
            t2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        else if (b4) {
            t2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        else if (b5) {
            t2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AWB;
        }
        else {
            t2 = captureResult$Key;
        }
        t = t2;
        if (a(16)) {
            final CaptureRequest$Key experimental_BGSTATS_AE_ENABLED = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE_ENABLED;
        }
        else if (b2) {
            final CaptureRequest$Key request_BGSTATS_AE_ENABLED = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        else if (b3) {
            final CaptureRequest$Key request_BGSTATS_AE_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        else if (b4) {
            final CaptureRequest$Key request_BGSTATS_AE_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        else if (b5) {
            final CaptureRequest$Key request_BGSTATS_AE_ENABLED4 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_BGSTATS_AE_ENABLED;
        }
        if (a(16)) {
            final CaptureResult$Key experimental_BGSTATS_AE = ExperimentalKeys.EXPERIMENTAL_BGSTATS_AE;
            return;
        }
        if (b2) {
            final CaptureResult$Key result_BGSTATS_AE = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (b3) {
            final CaptureResult$Key result_BGSTATS_AE2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (b4) {
            final CaptureResult$Key result_BGSTATS_AE3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BGSTATS_AE;
            return;
        }
        if (b5) {
            final CaptureResult$Key result_BGSTATS_AE4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_BGSTATS_AE;
        }
    }
    
    private static boolean a(final int n) {
        final boolean u = jli.u;
        boolean b = false;
        if (u) {
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
