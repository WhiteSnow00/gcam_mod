import android.view.Window;
import android.os.HandlerThread;
import android.os.Handler;
import android.app.Activity;
import android.view.Window$OnFrameMetricsAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mim implements mfh, mfg, mih
{
    private final Window$OnFrameMetricsAvailableListener a;
    private Activity b;
    private boolean c;
    private Handler d;
    
    public mim(final Window$OnFrameMetricsAvailableListener a) {
        this.a = a;
    }
    
    private final void e() {
        final Activity b = this.b;
        if (b != null) {
            final Window window = b.getWindow();
            final Window$OnFrameMetricsAvailableListener a = this.a;
            if (this.d == null) {
                final HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                handlerThread.start();
                this.d = new Handler(handlerThread.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(a, this.d);
        }
    }
    
    private final void f() {
        final Activity b = this.b;
        if (b != null) {
            try {
                b.getWindow().removeOnFrameMetricsAvailableListener(this.a);
            }
            catch (final RuntimeException ex) {}
        }
    }
    
    @Override
    public void a(final Activity b) {
        synchronized (this) {
            this.b = b;
            if (this.c) {
                this.e();
            }
        }
    }
    
    @Override
    public void b(final Activity activity) {
        synchronized (this) {
            if (this.c) {
                this.f();
            }
            this.b = null;
        }
    }
    
    @Override
    public void c() {
        synchronized (this) {
            this.c = true;
            if (this.b != null) {
                this.e();
            }
        }
    }
    
    @Override
    public void d() {
        synchronized (this) {
            this.c = false;
            this.f();
        }
    }
}
