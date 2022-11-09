import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;
import android.hardware.camera2.CameraCaptureSession;

// 
// Decompiled by Procyon v0.6.0
// 

public class lej implements ljf
{
    public final CameraCaptureSession a;
    
    public lej(final CameraCaptureSession a) {
        this.a = a;
    }
    
    @Override
    public final ljg a() {
        return new lel(this.a.getDevice());
    }
    
    @Override
    public final void b() {
        try {
            this.a.abortCaptures();
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalStateException ex2) {}
        final SecurityException ex;
        throw new ljd(ex);
    }
    
    @Override
    public final void c(final List list) {
        jlm.b(this.a, lfe.e(list));
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    @Override
    public final void d() {
        try {
            this.a.stopRepeating();
            return;
        }
        catch (final SecurityException ex) {}
        catch (final IllegalStateException ex2) {}
        final SecurityException ex;
        throw new ljd(ex);
    }
    
    @Override
    public final int e(ljh ex, final ldg ldg, final Handler handler) {
        try {
            final CameraCaptureSession a = this.a;
            ex = (SecurityException)lfe.d((ljc)ex);
            return a.capture((CaptureRequest)ex, (CameraCaptureSession$CaptureCallback)new lei(ldg), handler);
        }
        catch (final SecurityException ex) {}
        catch (final IllegalStateException ex2) {}
        throw new ljd(ex);
    }
    
    @Override
    public final int f(List e, final ldg ldg, final Handler handler) {
        try {
            final CameraCaptureSession a = this.a;
            e = lfe.e(e);
            return a.captureBurst(e, (CameraCaptureSession$CaptureCallback)new lei(ldg), handler);
        }
        catch (final SecurityException e) {}
        catch (final IllegalStateException ex) {}
        throw new ljd((Throwable)e);
    }
    
    @Override
    public final int g(ljh ex, final ldg ldg, final Handler handler) {
        try {
            final CameraCaptureSession a = this.a;
            ex = (SecurityException)lfe.d((ljc)ex);
            return a.setRepeatingRequest((CaptureRequest)ex, (CameraCaptureSession$CaptureCallback)new lei(ldg), handler);
        }
        catch (final SecurityException ex) {}
        catch (final IllegalStateException ex2) {}
        throw new ljd(ex);
    }
}
