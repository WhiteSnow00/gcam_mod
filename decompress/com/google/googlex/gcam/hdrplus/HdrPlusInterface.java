// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class HdrPlusInterface
{
    private static final AtomicBoolean b;
    
    static {
        b = new AtomicBoolean();
    }
    
    public HdrPlusInterface() {
        if (HdrPlusInterface.b.compareAndSet(false, true)) {
            init();
        }
    }
    
    public static EncodedBlobCallback a(final EncodedBlobCallback encodedBlobCallback, final boolean b) {
        return new oho(encodedBlobCallback, b);
    }
    
    private static native void init();
    
    public native boolean addPayloadFrame(final long p0, final int p1, final long p2, final long p3, final long p4, final Runnable p5, final long p6, final Runnable p7, final long p8, final Runnable p9);
    
    public native void addViewfinderFrame(final long p0, final int p1, final long p2, final long p3, final long p4, final long p5, final Runnable p6);
    
    public native float getPostZoomSharpenStrength(final long p0, final float p1);
    
    public native void setBaseFrameCallback(final long p0, final BaseFrameCallback p1);
    
    public native void setFinalImageCallback(final long p0, final ManagedImageCallback p1);
    
    public native void setFinalImageRgb16Allocator(final long p0, final InterleavedU16ClientAllocator p1);
    
    public native void setFinalImageRgbAllocator(final long p0, final InterleavedU8ClientAllocator p1);
    
    public native void setFinalImageYuvAllocator(final long p0, final YuvClientAllocator p1);
    
    public native void setJpegCallback(final long p0, final EncodedBlobCallback p1);
    
    public native void setMergedDngCallback(final long p0, final EncodedBlobCallback p1);
    
    public native void setMergedPdAllocator(final long p0, final InterleavedU16ClientAllocator p1);
    
    public native void setMergedPdCallback(final long p0, final IntLongConsumer p1);
    
    public native void setMergedRawImageAllocator(final long p0, final RawClientAllocator p1);
    
    public native void setMergedRawImageCallback(final long p0, final ManagedImageCallback p1);
    
    public native void setMutableMergedRawCallback(final long p0, final MutableMergedRawCallback p1);
    
    public native void setPostviewCallback(final long p0, final ManagedImageCallback p1);
    
    public native void setPostviewRgbAllocator(final long p0, final InterleavedU8ClientAllocator p1);
    
    public native void setPostviewYuvAllocator(final long p0, final YuvClientAllocator p1);
    
    public native void setProgressCallback(final long p0, final IntFloatConsumer p1);
    
    public native void setShotStatusCallbacks(final long p0, final IntLongConsumer p1, final IntStringConsumer p2, final IntConsumer p3);
    
    public native boolean temporallyBinViewfinderFrame(final long p0, final int p1, final long p2, final long p3, final long p4, final Runnable p5, final long p6, final Runnable p7, final long p8, final long p9, final Runnable p10, final boolean p11, final int p12);
}
