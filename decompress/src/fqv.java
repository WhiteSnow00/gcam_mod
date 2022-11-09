import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.AeShotParams;
import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.ClientShotMetadata;
import com.google.googlex.gcam.LocationData;
import android.location.Location;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.Gcam;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqv
{
    private final lfg a;
    private final ohv b;
    private final dvj c;
    private final eya d;
    private final fxb e;
    private final gij f;
    private final Gcam g;
    private final cxl h;
    
    public fqv(final Gcam g, final cxl h, final lfg a, final lfh lfh, final dvj c, final eya d, final fxb e, final gij f) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = new ohv(a, lfh);
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final fum a(final ljm ljm, int b) {
        final int a = this.c.a(ljm);
        final StaticMetadata b2 = this.g.b(a);
        final ShotMetadata shotMetadata = new ShotMetadata();
        GcamModuleJNI.ShotMetadata_static_metadata_set(shotMetadata.a, shotMetadata, StaticMetadata.b(b2), b2);
        final FrameMetadata k = this.c.k(ljm, null);
        GcamModuleJNI.ShotMetadata_frame_metadata_set(shotMetadata.a, shotMetadata, FrameMetadata.b(k), k);
        final SpatialGainMap n = this.b.n(ljm);
        final InterleavedImageF interleavedImageF = new InterleavedImageF(GcamModuleJNI.SpatialGainMap_gain_map(n.a, n));
        GcamModuleJNI.ShotMetadata_gain_map_rggb_set(shotMetadata.a, shotMetadata, InterleavedImageF.a(interleavedImageF), interleavedImageF);
        final niz d = this.d.d();
        ClientShotMetadata clientShotMetadata;
        if (d.g()) {
            final Location location = (Location)d.c();
            final LocationData locationData = new LocationData();
            GcamModuleJNI.LocationData_altitude_set(locationData.a, locationData, location.getAltitude());
            GcamModuleJNI.LocationData_degree_of_precision_set(locationData.a, locationData, location.getAccuracy());
            GcamModuleJNI.LocationData_latitude_set(locationData.a, locationData, location.getLatitude());
            GcamModuleJNI.LocationData_longitude_set(locationData.a, locationData, location.getLongitude());
            GcamModuleJNI.LocationData_timestamp_unix_set(locationData.a, locationData, location.getTime() / 1000L);
            GcamModuleJNI.LocationData_processing_method_set(locationData.a, locationData, location.getProvider());
            clientShotMetadata = new ClientShotMetadata();
            GcamModuleJNI.ClientShotMetadata_location_set(clientShotMetadata.a, clientShotMetadata, locationData.a, locationData);
        }
        else {
            clientShotMetadata = null;
        }
        if (clientShotMetadata != null) {
            GcamModuleJNI.ShotMetadata_client_shot_metadata_set(shotMetadata.a, shotMetadata, ClientShotMetadata.a(clientShotMetadata), clientShotMetadata);
        }
        final Integer n2 = (Integer)ljm.d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        float a2;
        if (n2 != null) {
            a2 = this.b.a(n2);
        }
        else {
            a2 = 1.0f;
        }
        GcamModuleJNI.ShotMetadata_exposure_compensation_set(shotMetadata.a, shotMetadata, a2);
        b = boa.b(b, this.a);
        GcamModuleJNI.ShotMetadata_image_rotation_set(shotMetadata.a, shotMetadata, b);
        if (this.e.aQ() == fxa.a) {
            b = 0;
        }
        else {
            b = 1;
        }
        GcamModuleJNI.ShotMetadata_wb_mode_set(shotMetadata.a, shotMetadata, b);
        GcamModuleJNI.ShotMetadata_flash_mode_set(shotMetadata.a, shotMetadata, 2);
        shotMetadata.k("f");
        final AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.g(a2);
        aeShotParams.l(1);
        this.b.r(aeShotParams, ljm, (float)this.h.g(cxk.a).c(), this.f.b);
        aeShotParams.d().a();
        return new fum(shotMetadata, a, aeShotParams, n);
    }
}
