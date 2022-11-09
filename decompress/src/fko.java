import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fko implements dpz, fkl
{
    private static final long b;
    public final dpy a;
    private final fkn c;
    private final fkn d;
    private final AtomicBoolean e;
    private final long f;
    private final AtomicBoolean g;
    private final List h;
    private final Executor i;
    private final ddm j;
    private final cxl k;
    private final niz l;
    private final List m;
    private niz n;
    private volatile gzn o;
    private volatile fkk p;
    private volatile long q;
    private volatile long r;
    private volatile int s;
    
    static {
        b = Math.round(1.6666666666666666E7);
    }
    
    public fko(final dpy a, final long f, final List h, final int s, final Executor i, final ddm j, final cxl k, final niz l) {
        this.n = nii.a;
        this.a = a;
        this.f = f;
        this.h = h;
        this.s = s;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.e = new AtomicBoolean(false);
        this.g = new AtomicBoolean(true);
        this.r = Long.MAX_VALUE;
        this.m = new ArrayList();
        if (k != null && k.k(cxx.E)) {
            this.c = new fkn(0.3f, 0.6f);
            this.d = new fkn(0.6f, 0.8f);
            return;
        }
        this.c = new fkn(0.3f, 0.6f);
        this.d = new fkn(0.5f, 0.8f);
    }
    
    private final int b(final List list) {
        int n;
        for (n = list.size() - 1; n > 1 && ((gzn)list.get(n)).b > this.f + fko.b; --n) {}
        this.o = (gzn)list.get(n);
        return n;
    }
    
    private final niz c(final gzn gzn) {
        final gzn o = this.o;
        if (o == null || gzn == null) {
            return nii.a;
        }
        this.e(gzn);
        final long b = gzn.b;
        final long f = this.f;
        if (b < f) {
            return nii.a;
        }
        if (b > f + 1500000000L) {
            niz.i(fkp.b);
            return niz.i(fkp.b);
        }
        for (final fky fky : this.h) {
            if (fky.b(gzn, o)) {
                niz.i(fky.a());
                return niz.i(fky.a());
            }
        }
        return nii.a;
    }
    
    private final void e(final gzn gzn) {
        synchronized (this) {
            this.m.add(gzn);
        }
    }
    
    private final void f(final fkp fkp) {
        if (fkp.equals(fkp.c)) {
            this.r = Math.max(this.f, this.r - dqe.h * 6L);
        }
    }
    
    private final void g(final fkk fkk, final long n, final fkp fkp) {
        final AtomicBoolean e = this.e;
        final int n2 = 0;
        if (!e.compareAndSet(false, true) || fkk == null) {
            return;
        }
        final long min = Math.min(TimeUnit.MICROSECONDS.convert(this.r, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f, TimeUnit.NANOSECONDS) + 1500000L);
        int i = 0;
        Label_0101: {
            if (this.k != null) {
                final cxo a = cxw.a;
                final int s = this.s;
                if (s == 0) {
                    throw null;
                }
                if (s == 1) {
                    i = (this.i() ? 1 : 0);
                    break Label_0101;
                }
            }
            i = 0;
        }
        int h = 0;
        Label_0142: {
            if (this.j.b()) {
                final int s2 = this.s;
                if (s2 == 0) {
                    throw null;
                }
                if (s2 == 1) {
                    h = (this.h() ? 1 : 0);
                    break Label_0142;
                }
            }
            h = 0;
        }
        if (min - n >= 1000000L) {
            if (i == 0 || h != 0) {
                fkk.b(min, fkp);
                return;
            }
            i = 1;
            h = n2;
        }
        final int s3 = this.s;
        if (s3 == 0) {
            throw null;
        }
        if (s3 == 1) {
            if (i != 0 && h == 0) {
                niz.i(fjy.d);
                fkk.a(fjy.d);
                return;
            }
            if (TimeUnit.MICROSECONDS.convert(this.f, TimeUnit.NANOSECONDS) - n < dqe.g * 10L) {
                niz.i(fjy.e);
                fkk.a(fjy.e);
                return;
            }
            niz.i(fjy.f);
            fkk.a(fjy.f);
        }
        else {
            final int s4 = this.s;
            if (s4 == 0) {
                throw null;
            }
            if (s4 == 2) {
                fkk.b(n + 1000000L, fkp);
                return;
            }
            final String a2 = fkz.a(this.s);
            final StringBuilder sb = new StringBuilder(a2.length() + 22);
            sb.append("Unknown trimming mode:");
            sb.append(a2);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    private final boolean h() {
        monitorenter(this);
        try {
            final had c = ((hae)((njd)this.l).a).c(this.o.b);
            if (c == null) {
                monitorexit(this);
                return false;
            }
            final Iterator iterator = this.m.iterator();
            float n = 0.0f;
            while (iterator.hasNext()) {
                final had c2 = ((hae)((njd)this.l).a).c(((gzn)iterator.next()).b);
                float b;
                if (c2 == null) {
                    b = 0.0f;
                }
                else {
                    b = c2.b;
                }
                if (b > n) {
                    n = b;
                }
            }
            if (fjk.a(n - c.b) > 0.6f) {
                monitorexit(this);
                return true;
            }
            monitorexit(this);
            return false;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final boolean i() {
        monitorenter(this);
        try {
            final int size = this.m.size();
            float n = 0.0f;
            float n2 = 0.0f;
            float n3;
            for (int i = 0; i < size; ++i, n2 = n3) {
                final gzn gzn = this.m.get(i);
                n += gzn.h;
                final float o = gzn.o;
                n3 = n2;
                if (o > n2) {
                    n3 = o;
                }
            }
            final float n4 = n / this.m.size();
            float j = j(n4, this.c);
            float k = j(n4, this.d);
            if (this.k.k(cxx.E) && n4 < 1.0E-9) {
                j = 0.6f;
                k = 0.8f;
            }
            final Iterator iterator = this.m.iterator();
            int n5 = 0;
            int n6 = 0;
            while (iterator.hasNext()) {
                float o2;
                final float n7 = o2 = ((gzn)iterator.next()).o;
                if (n7 > 0.1f) {
                    o2 = n7 / n2;
                }
                if (o2 > j) {
                    ++n5;
                }
                else {
                    ++n6;
                }
            }
            if (n5 == 0) {
                monitorexit(this);
                return true;
            }
            final float n8 = n5 / (float)(n5 + n6);
            monitorexit(this);
            return n8 < k;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private static final float j(float min, final fkn fkn) {
        final float a = fkn.a;
        final float b = fkn.b;
        min = Math.min(Math.max((min - 1.0f) / 0.5f, 0.0f), 1.0f);
        return a * (1.0f - min) + b * min;
    }
    
    @Override
    public final long a() {
        final List c = this.a.c();
        if (c.isEmpty()) {
            return TimeUnit.MICROSECONDS.convert(this.f, TimeUnit.NANOSECONDS) - 1500000L;
        }
        final int b = this.b(c);
        long b2 = this.o.b;
        while (true) {
            long b3;
            for (int i = b - 1; i >= 0; --i, b2 = b3) {
                final gzn gzn = c.get(i);
                b3 = gzn.b;
                final gzn o = this.o;
                if (o != null) {
                    if (gzn != null) {
                        this.e(gzn);
                        final long b4 = gzn.b;
                        final long f = this.f;
                        if (b4 <= f) {
                            Label_0211: {
                                if (b4 >= f - 1500000000L) {
                                    for (final fky fky : this.h) {
                                        if (fky.b(gzn, o)) {
                                            this.n = niz.i(fky.a());
                                            break Label_0211;
                                        }
                                    }
                                    continue;
                                }
                                this.n = niz.i(fkp.b);
                            }
                            if (i <= b) {
                                long n;
                                if (this.n.equals(niz.i(fkp.c))) {
                                    n = dqe.h * 6L;
                                }
                                else {
                                    n = 0L;
                                }
                                return this.q = Math.min(Math.max(TimeUnit.MICROSECONDS.convert(b2 + n, TimeUnit.NANOSECONDS), TimeUnit.MICROSECONDS.convert(this.f, TimeUnit.NANOSECONDS) - 1500000L), TimeUnit.MICROSECONDS.convert(this.f, TimeUnit.NANOSECONDS));
                            }
                        }
                    }
                }
            }
            this.n = niz.i(fkp.b);
            continue;
        }
    }
    
    @Override
    public final void d(final fkk fkk) {
        this.p = new fkm(this, fkk);
        this.a.f(this, this.i);
    }
    
    @Override
    public final void k(gzn gzn) {
        monitorenter(this);
        try {
            final fkk p = this.p;
            final long q = this.q;
            if (this.g.compareAndSet(true, false)) {
                final List c = this.a.c();
                if (!c.isEmpty()) {
                    this.r = this.f;
                    for (int i = this.b(c) + 1; i < c.size(); ++i) {
                        gzn = (gzn)c.get(i);
                        final niz c2 = this.c(gzn);
                        if (c2.g()) {
                            this.f((fkp)c2.c());
                            this.g(p, q, (fkp)c2.c());
                        }
                        else {
                            this.r = gzn.b;
                        }
                    }
                }
                monitorexit(this);
                return;
            }
            final niz c3 = this.c(gzn);
            if (c3.g()) {
                this.f((fkp)c3.c());
                this.g(p, q, (fkp)c3.c());
            }
            else {
                this.r = gzn.b;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
