// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class AfMetadata
{
    public transient long a;
    
    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata());
    }
    
    public AfMetadata(final long a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
