import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.os.Message;
import android.os.Looper;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eer extends Handler
{
    private final WeakReference a;
    
    public eer(final ees ees, final Looper looper) {
        super(looper);
        this.a = new WeakReference((T)ees);
    }
    
    public final void handleMessage(final Message message) {
        final ees ees = (ees)this.a.get();
        if (ees == null) {
            return;
        }
        switch (message.what) {
            default: {
                return;
            }
            case 3: {
                this.getLooper().quitSafely();
                return;
            }
            case 2: {
                ees.c.a();
                return;
            }
            case 1: {
                final long n = message.arg1;
                final long n2 = message.arg2;
                final float[] array = (float[])message.obj;
                final eeo b = ees.b;
                if (!b.h) {
                    a.l(eeo.a.b(), "Received a frame to process, but the encoder either hasn't started or has already stopped. This should not happen.", '\u0486');
                    b.f();
                    return;
                }
                b.e.b();
                b.d.a(array);
                b.f();
                final muf e = b.e;
                EGLExt.eglPresentationTimeANDROID(e.a, e.b, n << 32 | (n2 & 0xFFFFFFFFL));
                final muf e2 = b.e;
                EGL14.eglSwapBuffers(e2.a, e2.b);
                ++b.g;
            }
        }
    }
}
