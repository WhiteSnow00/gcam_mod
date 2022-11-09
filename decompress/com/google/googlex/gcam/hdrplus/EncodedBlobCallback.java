// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.hdrplus;

import java.nio.ByteBuffer;

@FunctionalInterface
public interface EncodedBlobCallback
{
    void onDataAvailable(final int p0, final ByteBuffer p1, final int p2, final int p3);
}
