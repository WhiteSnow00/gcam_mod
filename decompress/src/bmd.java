import java.util.Iterator;
import java.util.concurrent.Executor;
import android.graphics.PointF;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmd implements jgq, krc
{
    public final bke a;
    public final lfu b;
    public bkx c;
    public jck d;
    public jck e;
    public krc f;
    private final bjh g;
    private final Set h;
    private final bkv i;
    private final jjb j;
    private final imb k;
    private final niz l;
    private boolean m;
    private final kjf n;
    private final bkb o;
    
    public bmd(final kjk kjk, final bkb o, final bke a, final lfu b, final bjh g, final Set h, final bkv i, final jjb j, final imb k, final niz l) {
        this.m = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.n = new bmc(this);
        this.a = a;
        this.b = b;
        this.g = g;
        this.o = o;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        kjk.c(this);
    }
    
    @Override
    public final boolean a(final PointF pointF) {
        return true;
    }
    
    @Override
    public final void b() {
        final bkx c = this.c;
        if (c != null) {
            c.e();
        }
    }
    
    public final void c() {
        this.a.h();
        this.a.i();
        final bkv i = this.i;
        if (i != null) {
            i.b();
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.m = true;
            try (final krc f = this.f) {}
        }
    }
    
    public final void d() {
        final jck e = this.e;
        if (e != null) {
            e.a().d(new bma(this), odx.a);
            return;
        }
        this.c();
    }
    
    @Override
    public final boolean e(final PointF pointF) {
        monitorenter(this);
        try {
            if (this.m) {
                monitorexit(this);
                return false;
            }
            if (this.k.c()) {
                monitorexit(this);
                return false;
            }
            final bkx c = this.c;
            if (c != null && !c.b().isDone() && this.a.n(pointF)) {
                this.c.e();
                monitorexit(this);
                return true;
            }
            final bkv i = this.i;
            if (i != null) {
                i.c();
            }
            final jck d = this.d;
            if (d != null) {
                d.c();
            }
            final jck e = this.e;
            if (e != null) {
                e.c();
            }
            final krc f = this.f;
            if (f != null) {
                f.close();
            }
            final Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ((jgp)iterator.next()).a(pointF);
            }
            (this.d = this.a.g(pointF)).b(new blw(this));
            final bkk a = this.g.a();
            this.c = this.o.a(this.b, pointF, a);
            if (this.l.g()) {
                ((jib)this.l.c()).c();
            }
            final jjb j = this.j;
            if (!((jjq)j).L) {
                j.h();
            }
            else if (j.C()) {
                this.j.x();
            }
            final jck d2 = this.d;
            oey oey;
            if (d2 == null) {
                oey = ofi.n(true);
            }
            else {
                oey = ((jcq)d2).b;
            }
            knf.g(oey, this.c.b(), this.n, mcn.n());
            knf.f(this.c.a(), new blx(this, 1), mcn.n());
            final ofn c2 = ((bkn)a).c;
            knf.f(c2, new blx(this), mcn.n());
            knf.f(((bkn)a).d, new blx(this, 2), mcn.n());
            knf.f(this.c.c(), new bly(this, c2, 1), odx.a);
            knf.f(this.c.c(), new bly(this, c2), mcn.n());
            monitorexit(this);
            return true;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
