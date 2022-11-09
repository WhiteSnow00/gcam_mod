// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements AdapterView$OnItemClickListener, mu, nl
{
    private static final int[] a;
    private mv b;
    
    static {
        a = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        this(context, set, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final to q = to.q(context, set, ExpandedMenuView.a, n);
        if (q.p(0)) {
            this.setBackgroundDrawable(q.h(0));
        }
        if (q.p(1)) {
            this.setDivider(q.h(1));
        }
        q.n();
    }
    
    public final void a(final mv b) {
        this.b = b;
    }
    
    public final boolean b(final my my) {
        return this.b.z((MenuItem)my, 0);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.b((my)this.getAdapter().getItem(n));
    }
}
