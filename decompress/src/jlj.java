import com.google.android.camera.experimental2019.ExperimentalKeys;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlj
{
    public static final CaptureRequest$Key a;
    public static final CaptureResult$Key b;
    public static final CaptureRequest$Key c;
    public static final CaptureResult$Key d;
    public static final CaptureRequest$Key e;
    public static final CaptureRequest$Key f;
    public static final CaptureRequest$Key g;
    public static final CameraCharacteristics$Key h;
    public static final CaptureRequest$Key i;
    public static final CaptureResult$Key j;
    public static final CaptureResult$Key k;
    public static final CaptureResult$Key l;
    public static final CaptureResult$Key m;
    public static final CaptureRequest$Key n;
    public static final CaptureRequest$Key o;
    public static final CaptureRequest$Key p;
    public static final CaptureResult$Key q;
    private static final boolean r;
    private static final boolean s;
    private static final boolean t;
    private static final boolean u;
    
    static {
        r = jlm.e(4);
        final boolean b2 = s = jlm.e(5);
        final boolean b3 = t = jlm.e(6);
        final boolean b4 = u = jlm.e(7);
        final boolean a2 = a(1);
        final CaptureResult$Key captureResult$Key = null;
        CaptureRequest$Key a3;
        if (a2) {
            a3 = ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        else if (b2) {
            a3 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        else if (b3) {
            a3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        else if (b4) {
            a3 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LENS_SHADING_STATS_ENABLED;
        }
        else {
            a3 = null;
        }
        a = a3;
        if (a(1)) {
            final CaptureResult$Key result_LENS_SHADING_STATS_ENABLED = ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_SHADING_STATS_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        else if (b3) {
            final CaptureResult$Key result_LENS_SHADING_STATS_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        else if (b4) {
            final CaptureResult$Key result_LENS_SHADING_STATS_ENABLED4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS_ENABLED;
        }
        if (a(1)) {
            final CaptureResult$Key result_LENS_SHADING_STATS = ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        else if (b2) {
            final CaptureResult$Key result_LENS_SHADING_STATS2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        else if (b3) {
            final CaptureResult$Key result_LENS_SHADING_STATS3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        else if (b4) {
            final CaptureResult$Key result_LENS_SHADING_STATS4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LENS_SHADING_STATS;
        }
        if (a(2)) {
            final CaptureRequest$Key request_GCAM_AE_MOTION_EF_ENABLED = ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b2) {
            final CaptureRequest$Key request_GCAM_AE_MOTION_EF_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b3) {
            final CaptureRequest$Key request_GCAM_AE_MOTION_EF_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b4) {
            final CaptureRequest$Key request_GCAM_AE_MOTION_EF_ENABLED4 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_GCAM_AE_MOTION_EF_ENABLED;
        }
        if (a(2)) {
            final CaptureResult$Key result_GCAM_AE_MOTION_EF_ENABLED = ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_GCAM_AE_MOTION_EF_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b3) {
            final CaptureResult$Key result_GCAM_AE_MOTION_EF_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        else if (b4) {
            final CaptureResult$Key result_GCAM_AE_MOTION_EF_ENABLED4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_MOTION_EF_ENABLED;
        }
        CaptureResult$Key b5;
        if (a(2)) {
            b5 = ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        }
        else if (b2) {
            b5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        }
        else if (b3) {
            b5 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        }
        else if (b4) {
            b5 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_GCAM_AE_OUTPUT;
        }
        else {
            b5 = null;
        }
        b = b5;
        CaptureRequest$Key c2;
        if (a(2)) {
            c2 = ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        }
        else if (b2) {
            c2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        }
        else if (b3) {
            c2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        }
        else if (b4) {
            c2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_LIVE_HDR_SETTINGS;
        }
        else {
            c2 = null;
        }
        c = c2;
        CaptureResult$Key d2;
        if (a(2)) {
            d2 = ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        }
        else if (b2) {
            d2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        }
        else if (b3) {
            d2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        }
        else if (b4) {
            d2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_LIVE_HDR_SETTINGS;
        }
        else {
            d2 = null;
        }
        d = d2;
        CaptureRequest$Key e2;
        if (a(3)) {
            e2 = ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        }
        else if (b2) {
            e2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        }
        else if (b3) {
            e2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IPE_INFO_ENABLED;
        }
        else {
            e2 = null;
        }
        e = e2;
        if (a(3)) {
            final CaptureResult$Key result_IPE_INFO_ENABLED = ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_IPE_INFO_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        else if (b3) {
            final CaptureResult$Key result_IPE_INFO_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO_ENABLED;
        }
        if (a(3)) {
            final CaptureResult$Key result_IPE_INFO = ExperimentalKeys.RESULT_IPE_INFO;
        }
        else if (b2) {
            final CaptureResult$Key result_IPE_INFO2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IPE_INFO;
        }
        else if (b3) {
            final CaptureResult$Key result_IPE_INFO3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IPE_INFO;
        }
        CaptureRequest$Key f2;
        if (a(3)) {
            f2 = ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        }
        else if (b2) {
            f2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        }
        else if (b3) {
            f2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_IFE_INFO_ENABLED;
        }
        else {
            f2 = null;
        }
        f = f2;
        if (a(3)) {
            final CaptureResult$Key result_IFE_INFO_ENABLED = ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_IFE_INFO_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        else if (b3) {
            final CaptureResult$Key result_IFE_INFO_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO_ENABLED;
        }
        if (a(3)) {
            final CaptureResult$Key result_IFE_INFO = ExperimentalKeys.RESULT_IFE_INFO;
        }
        else if (b2) {
            final CaptureResult$Key result_IFE_INFO2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_IFE_INFO;
        }
        else if (b3) {
            final CaptureResult$Key result_IFE_INFO3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_IFE_INFO;
        }
        CaptureRequest$Key g2;
        if (a(3)) {
            g2 = ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        }
        else if (b2) {
            g2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        }
        else if (b3) {
            g2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_BPS_INFO_ENABLED;
        }
        else {
            g2 = null;
        }
        g = g2;
        if (a(3)) {
            final CaptureResult$Key result_BPS_INFO_ENABLED = ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        else if (b2) {
            final CaptureResult$Key result_BPS_INFO_ENABLED2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        else if (b3) {
            final CaptureResult$Key result_BPS_INFO_ENABLED3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO_ENABLED;
        }
        if (a(3)) {
            final CaptureResult$Key result_BPS_INFO = ExperimentalKeys.RESULT_BPS_INFO;
        }
        else if (b2) {
            final CaptureResult$Key result_BPS_INFO2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_BPS_INFO;
        }
        else if (b3) {
            final CaptureResult$Key result_BPS_INFO3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_BPS_INFO;
        }
        CameraCharacteristics$Key h2;
        if (a(4)) {
            h2 = ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        }
        else if (b2) {
            h2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        }
        else if (b3) {
            h2 = com.google.android.camera.experimental2020.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        }
        else if (b4) {
            h2 = com.google.android.camera.experimental2021.ExperimentalKeys.CHARACTERISTICS_MESH_WARP_AVAILABLE_MODES;
        }
        else {
            h2 = null;
        }
        h = h2;
        CaptureRequest$Key i2;
        if (a(4)) {
            i2 = ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        }
        else if (b2) {
            i2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        }
        else if (b3) {
            i2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        }
        else if (b4) {
            i2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_MESH_WARP_MODE;
        }
        else {
            i2 = null;
        }
        i = i2;
        if (a(4)) {
            final CaptureResult$Key result_MESH_WARP_MODE = ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        else if (b2) {
            final CaptureResult$Key result_MESH_WARP_MODE2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        else if (b3) {
            final CaptureResult$Key result_MESH_WARP_MODE3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        else if (b4) {
            final CaptureResult$Key result_MESH_WARP_MODE4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_MODE;
        }
        CaptureResult$Key j2;
        if (a(4)) {
            j2 = ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        }
        else if (b2) {
            j2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        }
        else if (b3) {
            j2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        }
        else if (b4) {
            j2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_SIZE;
        }
        else {
            j2 = null;
        }
        j = j2;
        CaptureResult$Key k2;
        if (a(4)) {
            k2 = ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        }
        else if (b2) {
            k2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        }
        else if (b3) {
            k2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        }
        else if (b4) {
            k2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_CROP_REGION;
        }
        else {
            k2 = null;
        }
        k = k2;
        CaptureResult$Key l2;
        if (a(4)) {
            l2 = ExperimentalKeys.RESULT_MESH_WARP_DATA;
        }
        else if (b2) {
            l2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        }
        else if (b3) {
            l2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        }
        else if (b4) {
            l2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_DATA;
        }
        else {
            l2 = null;
        }
        l = l2;
        CaptureResult$Key m2;
        if (a(8)) {
            m2 = ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        }
        else if (b2) {
            m2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        }
        else if (b3) {
            m2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        }
        else if (b4) {
            m2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_MESH_WARP_IS_IDENTITY_TRANSFORM;
        }
        else {
            m2 = null;
        }
        m = m2;
        CaptureRequest$Key n2;
        if (a(5)) {
            n2 = ExperimentalKeys.REQUEST_HDRNET_MODE;
        }
        else if (b2) {
            n2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HDRNET_MODE;
        }
        else if (b3) {
            n2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HDRNET_MODE;
        }
        else if (b4) {
            n2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HDRNET_MODE;
        }
        else {
            n2 = null;
        }
        n = n2;
        if (a(5)) {
            final CaptureResult$Key result_HDRNET_MODE = ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        else if (b2) {
            final CaptureResult$Key result_HDRNET_MODE2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        else if (b3) {
            final CaptureResult$Key result_HDRNET_MODE3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        else if (b4) {
            final CaptureResult$Key result_HDRNET_MODE4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HDRNET_MODE;
        }
        CaptureRequest$Key o2;
        if (a(6)) {
            o2 = ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        }
        else if (b2) {
            o2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        }
        else if (b3) {
            o2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        }
        else if (b4) {
            o2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AUTO_3A_SCENE_MODE;
        }
        else {
            o2 = null;
        }
        o = o2;
        if (a(6)) {
            final CaptureResult$Key result_AUTO_3A_SCENE_MODE = ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        else if (b2) {
            final CaptureResult$Key result_AUTO_3A_SCENE_MODE2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        else if (b3) {
            final CaptureResult$Key result_AUTO_3A_SCENE_MODE3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        else if (b4) {
            final CaptureResult$Key result_AUTO_3A_SCENE_MODE4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AUTO_3A_SCENE_MODE;
        }
        CaptureRequest$Key p2;
        if (a(7)) {
            p2 = ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        }
        else if (b2) {
            p2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        }
        else if (b3) {
            p2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        }
        else if (b4) {
            p2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_AF_RESCAN_FRAME_COUNT;
        }
        else {
            p2 = null;
        }
        p = p2;
        CaptureResult$Key q2;
        if (a(7)) {
            q2 = ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        else if (b2) {
            q2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        else if (b3) {
            q2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        else if (b4) {
            q2 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_AF_RESCAN_FRAME_COUNT;
        }
        else {
            q2 = captureResult$Key;
        }
        q = q2;
        if (a(10)) {
            final CaptureRequest$Key request_SENSOR_MODE_FULLFOV = ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        else if (b2) {
            final CaptureRequest$Key request_SENSOR_MODE_FULLFOV2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        else if (b3) {
            final CaptureRequest$Key request_SENSOR_MODE_FULLFOV3 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        else if (b4) {
            final CaptureRequest$Key request_SENSOR_MODE_FULLFOV4 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_SENSOR_MODE_FULLFOV;
        }
        if (a(10)) {
            final CaptureResult$Key result_SENSOR_MODE_FULLFOV = ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        else if (b2) {
            final CaptureResult$Key result_SENSOR_MODE_FULLFOV2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        else if (b3) {
            final CaptureResult$Key result_SENSOR_MODE_FULLFOV3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        else if (b4) {
            final CaptureResult$Key result_SENSOR_MODE_FULLFOV4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_SENSOR_MODE_FULLFOV;
        }
        if (a(11)) {
            final CaptureResult$Key result_RLS_ENABLE = ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (jlk.a(3)) {
            final CaptureResult$Key result_RLS_ENABLE2 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_RLS_ENABLE;
            return;
        }
        if (b4) {
            final CaptureResult$Key result_RLS_ENABLE3 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_RLS_ENABLE;
        }
    }
    
    private static boolean a(final int n) {
        final boolean r = jlj.r;
        boolean b = false;
        if (r) {
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
