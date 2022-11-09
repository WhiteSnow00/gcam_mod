// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class OisMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public OisMetadata() {
        final long new_OisMetadata = GcamModuleJNI.new_OisMetadata();
        this.b = true;
        this.a = new_OisMetadata;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_OisMetadata(a);
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
