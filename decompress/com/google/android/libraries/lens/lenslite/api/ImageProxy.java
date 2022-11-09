// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import java.util.List;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;

public interface ImageProxy extends AutoCloseable
{
    void close();
    
    Rect getCropRect();
    
    int getFormat();
    
    HardwareBuffer getHardwareBuffer();
    
    int getHeight();
    
    List getPlanes();
    
    long getTimestamp();
    
    int getWidth();
    
    void setCropRect(final Rect p0);
}
