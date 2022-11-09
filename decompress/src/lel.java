import android.os.Handler;
import java.util.List;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CameraCaptureSession$StateCallback;
import android.hardware.camera2.params.SessionConfiguration;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lel implements ljg
{
    private final CameraDevice a;
    
    public lel(final CameraDevice a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        try {
            return this.a.getCameraAudioRestriction();
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final SecurityException ex) {}
        catch (final CameraAccessException ex) {}
        catch (final IllegalStateException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final UnsupportedOperationException ex;
        throw new kuw(ex);
    }
    
    @Override
    public final String b() {
        return this.a.getId();
    }
    
    @Override
    public final void c(ljq e) {
        try {
            final SessionConfiguration sessionConfiguration = new SessionConfiguration(((ljq)e).a, nqb.s(((ljq)e).b, fzt.r), ((ljq)e).c, (CameraCaptureSession$StateCallback)new ler(((ljq)e).d));
            e = (UnsupportedOperationException)((ljq)e).e;
            if (e != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest)lfe.d((ljc)e));
            }
            this.a.createCaptureSession(sessionConfiguration);
            return;
        }
        catch (final UnsupportedOperationException e) {}
        catch (final SecurityException e) {}
        catch (final CameraAccessException e) {}
        catch (final IllegalStateException e) {}
        catch (final IllegalArgumentException ex) {}
        throw new kuw(e);
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final void d(final List ex, final lje lje, final Handler handler) {
        try {
            this.a.createCaptureSession((List)ex, (CameraCaptureSession$StateCallback)new ler(lje), handler);
            return;
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final SecurityException ex) {}
        catch (final CameraAccessException ex) {}
        catch (final IllegalStateException ex) {}
        catch (final IllegalArgumentException ex2) {}
        throw new kuw(ex);
    }
    
    @Override
    public final void e(List e, final lje lje, final Handler handler) {
        try {
            final CameraDevice a = this.a;
            e = lfe.e(e);
            a.createCaptureSessionByOutputConfigurations(e, (CameraCaptureSession$StateCallback)new ler(lje), handler);
            return;
        }
        catch (final UnsupportedOperationException e) {}
        catch (final SecurityException e) {}
        catch (final CameraAccessException e) {}
        catch (final IllegalStateException e) {}
        catch (final IllegalArgumentException ex) {}
        throw new kuw((Throwable)e);
    }
    
    @Override
    public final void f(final List ex, final lje lje, final Handler handler) {
        try {
            this.a.createConstrainedHighSpeedCaptureSession((List)ex, (CameraCaptureSession$StateCallback)new ler(lje), handler);
            return;
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final SecurityException ex) {}
        catch (final CameraAccessException ex) {}
        catch (final IllegalStateException ex) {}
        catch (final IllegalArgumentException ex2) {}
        throw new kuw(ex);
    }
    
    @Override
    public final void g(final int cameraAudioRestriction) {
        try {
            this.a.setCameraAudioRestriction(cameraAudioRestriction);
            return;
        }
        catch (final UnsupportedOperationException ex) {}
        catch (final SecurityException ex) {}
        catch (final CameraAccessException ex) {}
        catch (final IllegalStateException ex) {}
        catch (final IllegalArgumentException ex2) {}
        final UnsupportedOperationException ex;
        throw new kuw(ex);
    }
    
    @Override
    public final leo h(final int n) {
        leo leo = null;
        try {
            leo = new leo(this.a.createCaptureRequest(n));
            return leo;
        }
        catch (final UnsupportedOperationException leo) {}
        catch (final SecurityException leo) {}
        catch (final CameraAccessException leo) {}
        catch (final IllegalStateException leo) {}
        catch (final IllegalArgumentException ex) {}
        throw new kuw((Throwable)leo);
    }
}
