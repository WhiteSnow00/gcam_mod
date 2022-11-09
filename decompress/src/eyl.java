import java.util.concurrent.Executor;
import java.util.concurrent.ArrayBlockingQueue;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyl implements eyu
{
    public static final nsd a;
    public static final lnl b;
    public final jpg c;
    public final ScheduledExecutorService d;
    public final ksk e;
    public final Context f;
    public final pii g;
    final ArrayBlockingQueue h;
    public final jqt i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/logging/ClearcutCameraEventLogger");
        b = new pqv();
    }
    
    public eyl(final Context f, final ScheduledExecutorService d, final kse kse) {
        final jpg c = new jpg(f, "ANDROID_CAMERA");
        final jqt b = kev.b(f.getApplicationContext(), new keu());
        this.h = new ArrayBlockingQueue(100);
        this.c = c;
        this.i = b;
        this.d = d;
        this.e = new ksk(d, kse, "Clearcut");
        this.f = f;
        this.g = new eyi(this);
    }
    
    @Override
    public final void a(final nxt nxt) {
        if (!this.h.offer(new eyk(nxt))) {
            a.l(eyl.a.c(), "Queue full. Discarded camera event.", '\u05bf');
        }
        this.e.execute(new eyh(this));
    }
}
