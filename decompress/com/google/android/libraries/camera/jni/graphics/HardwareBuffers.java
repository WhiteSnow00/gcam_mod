// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.jni.graphics;

import android.hardware.HardwareBuffer;

public class HardwareBuffers
{
    static {
        krk.b(HardwareBuffers.class, "graphics-jni");
    }
    
    private HardwareBuffers() {
    }
    
    public static native HardwareBuffer fork(final HardwareBuffer p0);
    
    public static native boolean lockingIsSupported();
}
