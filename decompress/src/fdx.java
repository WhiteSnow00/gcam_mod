import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import android.os.SystemClock;
import java.io.IOException;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdx implements fet
{
    public static final nsd a;
    private final fkh A;
    private final dxk B;
    public final Executor b;
    public final Executor c;
    public final few d;
    public final Object e;
    public final fcz f;
    public final niz g;
    public final niz h;
    public final fvc i;
    public final fge j;
    public final fkq k;
    public final cxl l;
    public final boolean m;
    public final fcy n;
    public final fei o;
    public final Handler p;
    public final hdz q;
    public final lfg r;
    public final dtb s;
    public final ddm t;
    public final fbv u;
    public final fcr v;
    public final njp w;
    public long x;
    public final List y;
    private final fcv z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/MicrovideoControllerImpl");
    }
    
    public fdx(final Executor b, final Executor c, final few d, final fcz f, final fcv z, final niz g, final niz h, final fvc i, final fge j, final fkq k, final fkh a, final cxl l, final fcy n, final hdz q, final lfg r, final Handler p22, final fei o, final dtb s, final dxk b2, final fbv u, final fcr v, final ddm t) {
        this.w = fdh.a;
        this.d = d;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        this.f = f;
        this.z = z;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.A = a;
        this.l = l;
        this.n = n;
        this.o = o;
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.B = b2;
        this.t = t;
        this.u = u;
        this.v = v;
        this.e = new Object();
        this.y = new ArrayList();
        final cxo a2 = cxw.a;
        l.e();
        this.m = l.k(cxw.j);
        final cxo a3 = cxr.a;
        l.c();
        l.b();
        l.b();
    }
    
    public static void d(final fvc fvc, final him him, final Handler handler) {
        handler.postDelayed((Runnable)new fdd(fvc, him), (Object)him, 11000L);
    }
    
    public static final void f(final fdw fdw, final fdv fdv) {
        njo.o(fdw.l.get());
        try {
            try {
                lpy.j(fdv.d, (ExifInterface)fdv.b.f(), fdv.e.a);
                fdv.c.m(fdv.e.a.a());
                fdv.e.c();
                fdw.c.b();
                njo.o(fdw.n.isDone() ^ true);
                fdw.n.o(fdv.a);
                return;
            }
            finally {}
        }
        catch (final IOException ex) {
            fdx.a.b().h(ex).E(1553).o("Could not move original image to place");
            fdw.n.a(ex);
            fdv.e.b();
            fdw.c.b();
            return;
        }
        fdw.c.b();
    }
    
    public static final oaf g(final fdw fdw, long longValue) {
        final fgs a = fdw.d.a();
        final okt m = oaf.m.m();
        final int b = (int)(longValue - fdw.f);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf = (oaf)m.b;
        oaf.a |= 0x1;
        oaf.b = b;
        if (fdw.p && fdw.r.g()) {
            SystemClock.elapsedRealtime();
            ((Long)fdw.r.c()).longValue();
        }
        try {
            longValue = (long)ofi.u(fdw.h);
            final int c = (int)TimeUnit.MILLISECONDS.convert(longValue - a.c, TimeUnit.MICROSECONDS);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oaf oaf2 = (oaf)m.b;
            oaf2.a |= 0x2;
            oaf2.c = c;
            final int d = (int)TimeUnit.MILLISECONDS.convert(a.d - fdw.e, TimeUnit.MICROSECONDS);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oaf oaf3 = (oaf)m.b;
            final int a2 = oaf3.a | 0x4;
            oaf3.a = a2;
            oaf3.d = d;
            final int a3 = a2 | 0x10;
            oaf3.a = a3;
            oaf3.f = true;
            final int b2 = a.b;
            final int a4 = a3 | 0x8;
            oaf3.a = a4;
            oaf3.e = b2;
            oaf3.a = (a4 | 0x20);
            oaf3.g = false;
            final int k = k(fdw.t);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oaf oaf4 = (oaf)m.b;
            oaf4.h = k - 1;
            final int a5 = oaf4.a | 0x40;
            oaf4.a = a5;
            final int u = fdw.u;
            if (u != 0) {
                oaf4.l = u - 1;
                oaf4.a = (a5 | 0x200);
                njo.o(fdw.j.isDone());
                if (((niz)ofi.v(fdw.j)).g()) {
                    if (m.c) {
                        m.m();
                        m.c = false;
                    }
                    final oaf oaf5 = (oaf)m.b;
                    oaf5.a |= 0x80;
                    oaf5.j = true;
                }
                fdw.i.e(m);
                return (oaf)m.h();
            }
            throw null;
        }
        catch (final ExecutionException ex) {
            throw new IllegalStateException("Shutter timestamp unavailable for stats collection", ex);
        }
    }
    
    public static final oaf h(final fdw fdw) {
        final okt m = oaf.m.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf = (oaf)m.b;
        oaf.a |= 0x10;
        oaf.f = false;
        final int k = k(fdw.t);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf2 = (oaf)m.b;
        oaf2.h = k - 1;
        final int a = oaf2.a | 0x40;
        oaf2.a = a;
        final int u = fdw.u;
        if (u != 0) {
            oaf2.l = u - 1;
            oaf2.a = (a | 0x200);
            return (oaf)m.h();
        }
        throw null;
    }
    
    public static final void j(final fdw fdw, final Throwable t, final fdv fdv) {
        final him a = fdw.a;
        if (fdw.l.getAndSet(true)) {
            a.l(fdx.a.c(), "Cancelling microvideo but result has been submitted already", '\u061c');
            return;
        }
        if (fdw.p) {
            fdw.k.w(t);
            fdw.n.a(new IllegalStateException("Microvideo LongS cancelled!", t));
        }
        else {
            f(fdw, fdv);
        }
        fdw.c.b();
        final huz c = fdv.c;
        final okt m = oaf.m.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf = (oaf)m.b;
        final int a2 = oaf.a | 0x10;
        oaf.a = a2;
        oaf.f = false;
        oaf.a = (a2 | 0x20);
        oaf.g = true;
        final int k = k(fdw.t);
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oaf oaf2 = (oaf)m.b;
        oaf2.h = k - 1;
        final int a3 = oaf2.a | 0x40;
        oaf2.a = a3;
        final int u = fdw.u;
        if (u != 0) {
            oaf2.l = u - 1;
            oaf2.a = (a3 | 0x200);
            c.k((oaf)m.h());
            return;
        }
        throw null;
    }
    
    private static final int k(final int n) {
        if (n == 0) {
            throw null;
        }
        switch (n - 1) {
            default: {
                final String a = fkz.a(n);
                final StringBuilder sb = new StringBuilder(a.length() + 23);
                sb.append("Unknown trimming mode: ");
                sb.append(a);
                throw new RuntimeException(sb.toString());
            }
            case 1: {
                return 4;
            }
            case 0: {
                return 3;
            }
        }
    }
    
    @Override
    public final fes a(final hhy hhy, final int n, final boolean b, final oey oey) {
        synchronized (this) {
            final him h = hhy.h();
            final boolean b2 = hhy.i() == hio.o;
            if (!this.f.h() && !b2) {
                return new fed(h);
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long currentTimeMillis = System.currentTimeMillis();
            new fdg(this, 1);
            flj.b();
            ffb.b.clear();
            ffb.c.clear();
            ffb.a();
            Object o = this.e;
            monitorenter(o);
            Label_0192: {
                if (!b2) {
                    break Label_0192;
                }
                try {
                    this.A.b();
                    if (this.h.g()) {
                        final ffi ffi = (ffi)this.h.c();
                        if (ffi.c.g() && ffi.a.g()) {
                            ffi.d.execute(new fff(ffi));
                        }
                    }
                    final long convert = TimeUnit.MICROSECONDS.convert(hhy.d() + (elapsedRealtime - currentTimeMillis), TimeUnit.MILLISECONDS);
                    if (this.x == 0L) {
                        fdx.a.c().E(1537).o("Taking picture before any frames came in; aborting.");
                        if (!b2) {
                            return new fed(h);
                        }
                        if (!this.l.k(cxw.u)) {
                            hhy.w(new IllegalStateException("Taking long shot before any frames came in."));
                            return new fed(h);
                        }
                    }
                    this.y.add(convert);
                    monitorexit(o);
                    final cxl l = this.l;
                    o = cxw.a;
                    l.c();
                    if (hhy.i() == hio.o && !this.z.b()) {
                        hhy.w(new IllegalStateException("Not enough free space."));
                        return new fed(h);
                    }
                    if (hhy.i() == hio.o) {
                        hhy.y();
                    }
                    o = this.i.b();
                    final ofn f = ofn.f();
                    this.B.a(h).a(new fdb(this, f));
                    this.b.execute(new fdl(this, h, convert, hhy, b, b2, n, oey, (krc)o, f));
                    return new fds(this, f);
                }
                finally {
                    monitorexit(o);
                }
            }
        }
    }
    
    public final void b(final fdw fdw) {
        synchronized (this) {
            fdw.b.a(fjy.c);
            fdw.o.c();
            fdw.c.b();
            final him a = fdw.a;
        }
    }
    
    public final void c(final fdw fdw, final Throwable t, final fdv fdv) {
        fdx.a.c().h(t).E(1557).r("%s: Microvideo session failed", fdw.a);
        this.j.d();
        if (fdw.l.getAndSet(true)) {
            return;
        }
        if (fdw.p) {
            fdw.n.a(new IllegalStateException("Microvideo LongS failed!", t));
        }
        else {
            f(fdw, fdv);
        }
        fdv.c.k(h(fdw));
    }
    
    public final boolean e(final boolean b) {
        boolean k;
        if (b) {
            final cxl l = this.l;
            final cxo a = cxw.a;
            l.b();
            k = false;
        }
        else {
            k = this.l.k(cxw.k);
        }
        return k;
    }
    
    public final void i(final fdw fdw, final fdv fdv, final long n) {
        final him a = fdw.a;
        final niz r = fdw.r;
        if (r.g()) {
            fdv.c.s((long)r.c());
        }
        else {
            fdx.a.c().E(1560).r("No recording-end timestamp recorded for %s", fdw.a);
        }
        try {
            final lkb a2 = fdw.c.a;
            if (!fdw.l.getAndSet(true)) {
                if (this.l.k(cxx.F)) {
                    this.o.a(a2);
                }
                fdv.c.m(a2.a());
                njo.o(fdw.n.isDone() ^ true);
                fdv.c.k(g(fdw, System.currentTimeMillis()));
                a2.h("LS");
                fdw.c.c();
                final ofn n2 = fdw.n;
                final hwr hwr = new hwr(llk.e);
                TimeUnit.MICROSECONDS.toMillis(n);
                hwr.a((ExifInterface)fdv.a.c.f());
                final hwr a3 = fdv.a;
                hwr.d = a3.d;
                hwr.b((kra)a3.b.f());
                n2.o(hwr);
                return;
            }
            throw new IllegalStateException("Trying to set final file but it has already been submitted.");
        }
        catch (final Exception ex) {
            this.c(fdw, ex, fdv);
        }
    }
}
