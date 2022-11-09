import java.util.Iterator;
import android.hardware.camera2.CaptureResult;
import java.util.Map;
import android.hardware.camera2.TotalCaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfc extends leq implements ljm
{
    private final TotalCaptureResult a;
    private volatile Map b;
    
    public lfc(final TotalCaptureResult a) {
        super((CaptureResult)a);
        this.b = null;
        this.a = a;
    }
    
    @Override
    public final lfa g() {
        return new lfa(this.a);
    }
    
    @Override
    public final Map h() {
        final Map b;
        if ((b = this.b) == null) {
            synchronized (this) {
                if (this.b == null) {
                    final Map physicalCameraResults = this.a.getPhysicalCameraResults();
                    final nnt l = nnx.l();
                    for (final String s : physicalCameraResults.keySet()) {
                        final CaptureResult captureResult = physicalCameraResults.get(s);
                        if (captureResult != null) {
                            l.d(s, new leq(captureResult));
                        }
                    }
                    this.b = l.b();
                }
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("TotalCaptureResult");
        d.f("FrameNumber", this.b());
        d.e("SequenceNumber", this.a());
        return d.toString();
    }
}
