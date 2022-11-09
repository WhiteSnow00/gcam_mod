import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqv extends CameraCaptureSession$CaptureCallback
{
    final /* synthetic */ asg a;
    final /* synthetic */ arb b;
    private boolean c;
    
    public aqv(final arb b, final asg a) {
        this.b = b;
        this.a = a;
        this.c = false;
    }
    
    private final void a(final CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) != null && !this.c) {
            this.c = true;
            final arb b = this.b;
            b.l = this.a;
            b.p.a(captureResult);
        }
    }
    
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        this.a((CaptureResult)totalCaptureResult);
    }
    
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        final aub a = ard.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("Focusing failed with reason ");
        sb.append(captureFailure.getReason());
        auc.a(a, sb.toString());
        this.a.a(false, this.b.e);
    }
    
    public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
        this.a(captureResult);
    }
}
