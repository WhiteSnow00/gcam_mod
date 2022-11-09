// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FaceInfo
{
    public transient long a;
    protected transient boolean b;
    
    public FaceInfo() {
        final long new_FaceInfo = GcamModuleJNI.new_FaceInfo();
        this.b = true;
        this.a = new_FaceInfo;
    }
    
    public final LandmarkMap a() {
        final long faceInfo_landmarks_get = GcamModuleJNI.FaceInfo_landmarks_get(this.a, this);
        if (faceInfo_landmarks_get == 0L) {
            return null;
        }
        return new LandmarkMap(faceInfo_landmarks_get);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FaceInfo(a);
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
