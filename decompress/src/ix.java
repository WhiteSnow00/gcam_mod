import j$.util.Objects;
import android.view.View;
import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

public class ix
{
    public static final ix a;
    private final iw b;
    
    static {
        a = iv.c;
    }
    
    private ix(final WindowInsets windowInsets) {
        this.b = new iv(this, windowInsets);
    }
    
    public ix(final ix ix) {
        this.b = new iw(this);
    }
    
    static gw f(final gw gw, final int n, final int n2, final int n3, final int n4) {
        final int max = Math.max(0, gw.b - n);
        final int max2 = Math.max(0, gw.c - n2);
        final int max3 = Math.max(0, gw.d - n3);
        final int max4 = Math.max(0, gw.e - n4);
        if (max == n && max2 == n2 && max3 == n3 && max4 == n4) {
            return gw;
        }
        return gw.c(max, max2, max3, max4);
    }
    
    public static ix l(final WindowInsets windowInsets) {
        return m(windowInsets, null);
    }
    
    public static ix m(final WindowInsets windowInsets, final View view) {
        hh.d(windowInsets);
        final ix ix = new ix(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            ix.q(ik.r(view));
            ix.o(view.getRootView());
        }
        return ix;
    }
    
    @Deprecated
    public int a() {
        return this.b.a().e;
    }
    
    @Deprecated
    public int b() {
        return this.b.a().b;
    }
    
    @Deprecated
    public int c() {
        return this.b.a().d;
    }
    
    @Deprecated
    public int d() {
        return this.b.a().c;
    }
    
    @Deprecated
    public gw e() {
        return this.b.m();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof ix && Objects.equals((Object)this.b, (Object)((ix)o).b));
    }
    
    @Deprecated
    public ix g() {
        return this.b.l();
    }
    
    @Deprecated
    public ix h() {
        return this.b.h();
    }
    
    @Override
    public int hashCode() {
        final iw b = this.b;
        if (b == null) {
            return 0;
        }
        return b.hashCode();
    }
    
    @Deprecated
    public ix i() {
        return this.b.i();
    }
    
    public ix j(final int n, final int n2, final int n3, final int n4) {
        return this.b.b(n, n2, n3, n4);
    }
    
    @Deprecated
    public ix k(final int n, final int n2, final int n3, final int n4) {
        final iq iq = new iq(this);
        hh.f(gw.c(n, n2, n3, n4), iq);
        return hh.e(iq);
    }
    
    public WindowInsets n() {
        final iw b = this.b;
        if (b instanceof ir) {
            return ((ir)b).a;
        }
        return null;
    }
    
    public void o(final View view) {
        this.b.d();
    }
    
    public void p(final gw[] array) {
        this.b.e();
    }
    
    public void q(final ix ix) {
        this.b.f();
    }
    
    public boolean r() {
        return this.b.j();
    }
}
