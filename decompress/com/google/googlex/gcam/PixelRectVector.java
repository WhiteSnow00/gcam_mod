// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PixelRectVector
{
    public transient long a;
    protected transient boolean b;
    
    public PixelRectVector() {
        this(GcamModuleJNI.new_PixelRectVector__SWIG_0(), true);
    }
    
    public PixelRectVector(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final PixelRect pixelRect) {
        GcamModuleJNI.PixelRectVector_add(this.a, this, pixelRect.a, pixelRect);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PixelRectVector(a);
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
