// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.image;

import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvReadView;

public final class YuvUtils
{
    public static boolean a(final YuvReadView yuvReadView, final InterleavedWriteViewU8 interleavedWriteViewU8) {
        final long a = yuvReadView.a;
        final long a2 = InterleavedWriteViewU8.a(interleavedWriteViewU8);
        final boolean b = true;
        njo.e(a != 0L, "src view is null");
        njo.e(a2 != 0L && b, "dst view is null");
        return yuvToRgbImpl(a, a2);
    }
    
    public static native boolean rgbToYuvImpl(final long p0, final long p1);
    
    private static native boolean yuvToRgbImpl(final long p0, final long p1);
}
