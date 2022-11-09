import java.lang.ref.WeakReference;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndb extends abp
{
    final /* synthetic */ BottomSheetBehavior a;
    
    public ndb(final BottomSheetBehavior a) {
        this.a = a;
    }
    
    @Override
    public final void c(final int n) {
        if (n == 1) {
            final BottomSheetBehavior a = this.a;
            if (a.r) {
                a.F(1);
            }
        }
    }
    
    @Override
    public final void d(final View view, final float n, final float n2) {
        int n3 = 4;
        int n4 = 0;
        Label_0557: {
            if (n2 < 0.0f) {
                final BottomSheetBehavior a = this.a;
                if (a.a) {
                    n4 = a.k;
                    n3 = 3;
                }
                else {
                    final int top = view.getTop();
                    System.currentTimeMillis();
                    final BottomSheetBehavior a2 = this.a;
                    n4 = a2.l;
                    if (top > n4) {
                        n3 = 6;
                    }
                    else {
                        n4 = a2.w();
                        n3 = 3;
                    }
                }
            }
            else {
                final BottomSheetBehavior a3 = this.a;
                if (a3.p && a3.I(view, n2)) {
                    if (Math.abs(n) >= Math.abs(n2) || n2 <= 500.0f) {
                        final int top2 = view.getTop();
                        final BottomSheetBehavior a4 = this.a;
                        if (top2 <= (a4.v + a4.w()) / 2) {
                            final BottomSheetBehavior a5 = this.a;
                            if (a5.a) {
                                n4 = a5.k;
                                n3 = 3;
                                break Label_0557;
                            }
                            if (Math.abs(view.getTop() - this.a.w()) < Math.abs(view.getTop() - this.a.l)) {
                                n4 = this.a.w();
                                n3 = 3;
                                break Label_0557;
                            }
                            n4 = this.a.l;
                            n3 = 6;
                            break Label_0557;
                        }
                    }
                    n4 = this.a.v;
                    n3 = 5;
                }
                else {
                    BottomSheetBehavior bottomSheetBehavior;
                    if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                        bottomSheetBehavior = this.a;
                        if (!bottomSheetBehavior.a) {
                            final int top3 = view.getTop();
                            if (Math.abs(top3 - this.a.l) < Math.abs(top3 - this.a.n)) {
                                n4 = this.a.l;
                                n3 = 6;
                                break Label_0557;
                            }
                            n4 = this.a.n;
                            break Label_0557;
                        }
                    }
                    else {
                        final int top4 = view.getTop();
                        final BottomSheetBehavior a6 = this.a;
                        if (a6.a) {
                            if (Math.abs(top4 - a6.k) < Math.abs(top4 - this.a.n)) {
                                n4 = this.a.k;
                                n3 = 3;
                                break Label_0557;
                            }
                            n4 = this.a.n;
                            break Label_0557;
                        }
                        else {
                            final int l = a6.l;
                            if (top4 < l) {
                                if (top4 < Math.abs(top4 - a6.n)) {
                                    n4 = this.a.w();
                                    n3 = 3;
                                    break Label_0557;
                                }
                                n4 = this.a.l;
                                n3 = 6;
                                break Label_0557;
                            }
                            else {
                                if (Math.abs(top4 - l) < Math.abs(top4 - this.a.n)) {
                                    n4 = this.a.l;
                                    n3 = 6;
                                    break Label_0557;
                                }
                                bottomSheetBehavior = this.a;
                            }
                        }
                    }
                    n4 = bottomSheetBehavior.n;
                }
            }
        }
        this.a.H(view, n3, n4, true);
    }
    
    @Override
    public final boolean e(final View view, final int n) {
        final BottomSheetBehavior a = this.a;
        final int s = a.s;
        if (s == 1) {
            return false;
        }
        if (a.A) {
            return false;
        }
        if (s == 3 && a.z == n) {
            final WeakReference x = a.x;
            View view2;
            if (x != null) {
                view2 = (View)x.get();
            }
            else {
                view2 = null;
            }
            if (view2 != null) {
                if (view2.canScrollVertically(-1)) {
                    return false;
                }
            }
        }
        System.currentTimeMillis();
        final WeakReference w = this.a.w;
        return w != null && w.get() == view;
    }
    
    @Override
    public final int f(final View view, final int n) {
        return view.getLeft();
    }
    
    @Override
    public final int g(final View view, final int n) {
        final int w = this.a.w();
        final BottomSheetBehavior a = this.a;
        int n2;
        if (a.p) {
            n2 = a.v;
        }
        else {
            n2 = a.n;
        }
        return aag.c(n, w, n2);
    }
    
    @Override
    public final int h() {
        final BottomSheetBehavior a = this.a;
        if (a.p) {
            return a.v;
        }
        return a.n;
    }
    
    @Override
    public final void i(final View view, final int n, final int n2) {
        this.a.A(n2);
    }
}
