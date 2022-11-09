import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import java.util.WeakHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class su extends ht
{
    final sv b;
    public final Map c;
    
    public su(final sv b) {
        this.c = new WeakHashMap();
        this.b = b;
    }
    
    @Override
    public final jd a(final View view) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            return ht.a(view);
        }
        return super.a(view);
    }
    
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            ht.c(view, accessibilityEvent);
            return;
        }
        super.c(view, accessibilityEvent);
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        if (!this.b.k()) {
            final se l = this.b.b.l;
            if (l != null) {
                l.aF(view, jc);
                final ht ht = this.c.get(view);
                if (ht != null) {
                    ht.d(view, jc);
                    return;
                }
                super.d(view, jc);
                return;
            }
        }
        super.d(view, jc);
    }
    
    @Override
    public final void e(final View view, final AccessibilityEvent accessibilityEvent) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            ht.e(view, accessibilityEvent);
            return;
        }
        super.e(view, accessibilityEvent);
    }
    
    @Override
    public final void f(final View view, final int n) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            ht.f(view, n);
            return;
        }
        super.f(view, n);
    }
    
    @Override
    public final void g(final View view, final AccessibilityEvent accessibilityEvent) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            ht.g(view, accessibilityEvent);
            return;
        }
        super.g(view, accessibilityEvent);
    }
    
    @Override
    public final boolean h(final View view, final AccessibilityEvent accessibilityEvent) {
        final ht ht = this.c.get(view);
        if (ht != null) {
            return ht.h(view, accessibilityEvent);
        }
        return super.h(view, accessibilityEvent);
    }
    
    @Override
    public final boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        final ht ht = this.c.get(viewGroup);
        if (ht != null) {
            return ht.i(viewGroup, view, accessibilityEvent);
        }
        return super.i(viewGroup, view, accessibilityEvent);
    }
    
    @Override
    public final boolean j(final View view, final int n, final Bundle bundle) {
        if (!this.b.k() && this.b.b.l != null) {
            final ht ht = this.c.get(view);
            if (ht != null) {
                if (ht.j(view, n, bundle)) {
                    return true;
                }
            }
            else if (super.j(view, n, bundle)) {
                return true;
            }
            final RecyclerView q = this.b.b.l.q;
            final sk c = q.c;
            final sq i = q.I;
            return false;
        }
        return super.j(view, n, bundle);
    }
}
