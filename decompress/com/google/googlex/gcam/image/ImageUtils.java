// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.InterleavedReadViewU8;

public final class ImageUtils
{
    private ImageUtils() {
    }
    
    public static void a(final InterleavedReadViewU8 interleavedReadViewU8, final InterleavedWriteViewU8 interleavedWriteViewU8) {
        final long a = interleavedReadViewU8.a;
        final long a2 = InterleavedWriteViewU8.a(interleavedWriteViewU8);
        final boolean b = true;
        njo.e(a != 0L, "src is null");
        njo.e(a2 != 0L && b, "dst is null");
        copyContentsImpl(a, a2);
    }
    
    private static native void copyContentsImpl(final long p0, final long p1);
    
    public static native boolean simpleRgbToAnyRgbImpl(final long p0, final int p1, final long p2);
}
