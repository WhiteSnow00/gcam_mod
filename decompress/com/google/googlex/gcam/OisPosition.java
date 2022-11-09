// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class OisPosition
{
    public transient long a;
    protected transient boolean b;
    
    public OisPosition() {
        final long new_OisPosition = GcamModuleJNI.new_OisPosition();
        this.b = true;
        this.a = new_OisPosition;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_OisPosition(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
