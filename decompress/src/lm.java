import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.ref.WeakReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lm extends lu implements mt
{
    public final mv a;
    public lt b;
    final /* synthetic */ ln c;
    private final Context f;
    private WeakReference g;
    
    public lm(final ln c, final Context f, final lt b) {
        this.c = c;
        this.f = f;
        this.b = b;
        final mv a = new mv(f);
        a.D();
        this.a = a;
        a.b = this;
    }
    
    @Override
    public final void E(final mv mv) {
        if (this.b == null) {
            return;
        }
        this.g();
        this.c.e.n();
    }
    
    @Override
    public final boolean G(final mv mv, final MenuItem menuItem) {
        final lt b = this.b;
        return b != null && b.b(this, menuItem);
    }
    
    @Override
    public final Menu a() {
        return (Menu)this.a;
    }
    
    @Override
    public final MenuInflater b() {
        return new mb(this.f);
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
        return this.c.e.h;
    }
    
    @Override
    public final CharSequence e() {
        return this.c.e.g;
    }
    
    @Override
    public final void f() {
        final ln c = this.c;
        if (c.g != this) {
            return;
        }
        if (!ln.y(c.l, false)) {
            final ln c2 = this.c;
            c2.h = this;
            c2.i = this.b;
        }
        else {
            this.b.a(this);
        }
        this.b = null;
        this.c.v(false);
        final ActionBarContextView e = this.c.e;
        if (e.i == null) {
            e.i();
        }
        this.c.d.d().sendAccessibilityEvent(32);
        final ln c3 = this.c;
        c3.b.l(c3.n);
        this.c.g = null;
    }
    
    @Override
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, (Menu)this.a);
        }
        finally {
            this.a.r();
        }
    }
    
    @Override
    public final void h(final View view) {
        this.c.e.j(view);
        this.g = new WeakReference((T)view);
    }
    
    @Override
    public final void i(final int n) {
        this.j(this.c.a.getResources().getString(n));
    }
    
    @Override
    public final void j(final CharSequence charSequence) {
        this.c.e.k(charSequence);
    }
    
    @Override
    public final void k(final int n) {
        this.l(this.c.a.getResources().getString(n));
    }
    
    @Override
    public final void l(final CharSequence charSequence) {
        this.c.e.l(charSequence);
    }
    
    @Override
    public final void m(final boolean e) {
        super.e = e;
        this.c.e.m(e);
    }
    
    @Override
    public final boolean n() {
        return this.c.e.j;
    }
}
