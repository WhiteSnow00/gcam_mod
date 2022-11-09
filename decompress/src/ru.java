import android.view.View;
import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ru
{
    public final /* synthetic */ RecyclerView a;
    
    public ru(final RecyclerView a) {
        this.a = a;
    }
    
    public final int a() {
        return this.a.getChildCount();
    }
    
    public final int b(final View view) {
        return this.a.indexOfChild(view);
    }
    
    public final View c(final int n) {
        return this.a.getChildAt(n);
    }
    
    public final void d(final View view) {
        final st f = RecyclerView.f(view);
        if (f != null) {
            this.a.af(f, f.m);
            f.m = 0;
        }
    }
    
    public final void e(final int n) {
        final View child = this.a.getChildAt(n);
        if (child != null) {
            this.a.t(child);
            child.clearAnimation();
        }
        this.a.removeViewAt(n);
    }
}
