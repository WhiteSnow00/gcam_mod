// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PixelRect
{
    public transient long a;
    protected transient boolean b;
    
    public PixelRect() {
        this(GcamModuleJNI.new_PixelRect(), true);
    }
    
    public PixelRect(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PixelRect(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final int n) {
        GcamModuleJNI.PixelRect_x0_set(this.a, this, n);
    }
    
    public final void c(final int n) {
        GcamModuleJNI.PixelRect_x1_set(this.a, this, n);
    }
    
    public final void d(final int n) {
        GcamModuleJNI.PixelRect_y0_set(this.a, this, n);
    }
    
    public final void e(final int n) {
        GcamModuleJNI.PixelRect_y1_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
