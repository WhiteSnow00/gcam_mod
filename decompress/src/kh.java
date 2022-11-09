import android.view.ViewGroup;
import android.support.v7.widget.ActionBarContextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kh implements ie
{
    final /* synthetic */ kw a;
    
    public kh(final kw a) {
        this.a = a;
    }
    
    @Override
    public final ix a(final View view, ix k) {
        final int d = k.d();
        final kw a = this.a;
        int d2 = k.d();
        final ActionBarContextView m = a.m;
        final int n = 8;
        boolean b3;
        if (m != null && m.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)a.m.getLayoutParams();
            boolean b2;
            if (a.m.isShown()) {
                if (a.G == null) {
                    a.G = new Rect();
                    a.H = new Rect();
                }
                final Rect g = a.G;
                final Rect h = a.H;
                g.set(k.b(), k.d(), k.c(), k.a());
                final ViewGroup s = a.s;
                if (ue.a != null) {
                    try {
                        ue.a.invoke(s, g, h);
                    }
                    catch (final Exception ex) {}
                }
                final int top = g.top;
                final int left = g.left;
                final int right = g.right;
                final ix r = ik.r((View)a.s);
                int b;
                if (r == null) {
                    b = 0;
                }
                else {
                    b = r.b();
                }
                int c;
                if (r == null) {
                    c = 0;
                }
                else {
                    c = r.c();
                }
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    b2 = false;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    b2 = true;
                }
                if (top > 0 && a.t == null) {
                    (a.t = new View(a.f)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = b;
                    frameLayout$LayoutParams.rightMargin = c;
                    a.s.addView(a.t, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View t = a.t;
                    if (t != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)t.getLayoutParams();
                        if (layoutParams2.height != layoutParams.topMargin || layoutParams2.leftMargin != b || layoutParams2.rightMargin != c) {
                            layoutParams2.height = layoutParams.topMargin;
                            layoutParams2.leftMargin = b;
                            layoutParams2.rightMargin = c;
                            a.t.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View t2 = a.t;
                b3 = (t2 != null);
                if (b3 && t2.getVisibility() != 0) {
                    final View t3 = a.t;
                    int backgroundColor;
                    if ((ik.k(t3) & 0x2000) != 0x0) {
                        backgroundColor = aai.b(a.f, 2131099654);
                    }
                    else {
                        backgroundColor = aai.b(a.f, 2131099653);
                    }
                    t3.setBackgroundColor(backgroundColor);
                }
                if (!a.w && b3) {
                    d2 = 0;
                }
            }
            else {
                if (layoutParams.topMargin != 0) {
                    layoutParams.topMargin = 0;
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                b3 = false;
            }
            if (b2) {
                a.m.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        else {
            b3 = false;
        }
        final View t4 = a.t;
        if (t4 != null) {
            int visibility;
            if (!b3) {
                visibility = n;
            }
            else {
                visibility = 0;
            }
            t4.setVisibility(visibility);
        }
        if (d != d2) {
            k = k.k(k.b(), d2, k.c(), k.a());
        }
        return ik.s(view, k);
    }
}
