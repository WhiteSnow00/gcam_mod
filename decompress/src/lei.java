import java.util.Map;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lei extends CameraCaptureSession$CaptureCallback
{
    private final ldg a;
    
    public lei(final ldg a) {
        this.a = a;
    }
    
    public final void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long n) {
        try {
            final ldg a = this.a;
            final Long b = ldh.b(new len(captureRequest));
            final kse a2 = a.c.a;
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
            sb.append("onCaptureBufferLost_");
            sb.append(value);
            a2.f(sb.toString());
            final kwz kwz = a.b.get(surface);
            kwz.getClass();
            final kxc kxc = (kxc)a.a.get(b);
            kxc.getClass();
            kxc.aL(kwz, n);
            synchronized (a.c) {
                a.c.h(b);
                monitorexit(a.c);
                a.c.a.g();
            }
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
        try {
            final ldg a = this.a;
            final len len = new len(captureRequest);
            final lfc lfc = new lfc(totalCaptureResult);
            final Long b = ldh.b(len);
            final kse a2 = a.c.a;
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 19);
            sb.append("onCaptureCompleted_");
            sb.append(value);
            a2.f(sb.toString());
            final kxc kxc = (kxc)a.a.get(b);
            kxc.getClass();
            kxc.b(lfc);
            synchronized (a.c) {
                a.c.h(b);
                monitorexit(a.c);
                a.c.a.g();
            }
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
        try {
            this.a.b(new len(captureRequest), new lem(captureFailure));
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
        try {
            final ldg a = this.a;
            final len len = new len(captureRequest);
            final leq leq = new leq(captureResult);
            final Long b = ldh.b(len);
            final kse a2 = a.c.a;
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
            sb.append("onCaptureProgressed_");
            sb.append(value);
            a2.f(sb.toString());
            final kxc kxc = (kxc)a.a.get(b);
            kxc.getClass();
            kxc.aM(leq);
            a.c.a.g();
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int n) {
        try {
            final ldg a = this.a;
            final kse a2 = a.c.a;
            final StringBuilder sb = new StringBuilder(36);
            sb.append("onCaptureSequenceAborted_");
            sb.append(n);
            a2.f(sb.toString());
            final nrv bn = a.a.s().bN();
            while (bn.hasNext()) {
                final Map.Entry<K, kxc> entry = bn.next();
                entry.getValue().aV((long)entry.getKey(), n);
            }
            a.c.a.g();
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int n, final long n2) {
        try {
            final ldg a = this.a;
            final kse a2 = a.c.a;
            final StringBuilder sb = new StringBuilder(38);
            sb.append("onCaptureSequenceCompleted_");
            sb.append(n);
            a2.f(sb.toString());
            final nrv bn = a.a.s().bN();
            while (bn.hasNext()) {
                final Map.Entry<K, kxc> entry = bn.next();
                entry.getValue().aW((long)entry.getKey(), n, n2);
            }
            a.c.a.g();
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
    
    public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long n, final long n2) {
        try {
            final ldg a = this.a;
            final Long b = ldh.b(new len(captureRequest));
            final kse a2 = a.c.a;
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
            sb.append("onCaptureStarted_");
            sb.append(value);
            a2.f(sb.toString());
            final kvx kvx = new kvx(n, n2, a.c.a());
            final kxc kxc = (kxc)a.a.get(b);
            kxc.getClass();
            kxc.aN(kvx);
            a.c.a.g();
        }
        finally {
            final Throwable t;
            kkg.a(t);
        }
    }
}
