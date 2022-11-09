import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
import java.util.Set;
import android.hardware.camera2.CaptureRequest$Key;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzd implements kwd
{
    public final kyk a;
    public final krr b;
    public final kyv c;
    private final kzo d;
    private final kyb e;
    private final kxp f;
    private final lam g;
    private final lad h;
    private final kjk i;
    private final long j;
    private final lbk k;
    private final laj l;
    private final kzf m;
    private final kyw n;
    private final kzj o;
    private final kzt p;
    private final kxr q;
    private final ofa r;
    private Future s;
    
    public kzd(final kyw n, final kzf m, final kyk a, final kzo d, final kyb e, final kxp f, final lad h, final lam g, final kjk i, final kue kue, final laj l, final kzj o, final lbk k, final kzt p16, final krr krr, final kyv c) {
        final ofa b = ofi.b(mcn.h("FSEx"));
        this.r = b;
        this.n = n;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
        this.i = i;
        this.l = l;
        this.o = o;
        this.m = m;
        this.c = c;
        this.p = p16;
        this.k = k;
        this.q = new kxr(c, b, krr);
        this.b = krr.a("FrameServer");
        this.j = System.nanoTime();
        m.b(n);
        i.c(kue.b(n.toString()));
        i.c(c);
        k.a.a.a(a.d().a);
    }
    
    private final boolean w(final String s) {
        if (this.i.a()) {
            final krr b = this.b;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(s.length() + 38 + String.valueOf(value).length());
            sb.append("Attempted to invoke ");
            sb.append(s);
            sb.append(" on ");
            sb.append(value);
            sb.append(" after close()");
            b.h(sb.toString());
            return true;
        }
        return false;
    }
    
    @Override
    public final kvq a() {
        return kxn.c();
    }
    
    @Override
    public final kwe b() {
        return this.a;
    }
    
    @Override
    public final kwh c() {
        if (!this.w("acquireExclusiveSession")) {
            final lag a = this.l.a();
            final kzj o = this.o;
            final kxw kxw = (kxw)o.a.get();
            kxw.getClass();
            final kse kse = (kse)o.b.get();
            kse.getClass();
            return new kzi(kxw, kse, a);
        }
        final String value = String.valueOf(this);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 37);
        sb.append("Unable to acquire session. ");
        sb.append(value);
        sb.append(" is closed");
        throw new kuw(sb.toString());
    }
    
    @Override
    public final void close() {
        final krr b = this.b;
        final String value = String.valueOf(this);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8);
        sb.append("Closing ");
        sb.append(value);
        b.f(sb.toString());
        this.r.shutdownNow();
        this.m.c(this.n);
        this.i.close();
        this.k.a.b.b((double)(System.nanoTime() - this.j), this.a.d().a);
        final krr b2 = this.b;
        final String value2 = String.valueOf(this);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 7);
        sb2.append("Closed ");
        sb2.append(value2);
        b2.b(sb2.toString());
    }
    
    @Override
    public final void d(kwz a) {
        this.p.e(a);
        if (a instanceof ldk) {
            final krr b = this.b;
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 9);
            sb.append("Draining ");
            sb.append(value);
            b.f(sb.toString());
            a = (kwz)((ldk)a).a;
            synchronized (a) {
                if (!((ldt)a).k) {
                    final krr f = ((ldt)a).f;
                    final String value2 = String.valueOf(((ldt)a).a);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 26);
                    sb2.append("Draining free buffers for ");
                    sb2.append(value2);
                    f.f(sb2.toString());
                    ((ldt)a).a.h();
                }
            }
        }
    }
    
    @Override
    public final void e() {
        if (!this.w("resume")) {
            final krr b = this.b;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 9);
            sb.append("Resuming ");
            sb.append(value);
            b.b(sb.toString());
            this.m.a(this.n);
            this.g.a();
        }
    }
    
    @Override
    public final void f(final kws kws) {
        this.f.c(kws);
    }
    
    @Override
    public final void g(final CaptureRequest$Key captureRequest$Key, final Object o) {
        final kxp f = this.f;
        if (!f.a.a(captureRequest$Key)) {
            f.c(kxc.p(captureRequest$Key, o));
        }
    }
    
    @Override
    public final void h(final Set set) {
        this.f.d(set);
    }
    
    @Override
    public final void i(final kwx kwx) {
        final Future s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        if (!this.w("trigger3A")) {
            try {
                this.s = this.r.a(new kza(this, kwx));
            }
            catch (final RejectedExecutionException ex) {
                final krr b = this.b;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to submit trigger3A task. ".concat(value);
                }
                else {
                    concat = new String("Failed to submit trigger3A task. ");
                }
                b.h(concat);
            }
        }
    }
    
    @Override
    public final void j(final kvr kvr, final kwx kwx) {
        final Future s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        if (!this.w("trigger3A")) {
            try {
                this.s = this.r.a(new kyy(this, kvr, kwx));
            }
            catch (final RejectedExecutionException ex) {
                final krr b = this.b;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to submit trigger3A task. ".concat(value);
                }
                else {
                    concat = new String("Failed to submit trigger3A task. ");
                }
                b.h(concat);
            }
        }
    }
    
    @Override
    public final void k(final boolean b, final boolean b2, final boolean b3) {
        final Future s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        if (!this.w("unlock3A")) {
            try {
                this.r.execute(new kzc(this, b, b2, b3));
            }
            catch (final RejectedExecutionException ex) {
                final krr b4 = this.b;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to submit unlock3A task. ".concat(value);
                }
                else {
                    concat = new String("Failed to submit unlock3A task. ");
                }
                b4.h(concat);
            }
        }
    }
    
    @Override
    public final void l(final kvr kvr) {
        if (this.w("update3A")) {
            return;
        }
        this.q.a(kvr, false);
    }
    
    @Override
    public final void m(final kvr kvr) {
        if (this.w("update3A")) {
            return;
        }
        this.q.a(kvr, true);
    }
    
    @Override
    public final void n(final kvr kvr) {
        final Future s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        if (!this.w("trigger3A")) {
            try {
                this.s = this.r.a(new kyz(this, kvr));
            }
            catch (final RejectedExecutionException ex) {
                final krr b = this.b;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to submit trigger3A task. ".concat(value);
                }
                else {
                    concat = new String("Failed to submit trigger3A task. ");
                }
                b.h(concat);
            }
        }
    }
    
    @Override
    public final void o(final boolean b) {
        final Future s = this.s;
        if (s != null) {
            s.cancel(true);
        }
        if (!this.w("trigger3A")) {
            try {
                this.s = this.r.a(new kzb(this, b));
            }
            catch (final RejectedExecutionException ex) {
                final krr b2 = this.b;
                final String value = String.valueOf(ex.getMessage());
                String concat;
                if (value.length() != 0) {
                    concat = "Failed to submit trigger3A task. ".concat(value);
                }
                else {
                    concat = new String("Failed to submit trigger3A task. ");
                }
                b2.h(concat);
            }
        }
    }
    
    @Override
    public final krc p(final kzl kzl) {
        this.w("attach(frameStream)");
        return this.e.d(kzl, 0);
    }
    
    @Override
    public final kvs q(final kzl kzl) {
        this.w("submit(frameStream)");
        return this.h.g(kzl);
    }
    
    @Override
    public final kvw r(final kzl kzl, final int n) {
        this.w("attach(frameStream, capacity)");
        return this.e.d(kzl, n);
    }
    
    @Override
    public final kzl s(final kwz kwz) {
        this.k.a(this.a.d().a, 1, 0);
        this.w("create(stream)");
        return this.d.a(kwz, nqr.a);
    }
    
    @Override
    public final kzl t(final Set set) {
        this.k.a(this.a.d().a, 1, 0);
        this.w("create(streams)");
        return this.d.b(set, nqr.a);
    }
    
    @Override
    public final String toString() {
        return this.n.toString();
    }
    
    @Override
    public final kzl u(final kwz kwz, final Set set) {
        this.k.a(this.a.d().a, 1, set.size());
        this.w("create(stream, parameters)");
        return this.d.a(kwz, noi.F(set));
    }
    
    @Override
    public final kzl v(final Set set, final Set set2) {
        this.k.a(this.a.d().a, set.size(), set2.size());
        this.w("create(streams, parameters)");
        return this.d.b(set, noi.F(set2));
    }
}
