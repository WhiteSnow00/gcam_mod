import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.HandlerThread;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjj implements krc
{
    private final HandlerThread a;
    private final AtomicBoolean b;
    
    public kjj(final HandlerThread a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (this.b.getAndSet(true)) {
            return;
        }
        final Looper looper = this.a.getLooper();
        if (looper != null) {
            kpo.d(looper).postDelayed((Runnable)new kji(this.a), 5000L);
        }
    }
}
