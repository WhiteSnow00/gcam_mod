// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class StaticMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public StaticMetadata() {
        this(GcamModuleJNI.new_StaticMetadata__SWIG_0(), true);
    }
    
    public StaticMetadata(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long b(final StaticMetadata staticMetadata) {
        if (staticMetadata == null) {
            return 0L;
        }
        return staticMetadata.a;
    }
    
    public final int a() {
        return GcamModuleJNI.StaticMetadata_sensor_id_get(this.a, this);
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_StaticMetadata(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void d(final int n) {
        GcamModuleJNI.StaticMetadata_frame_raw_max_height_set(this.a, this, n);
    }
    
    public final void e(final int n) {
        GcamModuleJNI.StaticMetadata_sensor_id_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
