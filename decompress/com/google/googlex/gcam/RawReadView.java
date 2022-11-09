// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class RawReadView
{
    protected transient boolean a;
    private transient long b;
    
    public RawReadView(final long b) {
        this.a = true;
        this.b = b;
    }
    
    public static long b(final RawReadView rawReadView) {
        if (rawReadView == null) {
            return 0L;
        }
        return rawReadView.b;
    }
    
    public void a() {
        synchronized (this) {
            final long b = this.b;
            if (b != 0L) {
                if (this.a) {
                    this.a = false;
                    GcamModuleJNI.delete_RawReadView(b);
                }
                this.b = 0L;
            }
        }
    }
    
    public final boolean c() {
        return GcamModuleJNI.RawReadView_empty(this.b, this);
    }
    
    @Override
    protected void finalize() {
        this.a();
    }
}
