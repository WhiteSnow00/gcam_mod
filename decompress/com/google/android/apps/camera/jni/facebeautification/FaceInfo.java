// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.facebeautification;

import android.graphics.Point;
import android.graphics.Rect;

public abstract class FaceInfo
{
    public static egy builder(final Rect a) {
        final egy egy = new egy();
        if (a != null) {
            egy.a = a;
            return egy;
        }
        throw new NullPointerException("Null bounds");
    }
    
    public abstract Rect bounds();
    
    public abstract Point leftEarTragion();
    
    public abstract Point leftEye();
    
    public abstract Point mouthCenter();
    
    public abstract Point noseTip();
    
    public abstract Point rightEarTragion();
    
    public abstract Point rightEye();
}
