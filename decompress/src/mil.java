import android.view.Window;
import android.os.HandlerThread;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mil implements mih, mfe
{
    private final Window$OnFrameMetricsAvailableListener a;
    private Handler b;
    
    public mil(final Window$OnFrameMetricsAvailableListener a) {
        this.a = a;
    }
    
    @Override
    public void a(final Activity activity, final Bundle bundle) {
        final Window window = activity.getWindow();
        final Window$OnFrameMetricsAvailableListener a = this.a;
        if (this.b == null) {
            final HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
            handlerThread.start();
            this.b = new Handler(handlerThread.getLooper());
        }
        window.addOnFrameMetricsAvailableListener(a, this.b);
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
    }
}
