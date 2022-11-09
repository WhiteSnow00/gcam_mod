// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import java.nio.ByteBuffer;

public interface ImageProxy$Plane
{
    ByteBuffer getBuffer();
    
    int getPixelStride();
    
    int getRowStride();
}
