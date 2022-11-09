import android.util.Log;
import java.util.concurrent.TimeUnit;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpp implements gfg
{
    public static final Long a;
    public static final Duration b;
    public static final Duration c;
    public final krr d;
    public final niz e;
    public final bpt f;
    public final duq g;
    public final dvj h;
    public final lfg i;
    public final boolean j;
    public final kse k;
    public hdc l;
    public hdc m;
    public boolean n;
    public fak o;
    private final gpg p;
    private final kwd q;
    private final niz r;
    private final kjk s;
    private final fea t;
    private kjk u;
    
    static {
        a = TimeUnit.MILLISECONDS.toNanos(100L);
        b = Duration.ofSeconds(2L);
        c = Duration.ofMillis(500L);
    }
    
    public gpp(final krr krr, final niz e, final kwd q, final niz r, final oey oey, final lfg lfg, final lfh lfh, final kjk s, final niz niz, final bpt f, final cxl cxl, final dvj h, final duq g, final lfg i, final jbm jbm, final kse k, final fea t, final gpg p18) {
        boolean j = false;
        this.n = false;
        this.d = krr.a("PckLongExposureCmd");
        this.p = p18;
        this.e = e;
        this.r = r;
        this.q = q;
        this.f = f;
        this.s = s;
        this.g = g;
        this.h = h;
        this.i = i;
        if (jbm == jbm.m) {
            j = true;
        }
        this.j = j;
        this.k = k;
        this.t = t;
        if (cxl.k(cxv.e) && jbm == jbm.m) {
            final frm frm = (frm)niz.c();
            final fak o = new fak(lfg, lfh);
            s.c(o);
            knf.e(oey, new gpm(this, o));
            this.o = o;
        }
        this.d();
    }
    
    private final void d() {
        final hdc l = this.l;
        if (l != null) {
            l.b();
        }
        final hdc m = this.m;
        if (m != null) {
            m.b();
        }
        if (this.e.g() && this.r.g()) {
            final kvw r = this.q.r((kzl)this.r.c(), 3);
            (this.u = this.s.b()).c(r);
            r.k(new gpn(this));
        }
        if (!this.j) {
            this.g.f(false, this.i.l(), false, false);
        }
    }
    
    @Override
    public final klj a() {
        return this.p.a;
    }
    
    @Override
    public final klj b() {
        return this.p.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final hhy b = gen.b;
        niz niz;
        if (b instanceof hgk) {
            niz = niz.h(b);
        }
        else {
            niz = nii.a;
        }
        if (!niz.g()) {
            final krr d = this.d;
            final String value = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 50);
            sb.append("Capture session not a LongExposureCaptureSession: ");
            sb.append(value);
            d.h(sb.toString());
        }
        final boolean g = niz.g();
        final fdz a = this.t.a(gen);
        if (g) {
            a.b();
            final niz a2 = a.a();
            if (a2.g()) {
                ((hgk)niz.c()).e = niz.i(a2.c());
            }
        }
        final fak o = this.o;
        Label_0442: {
            if (o == null) {
                this.p.c(gff, gen);
                break Label_0442;
            }
            try {
                final ohi ohi = new ohi();
                final kra a3 = kra.a;
                if (a3 == null) {
                    throw new NullPointerException("Null imageRotation");
                }
                ohi.a = a3;
                final kra a4 = ohi.a;
                if (a4 != null) {
                    final ohj ohj = new ohj(a4);
                    final ohl ohl = new ohl();
                    ohl.a = 0L;
                    ohl.b = ohk.b;
                    ohl.c = ohk.a;
                    ohl.d = ohk.c;
                    final Long a5 = ohl.a;
                    if (a5 != null && ohl.b != null && ohl.c != null) {
                        if (ohl.d != null) {
                            final ohm ohm = new ohm(a5, ohl.b, ohl.c, ohl.d);
                            final ohh a6 = o.a;
                            synchronized (a6.d) {
                                if (a6.f) {
                                    Log.e("SeeDarkSession", "Unable to startCapture(): the session is closing or already closed.");
                                    monitorexit(a6.d);
                                }
                                else {
                                    a6.e.execute(new ohe(a6, ohj, ohm));
                                    monitorexit(a6.d);
                                }
                                this.u.close();
                                this.p.c(gff, gen);
                                this.d();
                                o.a();
                                if (g) {
                                    a.c();
                                }
                                return;
                            }
                        }
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    if (ohl.a == null) {
                        sb2.append(" shotId");
                    }
                    if (ohl.b == null) {
                        sb2.append(" onFinish");
                    }
                    if (ohl.c == null) {
                        sb2.append(" onError");
                    }
                    if (ohl.d == null) {
                        sb2.append(" onComplete");
                    }
                    final String value2 = String.valueOf(sb2);
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(value2).length() + 28);
                    sb3.append("Missing required properties:");
                    sb3.append(value2);
                    throw new IllegalStateException(sb3.toString());
                }
                throw new IllegalStateException("Missing required properties: imageRotation");
            }
            finally {
                this.d();
                o.a();
            }
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("delegate", this.p);
        return c.toString();
    }
}
