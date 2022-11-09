// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.stats.timing;

public class OneCameraTiming extends hwh
{
    public final kse a;
    public ksh b;
    
    public OneCameraTiming(final lmm lmm, final kse a) {
        super(lmm, hwa.values());
        this.b = ksh.b;
        this.a = a;
    }
    
    public long getOneCameraCreateNs() {
        return this.g(hwa.b);
    }
    
    public long getOneCameraCreatedNs() {
        return this.g(hwa.c);
    }
}
