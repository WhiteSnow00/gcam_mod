// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.imageio;

import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.InterleavedReadViewU8;

public final class JpgHelper
{
    private JpgHelper() {
    }
    
    public static niz a(final InterleavedReadViewU8 interleavedReadViewU8, final JpgEncodeOptions jpgEncodeOptions, final int n) {
        return niz.h(encodeRgbToJpegAsByteArrayImpl(interleavedReadViewU8.a, jpgEncodeOptions.a, n));
    }
    
    private static native byte[] encodeRgbToJpegAsByteArrayImpl(final long p0, final long p1, final int p2);
    
    public static native byte[] encodeYuvToJpegAsByteArrayImpl(final long p0, final long p1, final int p2);
}
