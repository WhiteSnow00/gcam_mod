// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FaceInfo$Landmark
{
    public transient long a;
    protected transient boolean b;
    
    public FaceInfo$Landmark() {
        final long new_FaceInfo_Landmark = GcamModuleJNI.new_FaceInfo_Landmark();
        this.b = true;
        this.a = new_FaceInfo_Landmark;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FaceInfo_Landmark(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float n) {
        GcamModuleJNI.FaceInfo_Landmark_x_set(this.a, this, n);
    }
    
    public final void c(final float n) {
        GcamModuleJNI.FaceInfo_Landmark_y_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
