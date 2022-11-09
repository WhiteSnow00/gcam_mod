// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class IspAwbMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public IspAwbMetadata() {
        this(GcamModuleJNI.new_IspAwbMetadata());
    }
    
    public IspAwbMetadata(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_IspAwbMetadata(a);
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
