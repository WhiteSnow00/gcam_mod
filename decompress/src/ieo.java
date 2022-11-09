import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.widget.FrameLayout;
import android.view.WindowManager;
import android.content.res.Resources;
import android.view.View$OnLayoutChangeListener;
import java.util.HashMap;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ieo
{
    public final AtomicBoolean a;
    public final kkz b;
    public final Context c;
    public final HashMap d;
    public final kjk e;
    public final View$OnLayoutChangeListener f;
    public final Resources g;
    public final efm h;
    public final WindowManager i;
    public final klv j;
    public final int k;
    public int l;
    public int m;
    public FrameLayout n;
    public ieg o;
    public ieh p;
    public iej q;
    public View r;
    public View s;
    public krc t;
    private final int u;
    
    public ieo(final Context c, final kjk e, final klv j, final efm h, final WindowManager i) {
        this.a = new AtomicBoolean(true);
        this.b = new kkz(jcb.a);
        this.d = new HashMap();
        this.t = bqx.o;
        this.c = c;
        final Resources resources = c.getResources();
        this.g = resources;
        this.e = e;
        this.h = h;
        this.i = i;
        this.j = j;
        this.u = resources.getDimensionPixelSize(2131166316);
        this.k = resources.getDimensionPixelSize(2131166316) / 2;
        this.f = (View$OnLayoutChangeListener)new iek(this, i, c);
    }
    
    private final int f(final jcb jcb) {
        final int[] array = new int[2];
        final int[] array2 = new int[2];
        this.s.getLocationInWindow(array2);
        this.r.getLocationInWindow(array);
        final int height = this.s.getHeight();
        final int width = this.s.getWidth();
        final jcb a = jcb.a;
        switch (jcb.ordinal()) {
            default: {
                return 0;
            }
            case 2: {
                return Math.abs(array2[0] - array[0]) - this.m;
            }
            case 1: {
                return width + Math.abs(array2[0] - array[0]);
            }
            case 0: {
                return height + Math.abs(array2[1] - array[1]);
            }
        }
    }
    
    public final String a(final idb idb) {
        if (this.p.a.c.containsKey(idb)) {
            final Integer n = this.d.get(idb);
            n.getClass();
            return this.g.getString((int)n);
        }
        throw new IllegalArgumentException("Unsupported speed up ratio.");
    }
    
    public final void b(final jcb jcb) {
        final int n = Math.abs(this.l - this.m) / 2;
        final int f = this.f(jcb);
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(this.l, this.m);
        layoutParams.setLayoutDirection(this.o.getLayoutDirection());
        final jcb a = jcb.a;
        switch (jcb.ordinal()) {
            case 1:
            case 2: {
                layoutParams.leftMargin = f - n;
                layoutParams.gravity = 19;
                break;
            }
            case 0: {
                layoutParams.topMargin = f;
                layoutParams.gravity = 49;
                break;
            }
        }
        this.o.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.o.setRotation((float)jcb.e);
        final int n2 = (this.m - this.u) / 2;
        final int f2 = this.f(jcb);
        final int a2 = this.o.a();
        final int f3 = ik.f((View)this.o);
        final int u = this.u;
        final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(u, u);
        layoutParams2.setLayoutDirection(this.q.getLayoutDirection());
        Label_0319: {
            Label_0287: {
                Label_0280: {
                    switch (jcb.ordinal()) {
                        default: {
                            break Label_0319;
                        }
                        case 2: {
                            layoutParams2.leftMargin = f2 + n2;
                            if (f3 == 1) {
                                break Label_0280;
                            }
                            break;
                        }
                        case 1: {
                            layoutParams2.leftMargin = f2 + n2;
                            if (f3 == 1) {
                                break;
                            }
                            break Label_0280;
                        }
                        case 0: {
                            layoutParams2.topMargin = f2 + n2;
                            layoutParams2.setMarginStart(a2);
                            layoutParams2.gravity = 49;
                            break Label_0319;
                        }
                    }
                    layoutParams2.topMargin = a2;
                    break Label_0287;
                }
                layoutParams2.bottomMargin = a2;
            }
            layoutParams2.gravity = 19;
        }
        this.q.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.n.requestLayout();
        this.b.aR(jcb);
    }
    
    public final void c() {
        final ieg o = this.o;
        if (o != null) {
            o.setEnabled(false);
        }
    }
    
    public final void d() {
        final FrameLayout n = this.n;
        if (n != null) {
            n.setVisibility(8);
        }
    }
    
    public final void e(final int n) {
        if (this.q == null) {
            return;
        }
        final jcb a = jcb.a(this.i.getDefaultDisplay(), this.c);
        final iej q = this.q;
        q.a.set(n);
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)q.getLayoutParams();
        final int a2 = q.c.a();
        final int f = ik.f((View)q);
        Label_0137: {
            Label_0120: {
                switch (a.ordinal()) {
                    default: {
                        break Label_0137;
                    }
                    case 2: {
                        if (f == 1) {
                            break Label_0120;
                        }
                        break;
                    }
                    case 1: {
                        if (f == 1) {
                            break;
                        }
                        break Label_0120;
                    }
                    case 0: {
                        layoutParams.setMarginStart(a2);
                        break Label_0137;
                    }
                }
                layoutParams.topMargin = a2;
                break Label_0137;
            }
            layoutParams.bottomMargin = a2;
        }
        final String d = q.c.d(n);
        q.setText((CharSequence)d);
        q.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        q.announceForAccessibility((CharSequence)q.b.getString(2131951680, new Object[] { d }));
        this.q.requestLayout();
    }
}
