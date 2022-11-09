import android.view.View$OnTouchListener;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.support.constraint.ConstraintLayout;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvq
{
    public final kkz a;
    public final bvz b;
    public final bwq c;
    public final bvy d;
    public final htm e;
    private final SharedPreferences f;
    private final bwm g;
    
    public bvq(final SharedPreferences f, final kkz a, final bvz b, final bwq c, final bvy d, final bwm g, final htm e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.g = g;
        this.e = e;
    }
    
    public final void a() {
        final bwm g = this.g;
        if (g.g) {
            g.e.post((Runnable)new bwl(g, 1));
        }
    }
    
    public final void b() {
        this.f.edit().putBoolean("autotimer_tutorial_shown", true).apply();
    }
    
    public final void c() {
        if (this.f() && this.g()) {
            final bwm g = this.g;
            if (!g.g) {
                g.e = (ConstraintLayout)g.b.c(2131427471);
                g.c = new bwo(g.a);
                g.d = new bwk(g.a);
                g.e.addView((View)g.c);
                g.e.addView((View)g.d);
                final iob layoutParams = (iob)g.c.getLayoutParams();
                layoutParams.Z = 2;
                g.c.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                final iob layoutParams2 = (iob)g.d.getLayoutParams();
                layoutParams2.Z = 3;
                g.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                g.c.setOnTouchListener(g.f);
                g.g = true;
            }
            g.e.post((Runnable)new bwl(g));
            final bwm g2 = this.g;
            g2.f = (View$OnTouchListener)new bvp(this);
            if (g2.g) {
                g2.c.setOnTouchListener(g2.f);
            }
        }
    }
    
    public final void d(final bwa bwa) {
        final Object d = this.a.d;
        this.a.aR(bwa);
    }
    
    public final boolean e() {
        return this.a.d == bwa.c;
    }
    
    public final boolean f() {
        return this.a.d != bwa.a;
    }
    
    public final boolean g() {
        return !this.f.getBoolean("autotimer_tutorial_shown", false);
    }
}
