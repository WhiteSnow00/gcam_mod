import android.view.ViewParent;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncu extends abp
{
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c;
    
    public ncu(final SwipeDismissBehavior a) {
        this.a = a;
        this.c = -1;
    }
    
    @Override
    public final int a(final View view) {
        return view.getWidth();
    }
    
    @Override
    public final void b(final View view, final int c) {
        this.c = c;
        this.b = view.getLeft();
        final ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    @Override
    public final void c(final int n) {
    }
    
    @Override
    public final void d(final View view, float c, final float n) {
        this.c = -1;
        final int width = view.getWidth();
        int b4 = 0;
        Label_0188: {
            Label_0182: {
                if (c != 0.0f) {
                    final int f = ik.f(view);
                    final int b = this.a.b;
                    if (b != 2) {
                        if (b == 0) {
                            if (f == 1) {
                                if (c >= 0.0f) {
                                    break Label_0182;
                                }
                            }
                            else if (c <= 0.0f) {
                                break Label_0182;
                            }
                        }
                        else if (f == 1) {
                            if (c <= 0.0f) {
                                break Label_0182;
                            }
                        }
                        else if (c >= 0.0f) {
                            break Label_0182;
                        }
                    }
                }
                else {
                    final int left = view.getLeft();
                    final int b2 = this.b;
                    final int width2 = view.getWidth();
                    c = this.a.c;
                    if (Math.abs(left - b2) < Math.round(width2 * c)) {
                        break Label_0182;
                    }
                }
                final int left2 = view.getLeft();
                final int b3 = this.b;
                if (left2 < b3) {
                    b4 = b3 - width;
                    break Label_0188;
                }
                b4 = b3 + width;
                break Label_0188;
            }
            b4 = this.b;
        }
        if (this.a.a.i(b4, view.getTop())) {
            ik.A(view, new ncw(this.a, view));
        }
    }
    
    @Override
    public final boolean e(final View view, final int n) {
        final int c = this.c;
        return (c == -1 || c == n) && this.a.w(view);
    }
    
    @Override
    public final int f(final View view, final int n) {
        final int f = ik.f(view);
        final int b = this.a.b;
        int n2;
        int n3;
        if (b == 0) {
            if (f == 1) {
                n2 = this.b - view.getWidth();
                n3 = this.b;
            }
            else {
                n2 = this.b;
                n3 = view.getWidth() + n2;
            }
        }
        else if (b == 1) {
            if (f == 1) {
                n2 = this.b;
                n3 = view.getWidth() + n2;
            }
            else {
                n2 = this.b - view.getWidth();
                n3 = this.b;
            }
        }
        else {
            n2 = this.b - view.getWidth();
            n3 = view.getWidth() + this.b;
        }
        return Math.min(Math.max(n2, n), n3);
    }
    
    @Override
    public final int g(final View view, final int n) {
        return view.getTop();
    }
    
    @Override
    public final void i(final View view, final int n, final int n2) {
        final float n3 = this.b + view.getWidth() * this.a.d;
        final float n4 = this.b + view.getWidth() * this.a.e;
        final float n5 = (float)n;
        if (n5 <= n3) {
            view.setAlpha(1.0f);
            return;
        }
        if (n5 >= n4) {
            view.setAlpha(0.0f);
            return;
        }
        view.setAlpha(SwipeDismissBehavior.x(1.0f - (n5 - n3) / (n4 - n3)));
    }
}
