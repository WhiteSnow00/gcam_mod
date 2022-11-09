// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class NormalizedRect
{
    public transient long a;
    protected transient boolean b;
    
    public NormalizedRect() {
        this(GcamModuleJNI.new_NormalizedRect(), true);
    }
    
    public NormalizedRect(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long a(final NormalizedRect normalizedRect) {
        if (normalizedRect == null) {
            return 0L;
        }
        return normalizedRect.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_NormalizedRect(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void c(final float n) {
        GcamModuleJNI.NormalizedRect_x0_set(this.a, this, n);
    }
    
    public final void d(final float n) {
        GcamModuleJNI.NormalizedRect_x1_set(this.a, this, n);
    }
    
    public final void e(final float n) {
        GcamModuleJNI.NormalizedRect_y0_set(this.a, this, n);
    }
    
    public final void f(final float n) {
        GcamModuleJNI.NormalizedRect_y1_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
