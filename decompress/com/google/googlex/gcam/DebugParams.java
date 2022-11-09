// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class DebugParams
{
    public transient long a;
    protected transient boolean b;
    
    public DebugParams() {
        final long new_DebugParams = GcamModuleJNI.new_DebugParams();
        this.b = true;
        this.a = new_DebugParams;
    }
    
    public final ImageSaverParams a() {
        final long debugParams_image_saver_params_get = GcamModuleJNI.DebugParams_image_saver_params_get(this.a, this);
        if (debugParams_image_saver_params_get == 0L) {
            return null;
        }
        return new ImageSaverParams(debugParams_image_saver_params_get, false);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_DebugParams(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
