import java.util.concurrent.atomic.AtomicBoolean;
import android.graphics.Matrix;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dtv
{
    public final dwk a;
    public final fxu b;
    public final efp c;
    public final efp d;
    public final efp e;
    public final efp f;
    public final efp g;
    public final ffa h;
    public final hdz i;
    public final cxl j;
    public final kse k;
    public final krr l;
    public final dti m;
    private final dxk n;
    private final dvc o;
    
    public dtv(final dwk a, final fxu b, final oui oui, final oui oui2, final oui oui3, final oui oui4, final oui oui5, final ffa h, final hdz i, final cxl j, final krr krr, final kse k, final dxk n, final dvc o, final dti m) {
        this.a = a;
        this.c = efp.a(oui);
        this.d = efp.a(oui2);
        this.b = b;
        this.e = efp.a(oui3);
        this.f = efp.a(oui4);
        this.g = efp.a(oui5);
        this.h = h;
        this.i = i;
        this.j = j;
        this.l = krr.a("GcaHdrShotCfgFctry");
        this.k = k;
        this.n = n;
        this.o = o;
        this.m = m;
    }
    
    public static Bitmap a(final Bitmap bitmap, final int n) {
        final Matrix matrix = new Matrix();
        matrix.postRotate((float)n);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
    
    public final void b(final gen gen, final dwo f, final dtx h, final int n, final boolean b, final boolean b2) {
        final niz a = this.o.a(h, nii.a, b2);
        if (a.g()) {
            final duf duf = (duf)a.c();
            final krr l = this.l;
            final String value = String.valueOf(duf);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
            sb.append("Selected primary format: ");
            sb.append(value);
            l.b(sb.toString());
            gen.d.a(dvj.a, 0.0f);
            if (h.d && (int)this.j.a(cyd.a).c() != 0 && !this.e.c()) {
                gen.d.a(dww.a, 0.0f);
            }
            final dxi a2 = this.n.a(gen.b.h());
            final dwt a3 = dwu.a();
            a3.e(kra.b(n));
            a3.h = h;
            a3.f = f;
            a3.f(gen);
            if (this.c.c()) {
                ((fve)this.c.b()).o(gen.b.h(), new fvd(h.a(), gen.b.i() == hio.k));
            }
            final dtl dtl = new dtl(this, gen, new AtomicBoolean(false));
            if (a2.a == null) {
                a2.a = noi.D();
            }
            a2.a.g(dtl);
            a2.a(new dtk(this, gen, a3, n));
            if (!this.j.k(cxs.ah) || !b) {
                a2.c(new dtm(this, n, gen));
            }
            if (duf == duf.b) {
                final dtn dtn = new dtn(this, gen);
                if (a2.w == null) {
                    a2.w = noi.D();
                }
                a2.w.g(dtn);
            }
            if (duf == duf.c) {
                final dto dto = new dto(this, a3, h);
                if (a2.q == null) {
                    a2.q = noi.D();
                }
                a2.q.g(dto);
            }
            oey oey;
            if (this.e.c() && this.e.b() instanceof dwr) {
                oey = ofn.f();
                final dtt dtt = new dtt(this, (ofn)oey);
                if (a2.o == null) {
                    a2.o = noi.D();
                }
                a2.o.g(dtt);
            }
            else {
                oey = ofi.l();
            }
            a3.c(oey);
            if ((this.e.c() && this.e.b() instanceof dwr && this.j.k(cyc.v)) || b2) {
                a2.d(new dtp(this, gen));
            }
            if (duf == duf.d) {
                final dtq dtq = new dtq(this, a3, h);
                if (a2.s == null) {
                    a2.s = noi.D();
                }
                a2.s.g(dtq);
            }
            if (duf == duf.e) {
                a2.b(new dtr(this, a3, h));
            }
            if (h.c && this.f.c() && gen.a.h) {
                njo.o(this.f.c());
                final dtu dtu = new dtu(this, gen);
                if (a2.k == null) {
                    a2.k = noi.D();
                }
                a2.k.g(dtu);
            }
            a2.e(new dts(this, gen));
            return;
        }
        throw new IllegalStateException("processOrRequestImage was given no image but still didn't request anything");
    }
}
