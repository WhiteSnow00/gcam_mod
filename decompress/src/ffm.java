import java.util.Collection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffm implements fge, ffy
{
    public static final nsd a;
    public final fhb b;
    public final niz c;
    public final Object d;
    public boolean e;
    public final Set f;
    private final fht g;
    private long h;
    private final ffn i;
    private final ffn j;
    private final ffn k;
    private final boolean l;
    private final boolean m;
    private boolean n;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/encoder/CookieCutterMicrovideoEncoder");
    }
    
    public ffm(final fhb b, final fht g, final niz c, final kjk kjk, final cxl cxl, final krr krr) {
        this.n = false;
        this.e = false;
        this.b = b;
        this.g = g;
        this.c = c;
        this.d = new Object();
        this.h = -1L;
        this.f = new HashSet();
        this.l = cxl.k(cxw.j);
        this.m = cxl.k(cxw.q);
        cxl.e();
        this.i = new ffp(krr, "Vid");
        this.j = new ffp(krr, "Aud");
        this.k = new ffp(krr, "Mtn");
        kjk.c(new ffk(this));
    }
    
    @Override
    public final ffx a(final long n) {
        final Object d = this.d;
        monitorenter(d);
        try {
            final Iterator iterator = this.f.iterator();
            final int n2 = 0;
            boolean b = false;
            while (iterator.hasNext()) {
                final ffl ffl = (ffl)iterator.next();
                if (!ffl.g) {
                    boolean b2;
                    if (ffl.f) {
                        b2 = this.m;
                    }
                    else {
                        b2 = this.l;
                    }
                    final nqe c = ffl.c;
                    final Long value = n;
                    if (c.k(value)) {
                        final him a = ffl.a;
                        final ffx a2 = ffx.a(b2);
                        monitorexit(d);
                        return a2;
                    }
                    if (ffl.c.m() && nqe.e(ffl.c.j(), (long)ffl.c.j() + 66666L).k(value)) {
                        final him a3 = ffl.a;
                        final ffx a4 = ffx.a(b2);
                        monitorexit(d);
                        return a4;
                    }
                    b |= ((long)ffl.c.i() < n ^ true);
                }
            }
            if (b) {
                final ffx ffx = new ffx(0);
                monitorexit(d);
                return ffx;
            }
            int n3;
            if (!this.l) {
                n3 = n2;
            }
            else {
                n3 = 4;
            }
            final ffx ffx2 = new ffx(n3 | 0x3);
            monitorexit(d);
            return ffx2;
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final fkk b(final him him, final fgd fgd, long h, final boolean b) {
        synchronized (this.d) {
            if (h < this.h) {
                ffm.a.b().E(1621).y("Starting session %s at %d which is before the last promise %d", him, h, this.h);
                h = this.h;
            }
            final ffl ffl = new ffl(this, him, fgd, nqe.c(h), b);
            this.f.add(ffl);
            this.g();
            this.f();
            return ffl;
        }
    }
    
    @Override
    public final void c(final long n) {
        final Object d = this.d;
        monitorenter(d);
        try {
            final Iterator iterator = this.f.iterator();
            long n2 = Long.MAX_VALUE;
            while (iterator.hasNext()) {
                final ffl ffl = (ffl)iterator.next();
                long min = n2;
                if (!ffl.d) {
                    min = n2;
                    if (!ffl.g) {
                        min = Math.min(n2, (long)ffl.c.i());
                    }
                }
                n2 = min;
            }
            this.h = Math.min(n2, Math.max(n, this.h));
            this.g();
            this.i.d(this.h);
            this.j.d(this.h);
            this.k.d(this.h);
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    @Override
    public final void d() {
        final Object d = this.d;
        monitorenter(d);
        try {
            this.i.c();
            this.j.c();
            this.k.c();
            for (final ffl ffl : this.f) {
                final nqe c = ffl.c;
                if (c != null) {
                    String format;
                    if (c.l()) {
                        format = String.format(Locale.US, "<%d>", c.i());
                    }
                    else {
                        format = "n/a";
                    }
                    String format2;
                    if (c.m()) {
                        format2 = String.format(Locale.US, "<%d>", c.j());
                    }
                    else {
                        format2 = "n/a";
                    }
                    String.format(Locale.US, "%s to %s", format, format2);
                }
                final boolean f = ffl.f;
                final boolean d2 = ffl.d;
            }
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
    
    public final void e() {
        synchronized (this.d) {
            if (!this.n && !this.e) {
                this.b.c(this.i, this);
                final fht g = this.g;
                final ffn k = this.k;
                k.a(ofi.n(g.i));
                g.p = k;
                g.q = g.j.a();
                if (this.c.g()) {
                    ((ffi)this.c.c()).b(this.j, this);
                }
                else {
                    this.j.a(ofi.l());
                }
                this.n = true;
            }
        }
    }
    
    public final void f() {
        this.b.e();
        if (this.c.g()) {
            final ffi ffi = (ffi)this.c.c();
        }
    }
    
    public final void g() {
        final Object d = this.d;
        monitorenter(d);
        try {
            final Iterator iterator = this.f.iterator();
            long n = Long.MIN_VALUE;
            while (iterator.hasNext()) {
                final ffl ffl = (ffl)iterator.next();
                long max = n;
                if (ffl.c.m()) {
                    max = n;
                    if ((long)ffl.c.j() < this.h) {
                        max = Math.max(n, (long)ffl.c.j());
                    }
                }
                n = max;
            }
            if (!this.f.isEmpty() && !this.n) {
                this.e();
            }
            for (final ffl ffl2 : this.f) {
                if (!ffl2.d && !ffl2.g && (ffl2.c.m() || ffl2.f)) {
                    boolean b;
                    if (ffl2.f) {
                        b = this.m;
                    }
                    else {
                        b = this.l;
                    }
                    final him a = ffl2.a;
                    lup a2 = ffl2.b.a;
                    if (!b) {
                        a2 = new fgp(a2);
                    }
                    ffl2.i = this.i.e(a2, (long)ffl2.c.i());
                    ffl2.k = this.k.e(ffl2.b.c, (long)ffl2.c.i());
                    final lup b2 = ffl2.b.b;
                    if (b2 != null) {
                        ffl2.j = this.j.e(b2, (long)ffl2.c.i());
                    }
                    ffl2.d = true;
                }
            }
            for (final ffl ffl3 : this.f) {
                if (ffl3.d && !ffl3.c.m() && !ffl3.g && ffl3.f) {
                    final him a3 = ffl3.a;
                    final ffo i = ffl3.i;
                    i.getClass();
                    i.a(this.h, false);
                    final ffo k = ffl3.k;
                    k.getClass();
                    k.a(this.h, false);
                    if (!this.c.g() || !ffl3.f) {
                        continue;
                    }
                    final ffo j = ffl3.j;
                    j.getClass();
                    j.a(this.h, false);
                }
            }
            for (final ffl ffl4 : this.f) {
                if (ffl4.d && ffl4.c.m() && !ffl4.g && !ffl4.e) {
                    final him a4 = ffl4.a;
                    ffl4.c.i();
                    ffl4.c.j();
                    ((Long)ffl4.c.j()).longValue();
                    ((Long)ffl4.c.i()).longValue();
                    final ffo l = ffl4.i;
                    l.getClass();
                    l.a((long)ffl4.c.j(), true);
                    final ffo m = ffl4.k;
                    m.getClass();
                    m.a((long)ffl4.c.j(), true);
                    final ffo j2 = ffl4.j;
                    if (j2 != null) {
                        if (ffl4.f) {
                            j2.a((long)ffl4.c.j(), true);
                        }
                        else {
                            final him a5 = ffl4.a;
                            j2.a((long)ffl4.c.i(), true);
                        }
                    }
                    ffl4.e = true;
                }
            }
            final ArrayList list = new ArrayList();
            for (final ffl ffl5 : this.f) {
                if (ffl5.g || (ffl5.e && ffl5.c.m() && (long)ffl5.c.j() < this.h)) {
                    list.add(ffl5);
                }
            }
            this.f.removeAll(list);
            monitorexit(d);
        }
        finally {
            monitorexit(d);
            while (true) {}
        }
    }
}
