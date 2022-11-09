import android.os.SystemClock;
import android.hardware.camera2.CaptureResult$Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.List;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hva implements huz
{
    private static final nsd o;
    protected long a;
    protected final eyt b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected ExifInterface g;
    protected List h;
    protected eyx i;
    protected hvb j;
    protected Long k;
    protected oaf l;
    protected nyx m;
    protected nyw n;
    private final ofn p;
    private nxk q;
    private nxn r;
    private nyy s;
    private Long t;
    private oby u;
    private boolean v;
    private final ofn w;
    private ezd x;
    private okt y;
    
    static {
        o = nsd.g("com/google/android/apps/camera/stats/CaptureSessionStatsCollectorImpl");
    }
    
    public hva(final eyt b) {
        this.a = 0L;
        this.p = ofn.f();
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.j = null;
        this.v = false;
        this.w = ofn.f();
        this.b = b;
    }
    
    private final nxl D(final long n) {
        if (!this.v) {
            return null;
        }
        Object m = null;
        try {
            m = this.w.get(2500L, TimeUnit.MILLISECONDS);
            if (m == null) {
                return null;
            }
            final long longValue = (long)m;
            m = nxl.c.m();
            if (((okt)m).c) {
                ((okt)m).m();
                ((okt)m).c = false;
            }
            final nxl nxl = (nxl)((okt)m).b;
            nxl.a |= 0x1;
            nxl.b = longValue - n;
            m = ((okt)m).h();
            return (nxl)m;
        }
        catch (final TimeoutException m) {}
        catch (final ExecutionException m) {}
        catch (final InterruptedException ex) {}
        a.m(hva.o.b(), "Error retrieving kepler meta.", '\u09ca', (Throwable)m);
        return null;
    }
    
    private final int E() {
        final ezd x = this.x;
        if (x == null) {
            a.l(hva.o.b(), "inferPhotoMode called while atTimeRequestData not present yet", '\u09cc');
            return 1;
        }
        if (this.y != null) {
            return 22;
        }
        if (x.n == 29) {
            return 29;
        }
        final oaf l = this.l;
        Label_0099: {
            if (l != null) {
                final int k = nvb.k(l.l);
                if (k != 0) {
                    if (k == 4) {
                        return 32;
                    }
                }
                final int i = nvb.k(this.l.l);
                if (i == 0) {
                    break Label_0099;
                }
                if (i != 5) {
                    break Label_0099;
                }
                return 32;
            }
        }
        if (this.f) {
            return 8;
        }
        final ezd x2 = this.x;
        if (x2 != null) {
            return x2.n;
        }
        a.l(hva.o.b(), "inferPhotoMode called while atTimeRequestData not present yet", '\u09cb');
        return 1;
    }
    
    private final void F(final int n, final long n2) {
        long n3 = n2 - this.a;
        final eyx i = this.i;
        Object c = null;
        Label_0289: {
            if (i != null) {
                final okt m = oac.d.m();
                synchronized (i.a) {
                    if (i.b.size() > 0 && i.c.get(0) != null) {
                        final int b = i.c.get(0).d;
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        c = m.b;
                        if (b == 0) {
                            throw null;
                        }
                        ((oac)c).b = b - 1;
                        ((oac)c).a |= 0x1;
                    }
                    else {
                        final int b = eyw.a.d;
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        c = m.b;
                        if (b == 0) {
                            throw null;
                        }
                        ((oac)c).b = b - 1;
                        ((oac)c).a |= 0x1;
                    }
                    final List b2 = i.b;
                    final oac oac = (oac)m.b;
                    c = oac.c;
                    if (!((olj)c).c()) {
                        oac.c = oky.C((olj)c);
                    }
                    ojf.e(b2, oac.c);
                    c = m.h();
                    break Label_0289;
                }
            }
            c = null;
        }
        final okt y = this.y;
        Object b3 = null;
        if (y != null) {
            final int b = (int)n3;
            if (y.c) {
                y.m();
                y.c = false;
            }
            b3 = y.b;
            final oav f = oav.f;
            ((oav)b3).a |= 0x1;
            ((oav)b3).b = b;
        }
        Object o = null;
        Object o4 = null;
        while (true) {
            Label_0723: {
                while (true) {
                    ExifInterface g = null;
                    try {
                        Object o2 = null;
                        Label_0484: {
                            if (this.f) {
                                b3 = this.p.get(500L, TimeUnit.MILLISECONDS);
                                Object c2 = ((ezf)b3).c;
                                try {
                                    final Long a = ((ezf)b3).a;
                                    try {
                                        b3 = ((ezf)b3).b;
                                        break Label_0484;
                                    }
                                    catch (final TimeoutException b3) {}
                                    catch (final ExecutionException b3) {}
                                    catch (final InterruptedException ex) {}
                                    finally {
                                        b3 = c2;
                                        final ezf ezf;
                                        c2 = ezf;
                                        break;
                                    }
                                }
                                catch (final TimeoutException b3) {}
                                catch (final ExecutionException b3) {}
                                catch (final InterruptedException ex2) {}
                                finally {
                                    b3 = c2;
                                    final dua dua = null;
                                    final dua dua2;
                                    o = dua2;
                                    o2 = dua;
                                    break;
                                }
                                break Label_0723;
                            }
                            o2 = null;
                            o = (b3 = o2);
                        }
                        if (this.C()) {
                            final eyt eyt = this.b;
                            final int b = this.E();
                            final ezd x = this.x;
                            g = this.g;
                            final boolean b4 = this.B();
                            if (o2 != null) {
                                n3 = (long)o2;
                            }
                            final Float n4 = jxc.f(n3);
                            final List list = this.h;
                            final Long n5 = this.k;
                            final oaf oaf = this.l;
                            final nyx nyx = this.m;
                            final okt y2 = this.y;
                            oav oav;
                            if (y2 == null) {
                                oav = null;
                            }
                            else {
                                oav = (oav)y2.h();
                            }
                            final Object x2 = oav;
                            final Object o3 = b3;
                            o4 = x;
                            eyt.ap(b, (ezd)o4, g, b4, n4, list, (oac)c, n, (dua)o, n5, (Integer)o3, oaf, nyx, (oav)x2, this.q, this.n, this.t, this.b(), this.d, this.e, this.u, this.r, this.D(n2), this.s, this.x.m);
                        }
                        return;
                    }
                    catch (final TimeoutException ex3) {}
                    catch (final ExecutionException ex4) {}
                    catch (final InterruptedException ex5) {}
                    finally {
                        o4 = (b3 = null);
                        break;
                    }
                    o4 = (o = null);
                    try {
                        hva.o.b().E(2509).r("Error retrieving Gcam metadata. %s", b3);
                        if (this.C()) {
                            final eyt eyt = this.b;
                            final int b = this.E();
                            final Object x2 = this.x;
                            final ExifInterface g2 = this.g;
                            final boolean b4 = this.B();
                            if (o4 != null) {
                                n3 = (long)o4;
                            }
                            final Float n4 = jxc.f(n3);
                            final List list = this.h;
                            final Long n5 = this.k;
                            final oaf oaf = this.l;
                            final nyx nyx = this.m;
                            final okt y3 = this.y;
                            if (y3 != null) {
                                final oav oav2 = (oav)y3.h();
                            }
                            final Object o3 = null;
                            continue;
                        }
                        return;
                    }
                    finally {
                        b3 = o;
                        o = g;
                    }
                    break;
                }
            }
            break;
        }
        if (this.C()) {
            final eyt b5 = this.b;
            final int e = this.E();
            final ezd x3 = this.x;
            final ExifInterface g3 = this.g;
            final boolean b6 = this.B();
            if (o4 != null) {
                n3 = (long)o4;
            }
            final float f2 = jxc.f(n3);
            final List h = this.h;
            final Long k = this.k;
            final oaf l = this.l;
            final nyx j = this.m;
            final okt y4 = this.y;
            oav oav3;
            if (y4 == null) {
                oav3 = null;
            }
            else {
                oav3 = (oav)y4.h();
            }
            b5.ap(e, x3, g3, b6, f2, h, (oac)c, n, (dua)b3, k, null, l, j, oav3, this.q, this.n, this.t, this.b(), this.d, this.e, this.u, this.r, this.D(n2), this.s, this.x.m);
        }
        throw o;
    }
    
    @Override
    public final void A(final long n) {
        this.F(2, n);
    }
    
    public final boolean B() {
        final ezd x = this.x;
        return x == null || (x.i || this.c);
    }
    
    public final boolean C() {
        return this.x != null && this.a != 0L;
    }
    
    @Override
    public final hvb a() {
        return this.j;
    }
    
    @Override
    public final Long b() {
        final hvb j = this.j;
        if (j == null) {
            return null;
        }
        return j.a;
    }
    
    @Override
    public final void c(final nxk q) {
        this.q = q;
    }
    
    @Override
    public final void d(final nxn r) {
        this.r = r;
    }
    
    @Override
    public final void e(final ezd x) {
        this.x = x;
    }
    
    @Override
    public final void f(final nyy s) {
        this.s = s;
    }
    
    @Override
    public final void g(final nyw n) {
        this.n = n;
    }
    
    @Override
    public final void h(final nyx m) {
        this.m = m;
    }
    
    @Override
    public final void i(final long n) {
        this.k = n;
    }
    
    @Override
    public final void j(final ezf ezf) {
        this.p.o(ezf);
    }
    
    @Override
    public final void k(final oaf l) {
        this.l = l;
    }
    
    @Override
    public final void l(final lji lji, final boolean f) {
        this.f = f;
        final CaptureResult$Key m = jli.m;
        final int n = 0;
        int i = 0;
        if (m != null && lji.d(jli.m) != null) {
            final List b = ljj.b(lji);
            final int size = b.size();
            this.h = new ArrayList(size);
            while (i < size) {
                this.h.add(gzm.b((ljj)b.get(i)));
                ++i;
            }
        }
        else {
            final Face[] array = (Face[])lji.d(CaptureResult.STATISTICS_FACES);
            if (array == null) {
                this.h = null;
            }
            else {
                final int length = array.length;
                this.h = new ArrayList(length);
                for (int j = n; j < length; ++j) {
                    this.h.add(gzm.a(array[j]));
                }
            }
        }
        final Float n2 = (Float)lji.d(CaptureResult.LENS_FOCUS_DISTANCE);
    }
    
    @Override
    public final void m(final long n) {
        final hvb j = this.j;
        if (j != null) {
            j.c = SystemClock.elapsedRealtimeNanos();
        }
        this.t = n;
    }
    
    @Override
    public final void n(final oav oav) {
        final okt y = (okt)oav.H(5);
        y.o(oav);
        this.y = y;
    }
    
    @Override
    public final void o(final ExifInterface g) {
        this.g = g;
    }
    
    @Override
    public final void p() {
        this.e = true;
    }
    
    @Override
    public final void q() {
        this.w.o(null);
    }
    
    @Override
    public final void r() {
        this.w.o(SystemClock.elapsedRealtime());
    }
    
    @Override
    public final void s(final long a) {
        this.a = a;
    }
    
    @Override
    public final void t(final long n) {
        this.F(1, n);
    }
    
    @Override
    public final void u() {
        this.v = true;
    }
    
    @Override
    public final void v(final boolean c) {
        this.c = c;
    }
    
    @Override
    public final void w() {
        this.d = true;
    }
    
    @Override
    public final void x(final eyx i) {
        this.i = i;
    }
    
    @Override
    public final void y(final hvb j) {
        this.j = j;
    }
    
    @Override
    public final void z(final oby u) {
        this.u = u;
    }
}
