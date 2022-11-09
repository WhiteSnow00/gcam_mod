import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kn implements lt
{
    final /* synthetic */ kw a;
    private final lt b;
    
    public kn(final kw a, final lt b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final lu lu) {
        final lx lx = (lx)this.b;
        lx.a.onDestroyActionMode(lx.e(lu));
        final kw a = this.a;
        if (a.n != null) {
            a.g.getDecorView().removeCallbacks(this.a.o);
        }
        final kw a2 = this.a;
        if (a2.m != null) {
            a2.B();
            final kw a3 = this.a;
            final in p = ik.p((View)a3.m);
            p.b(0.0f);
            a3.p = p;
            this.a.p.d(new km(this));
        }
        final kw a4 = this.a;
        a4.l = null;
        ik.D((View)a4.s);
    }
    
    @Override
    public final boolean b(final lu lu, final MenuItem menuItem) {
        final lx lx = (lx)this.b;
        return lx.a.onActionItemClicked(lx.e(lu), (MenuItem)new ne(lx.b, (hf)menuItem));
    }
    
    @Override
    public final boolean c(final lu lu, final Menu menu) {
        final lx lx = (lx)this.b;
        return lx.a.onCreateActionMode(lx.e(lu), lx.f(menu));
    }
    
    @Override
    public final void d(final lu lu, final Menu menu) {
        ik.D((View)this.a.s);
        final lx lx = (lx)this.b;
        lx.a.onPrepareActionMode(lx.e(lu), lx.f(menu));
    }
}
