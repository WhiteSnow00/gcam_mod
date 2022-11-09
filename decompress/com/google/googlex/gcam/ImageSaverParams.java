// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ImageSaverParams
{
    public transient long a;
    protected transient boolean b;
    
    public ImageSaverParams() {
        this(GcamModuleJNI.new_ImageSaverParams(), true);
    }
    
    public ImageSaverParams(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final String a() {
        return GcamModuleJNI.ImageSaverParams_dest_folder_get(this.a, this);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ImageSaverParams(a);
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
