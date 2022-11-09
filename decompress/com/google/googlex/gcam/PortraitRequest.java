// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class PortraitRequest
{
    public transient long a;
    protected transient boolean b;
    
    public PortraitRequest() {
        final long new_PortraitRequest = GcamModuleJNI.new_PortraitRequest();
        this.b = true;
        this.a = new_PortraitRequest;
    }
    
    public final PixelRectVector a() {
        final long portraitRequest_faces_get = GcamModuleJNI.PortraitRequest_faces_get(this.a, this);
        if (portraitRequest_faces_get == 0L) {
            return null;
        }
        return new PixelRectVector(portraitRequest_faces_get, false);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_PortraitRequest(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final boolean c() {
        return GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_get(this.a, this);
    }
    
    public final boolean d() {
        return GcamModuleJNI.PortraitRequest_use_gpu_resample_get(this.a, this);
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
