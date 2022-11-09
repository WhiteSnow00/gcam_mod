import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.content.Context;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ya implements xw
{
    public volatile CameraManager a;
    public volatile pii b;
    public volatile Object c;
    public volatile Object d;
    public volatile Object e;
    public volatile Object f;
    private final xx g;
    private final yg h;
    private volatile Object i;
    private volatile Object j;
    
    public ya(final xx g, final yg h) {
        this.i = new ouq();
        this.c = new ouq();
        this.d = new ouq();
        this.e = new ouq();
        this.f = new ouq();
        this.j = new ouq();
        this.g = g;
        this.h = h;
    }
    
    public final Context a() {
        return this.g.a.a;
    }
    
    public final yj b() {
        final Object i = this.i;
        if (i instanceof ouq) {
            synchronized (i) {
                if (this.i instanceof ouq) {
                    final yg h = this.h;
                    final pnd h2 = plv.h();
                    final xk a = h.a;
                    final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2, new yf(h2, 1));
                    fixedThreadPool.getClass();
                    final pnw f = pqf.f(fixedThreadPool);
                    final xk a2 = h.a;
                    final ExecutorService fixedThreadPool2 = Executors.newFixedThreadPool(8, new yf(h2));
                    fixedThreadPool2.getClass();
                    final pnw f2 = pqf.f(fixedThreadPool2);
                    final yc yc = new yc();
                    final yc yc2 = new yc(1);
                    final pjq ch = f.ch(new poa());
                    ch.getClass();
                    pjq ch2 = ch;
                    if (ch.b(pou.b) == null) {
                        ch2 = ch.ch(new pox());
                    }
                    final ppp ppp = new ppp(ch2);
                    final yj j = new yj(fixedThreadPool, fixedThreadPool2, f2, yc, yc2);
                    oum.c(this.i, j);
                    this.i = j;
                }
                final Object o;
                return (yj)o;
            }
        }
        final Object o = i;
        return (yj)o;
    }
}
