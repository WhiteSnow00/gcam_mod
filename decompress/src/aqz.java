import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import android.view.Surface;
import android.os.Handler;
import android.media.ImageReader$OnImageAvailableListener;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqz extends ara
{
    public int a;
    public long b;
    public long c;
    final /* synthetic */ arb d;
    
    public aqz(final arb d) {
        this.d = d;
        this.a = -1;
        this.b = -1L;
        this.c = -1L;
    }
    
    @Override
    public final void a(final CaptureResult captureResult) {
        final Integer n = (Integer)captureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (n != null) {
            final int intValue = n;
            if (captureResult.getFrameNumber() > this.b) {
                final int a = this.a;
                this.a = intValue;
                this.b = captureResult.getFrameNumber();
                switch (intValue) {
                    case 4:
                    case 5: {
                        final arb d = this.d;
                        final asg l = d.l;
                        if (l != null) {
                            l.a(intValue == 4, d.e);
                            this.d.l = null;
                            break;
                        }
                        break;
                    }
                    case 1:
                    case 2:
                    case 6: {
                        if (intValue == a) {
                            break;
                        }
                        final ash n2 = this.d.n;
                        if (n2 != null) {
                            n2.a();
                            break;
                        }
                        break;
                    }
                }
            }
        }
        final Integer n3 = (Integer)captureResult.get(CaptureResult.CONTROL_AE_STATE);
        if (n3 != null) {
            final int intValue2 = n3;
            if (captureResult.getFrameNumber() > this.c) {
                this.d.o = n3;
                this.c = captureResult.getFrameNumber();
                switch (intValue2) {
                    case 2:
                    case 3:
                    case 4: {
                        final arb d2 = this.d;
                        final arc m = d2.m;
                        if (m == null) {
                            break;
                        }
                        d2.j.setOnImageAvailableListener((ImageReader$OnImageAvailableListener)m, (Handler)d2);
                        try {
                            try {
                                final arb d3 = this.d;
                                final CameraCaptureSession i = d3.i;
                                final CaptureRequest a2 = d3.f.a(d3.d, 2, d3.j.getSurface());
                                final arb d4 = this.d;
                                i.capture(a2, (CameraCaptureSession$CaptureCallback)d4.m, (Handler)d4);
                                this.d.m = null;
                                return;
                            }
                            finally {}
                        }
                        catch (final CameraAccessException ex) {
                            auc.b(ard.a, "Unable to initiate capture", (Throwable)ex);
                            this.d.m = null;
                            return;
                        }
                        this.d.m = null;
                        break;
                    }
                }
            }
        }
    }
    
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.a((CaptureResult)totalCaptureResult);
    }
    
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        final aub a = ard.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Capture attempt failed with reason ");
        sb.append(captureFailure.getReason());
        auc.a(a, sb.toString());
    }
    
    public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
        this.a(captureResult);
    }
}
