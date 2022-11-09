import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.support.v7.widget.Toolbar;
import android.app.Dialog;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import android.view.View;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.content.Context;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ln extends ju implements ny
{
    private static final Interpolator r;
    private static final Interpolator s;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    pz d;
    ActionBarContextView e;
    View f;
    lm g;
    lu h;
    lt i;
    public int j;
    public boolean k;
    public boolean l;
    public md m;
    boolean n;
    final io o;
    final io p;
    final ll q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    static {
        r = (Interpolator)new AccelerateInterpolator();
        s = (Interpolator)new DecelerateInterpolator();
    }
    
    public ln(final Activity activity, final boolean b) {
        new ArrayList();
        this.w = new ArrayList();
        this.j = 0;
        this.k = true;
        this.y = true;
        this.o = new lj(this);
        this.p = new lk(this);
        this.q = new ll(this);
        final View decorView = activity.getWindow().getDecorView();
        this.z(decorView);
        if (!b) {
            this.f = decorView.findViewById(16908290);
        }
    }
    
    public ln(final Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.j = 0;
        this.k = true;
        this.y = true;
        this.o = new lj(this);
        this.p = new lk(this);
        this.q = new ll(this);
        this.z(dialog.getWindow().getDecorView());
    }
    
    private final void A(final boolean b) {
        if (!b) {
            this.d.x();
        }
        else {
            this.d.x();
        }
        this.d.w();
        this.d.z();
        this.b.e = false;
    }
    
    static boolean y(final boolean b, final boolean b2) {
        return b2 || !b;
    }
    
    private final void z(final View view) {
        final ActionBarOverlayLayout b = (ActionBarOverlayLayout)view.findViewById(2131427538);
        this.b = b;
        if (b != null) {
            b.h = this;
            if (b.getWindowToken() != null) {
                ((ln)b.h).j = b.b;
                final int g = b.g;
                if (g != 0) {
                    b.onWindowSystemUiVisibilityChanged(g);
                    ik.D((View)b);
                }
            }
        }
        final View viewById = view.findViewById(2131427382);
        pz f;
        if (viewById instanceof pz) {
            f = (pz)viewById;
        }
        else {
            if (!(viewById instanceof Toolbar)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't make a decor toolbar out of ");
                String simpleName;
                if (viewById != null) {
                    simpleName = ((Toolbar)viewById).getClass().getSimpleName();
                }
                else {
                    simpleName = "null";
                }
                sb.append(simpleName);
                throw new IllegalStateException(sb.toString());
            }
            f = ((Toolbar)viewById).f();
        }
        this.d = f;
        this.e = (ActionBarContextView)view.findViewById(2131427391);
        final ActionBarContainer c = (ActionBarContainer)view.findViewById(2131427384);
        this.c = c;
        final pz d = this.d;
        if (d != null && this.e != null && c != null) {
            this.a = d.b();
            if ((this.d.a() & 0x4) != 0x0) {
                this.u = true;
            }
            final Context a = this.a;
            final int targetSdkVersion = a.getApplicationInfo().targetSdkVersion;
            this.d.y();
            this.A(jp.h(a));
            final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, lo.a, 2130968584, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                final ActionBarOverlayLayout b2 = this.b;
                if (!b2.d) {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
                b2.l(this.n = true);
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ik.J((View)this.c, (float)dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass().getSimpleName());
        sb2.append(" can only be used with a compatible window decor layout");
        throw new IllegalStateException(sb2.toString());
    }
    
    @Override
    public final int a() {
        return this.d.a();
    }
    
    @Override
    public final Context b() {
        if (this.t == null) {
            final TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968589, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.t = (Context)new ContextThemeWrapper(this.a, resourceId);
            }
            else {
                this.t = this.a;
            }
        }
        return this.t;
    }
    
    @Override
    public final lu c(lt g) {
        final lm g2 = this.g;
        if (g2 != null) {
            g2.f();
        }
        this.b.l(false);
        this.e.i();
        g = (lt)new lm(this, this.e.getContext(), g);
        ((lm)g).a.s();
        try {
            final boolean c = ((lm)g).b.c((lu)g, (Menu)((lm)g).a);
            ((lm)g).a.r();
            if (c) {
                (this.g = (lm)g).g();
                this.e.h((lu)g);
                this.v(true);
                this.e.sendAccessibilityEvent(32);
                return (lu)g;
            }
            return null;
        }
        finally {
            ((lm)g).a.r();
        }
    }
    
    @Override
    public final void d(final boolean v) {
        if (v == this.v) {
            return;
        }
        this.v = v;
        for (int size = this.w.size(), i = 0; i < size; ++i) {
            ((jt)this.w.get(i)).a();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (!this.u) {
            this.g(b);
        }
    }
    
    @Override
    public final void g(final boolean b) {
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 4;
        }
        this.w(n, 4);
    }
    
    @Override
    public final void h(final boolean z) {
        if (!(this.z = z)) {
            final md m = this.m;
            if (m != null) {
                m.a();
            }
        }
    }
    
    @Override
    public final void i(final CharSequence charSequence) {
        this.d.m(charSequence);
    }
    
    @Override
    public final void j(final CharSequence charSequence) {
        this.d.p(charSequence);
    }
    
    @Override
    public final boolean l() {
        final pz d = this.d;
        if (d != null && d.r()) {
            this.d.e();
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean n(final int n, final KeyEvent keyEvent) {
        final lm g = this.g;
        if (g == null) {
            return false;
        }
        final mv a = g.a;
        int deviceId;
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        }
        else {
            deviceId = -1;
        }
        final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
        boolean qwertyMode = true;
        if (keyboardType == 1) {
            qwertyMode = false;
        }
        ((Menu)a).setQwertyMode(qwertyMode);
        return ((Menu)a).performShortcut(n, keyEvent, 0);
    }
    
    @Override
    public final void q() {
        this.A(jp.h(this.a));
    }
    
    @Override
    public final void r() {
        this.w(2, 2);
    }
    
    @Override
    public final void s() {
        this.w(8, 8);
    }
    
    @Override
    public final void t() {
        this.d.j(null);
    }
    
    @Override
    public final void u() {
        this.i(this.a.getString(2131952475));
    }
    
    public final void v(final boolean b) {
        if (b) {
            if (!this.x) {
                this.x = true;
                this.x(false);
            }
        }
        else if (this.x) {
            this.x(this.x = false);
        }
        if (ik.U((View)this.c)) {
            in in;
            in in2;
            if (b) {
                in = this.d.c(4, 100L);
                in2 = this.e.b(0, 200L);
            }
            else {
                in2 = this.d.c(0, 200L);
                in = this.e.b(8, 100L);
            }
            final md md = new md();
            md.a.add(in);
            final View view = (View)in.a.get();
            long duration;
            if (view != null) {
                duration = view.animate().getDuration();
            }
            else {
                duration = 0L;
            }
            final View view2 = (View)in2.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            md.a.add(in2);
            md.b();
            return;
        }
        if (b) {
            this.d.n(4);
            this.e.setVisibility(0);
            return;
        }
        this.d.n(0);
        this.e.setVisibility(8);
    }
    
    public final void w(final int n, final int n2) {
        final int a = this.d.a();
        if ((n2 & 0x4) != 0x0) {
            this.u = true;
        }
        this.d.i((n & n2) | (~n2 & a));
    }
    
    public final void x(final boolean b) {
        if (y(this.l, this.x)) {
            if (!this.y) {
                this.y = true;
                final md m = this.m;
                if (m != null) {
                    m.a();
                }
                this.c.setVisibility(0);
                Label_0296: {
                    Label_0250: {
                        if (this.j == 0) {
                            boolean b2 = b;
                            if (!this.z) {
                                if (!b) {
                                    break Label_0250;
                                }
                                b2 = true;
                            }
                            this.c.setTranslationY(0.0f);
                            float n = (float)(-this.c.getHeight());
                            if (b2) {
                                final int[] array2;
                                final int[] array = array2 = new int[2];
                                array2[1] = (array2[0] = 0);
                                this.c.getLocationInWindow(array);
                                n -= array[1];
                            }
                            this.c.setTranslationY(n);
                            final md i = new md();
                            final in p = ik.p((View)this.c);
                            p.f(0.0f);
                            p.e(this.q);
                            i.c(p);
                            if (this.k) {
                                final View f = this.f;
                                if (f != null) {
                                    f.setTranslationY(n);
                                    final in p2 = ik.p(this.f);
                                    p2.f(0.0f);
                                    i.c(p2);
                                }
                            }
                            i.e(ln.s);
                            i.d();
                            i.f(this.p);
                            (this.m = i).b();
                            break Label_0296;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.k) {
                        final View f2 = this.f;
                        if (f2 != null) {
                            f2.setTranslationY(0.0f);
                        }
                    }
                    this.p.b();
                }
                final ActionBarOverlayLayout b3 = this.b;
                if (b3 != null) {
                    ik.D((View)b3);
                }
            }
        }
        else if (this.y) {
            this.y = false;
            final md j = this.m;
            if (j != null) {
                j.a();
            }
            Label_0532: {
                if (this.j == 0) {
                    boolean b4 = b;
                    if (!this.z) {
                        if (!b) {
                            break Label_0532;
                        }
                        b4 = true;
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    final md k = new md();
                    float n2 = (float)(-this.c.getHeight());
                    if (b4) {
                        final int[] array4;
                        final int[] array3 = array4 = new int[2];
                        array4[1] = (array4[0] = 0);
                        this.c.getLocationInWindow(array3);
                        n2 -= array3[1];
                    }
                    final in p3 = ik.p((View)this.c);
                    p3.f(n2);
                    p3.e(this.q);
                    k.c(p3);
                    if (this.k) {
                        final View f3 = this.f;
                        if (f3 != null) {
                            final in p4 = ik.p(f3);
                            p4.f(n2);
                            k.c(p4);
                        }
                    }
                    k.e(ln.r);
                    k.d();
                    k.f(this.o);
                    (this.m = k).b();
                    return;
                }
            }
            this.o.b();
        }
    }
}
