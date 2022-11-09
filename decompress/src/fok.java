import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class fok extends Handler
{
    final /* synthetic */ fol a;
    
    public fok(final fol a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            case 3: {
                final esv r = this.a.r;
                if (r != null) {
                    r.b();
                    return;
                }
                break;
            }
            case 2: {
                final int arg1 = message.arg1;
                final int arg2 = message.arg2;
                final fol a = this.a;
                final esv r2 = a.r;
                if (r2 != null && a.s != null) {
                    r2.onSurfaceChanged(null, message.arg1, message.arg2);
                    this.a.r.b();
                    this.a.s.e();
                    return;
                }
                break;
            }
            case 1: {
                final esv r3 = this.a.r;
                if (r3 != null) {
                    r3.onSurfaceCreated(null, null);
                    break;
                }
                break;
            }
        }
    }
}
