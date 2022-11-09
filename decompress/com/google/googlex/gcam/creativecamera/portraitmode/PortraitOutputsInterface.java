// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.creativecamera.portraitmode;

import com.google.googlex.gcam.base.function.LongFloatConsumer;
import com.google.googlex.gcam.base.function.LongStringConsumer;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.base.function.LongConsumer;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PortraitOutputsInterface
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean();
    }
    
    public PortraitOutputsInterface() {
        if (PortraitOutputsInterface.a.compareAndSet(false, true)) {
            init();
        }
    }
    
    private static native void init();
    
    public native void setCompleteCallback(final long p0, final LongConsumer p1);
    
    public native void setDebugHardwareBufferCallback(final long p0, final PortraitOpaqueHandleCallback p1);
    
    public native void setDebugImageCallback(final long p0, final PortraitImageCallback p1);
    
    public native void setDebugRgbAllocator(final long p0, final InterleavedU8ClientAllocator p1);
    
    public native void setHardwareBufferCallback(final long p0, final PortraitOpaqueHandleCallback p1);
    
    public native void setImageCallback(final long p0, final PortraitImageCallback p1);
    
    public native void setLogCallback(final long p0, final LongStringConsumer p1);
    
    public native void setProgressCallback(final long p0, final LongFloatConsumer p1);
    
    public native void setRgbAllocator(final long p0, final InterleavedU8ClientAllocator p1);
    
    public native void setSecondaryHardwareBufferCallback(final long p0, final PortraitOpaqueHandleCallback p1);
    
    public native void setSecondaryImageCallback(final long p0, final PortraitImageCallback p1);
    
    public native void setUpsampledInputHardwareBufferCallback(final long p0, final PortraitOpaqueHandleCallback p1);
    
    public native void setUpsampledInputImageCallback(final long p0, final PortraitImageCallback p1);
}
