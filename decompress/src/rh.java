import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class rh implements AbsListView$OnScrollListener
{
    final /* synthetic */ rj a;
    
    public rh(final rj a) {
        this.a = a;
    }
    
    public final void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
    }
    
    public final void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (n == 1 && !this.a.w() && this.a.p.getContentView() != null) {
            final rj a = this.a;
            a.n.removeCallbacks((Runnable)a.q);
            this.a.q.run();
        }
    }
}
