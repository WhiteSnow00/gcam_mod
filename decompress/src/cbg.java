import android.content.Intent;
import j$.util.function.Consumer;
import j$.util.Collection$_EL;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbg implements oen
{
    final /* synthetic */ oey a;
    final /* synthetic */ cbh b;
    final /* synthetic */ int c;
    
    public cbg(final cbh b, final int c, final oey a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        synchronized (this.b.v) {
            this.b.e.g();
            this.b.q = null;
            if (!this.a.isCancelled()) {
                cbh.a.b().h(t).E(292).o("Failed to create capture session.");
                this.b.r.a(cfd.f);
                final cqv u = this.b.u;
                u.getClass();
                u.e = 3;
            }
            if (t instanceof dga) {
                final dga dga = (dga)t;
                final long c = dga.c;
                final long e = this.b.x.e();
                if (kst.d(dga.a) && c < e && this.b.x.h() && this.b.b.a() != jbm.f) {
                    final cbh b = this.b;
                    b.l.h(b.d.e());
                    this.b.c.execute(new cbf(this));
                }
                else {
                    this.b.k.c(dga);
                }
            }
        }
    }
}
