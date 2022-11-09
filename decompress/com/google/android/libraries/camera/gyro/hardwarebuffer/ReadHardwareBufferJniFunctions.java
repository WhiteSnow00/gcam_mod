// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.camera.gyro.hardwarebuffer;

import android.hardware.HardwareBuffer;

public class ReadHardwareBufferJniFunctions
{
    static {
        krk.b(ReadHardwareBufferJniFunctions.class, "hardwarebuffer-jni");
    }
    
    public static native boolean isSupported();
    
    public static native boolean readHardwareBuffer(final HardwareBuffer p0, final byte[] p1, final int p2, final int p3, final int p4);
}
