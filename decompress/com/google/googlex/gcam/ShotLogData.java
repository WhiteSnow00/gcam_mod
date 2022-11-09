// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ShotLogData
{
    public transient long a;
    protected transient boolean b;
    
    public ShotLogData() {
        this(GcamModuleJNI.new_ShotLogData());
    }
    
    public ShotLogData(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public final int a() {
        return GcamModuleJNI.ShotLogData_executed_finish_on_get(this.a, this);
    }
    
    public final FloatVector b() {
        final long shotLogData_final_payload_frame_sharpness_get = GcamModuleJNI.ShotLogData_final_payload_frame_sharpness_get(this.a, this);
        if (shotLogData_final_payload_frame_sharpness_get == 0L) {
            return null;
        }
        return new FloatVector(shotLogData_final_payload_frame_sharpness_get, false);
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ShotLogData(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.c();
    }
}
