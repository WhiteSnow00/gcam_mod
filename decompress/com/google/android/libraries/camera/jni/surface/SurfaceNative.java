// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.jni.surface;

import android.view.Surface;

public class SurfaceNative
{
    static {
        krk.b(SurfaceNative.class, "surface-jni");
    }
    
    public static native int setSurfaceGeometry(final Surface p0, final int p1, final int p2, final int p3);
    
    public static native int setSurfaceTransform(final Surface p0, final int p1);
}
