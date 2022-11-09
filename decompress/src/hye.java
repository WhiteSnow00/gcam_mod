import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hye extends hos implements exn, exb, ewb
{
    public final Context d;
    public final hdo e;
    public final eyt f;
    public boolean g;
    private final klv h;
    private final hxu i;
    private final kjm j;
    private final ewy k;
    private hpg l;
    private long m;
    
    public hye(final Context d, final klv h, final hdo e, final hxu i, final eyt f, final kjm j, final ewy k) {
        this.m = -1L;
        this.d = d;
        this.h = h;
        this.e = e;
        this.i = i;
        this.f = f;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final void F() {
        this.g = false;
    }
    
    @Override
    public final void b(final hph a) {
        super.a = a;
        final hpg b = super.b;
        if (b != null) {
            super.a.b(b);
        }
        egz.d(this.j, this.k, this);
    }
    
    public final void d(final hyj hyj) {
        if (this.g) {
            return;
        }
        final hxt a = this.i.a(hyj);
        final jbm jbm = (jbm)this.h.aQ();
        if (((jbm != jbm.b && jbm != jbm.g && jbm != jbm.m) || !a.c) && (jbm != jbm.c || !a.d)) {
            this.m = -1L;
            this.c();
            return;
        }
        final long m = this.m;
        if (m >= 0L && hyj.b >= m) {
            return;
        }
        this.m = Math.max(0L, hyj.b - 25000000L);
        if (this.l == null) {
            final Resources resources = this.d.getResources();
            final hpf a2 = hpg.a();
            a2.b = resources.getString(2131952682);
            a2.c = resources.getDrawable(2131231525, (Resources$Theme)null);
            a2.d(6000L);
            a2.d = new hyd(this);
            a2.g = new hyd(this, 1);
            this.l = a2.a();
        }
        final hpg l = this.l;
        final hpf b = l.b();
        final Runnable e = l.e;
        if (e != null) {
            b.d = new hor(this, e, 1);
        }
        final Runnable h = l.h;
        if (h != null) {
            b.g = new hor(this, h);
        }
        final Runnable f = l.f;
        if (f != null) {
            b.e = new hor(this, f, 2);
        }
        final Runnable k = l.k;
        if (!l.l) {
            b.j = new hor(this, k, 3);
        }
        final hpg a3 = b.a();
        final hph a4 = super.a;
        if (a4 != null && !super.c) {
            if (super.b != null) {
                a4.c(a3);
            }
            else {
                a4.b(a3);
            }
        }
        super.b = a3;
    }
    
    @Override
    public final void t() {
        super.c = true;
        this.m = -1L;
    }
    
    @Override
    public final void z(final Intent intent) {
        this.g = false;
    }
}
