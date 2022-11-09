// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.lightcycle.panorama;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle$LightCycleProgressCallback;

public class LightCycleNative
{
    static {
        System.loadLibrary("lightcycle");
    }
    
    public static native String AddImage(final float[] p0);
    
    public static native void AlignNextImage();
    
    public static native float CalibrateFieldOfViewDeg(final String p0);
    
    public static native boolean CanUndo();
    
    public static native void CreateFrameTexture(final int p0);
    
    public static native int CreateNewStitchingSession();
    
    public static native int DeviceOrientationStatus();
    
    public static native float[] EndGyroCalibration(final float[] p0, final int p1, final int p2);
    
    public static native void FinishCapture(final boolean p0, final String p1, final String p2, final int p3);
    
    public static native float[] GetFrameGeometry(final int p0, final int p1);
    
    public static native int GetNumCapturedTargets();
    
    public static native int GetNumTotalTargets();
    
    public static native int GetTargetInRange();
    
    public static native NewTarget[] GetTargets();
    
    public static native void Init(final int p0, final int p1, final float p2, final LightCycle$LightCycleProgressCallback p3);
    
    public static native void InitFrameTexture(final int p0, final int p1, final int p2);
    
    public static native NewTarget[] InitTargets(final float[] p0);
    
    public static native boolean MovingTooFast();
    
    public static native boolean PhotoSkippedTooFast();
    
    public static native float[] ProcessFrame(final byte[] p0, final int p1, final int p2, final boolean p3);
    
    public static native boolean RenderNextSession(final int p0);
    
    public static native void ResetForFisheyeCapture(final String p0, final float p1);
    
    public static native void ResetForHorizontalCapture(final String p0, final float p1);
    
    public static native void ResetForPhotoSphereCapture(final String p0, final float p1);
    
    public static native void ResetForVerticalCapture(final String p0, final float p1);
    
    public static native void ResetForWideCapture(final String p0, final float p1);
    
    public static native void ResetTargets();
    
    public static native void SetAppVersion(final String p0);
    
    public static native void SetFilteredRotation(final float[] p0);
    
    public static native void SetOutputResolutionLarge();
    
    public static native void SetSensorMovementTooFast(final boolean p0);
    
    public static native void SetTargetHitAngleRadians(final float p0);
    
    public static native void StartGyroCalibration(final float p0);
    
    public static native boolean TakeNewPhoto();
    
    public static native boolean TargetHit();
    
    public static native boolean UndoAddImage();
    
    public static native void UpdateFrameTexture(final int p0);
}
