import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.InterleavedImageF;
import com.google.googlex.gcam.StringSpatialGainMap;
import com.google.googlex.gcam.StringStaticMetadataMap;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.StringAeResultsMap;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.PortraitRequest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzr
{
    public static final nsd a;
    public final pii b;
    public final cxl c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/portrait/PortraitRequestDecorator");
    }
    
    public dzr(final pii b, final cxl c) {
        this.b = b;
        this.c = c;
    }
    
    public static final void a(final String s, final PortraitRequest portraitRequest, final ShotMetadata shotMetadata) {
        final long portraitRequest_ae_results_get = GcamModuleJNI.PortraitRequest_ae_results_get(portraitRequest.a, portraitRequest);
        final InterleavedImageF interleavedImageF = null;
        StringAeResultsMap stringAeResultsMap;
        if (portraitRequest_ae_results_get == 0L) {
            stringAeResultsMap = null;
        }
        else {
            stringAeResultsMap = new StringAeResultsMap(portraitRequest_ae_results_get);
        }
        final AeResults e = shotMetadata.e();
        GcamModuleJNI.StringAeResultsMap_set(stringAeResultsMap.a, stringAeResultsMap, s, AeResults.b(e), e);
        final long portraitRequest_frame_metadata_get = GcamModuleJNI.PortraitRequest_frame_metadata_get(portraitRequest.a, portraitRequest);
        StringFrameMetadataMap stringFrameMetadataMap;
        if (portraitRequest_frame_metadata_get == 0L) {
            stringFrameMetadataMap = null;
        }
        else {
            stringFrameMetadataMap = new StringFrameMetadataMap(portraitRequest_frame_metadata_get, false);
        }
        stringFrameMetadataMap.b(s, shotMetadata.f());
        final long portraitRequest_static_metadata_get = GcamModuleJNI.PortraitRequest_static_metadata_get(portraitRequest.a, portraitRequest);
        StringStaticMetadataMap stringStaticMetadataMap;
        if (portraitRequest_static_metadata_get == 0L) {
            stringStaticMetadataMap = null;
        }
        else {
            stringStaticMetadataMap = new StringStaticMetadataMap(portraitRequest_static_metadata_get, false);
        }
        stringStaticMetadataMap.b(s, shotMetadata.g());
        final long portraitRequest_gain_map_get = GcamModuleJNI.PortraitRequest_gain_map_get(portraitRequest.a, portraitRequest);
        StringSpatialGainMap stringSpatialGainMap;
        if (portraitRequest_gain_map_get == 0L) {
            stringSpatialGainMap = null;
        }
        else {
            stringSpatialGainMap = new StringSpatialGainMap(portraitRequest_gain_map_get);
        }
        final long shotMetadata_gain_map_rggb_get = GcamModuleJNI.ShotMetadata_gain_map_rggb_get(shotMetadata.a, shotMetadata);
        InterleavedImageF interleavedImageF2;
        if (shotMetadata_gain_map_rggb_get == 0L) {
            interleavedImageF2 = interleavedImageF;
        }
        else {
            interleavedImageF2 = new InterleavedImageF(shotMetadata_gain_map_rggb_get);
        }
        final SpatialGainMap spatialGainMap = new SpatialGainMap(GcamModuleJNI.new_SpatialGainMap__SWIG_1(InterleavedImageF.a(interleavedImageF2), interleavedImageF2, false));
        GcamModuleJNI.StringSpatialGainMap_set(stringSpatialGainMap.a, stringSpatialGainMap, s, SpatialGainMap.a(spatialGainMap), spatialGainMap);
    }
}
