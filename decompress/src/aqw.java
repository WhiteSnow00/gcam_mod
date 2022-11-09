import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqw extends CameraCaptureSession$CaptureCallback
{
    final /* synthetic */ arc a;
    final /* synthetic */ arb b;
    private boolean c;
    
    public aqw(final arb b, final arc a) {
        this.b = b;
        this.a = a;
        this.c = false;
    }
    
    private final void a(final CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) != null && !this.c) {
            this.c = true;
            final arb b = this.b;
            b.m = this.a;
            b.p.a(captureResult);
        }
    }
    
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.a((CaptureResult)totalCaptureResult);
    }
    
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        final aub a = ard.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Autoexposure and capture failed with reason ");
        sb.append(captureFailure.getReason());
        auc.a(a, sb.toString());
    }
    
    public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
        this.a(captureResult);
    }
}
