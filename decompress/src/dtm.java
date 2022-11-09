import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotMetadata;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtm implements dvs
{
    final /* synthetic */ int a;
    final /* synthetic */ gen b;
    final /* synthetic */ dtv c;
    
    public dtm(final dtv c, final int a, final gen b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void m(final dxh dxh, final Bitmap bitmap, final ShotMetadata shotMetadata) {
        this.c.k.f("PostviewRgbCallback");
        Label_0154: {
            if (this.c.g.c()) {
                final FrameMetadata f = shotMetadata.f();
                final long frameMetadata_geometric_calibration_get = GcamModuleJNI.FrameMetadata_geometric_calibration_get(f.a, f);
                final MeshWarp meshWarp = null;
                GeometricCalibrationVector geometricCalibrationVector;
                if (frameMetadata_geometric_calibration_get == 0L) {
                    geometricCalibrationVector = null;
                }
                else {
                    geometricCalibrationVector = new GeometricCalibrationVector(frameMetadata_geometric_calibration_get, false);
                }
                if (GcamModuleJNI.GeometricCalibrationVector_isEmpty(geometricCalibrationVector.a, geometricCalibrationVector)) {
                    final FrameMetadata f2 = shotMetadata.f();
                    final long frameMetadata_mesh_warp_get = GcamModuleJNI.FrameMetadata_mesh_warp_get(f2.a, f2);
                    MeshWarp meshWarp2;
                    if (frameMetadata_mesh_warp_get == 0L) {
                        meshWarp2 = meshWarp;
                    }
                    else {
                        meshWarp2 = new MeshWarp(frameMetadata_mesh_warp_get, false);
                    }
                    final FloatVector c = meshWarp2.c();
                    if (GcamModuleJNI.FloatVector_isEmpty(c.a, c)) {
                        break Label_0154;
                    }
                }
                ((hbb)this.c.g.b()).e(bitmap, shotMetadata);
            }
        }
        final dtv c2 = this.c;
        Bitmap bitmap3;
        final Bitmap bitmap2 = bitmap3 = c2.i.a(bitmap, this.a, c2.b.l());
        if (bitmap2.equals(bitmap)) {
            final int a = this.a;
            bitmap3 = bitmap2;
            if (a != 0) {
                bitmap3 = bitmap2;
                if (bitmap != null) {
                    bitmap3 = dtv.a(bitmap, a);
                }
            }
        }
        final hhy b = this.b.b;
        b.U(bitmap3, 0);
        b.W(bitmap3);
        this.c.k.g();
    }
}
