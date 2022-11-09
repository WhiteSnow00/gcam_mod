// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class GenerateRgbImageOptions
{
    public transient long a;
    protected transient boolean b;
    
    public GenerateRgbImageOptions() {
        final long new_GenerateRgbImageOptions = GcamModuleJNI.new_GenerateRgbImageOptions();
        this.b = true;
        this.a = new_GenerateRgbImageOptions;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_GenerateRgbImageOptions(a);
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
