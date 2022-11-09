// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class SpatialGainMap
{
    public transient long a;
    protected transient boolean b;
    
    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0());
    }
    
    public SpatialGainMap(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public static long a(final SpatialGainMap spatialGainMap) {
        if (spatialGainMap == null) {
            return 0L;
        }
        return spatialGainMap.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_SpatialGainMap(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
