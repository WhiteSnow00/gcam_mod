import android.hardware.Camera$Size;
import android.hardware.Camera$Parameters;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asc extends atu
{
    private static final aub a;
    
    static {
        a = new aub("AndCamSet");
    }
    
    public asc(final asc asc) {
        super(asc);
    }
    
    public asc(final atl atl, final Camera$Parameters camera$Parameters) {
        if (camera$Parameters == null) {
            auc.c(asc.a, "Settings ctor requires a non-null Camera.Parameters.");
            return;
        }
        final atj w = atl.w;
        super.g = false;
        final Camera$Size previewSize = camera$Parameters.getPreviewSize();
        this.l(new aua(previewSize.width, previewSize.height));
        final int previewFrameRate = camera$Parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            super.j = previewFrameRate;
            super.i = previewFrameRate;
            super.h = previewFrameRate;
        }
        final int[] array = new int[2];
        camera$Parameters.getPreviewFpsRange(array);
        this.j(array[0], array[1]);
        super.l = camera$Parameters.getPreviewFormat();
        if (atl.d(atf.a)) {
            super.p = camera$Parameters.getZoomRatios().get(camera$Parameters.getZoom()) / 100.0f;
        }
        else {
            super.p = 1.0f;
        }
        super.q = camera$Parameters.getExposureCompensation();
        final String flashMode = camera$Parameters.getFlashMode();
        atg a;
        if (flashMode == null) {
            a = atg.values()[0];
        }
        else {
            try {
                a = atg.a(atj.b(flashMode));
            }
            catch (final IllegalArgumentException ex) {
                a = atg.values()[0];
            }
        }
        super.r = a;
        final String focusMode = camera$Parameters.getFocusMode();
        ath a2;
        if (focusMode == null) {
            a2 = ath.values()[0];
        }
        else {
            try {
                a2 = ath.a(atj.b(focusMode));
            }
            catch (final IllegalArgumentException ex2) {
                a2 = ath.values()[0];
            }
        }
        super.s = a2;
        final String sceneMode = camera$Parameters.getSceneMode();
        ati a3;
        if (sceneMode == null) {
            a3 = ati.values()[0];
        }
        else {
            try {
                a3 = ati.a(atj.b(sceneMode));
            }
            catch (final IllegalArgumentException ex3) {
                a3 = ati.values()[0];
            }
        }
        super.t = a3;
        atl.d(atf.g);
        super.y = "true".equals(camera$Parameters.get("recording-hint"));
        this.i(camera$Parameters.getJpegQuality());
        final Camera$Size pictureSize = camera$Parameters.getPictureSize();
        this.k(new aua(pictureSize.width, pictureSize.height));
        super.o = camera$Parameters.getPictureFormat();
    }
    
    @Override
    public final atu a() {
        return new asc(this);
    }
}
