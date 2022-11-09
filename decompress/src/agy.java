import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agy extends afo
{
    final /* synthetic */ ViewPager2 a;
    private final jl b;
    private final jl c;
    private aah d;
    
    public agy(final ViewPager2 a) {
        this.a = a;
        this.b = new agx(this, 1);
        this.c = new agx(this);
    }
    
    final void C(final int n) {
        final ViewPager2 a = this.a;
        if (a.i) {
            a.f(n);
        }
    }
    
    final void D() {
        final ViewPager2 a = this.a;
        int n = 16908360;
        ik.C((View)a, 16908360);
        ik.C((View)a, 16908361);
        ik.C((View)a, 16908358);
        ik.C((View)a, 16908359);
        if (this.a.b() == null) {
            return;
        }
        final int a2 = this.a.b().a();
        if (a2 == 0) {
            return;
        }
        final ViewPager2 a3 = this.a;
        if (!a3.i) {
            return;
        }
        if (a3.a() == 0) {
            final boolean d = this.a.d();
            int n2;
            if (!d) {
                n2 = 16908361;
            }
            else {
                n2 = 16908360;
            }
            if (d) {
                n = 16908361;
            }
            if (this.a.c < a2 - 1) {
                ik.aa((View)a, new iz(n2), this.b);
            }
            if (this.a.c > 0) {
                ik.aa((View)a, new iz(n), this.c);
            }
        }
        else {
            if (this.a.c < a2 - 1) {
                ik.aa((View)a, new iz(16908359), this.b);
            }
            if (this.a.c > 0) {
                ik.aa((View)a, new iz(16908358), this.c);
            }
        }
    }
    
    @Override
    public final String c() {
        return "androidx.viewpager.widget.ViewPager";
    }
    
    @Override
    public final void d(final rw rw) {
        this.D();
        rw.e(this.d);
    }
    
    @Override
    public final void e(final rw rw) {
        if (rw != null) {
            rw.f(this.d);
        }
    }
    
    @Override
    public final void f(final AccessibilityNodeInfo accessibilityNodeInfo) {
        final jc a = jc.a(accessibilityNodeInfo);
        int a2;
        int a3;
        if (this.a.b() != null) {
            if (this.a.a() == 1) {
                a2 = this.a.b().a();
                a3 = 1;
            }
            else {
                a3 = this.a.b().a();
                a2 = 1;
            }
        }
        else {
            a2 = 0;
            a3 = 0;
        }
        a.f(ja.a(a2, a3, 0));
        final rw b = this.a.b();
        if (b != null) {
            final int a4 = b.a();
            if (a4 != 0) {
                final ViewPager2 a5 = this.a;
                if (a5.i) {
                    if (a5.c > 0) {
                        a.b(8192);
                    }
                    if (this.a.c < a4 - 1) {
                        a.b(4096);
                    }
                    a.i(true);
                }
            }
        }
    }
    
    @Override
    public final void h(final View view, final jc jc) {
        int bd;
        if (this.a.a() == 1) {
            bd = se.bd(view);
        }
        else {
            bd = 0;
        }
        int bd2;
        if (this.a.a() == 0) {
            bd2 = se.bd(view);
        }
        else {
            bd2 = 0;
        }
        jc.g(jb.a(bd, 1, bd2, 1, false));
    }
    
    @Override
    public final void i() {
        this.D();
    }
    
    @Override
    public final void j(final AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource((View)this.a);
        accessibilityEvent.setClassName((CharSequence)"androidx.viewpager.widget.ViewPager");
    }
    
    @Override
    public final void k() {
        this.D();
    }
    
    @Override
    public final void l() {
        this.D();
    }
    
    @Override
    public final void m() {
        this.D();
    }
    
    @Override
    public final boolean n() {
        return true;
    }
    
    @Override
    public final boolean q(final int n) {
        return n == 8192 || n == 4096;
    }
    
    @Override
    public final void r(final RecyclerView recyclerView) {
        ik.K((View)recyclerView, 2);
        this.d = new aah();
        if (ik.d((View)this.a) == 0) {
            ik.K((View)this.a, 1);
        }
    }
    
    @Override
    public final void t(int n) {
        if (this.q(n)) {
            if (n == 8192) {
                n = this.a.c - 1;
            }
            else {
                n = this.a.c + 1;
            }
            this.C(n);
            return;
        }
        throw new IllegalStateException();
    }
}
