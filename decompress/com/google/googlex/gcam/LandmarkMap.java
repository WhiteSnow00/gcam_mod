// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class LandmarkMap
{
    private transient long a;
    
    public LandmarkMap() {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_0());
    }
    
    public LandmarkMap(final long a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    public final void b(final int n, final FaceInfo$Landmark faceInfo$Landmark) {
        GcamModuleJNI.LandmarkMap_set(this.a, this, n, faceInfo$Landmark.a, faceInfo$Landmark);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
