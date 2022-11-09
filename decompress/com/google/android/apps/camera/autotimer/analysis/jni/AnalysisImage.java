// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.autotimer.analysis.jni;

import java.util.List;

class AnalysisImage
{
    private final lju a;
    
    public AnalysisImage(final lju a) {
        njo.o(a.a() == 35);
        this.a = a;
    }
    
    int getHeight() {
        return this.a.b();
    }
    
    AnalysisImage$Plane[] getPlanes() {
        final List h = this.a.h();
        final AnalysisImage$Plane[] array = new AnalysisImage$Plane[h.size()];
        for (int i = 0; i < h.size(); ++i) {
            array[i] = new AnalysisImage$Plane((ljt)h.get(i));
        }
        return array;
    }
    
    int getWidth() {
        return this.a.c();
    }
}
