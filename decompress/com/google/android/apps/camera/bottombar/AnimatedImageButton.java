// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

public interface AnimatedImageButton
{
    int getState();
    
    void setOnPreChangeListener(final OnStateChangeListener p0);
    
    void setOnStateChangeListener(final OnStateChangeListener p0);
    
    void setState(final int p0, final boolean p1);
    
    void setStateAnimated(final int p0, final boolean p1);
}
