import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import android.support.v7.widget.ActionBarContextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lw extends lu implements mt
{
    public final mv a;
    private final Context b;
    private final ActionBarContextView c;
    private final lt f;
    private WeakReference g;
    private boolean h;
    
    public lw(final Context b, final ActionBarContextView c, final lt f) {
        this.b = b;
        this.c = c;
        this.f = f;
        final mv a = new mv(c.getContext());
        a.D();
        this.a = a;
        a.b = this;
    }
    
    @Override
    public final void E(final mv mv) {
        this.g();
        this.c.n();
    }
    
    @Override
    public final boolean G(final mv mv, final MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }
    
    @Override
    public final Menu a() {
        return (Menu)this.a;
    }
    
    @Override
    public final MenuInflater b() {
        return new mb(this.c.getContext());
    }
    
    @Override
    public final View c() {
        final WeakReference g = this.g;
        if (g != null) {
            return (View)g.get();
        }
        return null;
    }
    
    @Override
    public final CharSequence d() {
        return this.c.h;
    }
    
    @Override
    public final CharSequence e() {
        return this.c.g;
    }
    
    @Override
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.sendAccessibilityEvent(32);
        this.f.a(this);
    }
    
    @Override
    public final void g() {
        this.f.d(this, (Menu)this.a);
    }
    
    @Override
    public final void h(final View view) {
        this.c.j(view);
        WeakReference g;
        if (view != null) {
            g = new WeakReference((T)view);
        }
        else {
            g = null;
        }
        this.g = g;
    }
    
    @Override
    public final void i(final int n) {
        this.j(this.b.getString(n));
    }
    
    @Override
    public final void j(final CharSequence charSequence) {
        this.c.k(charSequence);
    }
    
    @Override
    public final void k(final int n) {
        this.l(this.b.getString(n));
    }
    
    @Override
    public final void l(final CharSequence charSequence) {
        this.c.l(charSequence);
    }
    
    @Override
    public final void m(final boolean e) {
        super.e = e;
        this.c.m(e);
    }
    
    @Override
    public final boolean n() {
        return this.c.j;
    }
}
