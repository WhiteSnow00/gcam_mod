// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class SceneFlicker
{
    public transient long a;
    protected transient boolean b;
    
    public SceneFlicker() {
        final long new_SceneFlicker = GcamModuleJNI.new_SceneFlicker();
        this.b = true;
        this.a = new_SceneFlicker;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_SceneFlicker(a);
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
