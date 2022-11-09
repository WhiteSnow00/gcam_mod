import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureRequest$Key;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlg
{
    public static final CaptureRequest$Key a;
    public static final CaptureResult$Key b;
    private static final boolean c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;
    private static final boolean g;
    private static final boolean h;
    private static final boolean i;
    private static final boolean j;
    
    static {
        final boolean b2 = c = jlm.e(1);
        final boolean b3 = d = jlm.e(2);
        final boolean b4 = e = jlm.e(3);
        final boolean b5 = f = jlm.e(4);
        final boolean b6 = g = jlm.e(5);
        final boolean b7 = h = jlm.e(6);
        final boolean b8 = i = jlm.e(7);
        j = true;
        CaptureRequest$Key a2;
        if (b2) {
            a2 = ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        }
        else if (b3) {
            a2 = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        }
        else if (b4) {
            a2 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE;
        }
        else if (b5) {
            a2 = com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        }
        else if (b6) {
            a2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        }
        else if (b7) {
            a2 = com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        }
        else if (b8) {
            a2 = com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE;
        }
        else {
            a2 = null;
        }
        a = a2;
        if (b2) {
            final CaptureResult$Key experimental_DYNAMIC_HYBRID_AE = ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        }
        else if (b3) {
            final CaptureResult$Key experimental_DYNAMIC_HYBRID_AE2 = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        }
        else if (b4) {
            final CaptureResult$Key experimental_DYNAMIC_HYBRID_AE3 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        }
        else if (b5) {
            final CaptureResult$Key result_HYBRID_AE_ENABLE = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        else if (b6) {
            final CaptureResult$Key result_HYBRID_AE_ENABLE2 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        else if (b7) {
            final CaptureResult$Key result_HYBRID_AE_ENABLE3 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        else if (b8) {
            final CaptureResult$Key result_HYBRID_AE_ENABLE4 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        b = CaptureResult.CONTROL_AF_SCENE_CHANGE;
    }
}
