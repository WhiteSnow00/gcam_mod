// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PortraitOutputs
{
    public transient long a;
    protected transient boolean b;
    
    public PortraitOutputs() {
        final long new_PortraitOutputs = GcamModuleJNI.new_PortraitOutputs();
        this.b = true;
        this.a = new_PortraitOutputs;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PortraitOutputs(a);
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
