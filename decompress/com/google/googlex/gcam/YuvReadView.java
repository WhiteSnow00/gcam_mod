// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class YuvReadView
{
    public transient long a;
    protected transient boolean b;
    
    public YuvReadView() {
        this(GcamModuleJNI.new_YuvReadView__SWIG_3());
    }
    
    public YuvReadView(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_YuvReadView(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final int b() {
        return GcamModuleJNI.YuvReadView_height(this.a, this);
    }
    
    public final int c() {
        return GcamModuleJNI.YuvReadView_width(this.a, this);
    }
    
    public final int d() {
        return GcamModuleJNI.YuvReadView_yuv_format(this.a, this);
    }
    
    @Override
    protected void finalize() {
        this.a();
    }
}
