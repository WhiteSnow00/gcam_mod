import j$.util.Objects;
import android.view.WindowInsets;

// 
// Decompiled by Procyon v0.6.0
// 

class ir extends iw
{
    final WindowInsets a;
    gw b;
    private gw c;
    
    public ir(final ix ix, final WindowInsets a) {
        super(ix);
        this.c = null;
        this.a = a;
    }
    
    @Override
    public final gw a() {
        if (this.c == null) {
            this.c = gw.c(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.c;
    }
    
    @Override
    public ix b(final int n, final int n2, final int n3, final int n4) {
        final iq iq = new iq(ix.l(this.a));
        hh.f(ix.f(this.a(), n, n2, n3, n4), iq);
        iq.a.setStableInsets(ix.f(this.g(), n, n2, n3, n4).a());
        return hh.e(iq);
    }
    
    @Override
    public final boolean c() {
        return this.a.isRound();
    }
    
    @Override
    public void d() {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final gw b = ((ir)o).b;
        return Objects.equals((Object)null, (Object)null);
    }
    
    @Override
    public final void f() {
    }
}
