import android.content.DialogInterface$OnClickListener;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.view.WindowManager$LayoutParams;
import android.view.View;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnKeyListener;
import android.widget.ListAdapter;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mr implements AdapterView$OnItemClickListener, nj
{
    Context a;
    public LayoutInflater b;
    mv c;
    public ExpandedMenuView d;
    public ni e;
    public mq f;
    
    public mr(final Context a) {
        this.a = a;
        this.b = LayoutInflater.from(a);
    }
    
    public final ListAdapter a() {
        if (this.f == null) {
            this.f = new mq(this);
        }
        return (ListAdapter)this.f;
    }
    
    public final void b(final Context a, final mv c) {
        if (this.a != null) {
            this.a = a;
            if (this.b == null) {
                this.b = LayoutInflater.from(a);
            }
        }
        this.c = c;
        final mq f = this.f;
        if (f != null) {
            f.notifyDataSetChanged();
        }
    }
    
    public final void c(final mv mv, final boolean b) {
        final ni e = this.e;
        if (e != null) {
            e.a(mv, b);
        }
    }
    
    public final void d(final ni ni) {
        throw null;
    }
    
    public final boolean e() {
        return false;
    }
    
    public final boolean f(final nr nr) {
        if (!nr.hasVisibleItems()) {
            return false;
        }
        final mw onDismissListener = new mw(nr);
        final mv a = onDismissListener.a;
        final kb kb = new kb(a.a);
        onDismissListener.c = new mr(kb.a());
        final mr c = onDismissListener.c;
        c.e = onDismissListener;
        onDismissListener.a.g(c);
        final ListAdapter a2 = onDismissListener.c.a();
        final jx a3 = kb.a;
        a3.n = a2;
        a3.o = (DialogInterface$OnClickListener)onDismissListener;
        final View g = a.g;
        if (g != null) {
            a3.e = g;
        }
        else {
            a3.c = a.f;
            kb.e(a.e);
        }
        kb.d((DialogInterface$OnKeyListener)onDismissListener);
        (onDismissListener.b = kb.b()).setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
        final WindowManager$LayoutParams attributes = onDismissListener.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 0x20000;
        onDismissListener.b.show();
        final ni e = this.e;
        if (e != null) {
            e.b(nr);
        }
        return true;
    }
    
    public final boolean g(final my my) {
        return false;
    }
    
    public final boolean h(final my my) {
        return false;
    }
    
    public final void i() {
        final mq f = this.f;
        if (f != null) {
            f.notifyDataSetChanged();
        }
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.c.A((MenuItem)this.f.a(n), this, 0);
    }
}
