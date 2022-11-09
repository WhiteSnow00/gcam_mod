// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class YuvWriteView extends YuvReadView
{
    public transient long c;
    
    public YuvWriteView() {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_0());
    }
    
    public YuvWriteView(final long c) {
        super(GcamModuleJNI.YuvWriteView_SWIGUpcast(c));
        this.c = c;
    }
    
    public static long e(final YuvWriteView yuvWriteView) {
        if (yuvWriteView == null) {
            return 0L;
        }
        return yuvWriteView.c;
    }
    
    @Override
    public void a() {
        synchronized (this) {
            final long c = this.c;
            if (c != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_YuvWriteView(c);
                }
                this.c = 0L;
            }
            super.a();
        }
    }
    
    @Override
    protected void finalize() {
        this.a();
    }
}
