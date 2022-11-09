import android.view.View;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.widget.ListAdapter;
import android.os.SystemClock;
import android.widget.HeaderViewListAdapter;
import android.view.MotionEvent;
import android.content.Context;
import android.view.MenuItem;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rl extends ql
{
    final int c;
    final int d;
    public rk e;
    private MenuItem f;
    
    public rl(final Context context, final boolean b) {
        super(context, b);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.c = 21;
            this.d = 22;
            return;
        }
        this.c = 22;
        this.d = 21;
    }
    
    @Override
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        if (this.e != null) {
            final ListAdapter adapter = this.getAdapter();
            final boolean b = adapter instanceof HeaderViewListAdapter;
            final int n = 0;
            int headersCount;
            ms ms;
            if (b) {
                final HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter)adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ms = (ms)headerViewListAdapter.getWrappedAdapter();
            }
            else {
                ms = (ms)adapter;
                headersCount = 0;
            }
            final int action = motionEvent.getAction();
            final mo mo = null;
            Object a = null;
            Label_0129: {
                if (action != 10) {
                    final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                    if (pointToPosition != -1) {
                        final int n2 = pointToPosition - headersCount;
                        if (n2 >= 0 && n2 < ms.getCount()) {
                            a = ms.a(n2);
                            break Label_0129;
                        }
                    }
                }
                a = null;
            }
            final MenuItem f = this.f;
            if (f != a) {
                final mv a2 = ms.a;
                if (f != null) {
                    final rk a3 = ((rm)this.e).a;
                    if (a3 != null) {
                        ((mn)a3).a.a.removeCallbacksAndMessages((Object)a2);
                    }
                }
                if ((this.f = (MenuItem)a) != null) {
                    final rk a4 = ((rm)this.e).a;
                    if (a4 != null) {
                        final mn mn = (mn)a4;
                        mn.a.a.removeCallbacksAndMessages((Object)null);
                        final int size = mn.a.b.size();
                        int i = n;
                        while (true) {
                            while (i < size) {
                                final int n3 = i;
                                if (a2 != ((mo)mn.a.b.get(i)).b) {
                                    ++i;
                                }
                                else {
                                    if (n3 == -1) {
                                        return super.onHoverEvent(motionEvent);
                                    }
                                    final int n4 = n3 + 1;
                                    mo mo2;
                                    if (n4 < mn.a.b.size()) {
                                        mo2 = mn.a.b.get(n4);
                                    }
                                    else {
                                        mo2 = mo;
                                    }
                                    mn.a.a.postAtTime((Runnable)new mm(mn, mo2, (MenuItem)a, a2), (Object)a2, SystemClock.uptimeMillis() + 200L);
                                    return super.onHoverEvent(motionEvent);
                                }
                            }
                            final int n3 = -1;
                            continue;
                        }
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        final ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
        if (listMenuItemView != null && n == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && n == this.d) {
            this.setSelection(-1);
            final ListAdapter adapter = this.getAdapter();
            ms ms;
            if (adapter instanceof HeaderViewListAdapter) {
                ms = (ms)((HeaderViewListAdapter)adapter).getWrappedAdapter();
            }
            else {
                ms = (ms)adapter;
            }
            ms.a.i(false);
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
}
