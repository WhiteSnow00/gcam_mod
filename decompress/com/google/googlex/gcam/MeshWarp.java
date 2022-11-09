// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class MeshWarp
{
    public transient long a;
    protected transient boolean b;
    
    public MeshWarp() {
        this(GcamModuleJNI.new_MeshWarp(), true);
    }
    
    public MeshWarp(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final int a() {
        return GcamModuleJNI.MeshWarp_grid_cols_get(this.a, this);
    }
    
    public final int b() {
        return GcamModuleJNI.MeshWarp_grid_rows_get(this.a, this);
    }
    
    public final FloatVector c() {
        final long meshWarp_mesh_warp_data_get = GcamModuleJNI.MeshWarp_mesh_warp_data_get(this.a, this);
        if (meshWarp_mesh_warp_data_get == 0L) {
            return null;
        }
        return new FloatVector(meshWarp_mesh_warp_data_get, false);
    }
    
    public final void d() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_MeshWarp(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.d();
    }
}
