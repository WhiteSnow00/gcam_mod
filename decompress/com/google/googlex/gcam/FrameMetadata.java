// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FrameMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }
    
    public FrameMetadata(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long b(final FrameMetadata frameMetadata) {
        if (frameMetadata == null) {
            return 0L;
        }
        return frameMetadata.a;
    }
    
    public final int a() {
        return GcamModuleJNI.FrameMetadata_sensor_id_get(this.a, this);
    }
    
    public final AeMetadata c() {
        final long frameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.a, this);
        if (frameMetadata_ae_get == 0L) {
            return null;
        }
        return new AeMetadata(frameMetadata_ae_get);
    }
    
    public final AfMetadata d() {
        final long frameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.a, this);
        if (frameMetadata_af_get == 0L) {
            return null;
        }
        return new AfMetadata(frameMetadata_af_get);
    }
    
    public final AwbMetadata e() {
        final long frameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.a, this);
        if (frameMetadata_awb_get == 0L) {
            return null;
        }
        return new AwbMetadata(frameMetadata_awb_get);
    }
    
    public final LiveHdrMetadata f() {
        final long frameMetadata_live_hdr_get = GcamModuleJNI.FrameMetadata_live_hdr_get(this.a, this);
        if (frameMetadata_live_hdr_get == 0L) {
            return null;
        }
        return new LiveHdrMetadata(frameMetadata_live_hdr_get, false);
    }
    
    @Override
    protected final void finalize() {
        this.g();
    }
    
    public final void g() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FrameMetadata(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void h(final float[] array) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.a, this, array);
    }
    
    public final void i(final int n) {
        GcamModuleJNI.FrameMetadata_flash_set(this.a, this, n);
    }
}
