import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.HashMap;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle$LightCycleProgressCallback;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esh
{
    public static final Object a;
    public static Boolean b;
    public static final Map c;
    public static final LightCycle$LightCycleProgressCallback d;
    
    static {
        a = new Object();
        esh.b = false;
        c = new HashMap();
        d = new LightCycle$LightCycleProgressCallback();
    }
    
    public static float a(final String s) {
        return LightCycleNative.CalibrateFieldOfViewDeg(s);
    }
    
    public static int b() {
        return LightCycleNative.CreateNewStitchingSession();
    }
    
    public static int c() {
        synchronized (esh.a) {
            if (esh.b) {
                return LightCycleNative.DeviceOrientationStatus();
            }
            throw new IllegalStateException("State is not ready.");
        }
    }
    
    public static int d() {
        return LightCycleNative.GetNumCapturedTargets();
    }
    
    public static int e() {
        return LightCycleNative.GetNumTotalTargets();
    }
    
    public static int f() {
        return LightCycleNative.GetTargetInRange();
    }
    
    public static void g() {
        LightCycleNative.AlignNextImage();
    }
    
    public static void h(final int n) {
        LightCycleNative.CreateFrameTexture(n);
    }
    
    public static void i(final int n, final int n2, final int n3) {
        LightCycleNative.InitFrameTexture(n, n2, n3);
    }
    
    public static void j(final String s, final float n) {
        synchronized (esh.a) {
            LightCycleNative.ResetForPhotoSphereCapture(s, n);
            esh.b = true;
        }
    }
    
    public static void k() {
        LightCycleNative.ResetTargets();
    }
    
    public static void l(final String s) {
        LightCycleNative.SetAppVersion(s);
    }
    
    public static void m(final float[] array) {
        LightCycleNative.SetFilteredRotation(array);
    }
    
    public static void n() {
        LightCycleNative.SetOutputResolutionLarge();
    }
    
    public static void o(final boolean b) {
        LightCycleNative.SetSensorMovementTooFast(b);
    }
    
    public static void p(final float n) {
        LightCycleNative.StartGyroCalibration(n);
    }
    
    public static void q(final int n) {
        LightCycleNative.UpdateFrameTexture(n);
    }
    
    public static boolean r() {
        return LightCycleNative.CanUndo();
    }
    
    public static boolean s() {
        return LightCycleNative.MovingTooFast();
    }
    
    public static boolean t() {
        return LightCycleNative.PhotoSkippedTooFast();
    }
    
    public static boolean u() {
        return LightCycleNative.TakeNewPhoto();
    }
    
    public static boolean v() {
        return LightCycleNative.TargetHit();
    }
    
    public static float[] w(final float[] array, final int n, final int n2) {
        return LightCycleNative.EndGyroCalibration(array, n, n2);
    }
    
    public static void x(final int n) {
        LightCycleNative.RenderNextSession(n);
    }
}
