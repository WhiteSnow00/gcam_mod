// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class YuvImage extends YuvWriteView
{
    private transient long d;
    
    public YuvImage() {
        this(GcamModuleJNI.new_YuvImage__SWIG_0());
    }
    
    public YuvImage(final int n, final int n2, final int n3) {
        this(GcamModuleJNI.new_YuvImage__SWIG_2(n, n2, n3));
    }
    
    public YuvImage(final long d) {
        super(GcamModuleJNI.YuvImage_SWIGUpcast(d));
        this.d = d;
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            final long d = this.d;
            if (d != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_YuvImage(d);
                }
                this.d = 0L;
            }
            super.a();
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
