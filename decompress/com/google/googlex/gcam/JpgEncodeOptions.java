// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class JpgEncodeOptions
{
    public transient long a;
    protected transient boolean b;
    
    public JpgEncodeOptions() {
        final long new_JpgEncodeOptions = GcamModuleJNI.new_JpgEncodeOptions();
        this.b = true;
        this.a = new_JpgEncodeOptions;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_JpgEncodeOptions(a);
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
