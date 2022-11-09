import java.util.concurrent.atomic.AtomicBoolean;
import android.opengl.GLSurfaceView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eap
{
    private static final nsd a;
    private final GLSurfaceView b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/GlTaskQueueImpl");
    }
    
    public eap(final GLSurfaceView b) {
        this.b = b;
    }
    
    public final void a(final Runnable runnable) {
        this.b.queueEvent(runnable);
    }
    
    public final void b(final Runnable runnable) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a(new eao(runnable, atomicBoolean));
        monitorenter(atomicBoolean);
        try {
            while (!atomicBoolean.get()) {
                try {
                    atomicBoolean.wait();
                }
                catch (final InterruptedException ex) {
                    eap.a.c().h(ex).E(1064).o("Interrupted during wait");
                }
            }
            monitorexit(atomicBoolean);
        }
        finally {
            monitorexit(atomicBoolean);
            while (true) {}
        }
    }
}
