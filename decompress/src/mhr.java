import android.os.Bundle;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhr extends mhn implements mgx, mfe, mfl, mfj
{
    public static final nsd a;
    volatile mdx b;
    public final oui c;
    public volatile boolean d;
    private final AtomicBoolean e;
    private final boolean f;
    private final Context g;
    private final Executor h;
    private final mgu i;
    private final niz j;
    private final mfp k;
    private final mma l;
    private final AtomicInteger m;
    private final AtomicInteger n;
    private final AtomicInteger o;
    private final AtomicBoolean p;
    private final Runnable q;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");
    }
    
    public mhr(final mgv mgv, final Context g, final Executor h, final oui c, final niz j, final mfp k, final mma l, final niz niz, final pii pii) {
        this.e = new AtomicBoolean();
        this.m = new AtomicInteger();
        this.n = new AtomicInteger();
        this.o = new AtomicInteger();
        this.p = new AtomicBoolean(false);
        this.c = c;
        this.j = j;
        this.k = k;
        this.l = l;
        this.i = mgv.a(odx.a, c, null);
        this.g = g;
        this.h = h;
        this.f = (boolean)niz.e(Boolean.FALSE);
        this.q = new mhp(this, pii);
    }
    
    private final void h(final int n, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        ofi.r(new mho(this, atomicInteger, n), this.h);
    }
    
    @Override
    public final void a(final Activity activity, final Bundle bundle) {
        if (!this.p.getAndSet(true)) {
            this.h(4, this.n);
        }
    }
    
    @Override
    public final void b(final Activity activity) {
        final Class<? extends Activity> class1 = activity.getClass();
        mdx b;
        if (!njb.d(null)) {
            final String value = String.valueOf((Object)null);
            final String value2 = String.valueOf(class1.getSimpleName());
            String concat;
            if (value2.length() != 0) {
                concat = value.concat(value2);
            }
            else {
                concat = new String(value);
            }
            b = new mdx(concat);
        }
        else {
            b = new mdx(class1.getSimpleName());
        }
        this.b = b;
    }
    
    @Override
    public final void c(final Activity activity) {
        this.b = null;
    }
    
    @Override
    public final void d() {
        if (this.e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new mhq(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
    
    public final void e(final psc g) {
        final mhm mhm = (mhm)this.c.get();
        if (!mhm.d()) {
            return;
        }
        while (true) {
            if (this.d) {
                Object d = this.i.e;
                synchronized (((mfb)d).a) {
                    if (((mfb)d).a.isEmpty()) {
                        d = mfa.a;
                        break Label_0108;
                    }
                    d = ((mfb)d).a.values().toArray(new mfd[0]);
                    monitorexit(((mfb)d).a);
                    d = new mfa((mfd[])d);
                    break Label_0108;
                }
            }
            Label_0106: {
                break Label_0106;
                while (this.m.getAndDecrement() > 0) {
                    this.f(3, mhm);
                }
                while (this.n.getAndDecrement() > 0) {
                    this.f(4, mhm);
                }
                while (this.o.getAndDecrement() > 0) {
                    this.f(5, mhm);
                }
                final mgu i = this.i;
                final mgq a = mgr.a();
                final okt m = psp.t.m();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final psp psp = (psp)m.b;
                g.getClass();
                psp.g = g;
                psp.a |= 0x40;
                a.c((psp)m.h());
                a.b = null;
                final Object d;
                a.d = (mfa)d;
                i.a(a.a());
                return;
            }
            Object d = null;
            continue;
        }
    }
    
    final oey f(final int n, final mhm mhm) {
        if (!mhm.d()) {
            return oev.a;
        }
        final float a = mhm.a;
        final mlz a2 = this.l.a(a / 100.0f);
        if (a2.b.nextFloat() < a2.a) {
            final mgu i = this.i;
            final mgq a3 = mgr.a();
            final okt m = psp.t.m();
            final okt j = psm.d.m();
            final int c = (int)(100.0f / a);
            if (j.c) {
                j.m();
                j.c = false;
            }
            final psm psm = (psm)j.b;
            final int a4 = psm.a | 0x2;
            psm.a = a4;
            psm.c = c;
            psm.b = n - 1;
            psm.a = (a4 | 0x1);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final psp psp = (psp)m.b;
            final psm h = (psm)j.h();
            h.getClass();
            psp.h = h;
            psp.a |= 0x80;
            a3.c((psp)m.h());
            return i.a(a3.a());
        }
        return oev.a;
    }
    
    public final okt g() {
        final okt m = psc.l.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final psc psc = (psc)m.b;
        psc.a |= 0x1;
        psc.b = true;
        final mdx b = this.b;
        String a;
        if (b == null) {
            a = null;
        }
        else {
            a = b.a;
        }
        if (a != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final psc psc2 = (psc)m.b;
            psc2.a |= 0x4;
            psc2.d = a;
        }
        try {
            final okt i = pry.c.m();
            final prx e = mga.e(null, this.g);
            if (i.c) {
                i.m();
                i.c = false;
            }
            final pry pry = (pry)i.b;
            e.getClass();
            pry.b = e;
            pry.a |= 0x1;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final psc psc3 = (psc)m.b;
            final pry c = (pry)i.h();
            c.getClass();
            psc3.c = c;
            psc3.a |= 0x2;
        }
        catch (final RuntimeException ex) {
            a.m(mhr.a.c(), "Failed to get process stats.", '\u0c1e', ex);
        }
        return m;
    }
    
    @Override
    public final void k() {
        ((mhs)((pii)((njd)this.j).a).get()).a(this);
        this.k.a(this);
        this.h(3, this.m);
        if (this.f) {
            this.d();
        }
        ofi.p(this.q, this.h);
    }
}
