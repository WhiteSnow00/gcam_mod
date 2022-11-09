// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ShotCallbacks
{
    public transient long a;
    protected transient boolean b;
    
    public ShotCallbacks() {
        final long new_ShotCallbacks = GcamModuleJNI.new_ShotCallbacks();
        this.b = true;
        this.a = new_ShotCallbacks;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ShotCallbacks(a);
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
