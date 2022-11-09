// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public interface GlSyncToken
{
    void release();
    
    void waitOnCpu();
    
    void waitOnGpu();
}
