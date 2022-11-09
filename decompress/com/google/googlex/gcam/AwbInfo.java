// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class AwbInfo
{
    public transient long a;
    protected transient boolean b;
    
    public AwbInfo() {
        this(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
    }
    
    public AwbInfo(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long a(final AwbInfo awbInfo) {
        if (awbInfo == null) {
            return 0L;
        }
        return awbInfo.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_AwbInfo(a);
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
