// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

import android.hardware.HardwareBuffer;

public class LockedHardwareBuffer implements AutoCloseable
{
    private long a;
    
    private LockedHardwareBuffer(final HardwareBuffer hardwareBuffer, long lockHardwareBuffer) {
        hardwareBuffer.getClass();
        lockHardwareBuffer = lockHardwareBuffer(hardwareBuffer, lockHardwareBuffer);
        this.a = lockHardwareBuffer;
        njo.e(lockHardwareBuffer != 0L, "Failed to lock HardwareBuffer.");
    }
    
    public static LockedHardwareBuffer c(final HardwareBuffer hardwareBuffer, final long n) {
        return new LockedHardwareBuffer(hardwareBuffer, n);
    }
    
    private static native long getInterleavedReadViewU8Impl(final long p0);
    
    private static native long getInterleavedWriteViewU8Impl(final long p0);
    
    private static native long lockHardwareBuffer(final HardwareBuffer p0, final long p1);
    
    private static native void unlockHardwareBuffer(final long p0);
    
    public final InterleavedReadViewU8 a() {
        return new InterleavedReadViewU8(getInterleavedReadViewU8Impl(this.a));
    }
    
    public final InterleavedWriteViewU8 b() {
        return new InterleavedWriteViewU8(getInterleavedWriteViewU8Impl(this.a));
    }
    
    @Override
    public final void close() {
        final long a = this.a;
        if (a != 0L) {
            unlockHardwareBuffer(a);
            this.a = 0L;
        }
    }
}
