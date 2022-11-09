import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class foj extends Handler
{
    private final WeakReference a;
    
    public foj(final fol fol) {
        this.a = new WeakReference((T)fol);
    }
    
    public final void handleMessage(final Message message) {
        final fol fol = (fol)this.a.get();
        if (fol == null) {
            return;
        }
        switch (message.what) {
            default: {
                throw new AssertionError(message.what);
            }
            case 105: {
                fol.C();
                return;
            }
            case 104: {
                final LocalSessionStorage m = fol.m;
                final hij d = m.b.d;
                Label_0214: {
                    if (!d.b()) {
                        a.l(fol.b.b(), "Could not create temporary mosaic file. Not able to stitch.", '\u06c1');
                        break Label_0214;
                    }
                    final String path = d.a().getPath();
                    final long n = fol.c.a() / 1000000L;
                    final boolean g = fol.G;
                    boolean b = true;
                    if (!g) {
                        if (esh.d() > 0) {
                            b = false;
                        }
                    }
                    final int n2 = (int)n;
                    synchronized (esh.a) {
                        LightCycleNative.FinishCapture(b, path, path, n2);
                        esh.b = false;
                        monitorexit(esh.a);
                        new ett(m, new foa(fol, m)).start();
                        fol.C();
                    }
                }
            }
            case 102:
            case 103: {
                return;
            }
            case 101: {
                fol.u();
            }
        }
    }
}
