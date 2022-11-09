import java.util.concurrent.ExecutorService;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dar implements hub, exn, ewp
{
    private final cxl a;
    
    public dar(final cxl a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final ExecutorService h = mcn.h("leak-checker");
        h.execute(new das(elapsedRealtimeNanos, h));
    }
    
    @Override
    public final void run() {
        final cxl a = this.a;
        final cxo a2 = cxr.a;
        a.c();
    }
}
