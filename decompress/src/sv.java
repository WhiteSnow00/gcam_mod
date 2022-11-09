import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sv extends ht
{
    final RecyclerView b;
    public final su c;
    
    public sv(final RecyclerView b) {
        this.b = b;
        final su c = this.c;
        if (c != null) {
            this.c = c;
            return;
        }
        this.c = new su(this);
    }
    
    @Override
    public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView && !this.k()) {
            final se l = ((RecyclerView)view).l;
            if (l != null) {
                l.O(accessibilityEvent);
            }
        }
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        super.d(view, jc);
        if (!this.k()) {
            final se l = this.b.l;
            if (l != null) {
                final RecyclerView q = l.q;
                l.aE(q.c, q.I, jc);
            }
        }
    }
    
    @Override
    public final boolean j(final View view, final int n, final Bundle bundle) {
        if (super.j(view, n, bundle)) {
            return true;
        }
        if (!this.k()) {
            final se l = this.b.l;
            if (l != null) {
                final RecyclerView q = l.q;
                return l.aV(q.c, q.I, n, bundle);
            }
        }
        return false;
    }
    
    final boolean k() {
        return this.b.aa();
    }
}
