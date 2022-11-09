// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.lasagna;

public interface LasagnaCallbacks
{
    void onFinalStatus(final int p0, final int p1, final String p2);
    
    void onImage(final int p0, final long p1, final String p2, final String p3, final String p4);
    
    void onProgress(final int p0, final float p1);
    
    void onPslRequest(final int p0, final boolean p1, final float p2, final float p3);
}
