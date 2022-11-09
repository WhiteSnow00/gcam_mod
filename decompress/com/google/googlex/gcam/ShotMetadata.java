// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ShotMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public ShotMetadata() {
        this(GcamModuleJNI.new_ShotMetadata__SWIG_0());
    }
    
    public ShotMetadata(final long a) {
        this.b = true;
        this.a = a;
    }
    
    public static long c(final ShotMetadata shotMetadata) {
        if (shotMetadata == null) {
            return 0L;
        }
        return shotMetadata.a;
    }
    
    public final int a() {
        return GcamModuleJNI.ShotMetadata_icc_profile_get(this.a, this);
    }
    
    public final int b() {
        return GcamModuleJNI.ShotMetadata_image_rotation_get(this.a, this);
    }
    
    public final long d() {
        return GcamModuleJNI.ShotMetadata_timestamp_unix_us_get(this.a, this);
    }
    
    public final AeResults e() {
        final long shotMetadata_ae_results_get = GcamModuleJNI.ShotMetadata_ae_results_get(this.a, this);
        if (shotMetadata_ae_results_get == 0L) {
            return null;
        }
        return new AeResults(shotMetadata_ae_results_get, false);
    }
    
    public final FrameMetadata f() {
        final long shotMetadata_frame_metadata_get = GcamModuleJNI.ShotMetadata_frame_metadata_get(this.a, this);
        if (shotMetadata_frame_metadata_get == 0L) {
            return null;
        }
        return new FrameMetadata(shotMetadata_frame_metadata_get, false);
    }
    
    @Override
    protected final void finalize() {
        this.i();
    }
    
    public final StaticMetadata g() {
        final long shotMetadata_static_metadata_get = GcamModuleJNI.ShotMetadata_static_metadata_get(this.a, this);
        if (shotMetadata_static_metadata_get == 0L) {
            return null;
        }
        return new StaticMetadata(shotMetadata_static_metadata_get, false);
    }
    
    public final String h() {
        return GcamModuleJNI.ShotMetadata_makernote_get(this.a, this);
    }
    
    public final void i() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ShotMetadata(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void j(final String s) {
        GcamModuleJNI.ShotMetadata_makernote_set(this.a, this, s);
    }
    
    public final void k(final String s) {
        GcamModuleJNI.ShotMetadata_software_suffix_set(this.a, this, s);
    }
}
