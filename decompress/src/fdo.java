import android.os.SystemClock;
import java.io.IOException;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class fdo implements fkk
{
    final /* synthetic */ fvb a;
    final /* synthetic */ fkk b;
    final /* synthetic */ fcx c;
    final /* synthetic */ fdw d;
    final /* synthetic */ boolean e;
    final /* synthetic */ lum f;
    final /* synthetic */ FileOutputStream g;
    final /* synthetic */ fdx h;
    
    public fdo(final fdx h, final fvb a, final fkk b, final fcx c, final fdw d, final boolean e, final lum f, final FileOutputStream g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a(final fjy fjy) {
        final boolean k = this.h.l.k(cxw.v);
        if (!this.e || k) {
            this.a.a();
            this.b.a(fjy);
            this.f.c();
            this.c.a();
            if (!this.h.l.k(cxw.y)) {
                try {
                    this.g.close();
                }
                catch (final IOException ex) {
                    fdx.a.c().h(ex).E(1531).r("Failed to close %s", this.g);
                }
            }
        }
        if (this.e && k) {
            if (this.d.q.g()) {
                this.h.v.a(((fbu)this.d.q.c()).a);
            }
            else {
                a.l(fdx.a.c(), "Didn't take second shot since UI resources are missing", '\u05fa');
            }
        }
        this.d.q = nii.a;
    }
    
    @Override
    public final void b(final long n, final fkp fkp) {
        this.a.b(n);
        this.b.b(n, fkp);
        this.c.a();
        this.d.r = niz.i(SystemClock.elapsedRealtime());
        final fdw d = this.d;
        if (d.p) {
            final fdx h = this.h;
            njo.o(true);
            h.p.postDelayed((Runnable)new fdj(h, d), (Object)d.a, 15000L);
            fdx.d(d.g, d.a, h.p);
            return;
        }
        d.q = nii.a;
    }
}
