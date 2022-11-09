import com.google.googlex.gcam.PostviewParams;
import java.util.concurrent.ExecutionException;
import com.google.googlex.gcam.BurstSpec;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqr implements gtt
{
    private static final nsd c;
    public final dvj a;
    public final dva b;
    private final lfg d;
    private final gij e;
    private final dtv f;
    private final dty g;
    private final dwn h;
    private final kse i;
    private final gry j;
    private final hvd k;
    private final dvb l;
    private final duq m;
    private final dyq n;
    private final guk o;
    
    static {
        c = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckZslHdrPlusProcessor");
    }
    
    public gqr(final dvj a, final lfg d, final gij e, final dtv f, final dty g, final dva b, final dwn h, final kse i, final gry j, final hvd k, final dvb l, final duq m, final dyq n, final guk o) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.b = b;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    private static final void i(final List list) {
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((kvs)iterator.next()).close();
        }
    }
    
    public final int a(final kvs kvs, final dxh dxh, final boolean b, int n, final int n2) {
        try {
            kwp.j(kvs);
            final kvx b2 = kvs.b();
            b2.getClass();
            if (b) {
                this.b.e(dxh, kvs);
            }
            final ljm c = kvs.c();
            if (c == null) {
                gqr.c.b().E(1987).y("Failure for frame %d @%d of %d, skipping.", n + 1, b2.b, n2);
                return n;
            }
            this.i.f("pckHdrZsl#addPayloadFrame");
            final grx a = this.j.a(kvs);
            lju lju;
            lju d;
            String s;
            if (b) {
                lju = a.e();
                d = a.d();
                s = a.a().c().a;
            }
            else {
                lju = a.f();
                final kwz b3 = a.b();
                if (b3 == null) {
                    a.l(gqr.c.b(), "Can't find the source camera for the secondary image.", '\u07c2');
                    throw new kuw("Can't find the source camera for the secondary image.");
                }
                s = b3.c().a;
                d = null;
            }
            ljm b4;
            if (a.h() && !b) {
                b4 = gto.b(c, s);
            }
            else {
                b4 = c;
            }
            kvs.close();
            this.a.o(dxh, n, b4, lju, d);
            if (lju != null) {
                ++n;
                final long b5 = b2.b;
                final long a2 = b2.a;
                dxh.a();
            }
            else {
                gqr.c.c().E(1984).y("Ignoring missing raw frame %d of %d for shot %d .", n + 1, n2, dxh.a());
                if (d != null) {
                    d.close();
                }
            }
            this.i.g();
            return n;
        }
        catch (final InterruptedException ex) {
            final kvx b6 = kvs.b();
            long b7;
            if (b6 != null) {
                b7 = b6.b;
            }
            else {
                b7 = -1L;
            }
            gqr.c.b().h(ex).E(1988).y("Completion failure for frame %d @%d of %d, skipping.", n + 1, b7, n2);
            return n;
        }
    }
    
    @Override
    public final void b(final List list, final gff gff, final gen gen, final int n, final ljm ljm, final dtx dtx) {
        this.h(list, gff, gen, n, ljm, dtx, null);
    }
    
    protected final int c(final List list, final dxh dxh, final boolean b, final int n) {
        final Set a = this.o.a(list);
        final Iterator iterator = list.iterator();
        int a2 = 0;
        while (iterator.hasNext()) {
            final kvs kvs = (kvs)iterator.next();
            final kvx b2 = kvs.b();
            if (b2 == null) {
                gqr.c.c().E(1990).p("Skipping invalid frame at %d", a2);
                kvs.close();
            }
            else if (a.contains(b2)) {
                kvs.close();
            }
            else {
                a2 = this.a(kvs, dxh, b, a2, n);
            }
        }
        return a2;
    }
    
    public final void d(final dxh dxh, final ljm ljm, final boolean b) {
        this.a.r(dxh);
        if (b) {
            this.b.f(dxh, null, ljm);
        }
    }
    
    public final void e(int a, final gen gen, final ljm ljm, final dxh dxh, final boolean b) {
        this.i.f("pckHdrZsl#endPayload");
        if (this.a.x(dxh)) {
            if (b) {
                this.b.h(dxh);
                final huz k = gen.b.k();
                k.l(ljm, true);
                this.k.c(k);
                int intValue;
                if (gen.b.i() == hio.b) {
                    intValue = 1;
                }
                else {
                    intValue = this.l.b();
                }
                final okt m = oby.d.m();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final oby oby = (oby)m.b;
                final int a2 = 0x1 | oby.a;
                oby.a = a2;
                oby.b = intValue;
                oby.a = (a2 | 0x2);
                oby.c = a;
                k.z((oby)m.h());
            }
            if (this.a.y(dxh)) {
                this.i.g();
                return;
            }
        }
        a = dxh.a();
        final StringBuilder sb = new StringBuilder(56);
        sb.append("Error ending the HDR+ payload, aborting shot ");
        sb.append(a);
        final String string = sb.toString();
        a.k(gqr.c.b(), "%s", string, '\u07cb');
        if (b) {
            this.b.d(dxh.c.b.h());
        }
        this.a.n(dxh);
        throw new dgf(string);
    }
    
    public final dxh f(final gen gen, final int n, final ljm ljm, final dtx dtx, final boolean b, final boolean b2) {
        try {
            try {
                final int a = this.a.a(ljm);
                final PostviewParams b3 = dub.b(this.d, this.e);
                this.i.f("detectFalconRequest");
                final int a2 = this.n.a(ljm);
                final boolean b4 = a2 == 3;
                final boolean b5 = a2 == 1 || b4;
                this.i.g();
                if (b) {
                    this.f.b(gen, this.h.a(ljm, a), dtx, boa.b(gen.a.a, this.d), true, b4);
                }
                else if (!b5) {
                    final kse kse = this.i;
                    kse.g();
                    return null;
                }
                int n2;
                if (!b2) {
                    n2 = -1;
                }
                else {
                    n2 = 0;
                }
                this.m.e(gen);
                this.i.f("pckHdrZsl#startZslShot");
                final dxh g = this.a.g(a, gen, b3, dtx.g, ljm, n2, n, b ^ true);
                this.i.g();
                return g;
            }
            finally {
                this.i.g();
                while (true) {}
                gqr.c.b().h((Throwable)gen).E(1993).o("Unable to start ZSL shot ");
                final kse kse = this.i;
            }
        }
        catch (final IllegalStateException ex) {}
        catch (final kuw kuw) {}
        catch (final InterruptedException ex2) {}
        catch (final ExecutionException ex3) {}
    }
    
    public final void g(final List list, final gff gff, final gen gen) {
        if (list.isEmpty()) {
            throw new dfy("No frames to process found.");
        }
        final dtx a = this.g.a();
        int i = 0;
        ljm a2 = null;
        while (i < ((nql)list).c) {
            a2 = gto.a(this.j.a(list.get(i)), true);
            if (a2 != null) {
                break;
            }
            ++i;
        }
        if (a2 != null) {
            this.h(list, gff, gen, -1, a2, a, null);
            return;
        }
        i(list);
        throw new dge((byte[])null);
    }
    
    public final void h(final List list, final gff gff, final gen gen, final int n, final ljm ljm, final dtx dtx, dxh f) {
        gff.close();
        list.size();
        Label_0027: {
            if (n < 0) {
                final boolean b = true;
                break Label_0027;
            }
            final boolean b = false;
            try {
                try {
                    this.i.f("pckHdrZsl#processFrames");
                    if (f == null) {
                        f = this.f(gen, n, ljm, dtx, b, false);
                    }
                    if (f != null) {
                        try {
                            this.i.h("pckHdrZsl#processPayload");
                            this.d(f, ljm, b);
                            this.c(list, f, b, list.size());
                            this.i.g();
                            this.e(list.size(), gen, ljm, f, b);
                            i(list);
                            this.i.g();
                            return;
                        }
                        catch (final kuw kuw) {}
                    }
                    gqr.c.c().E(2000).o("Failed to initiate HDR plus shot capture.");
                    this.i.g();
                    throw new dgb("Invalid shot received from HdrPlusSession.");
                }
                finally {}
            }
            catch (final kuw kuw2) {}
        }
        gqr.c.b().h((Throwable)gff).E(1999).o("Error processing HDR+ payload.");
        if (f != null) {
            this.a.n(f);
        }
        throw new dgf((Throwable)gff);
        i(list);
        this.i.g();
    }
}
