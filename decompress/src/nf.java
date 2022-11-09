import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.view.MenuItem;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nf implements AdapterView$OnItemClickListener, nn, nj
{
    public Rect g;
    
    public nf() {
    }
    
    protected static ms v(final ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (ms)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (ms)listAdapter;
    }
    
    protected static boolean w(final mv mv) {
        final int size = mv.size();
        boolean b = false;
        for (int i = 0; i < size; ++i) {
            final MenuItem item = mv.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                b = true;
                break;
            }
        }
        return b;
    }
    
    protected static int x(final ListAdapter listAdapter, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = listAdapter.getCount();
        View view;
        Object o = view = null;
        int n2 = 0;
        int n3 = 0;
        while (i < count) {
            final int itemViewType = listAdapter.getItemViewType(i);
            int n4;
            if (itemViewType != n3) {
                n4 = itemViewType;
            }
            else {
                n4 = n3;
            }
            if (itemViewType != n3) {
                view = null;
            }
            Object o2;
            if ((o2 = o) == null) {
                o2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i, view, (ViewGroup)o2);
            view.measure(measureSpec, measureSpec2);
            final int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            o = o2;
        }
        return n2;
    }
    
    public final void b(final Context context, final mv mv) {
    }
    
    public final boolean g(final my my) {
        return false;
    }
    
    public final boolean h(final my my) {
        return false;
    }
    
    public abstract void j(final mv p0);
    
    public abstract void l(final View p0);
    
    public abstract void m(final boolean p0);
    
    public abstract void n(final int p0);
    
    public abstract void o(final int p0);
    
    public final void onItemClick(final AdapterView adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        final mv a = v(listAdapter).a;
        final MenuItem menuItem = (MenuItem)listAdapter.getItem(n);
        if (!this.t()) {
            n = 4;
        }
        else {
            n = 0;
        }
        a.A(menuItem, this, n);
    }
    
    public abstract void p(final PopupWindow$OnDismissListener p0);
    
    public abstract void q(final boolean p0);
    
    public abstract void r(final int p0);
    
    protected boolean t() {
        return true;
    }
}
