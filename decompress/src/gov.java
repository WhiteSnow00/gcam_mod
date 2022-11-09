import android.hardware.camera2.CaptureResult;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import j$.util.function.Supplier;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gov implements gue
{
    public static final nsd a;
    public final nnc b;
    public final kvw c;
    private final njp d;
    private final fyr e;
    private final long f;
    private final guk g;
    private final Set h;
    private final dti i;
    private final kse j;
    private final int k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckFilteredRingBuffer");
    }
    
    public gov(final kjk kjk, final fyr e, final oey oey, final guk g, final Set h, final dti i, final kse j, final long f, final kvw c, final njp d, final int k) {
        this.b = nnc.v();
        this.e = e;
        this.d = d;
        this.k = k;
        this.f = f;
        this.c = c;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        for (final kwz kwz : c.q().c) {
            this.b.p(kwz.a(), kwz);
        }
        kjk.c(c);
        knf.f(oey, new gou(c), odx.a);
        if (this.b.a.containsKey(37) && g.b.k(cxs.S)) {
            final gui a = g.a;
            final dvj dvj = (dvj)a.a.get();
            dvj.getClass();
            final gry gry = (gry)a.b.get();
            gry.getClass();
            final kkn l = bsy.k();
            final Supplier supplier = (Supplier)a.c.get();
            supplier.getClass();
            final guh guh = new guh(dvj, gry, l, supplier, c);
            c.k(guh);
            g.c.c(guh);
            niz.i(guh);
        }
    }
    
    @Override
    public final gud a() {
        return got.a;
    }
    
    @Override
    public final kvs b(final long n) {
        return this.c.d(new fca(n, 3));
    }
    
    @Override
    public final kvs c() {
        kvs kvs = null;
        switch (this.k - 1) {
            default: {
                kvs = this.c.h();
                break;
            }
            case 1: {
                kvs = this.c.e();
                break;
            }
        }
        if (kvs != null) {
            kwp.j(kvs);
        }
        return kvs;
    }
    
    @Override
    public final kvs d() {
        switch (this.k - 1) {
            default: {
                return this.c.g();
            }
            case 1: {
                return this.c.c();
            }
        }
    }
    
    @Override
    public final kvs e() {
        final kvs h = this.c.h();
        if (h != null) {
            kwp.j(h);
        }
        return h;
    }
    
    @Override
    public final kvw f() {
        return this.c;
    }
    
    @Override
    public final nns g(final List list) {
        this.j.f("zslRingBuffer#filterAndTrim");
        this.j.f("zslRingBuffer#filterByTimestamp");
        nns nns;
        if (list.isEmpty()) {
            nns = nns.l();
        }
        else {
            final nnn e = nns.e();
            final kvx b = ((kvs)nov.d(list)).b();
            long n;
            if (b != null) {
                n = Math.max(b.a, this.e.d());
            }
            else {
                n = this.e.d();
            }
            final long f = this.f;
            for (final kvs kvs : list) {
                final kvx b2 = kvs.b();
                if (b2 != null && b2.a > n - f) {
                    e.g(kvs);
                }
                else {
                    kvs.close();
                }
            }
            nns = e.f();
        }
        this.j.h("zslRingBuffer#trimByCapacity");
        final boolean empty = nns.isEmpty();
        final int n2 = 0;
        nns nns2;
        if (empty) {
            nns2 = nns.l();
        }
        else {
            final LinkedList list2 = new LinkedList<Object>(nns);
            final nnn e2 = nns.e();
            for (int min = Math.min((int)this.d.a(), ((nql)nns).c), i = 0; i < min; ++i) {
                final kvs kvs2 = list2.pollLast();
                if (kvs2 != null) {
                    e2.g(kvs2);
                }
            }
            final Iterator<kvs> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().close();
            }
            nns2 = e2.f();
        }
        this.j.g();
        this.j.h("zslRingBuffer#filterByMetadata");
        nns nns3;
        if (nns2.isEmpty()) {
            nns3 = nns.l();
        }
        else {
            final nnn e3 = nns.e();
            final kvs kvs3 = nns2.get(0);
            this.j.f("zslRingBuffer#getRecentFocalLength");
            kwp.k(kvs3);
            final ljm c = kvs3.c();
            float floatValue = -1.0f;
            if (c != null) {
                final Float n3 = (Float)c.d(CaptureResult.LENS_FOCAL_LENGTH);
                if (n3 != null) {
                    floatValue = n3;
                }
            }
            this.j.h("zslRingBuffer#buildFilter");
            final nog nog = new nog();
            nog.i(this.h);
            nog.g(new guq(CaptureResult.LENS_FOCAL_LENGTH, floatValue));
            final gun gun = new gun(nog.f());
            this.j.h("findBinningStatus");
            final Set a = this.g.a(nns2);
            this.j.g();
            final nrw t = nns2.t();
            boolean b3 = false;
            while (t.hasNext()) {
                final kvs kvs4 = t.next();
                this.j.f("zslRingBuffer#filter");
                final boolean contains = a.contains(kvs4.b());
                if (gun.a(kvs4)) {
                    e3.g(kvs4);
                    if (contains ^ true) {
                        final dti j = this.i;
                        final kvx b4 = kvs4.b();
                        b4.getClass();
                        b3 |= (j.b(b4.a) ^ true);
                    }
                    else {
                        kvs4.b().getClass();
                    }
                }
                else {
                    kvs4.close();
                }
                this.j.g();
            }
            nns3 = e3.f();
            if (!b3) {
                for (int c2 = ((nql)nns3).c, k = n2; k < c2; ++k) {
                    ((kvs)nns3.get(k)).close();
                }
                nns3 = nns.l();
            }
        }
        this.j.g();
        return nns3;
    }
    
    @Override
    public final nns h(final List list) {
        this.j.f("zslRingBuffer#filter");
        final nns g = this.g(list);
        this.j.h("zslRingBuffer#awaitComplete");
        for (int c = ((nql)g).c, i = 0; i < c; ++i) {
            kwp.j((kvs)g.get(i));
        }
        this.j.g();
        return g;
    }
    
    @Override
    public final List i() {
        return this.m();
    }
    
    @Override
    public final List j() {
        return this.c.i();
    }
    
    @Override
    public final void k(final int n) {
        this.c.m(n);
    }
    
    @Override
    public final kzl l() {
        return this.c.q();
    }
    
    public final List m() {
        List list = null;
        switch (this.k - 1) {
            default: {
                list = this.c.j();
                break;
            }
            case 1: {
                list = this.c.i();
                break;
            }
        }
        return list;
    }
}
