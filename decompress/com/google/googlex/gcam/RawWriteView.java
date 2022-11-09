// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class RawWriteView extends RawReadView
{
    private transient long b;
    
    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0());
    }
    
    public RawWriteView(final int n, final int n2, final int n3, final int n4, final ogn ogn) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(n, n2, n3, n4, ogn.a(ogn)));
    }
    
    public RawWriteView(final long b) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(b));
        this.b = b;
    }
    
    public static long d(final RawWriteView rawWriteView) {
        if (rawWriteView == null) {
            return 0L;
        }
        return rawWriteView.b;
    }
    
    @Override
    public void a() {
        synchronized (this) {
            final long b = this.b;
            if (b != 0L) {
                if (this.a) {
                    this.a = false;
                    GcamModuleJNI.delete_RawWriteView(b);
                }
                this.b = 0L;
            }
            super.a();
        }
    }
    
    @Override
    protected void finalize() {
        this.a();
    }
}
