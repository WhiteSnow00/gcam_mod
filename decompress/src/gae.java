import java.util.concurrent.Executor;
import java.util.LinkedList;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gae implements krc
{
    public final gig a;
    private final Object b;
    private final Queue c;
    private int d;
    private final kkz e;
    private volatile boolean f;
    
    public gae(final int d) {
        this.b = new Object();
        this.f = false;
        this.d = d;
        this.c = new LinkedList();
        this.a = new gig();
        this.e = new kkz(this.d);
    }
    
    private final void c(final gab gab, final gie gie, final ofn ofn) {
        ofi.w(gab.a(), new gac(this, ofn, gie), odx.a);
    }
    
    public final oey a(final gab gab) {
        if (this.f) {
            return gab.b();
        }
        final ofn f = ofn.f();
        final gig a = this.a;
        synchronized (a.a) {
            a.aR((int)a.d + 1);
            monitorexit(a.a);
            final gif gif = new gif(a);
            final Object b = this.b;
            synchronized (a.a) {
                if (this.d > 0) {
                    njo.o(this.c.isEmpty());
                    final int d = this.d - 1;
                    this.d = d;
                    this.e.aR(d);
                    monitorexit(a.a);
                    this.c(gab, gif, f);
                    return f;
                }
                this.c.add(new gad(gab, gif, f));
                return f;
            }
        }
    }
    
    public final void b() {
        Object o = this.b;
        synchronized (o) {
            final gad gad = this.c.poll();
            if (gad == null) {
                final int d = this.d + 1;
                this.d = d;
                this.e.aR(d);
                return;
            }
            monitorexit(o);
            o = gad.a;
            this.c((gab)o, gad.b, gad.c);
        }
    }
    
    @Override
    public final void close() {
        this.f = true;
    }
}
