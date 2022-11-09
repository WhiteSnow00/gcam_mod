// 
// Decompiled by Procyon v0.6.0
// 

package com.google.geo.lightfield.processing;

public interface ProgressCallback
{
    void setProgress(final float p0);
    
    void setRange(final float p0, final float p1);
    
    boolean wasCancelled();
}
