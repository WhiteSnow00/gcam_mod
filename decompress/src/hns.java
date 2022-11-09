import android.view.View;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import java.util.Date;
import com.google.android.apps.camera.smarts.SmartsChipView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hns implements hoz
{
    public final hpe a;
    public hpg b;
    public final SmartsChipView c;
    public final eyt d;
    public final igw e;
    public final gkw f;
    public final dgm g;
    public boolean h;
    private final hpc i;
    private final boolean j;
    private final boolean k;
    private Date l;
    
    public hns(final hpe a, final hpc i, final hpg b, final SmartsChipView c, final eyt d, final igw e, final gkw f, final dgm g, final boolean j, final boolean k) {
        this.h = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final int a() {
        return (int)this.b.a;
    }
    
    @Override
    public final efo b() {
        return efo.c;
    }
    
    @Override
    public final Object c() {
        return this.i;
    }
    
    @Override
    public final Runnable d() {
        return this.b.k;
    }
    
    @Override
    public final Date e() {
        return this.l;
    }
    
    @Override
    public final void f(final Runnable f) {
        final SmartsChipView c = this.c;
        c.f = f;
        if (c.d) {
            c.e = true;
        }
        else {
            c.b();
        }
        this.h = false;
    }
    
    @Override
    public final void g() {
        this.c.b();
        this.h = false;
    }
    
    @Override
    public final void i(final Date l) {
        this.l = l;
    }
    
    @Override
    public final void j() {
        final SmartsChipView c = this.c;
        if (!c.d) {
            c.b.scrollTo(0, 0);
            if (ik.f(c.b.getRootView()) == 1) {
                c.b.setGravity(8388661);
            }
            else {
                c.b.setGravity(8388659);
            }
            if (c.m.a()) {
                c.m = new kjk();
            }
            c.m.c(this.g.b.a(new hmo(c, this, 1), aal.a(c.getContext())));
            c.m.c(this.g.a.a(new hmo(c, this), aal.a(c.getContext())));
            final hml hml = new hml(c, this);
            ((ViewGroup)c.getParent()).addOnLayoutChangeListener((View$OnLayoutChangeListener)hml);
            c.m.c(new hmn(c, (View$OnLayoutChangeListener)hml));
            c.c(this);
            if (!this.s()) {
                c.setVisibility(8);
            }
            else {
                if (this.e.a()) {
                    jdj.e((View)this.c);
                }
                c.a(0);
                final Runnable i = this.b.i;
                if (i != null) {
                    i.run();
                }
                this.d.Y(2, this.a.a);
            }
            c.g = this.b.j;
        }
        this.h = true;
    }
    
    @Override
    public final boolean k() {
        return true;
    }
    
    @Override
    public final boolean m() {
        return this.b.l;
    }
    
    @Override
    public final boolean n() {
        return false;
    }
    
    @Override
    public final int p() {
        return this.a.h;
    }
    
    @Override
    public final void q(final int n, final boolean b) {
        final SmartsChipView c = this.c;
        final hlp a = hlq.a(this);
        a.f(n);
        a.d(this.j);
        a.c(b);
        a.e(this.k);
        c.d(a.a());
    }
    
    @Override
    public final void r(final hpg b) {
        this.b = b;
        if (this.h) {
            final SmartsChipView c = this.c;
            c.c(this);
            if (!this.s()) {
                c.setVisibility(8);
            }
            else {
                final Runnable i = this.b.i;
                if (i != null) {
                    i.run();
                }
                c.setVisibility(0);
            }
            c.g = this.b.j;
        }
    }
    
    @Override
    public final boolean s() {
        final hpg b = this.b;
        return b.d != null || b.c != null;
    }
}
