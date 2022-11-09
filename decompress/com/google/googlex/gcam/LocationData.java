// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class LocationData
{
    public transient long a;
    protected transient boolean b;
    
    public LocationData() {
        final long new_LocationData = GcamModuleJNI.new_LocationData();
        this.b = true;
        this.a = new_LocationData;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_LocationData(a);
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
