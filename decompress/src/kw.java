import android.location.Location;
import java.util.Calendar;
import android.app.UiModeManager;
import java.lang.ref.WeakReference;
import android.content.res.Resources;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.view.View$OnClickListener;
import android.support.v7.widget.AppCompatImageView;
import android.view.KeyCharacterMap;
import android.view.MenuItem;
import android.util.Log;
import android.media.AudioManager;
import android.view.ViewConfiguration;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.support.v7.widget.ContentFrameLayout;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.ViewParent;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.TypedValue;
import android.view.WindowManager;
import android.view.Menu;
import android.view.KeyEvent;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Window$Callback;
import android.location.LocationManager;
import android.content.ContextWrapper;
import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.support.v7.widget.ActionBarContextView;
import android.view.MenuInflater;
import android.view.Window;
import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.widget.TextView;
import android.graphics.Rect;
import android.view.LayoutInflater$Factory2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kw extends kg implements LayoutInflater$Factory2, mt
{
    private static final zb I;
    private static final int[] J;
    public static final boolean c;
    public static final boolean d;
    public boolean A;
    public boolean B;
    boolean C;
    public int D;
    boolean E;
    int F;
    public Rect G;
    public Rect H;
    private CharSequence K;
    private kv L;
    private TextView M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ku[] Q;
    private boolean R;
    private boolean S;
    private int T;
    private boolean U;
    private boolean V;
    private kr W;
    private kr X;
    private final Runnable Y;
    private boolean Z;
    private AppCompatViewInflater aa;
    private kv ab;
    public final Object e;
    final Context f;
    public Window g;
    public ko h;
    public ju i;
    public MenuInflater j;
    public py k;
    lu l;
    ActionBarContextView m;
    public PopupWindow n;
    public Runnable o;
    in p;
    public boolean q;
    public boolean r;
    ViewGroup s;
    public View t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public ku z;
    
    static {
        I = new zb();
        J = new int[] { 16842836 };
        c = ("robolectric".equals(Build.FINGERPRINT) ^ true);
        d = true;
    }
    
    public kw(Context baseContext, final Window window, final Object e) {
        final kf kf = null;
        this.p = null;
        this.q = true;
        this.T = -100;
        this.Y = new kk(this, 1);
        this.f = baseContext;
        this.e = e;
        Label_0120: {
            if (this.T == -100 && e instanceof Dialog) {
                while (true) {
                    while (baseContext != null) {
                        if (baseContext instanceof kf) {
                            final kf kf2 = (kf)baseContext;
                            if (kf2 != null) {
                                this.T = ((kw)kf2.i()).T;
                            }
                            break Label_0120;
                        }
                        else {
                            if (!(baseContext instanceof ContextWrapper)) {
                                break;
                            }
                            baseContext = ((ContextWrapper)baseContext).getBaseContext();
                        }
                    }
                    final kf kf2 = kf;
                    continue;
                }
            }
        }
        if (this.T == -100) {
            final zb i = kw.I;
            final Integer n = (Integer)i.get(this.e.getClass().getName());
            if (n != null) {
                this.T = n;
                i.remove(this.e.getClass().getName());
            }
        }
        if (window != null) {
            this.Q(window);
        }
        ot.f();
    }
    
    private final kr O(final Context context) {
        if (this.X == null) {
            this.X = new kp(this, context);
        }
        return this.X;
    }
    
    private final kr P(Context applicationContext) {
        if (this.W == null) {
            if (li.a == null) {
                applicationContext = applicationContext.getApplicationContext();
                li.a = new li(applicationContext, (LocationManager)applicationContext.getSystemService("location"));
            }
            this.W = new ks(this, li.a);
        }
        return this.W;
    }
    
    private final void Q(final Window g) {
        if (this.g != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        final Window$Callback callback = g.getCallback();
        if (!(callback instanceof ko)) {
            g.setCallback((Window$Callback)(this.h = new ko(this, callback)));
            final to k = to.k(this.f, null, kw.J);
            final Drawable i = k.i(0);
            if (i != null) {
                g.setBackgroundDrawable(i);
            }
            k.n();
            this.g = g;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
    
    private final void R() {
        if (this.g == null) {
            final Object e = this.e;
            if (e instanceof Activity) {
                this.Q(((Activity)e).getWindow());
            }
        }
        if (this.g != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }
    
    private final void S(final int n) {
        this.F |= 1 << n;
        if (!this.E) {
            ik.A(this.g.getDecorView(), this.Y);
            this.E = true;
        }
    }
    
    private final void T(final ku ku, final KeyEvent keyEvent) {
        if (ku.m || this.C) {
            return;
        }
        if (ku.a == 0 && (this.f.getResources().getConfiguration().screenLayout & 0xF) == 0x4) {
            return;
        }
        final Window$Callback v = this.v();
        if (v != null && !v.onMenuOpened(ku.a, (Menu)ku.h)) {
            this.z(ku, true);
            return;
        }
        final WindowManager windowManager = (WindowManager)this.f.getSystemService("window");
        if (windowManager == null) {
            return;
        }
        if (!this.H(ku, keyEvent)) {
            return;
        }
        final ViewGroup e = ku.e;
        int n = 0;
        Label_0717: {
            if (e == null || ku.n) {
                if (e == null) {
                    final Context s = this.s();
                    final TypedValue typedValue = new TypedValue();
                    final Resources$Theme theme = s.getResources().newTheme();
                    theme.setTo(s.getTheme());
                    theme.resolveAttribute(2130968581, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        theme.applyStyle(typedValue.resourceId, true);
                    }
                    theme.resolveAttribute(2130969526, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        theme.applyStyle(typedValue.resourceId, true);
                    }
                    else {
                        theme.applyStyle(2132017848, true);
                    }
                    final lv j = new lv(s, 0);
                    ((Context)j).getTheme().setTo(theme);
                    ku.j = (Context)j;
                    final TypedArray obtainStyledAttributes = ((Context)j).obtainStyledAttributes(lo.j);
                    ku.b = obtainStyledAttributes.getResourceId(86, 0);
                    ku.d = obtainStyledAttributes.getResourceId(1, 0);
                    obtainStyledAttributes.recycle();
                    ku.e = (ViewGroup)new kt(this, ku.j);
                    ku.c = 81;
                    if (ku.e == null) {
                        return;
                    }
                }
                else if (ku.n && e.getChildCount() > 0) {
                    ku.e.removeAllViews();
                }
                final View g = ku.g;
                Label_0778: {
                    if (g != null) {
                        ku.f = g;
                    }
                    else {
                        if (ku.h == null) {
                            break Label_0778;
                        }
                        if (this.L == null) {
                            this.L = new kv(this);
                        }
                        final kv l = this.L;
                        Object d;
                        if (ku.h == null) {
                            d = null;
                        }
                        else {
                            if (ku.i == null) {
                                ku.i = new mr(ku.j);
                                final mr i = ku.i;
                                i.e = l;
                                ku.h.g(i);
                            }
                            final mr k = ku.i;
                            final ViewGroup e2 = ku.e;
                            if (k.d == null) {
                                k.d = (ExpandedMenuView)k.b.inflate(2131623949, e2, false);
                                if (k.f == null) {
                                    k.f = new mq(k);
                                }
                                k.d.setAdapter((ListAdapter)k.f);
                                k.d.setOnItemClickListener((AdapterView$OnItemClickListener)k);
                            }
                            d = k.d;
                        }
                        ku.f = (View)d;
                        if (ku.f == null) {
                            break Label_0778;
                        }
                    }
                    if (ku.f != null) {
                        if (ku.g == null) {
                            if (ku.i.a().getCount() <= 0) {
                                break Label_0778;
                            }
                        }
                        ViewGroup$LayoutParams layoutParams;
                        if ((layoutParams = ku.f.getLayoutParams()) == null) {
                            layoutParams = new ViewGroup$LayoutParams(-2, -2);
                        }
                        ku.e.setBackgroundResource(ku.b);
                        final ViewParent parent = ku.f.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup)parent).removeView(ku.f);
                        }
                        ku.e.addView(ku.f, layoutParams);
                        if (!ku.f.hasFocus()) {
                            ku.f.requestFocus();
                            n = -2;
                            break Label_0717;
                        }
                        n = -2;
                        break Label_0717;
                    }
                }
                ku.n = true;
                return;
            }
            final View g2 = ku.g;
            if (g2 != null) {
                final ViewGroup$LayoutParams layoutParams2 = g2.getLayoutParams();
                if (layoutParams2 != null && layoutParams2.width == -1) {
                    n = -1;
                    break Label_0717;
                }
            }
            n = -2;
        }
        ku.l = false;
        final WindowManager$LayoutParams windowManager$LayoutParams = new WindowManager$LayoutParams(n, -2, 0, 0, 1002, 8519680, -3);
        windowManager$LayoutParams.gravity = ku.c;
        windowManager$LayoutParams.windowAnimations = ku.d;
        windowManager.addView((View)ku.e, (ViewGroup$LayoutParams)windowManager$LayoutParams);
        ku.m = true;
    }
    
    private final void U() {
        if (!this.r) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    
    final void A(final int n) {
        final ku l = this.L(n);
        if (l.h != null) {
            final Bundle p = new Bundle();
            l.h.o(p);
            if (p.size() > 0) {
                l.p = p;
            }
            l.h.s();
            l.h.clear();
        }
        l.o = true;
        l.n = true;
        if ((n == 108 || n == 0) && this.k != null) {
            final ku i = this.L(0);
            i.k = false;
            this.H(i, null);
        }
    }
    
    public final void B() {
        final in p = this.p;
        if (p != null) {
            p.a();
        }
    }
    
    public final void C() {
        if (!this.r) {
            final TypedArray obtainStyledAttributes = this.f.obtainStyledAttributes(lo.j);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                this.n(1);
            }
            else if (obtainStyledAttributes.getBoolean(117, false)) {
                this.n(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                this.n(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                this.n(10);
            }
            this.x = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.R();
            this.g.getDecorView();
            final LayoutInflater from = LayoutInflater.from(this.f);
            ViewGroup viewGroup;
            if (!this.y) {
                if (this.x) {
                    viewGroup = (ViewGroup)from.inflate(2131623948, (ViewGroup)null);
                    this.v = false;
                    this.u = false;
                }
                else if (this.u) {
                    final TypedValue typedValue = new TypedValue();
                    this.f.getTheme().resolveAttribute(2130968588, typedValue, true);
                    Object f;
                    if (typedValue.resourceId != 0) {
                        f = new lv(this.f, typedValue.resourceId);
                    }
                    else {
                        f = this.f;
                    }
                    final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from((Context)f).inflate(2131623959, (ViewGroup)null);
                    (this.k = (py)viewGroup2.findViewById(2131427538)).o(this.v());
                    if (this.v) {
                        this.k.i(109);
                    }
                    if (this.N) {
                        this.k.i(2);
                    }
                    viewGroup = viewGroup2;
                    if (this.O) {
                        this.k.i(5);
                        viewGroup = viewGroup2;
                    }
                }
                else {
                    viewGroup = null;
                }
            }
            else if (this.w) {
                viewGroup = (ViewGroup)from.inflate(2131623958, (ViewGroup)null);
            }
            else {
                viewGroup = (ViewGroup)from.inflate(2131623957, (ViewGroup)null);
            }
            if (viewGroup == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.u);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.v);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.x);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.w);
                sb.append(", windowNoTitle: ");
                sb.append(this.y);
                sb.append(" }");
                throw new IllegalArgumentException(sb.toString());
            }
            ik.L((View)viewGroup, new kh(this));
            if (this.k == null) {
                this.M = (TextView)viewGroup.findViewById(2131428063);
            }
            ue.a((View)viewGroup);
            final ContentFrameLayout contentFrameLayout = (ContentFrameLayout)viewGroup.findViewById(2131427383);
            final ViewGroup viewGroup3 = (ViewGroup)this.g.findViewById(16908290);
            if (viewGroup3 != null) {
                while (viewGroup3.getChildCount() > 0) {
                    final View child = viewGroup3.getChildAt(0);
                    viewGroup3.removeViewAt(0);
                    contentFrameLayout.addView(child);
                }
                viewGroup3.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup3 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup3).setForeground((Drawable)null);
                }
            }
            this.g.setContentView((View)viewGroup);
            contentFrameLayout.i = new ki(this);
            this.s = viewGroup;
            final CharSequence w = this.w();
            if (!TextUtils.isEmpty(w)) {
                final py k = this.k;
                if (k != null) {
                    k.p(w);
                }
                else {
                    final ju i = this.i;
                    if (i != null) {
                        i.j(w);
                    }
                    else {
                        final TextView m = this.M;
                        if (m != null) {
                            m.setText(w);
                        }
                    }
                }
            }
            final ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout)this.s.findViewById(16908290);
            final View decorView = this.g.getDecorView();
            contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (ik.U((View)contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            final TypedArray obtainStyledAttributes2 = this.f.obtainStyledAttributes(lo.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new TypedValue();
            }
            obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
            if (obtainStyledAttributes2.hasValue(122)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
            }
            if (obtainStyledAttributes2.hasValue(123)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
            }
            if (obtainStyledAttributes2.hasValue(120)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new TypedValue();
                }
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.r = true;
            final ku l = this.L(0);
            if (!this.C && l.h == null) {
                this.S(108);
            }
        }
    }
    
    public final void D() {
        this.C();
        if (this.u && this.i == null) {
            final Object e = this.e;
            if (e instanceof Activity) {
                this.i = new ln((Activity)e, this.v);
            }
            else if (e instanceof Dialog) {
                this.i = new ln((Dialog)e);
            }
            final ju i = this.i;
            if (i != null) {
                i.f(this.Z);
            }
        }
    }
    
    public final void E(final mv mv) {
        final py k = this.k;
        if (k != null && k.q() && (!ViewConfiguration.get(this.f).hasPermanentMenuKey() || this.k.s())) {
            final Window$Callback v = this.v();
            if (this.k.t()) {
                this.k.r();
                if (!this.C) {
                    v.onPanelClosed(108, (Menu)this.L(0).h);
                }
            }
            else if (v != null && !this.C) {
                if (this.E && (0x1 & this.F) != 0x0) {
                    this.g.getDecorView().removeCallbacks(this.Y);
                    this.Y.run();
                }
                final ku l = this.L(0);
                final mv h = l.h;
                if (h != null && !l.o && v.onPreparePanel(0, l.g, (Menu)h)) {
                    v.onMenuOpened(108, (Menu)l.h);
                    this.k.u();
                }
            }
            return;
        }
        final ku i = this.L(0);
        i.n = true;
        this.z(i, false);
        this.T(i, null);
    }
    
    final boolean F(final KeyEvent keyEvent) {
        final Object e = this.e;
        if ((e instanceof hy || e instanceof ky) && this.g.getDecorView() != null) {
            final int[] a = ik.a;
        }
        final int keyCode = keyEvent.getKeyCode();
        final boolean b = true;
        boolean r = true;
        if (keyCode == 82 && this.h.b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        final int keyCode2 = keyEvent.getKeyCode();
        boolean b2 = false;
        if (keyEvent.getAction() == 0) {
            switch (keyCode2) {
                default: {
                    b2 = false;
                    break;
                }
                case 82: {
                    if (keyEvent.getRepeatCount() == 0) {
                        final ku l = this.L(0);
                        if (!l.m) {
                            this.H(l, keyEvent);
                            b2 = b;
                            break;
                        }
                    }
                    b2 = b;
                    break;
                }
                case 4: {
                    if ((keyEvent.getFlags() & 0x80) == 0x0) {
                        r = false;
                    }
                    this.R = r;
                    b2 = false;
                    break;
                }
            }
        }
        else {
            switch (keyCode2) {
                default: {
                    b2 = false;
                    return b2;
                }
                case 82: {
                    if (this.l != null) {
                        break;
                    }
                    final ku i = this.L(0);
                    final py k = this.k;
                    Label_0408: {
                        boolean b3;
                        if (k != null && k.q() && !ViewConfiguration.get(this.f).hasPermanentMenuKey()) {
                            if (!this.k.t()) {
                                if (this.C || !this.H(i, keyEvent)) {
                                    return b;
                                }
                                b3 = this.k.u();
                            }
                            else {
                                b3 = this.k.r();
                            }
                        }
                        else {
                            b3 = i.m;
                            if (!b3 && !i.l) {
                                if (i.k) {
                                    if (i.o) {
                                        i.k = false;
                                        if (!this.H(i, keyEvent)) {
                                            return b;
                                        }
                                    }
                                    this.T(i, keyEvent);
                                    break Label_0408;
                                }
                                b2 = b;
                                return b2;
                            }
                            this.z(i, true);
                        }
                        if (!b3) {
                            return b;
                        }
                    }
                    final AudioManager audioManager = (AudioManager)this.f.getApplicationContext().getSystemService("audio");
                    if (audioManager != null) {
                        audioManager.playSoundEffect(0);
                        b2 = b;
                        return b2;
                    }
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                    b2 = b;
                    return b2;
                    b2 = b;
                    return b2;
                }
                case 4: {
                    final boolean r2 = this.R;
                    this.R = false;
                    final ku j = this.L(0);
                    if (j.m) {
                        if (!r2) {
                            this.z(j, true);
                            b2 = b;
                            return b2;
                        }
                        b2 = b;
                        return b2;
                    }
                    else {
                        final lu m = this.l;
                        if (m != null) {
                            m.f();
                            b2 = b;
                            return b2;
                        }
                        final ju a2 = this.a();
                        if (a2 != null && a2.l()) {
                            break;
                        }
                        b2 = false;
                        return b2;
                    }
                    break;
                }
            }
            b2 = b;
        }
        return b2;
    }
    
    public final boolean G(final mv mv, final MenuItem menuItem) {
        final Window$Callback v = this.v();
        if (v != null && !this.C) {
            final ku u = this.u((Menu)mv.a());
            if (u != null) {
                return v.onMenuItemSelected(u.a, menuItem);
            }
        }
        return false;
    }
    
    public final boolean H(final ku z, final KeyEvent keyEvent) {
        if (this.C) {
            return false;
        }
        if (z.k) {
            return true;
        }
        final ku z2 = this.z;
        if (z2 != null && z2 != z) {
            this.z(z2, false);
        }
        final Window$Callback v = this.v();
        if (v != null) {
            z.g = v.onCreatePanelView(z.a);
        }
        final int a = z.a;
        final boolean b = a == 0 || a == 108;
        if (b) {
            final py k = this.k;
            if (k != null) {
                k.n();
            }
        }
        if (z.g == null && (!b || !(this.i instanceof lf))) {
            final mv h = z.h;
            if (h == null || z.o) {
                if (h == null) {
                    final Context f = this.f;
                    final int a2 = z.a;
                    Object o;
                    if ((a2 == 0 || a2 == 108) && this.k != null) {
                        final TypedValue typedValue = new TypedValue();
                        final Resources$Theme theme = f.getTheme();
                        theme.resolveAttribute(2130968588, typedValue, true);
                        Resources$Theme theme2;
                        if (typedValue.resourceId != 0) {
                            theme2 = f.getResources().newTheme();
                            theme2.setTo(theme);
                            theme2.applyStyle(typedValue.resourceId, true);
                            theme2.resolveAttribute(2130968589, typedValue, true);
                        }
                        else {
                            theme.resolveAttribute(2130968589, typedValue, true);
                            theme2 = null;
                        }
                        Resources$Theme theme3 = theme2;
                        if (typedValue.resourceId != 0) {
                            if ((theme3 = theme2) == null) {
                                theme3 = f.getResources().newTheme();
                                theme3.setTo(theme);
                            }
                            theme3.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme3 != null) {
                            o = new lv(f, 0);
                            ((Context)o).getTheme().setTo(theme3);
                        }
                        else {
                            o = f;
                        }
                    }
                    else {
                        o = f;
                    }
                    final mv mv = new mv((Context)o);
                    mv.b = this;
                    z.a(mv);
                    if (z.h == null) {
                        return false;
                    }
                }
                if (b && this.k != null) {
                    if (this.ab == null) {
                        this.ab = new kv(this, 1);
                    }
                    this.k.m((Menu)z.h, this.ab);
                }
                z.h.s();
                if (!v.onCreatePanelMenu(z.a, (Menu)z.h)) {
                    z.a(null);
                    if (b) {
                        final py i = this.k;
                        if (i != null) {
                            i.m(null, this.ab);
                        }
                    }
                    return false;
                }
                z.o = false;
            }
            z.h.s();
            final Bundle p2 = z.p;
            if (p2 != null) {
                z.h.n(p2);
                z.p = null;
            }
            if (!v.onPreparePanel(0, z.g, (Menu)z.h)) {
                if (b) {
                    final py j = this.k;
                    if (j != null) {
                        j.m(null, this.ab);
                    }
                }
                z.h.r();
                return false;
            }
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            z.h.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
            z.h.r();
        }
        z.k = true;
        z.l = false;
        this.z = z;
        return true;
    }
    
    final boolean I() {
        if (this.r) {
            final ViewGroup s = this.s;
            if (s != null && ik.U((View)s)) {
                return true;
            }
        }
        return false;
    }
    
    public final void J() {
        this.N(true);
    }
    
    public final View K(final String s, Context context, final AttributeSet set) {
        if (this.aa == null) {
            final String string = this.f.obtainStyledAttributes(lo.j).getString(116);
            if (string == null) {
                this.aa = new AppCompatViewInflater();
            }
            else {
                try {
                    this.aa = (AppCompatViewInflater)Class.forName(string).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                finally {
                    this.aa = new AppCompatViewInflater();
                }
            }
        }
        final AppCompatViewInflater aa = this.aa;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, lo.x, 0, 0);
        int n = 4;
        final int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.recycle();
        Object o;
        if (resourceId != 0 && (!(context instanceof lv) || ((lv)context).a != resourceId)) {
            o = new lv(context, resourceId);
        }
        else {
            o = context;
        }
        Label_0523: {
            switch (s.hashCode()) {
                case 2001146706: {
                    if (s.equals("Button")) {
                        n = 2;
                        break Label_0523;
                    }
                    break;
                }
                case 1666676343: {
                    if (s.equals("EditText")) {
                        n = 3;
                        break Label_0523;
                    }
                    break;
                }
                case 1601505219: {
                    if (s.equals("CheckBox")) {
                        n = 6;
                        break Label_0523;
                    }
                    break;
                }
                case 1413872058: {
                    if (s.equals("AutoCompleteTextView")) {
                        n = 9;
                        break Label_0523;
                    }
                    break;
                }
                case 1125864064: {
                    if (s.equals("ImageView")) {
                        n = 1;
                        break Label_0523;
                    }
                    break;
                }
                case 799298502: {
                    if (s.equals("ToggleButton")) {
                        n = 13;
                        break Label_0523;
                    }
                    break;
                }
                case 776382189: {
                    if (s.equals("RadioButton")) {
                        n = 7;
                        break Label_0523;
                    }
                    break;
                }
                case -339785223: {
                    if (s.equals("Spinner")) {
                        break Label_0523;
                    }
                    break;
                }
                case -658531749: {
                    if (s.equals("SeekBar")) {
                        n = 12;
                        break Label_0523;
                    }
                    break;
                }
                case -937446323: {
                    if (s.equals("ImageButton")) {
                        n = 5;
                        break Label_0523;
                    }
                    break;
                }
                case -938935918: {
                    if (s.equals("TextView")) {
                        n = 0;
                        break Label_0523;
                    }
                    break;
                }
                case -1346021293: {
                    if (s.equals("MultiAutoCompleteTextView")) {
                        n = 10;
                        break Label_0523;
                    }
                    break;
                }
                case -1455429095: {
                    if (s.equals("CheckedTextView")) {
                        n = 8;
                        break Label_0523;
                    }
                    break;
                }
                case -1946472170: {
                    if (s.equals("RatingBar")) {
                        n = 11;
                        break Label_0523;
                    }
                    break;
                }
            }
            n = -1;
        }
        Object o2 = null;
        switch (n) {
            default: {
                o2 = null;
                break;
            }
            case 13: {
                o2 = new pv((Context)o, set);
                break;
            }
            case 12: {
                o2 = new pd((Context)o, set);
                break;
            }
            case 11: {
                o2 = new pb((Context)o, set);
                break;
            }
            case 10: {
                o2 = new ox((Context)o, set);
                break;
            }
            case 9: {
                o2 = aa.a((Context)o, set);
                break;
            }
            case 8: {
                o2 = new oq((Context)o, set);
                break;
            }
            case 7: {
                o2 = aa.d((Context)o, set);
                break;
            }
            case 6: {
                o2 = aa.c((Context)o, set);
                break;
            }
            case 5: {
                o2 = new ov((Context)o, set);
                break;
            }
            case 4: {
                o2 = new pp((Context)o, set);
                break;
            }
            case 3: {
                o2 = new ou((Context)o, set);
                break;
            }
            case 2: {
                o2 = aa.b((Context)o, set);
                break;
            }
            case 1: {
                o2 = new AppCompatImageView((Context)o, set);
                break;
            }
            case 0: {
                o2 = aa.e((Context)o, set);
                break;
            }
        }
        final Object o3;
        Label_1003: {
            Label_1000: {
                if (o2 == null && context != o) {
                    String attributeValue = s;
                    if (s.equals("view")) {
                        attributeValue = set.getAttributeValue((String)null, "class");
                    }
                    try {
                        final Object[] c = aa.c;
                        c[0] = o;
                        c[1] = set;
                        if (attributeValue.indexOf(46) == -1) {
                            for (int i = 0; i < 3; ++i) {
                                o2 = aa.f((Context)o, attributeValue, AppCompatViewInflater.b[i]);
                                if (o2 != null) {
                                    break Label_1000;
                                }
                            }
                            final Object[] c2 = aa.c;
                            c2[1] = (c2[0] = null);
                            break Label_1003;
                        }
                        aa.f((Context)o, attributeValue, null);
                        break Label_1003;
                    }
                    catch (final Exception ex) {
                        final Object[] c3 = aa.c;
                        c3[1] = (c3[0] = null);
                        break Label_1003;
                    }
                    finally {
                        final Object[] c4 = aa.c;
                        c4[1] = (c4[0] = null);
                    }
                }
            }
            o3 = o2;
        }
        if (o3 != null) {
            context = ((View)o3).getContext();
            if (context instanceof ContextWrapper) {
                if (ik.R((View)o3)) {
                    final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, AppCompatViewInflater.a);
                    final String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        ((View)o3).setOnClickListener((View$OnClickListener)new kz((View)o3, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return (View)o3;
    }
    
    public final ku L(final int n) {
        final ku[] q = this.Q;
        ku[] q2;
        if (q != null && q.length > n) {
            q2 = q;
        }
        else {
            q2 = new ku[n + 1];
            if (q != null) {
                System.arraycopy(q, 0, q2, 0, q.length);
            }
            this.Q = q2;
        }
        ku ku;
        if ((ku = q2[n]) == null) {
            ku = new ku(n);
            q2[n] = ku;
        }
        return ku;
    }
    
    public final boolean M(final ku ku, final int n, final KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if (ku.k || this.H(ku, keyEvent)) {
            final mv h = ku.h;
            if (h != null) {
                return h.performShortcut(n, keyEvent, 1);
            }
        }
        return false;
    }
    
    public final void N(final boolean b) {
        if (this.C) {
            return;
        }
        final int q = this.q();
        final Configuration t = this.t(this.f, this.r(this.f, q), null);
        final boolean v = this.V;
        boolean u = false;
        Label_0162: {
            if (!v && this.e instanceof Activity) {
                final PackageManager packageManager = this.f.getPackageManager();
                if (packageManager == null) {
                    break Label_0162;
                }
                try {
                    final ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f, (Class)this.e.getClass()), 269221888);
                    this.U = (activityInfo != null && (activityInfo.configChanges & 0x200) != 0x0);
                }
                catch (final PackageManager$NameNotFoundException ex) {
                    this.U = false;
                }
            }
            this.V = true;
            u = this.U;
        }
        final int n = this.f.getResources().getConfiguration().uiMode & 0x30;
        final int n2 = t.uiMode & 0x30;
        Label_0451: {
            Label_0430: {
                if (n != n2 && b && !u && this.A && (kw.c || this.S)) {
                    final Object e = this.e;
                    if (e instanceof Activity && !((Activity)e).isChild()) {
                        ((Activity)this.e).recreate();
                        break Label_0430;
                    }
                }
                if (n == n2) {
                    break Label_0451;
                }
                final Resources resources = this.f.getResources();
                final Configuration configuration = new Configuration(resources.getConfiguration());
                configuration.uiMode = (n2 | (resources.getConfiguration().uiMode & 0xFFFFFFCF));
                resources.updateConfiguration(configuration, (DisplayMetrics)null);
                final int d = this.D;
                if (d != 0) {
                    this.f.setTheme(d);
                    this.f.getTheme().applyStyle(this.D, true);
                }
                if (u) {
                    final Object e2 = this.e;
                    if (e2 instanceof Activity) {
                        final Activity activity = (Activity)e2;
                        if (activity instanceof k) {
                            if (((k)activity).aD().a.a(h.d)) {
                                activity.onConfigurationChanged(configuration);
                            }
                        }
                        else if (this.B) {
                            activity.onConfigurationChanged(configuration);
                        }
                    }
                }
            }
            final Object e3 = this.e;
            if (e3 instanceof kf) {
                final kf kf = (kf)e3;
            }
        }
        if (q == 0) {
            this.P(this.f).d();
        }
        else {
            final kr w = this.W;
            if (w != null) {
                w.c();
            }
            if (q == 3) {
                this.O(this.f).d();
                return;
            }
        }
        final kr x = this.X;
        if (x != null) {
            x.c();
        }
    }
    
    @Override
    public final ju a() {
        this.D();
        return this.i;
    }
    
    @Override
    public final View b(final int n) {
        this.C();
        return this.g.findViewById(n);
    }
    
    @Override
    public final void c(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.C();
        ((ViewGroup)this.s.findViewById(16908290)).addView(view, viewGroup$LayoutParams);
        this.h.b.onContentChanged();
    }
    
    @Override
    public final void d() {
        final LayoutInflater from = LayoutInflater.from(this.f);
        if (from.getFactory() == null) {
            from.setFactory2((LayoutInflater$Factory2)this);
            return;
        }
        from.getFactory2();
    }
    
    @Override
    public final void e() {
        final ju a = this.a();
        if (a != null && a.m()) {
            return;
        }
        this.S(0);
    }
    
    @Override
    public final void f() {
        if (this.e instanceof Activity) {
            synchronized (kg.b) {
                kg.h(this);
            }
        }
        if (this.E) {
            this.g.getDecorView().removeCallbacks(this.Y);
        }
        this.B = false;
        this.C = true;
        Label_0137: {
            if (this.T != -100) {
                final Object e = this.e;
                if (e instanceof Activity && ((Activity)e).isChangingConfigurations()) {
                    kw.I.put(this.e.getClass().getName(), this.T);
                    break Label_0137;
                }
            }
            kw.I.remove(this.e.getClass().getName());
        }
        final ju i = this.i;
        if (i != null) {
            i.e();
        }
        final kr w = this.W;
        if (w != null) {
            w.c();
        }
        final kr x = this.X;
        if (x != null) {
            x.c();
        }
    }
    
    @Override
    public final void g() {
        this.B = false;
        final ju a = this.a();
        if (a != null) {
            a.h(false);
        }
    }
    
    @Override
    public final void i(final int n) {
        this.C();
        final ViewGroup viewGroup = (ViewGroup)this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f).inflate(n, viewGroup);
        this.h.b.onContentChanged();
    }
    
    @Override
    public final void j(final View view) {
        this.C();
        final ViewGroup viewGroup = (ViewGroup)this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.h.b.onContentChanged();
    }
    
    @Override
    public final void k(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.C();
        final ViewGroup viewGroup = (ViewGroup)this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, viewGroup$LayoutParams);
        this.h.b.onContentChanged();
    }
    
    @Override
    public final void l(final CharSequence charSequence) {
        this.K = charSequence;
        final py k = this.k;
        if (k != null) {
            k.p(charSequence);
            return;
        }
        final ju i = this.i;
        if (i != null) {
            i.j(charSequence);
            return;
        }
        final TextView m = this.M;
        if (m != null) {
            m.setText(charSequence);
        }
    }
    
    @Override
    public final void m() {
        this.A = true;
        this.N(false);
        this.R();
        final Object e = this.e;
        if (e instanceof Activity) {
            String c;
            try {
                c = fw.c((Activity)e);
            }
            catch (final IllegalArgumentException ex) {
                c = null;
            }
            if (c != null) {
                final ju i = this.i;
                if (i == null) {
                    this.Z = true;
                }
                else {
                    i.f(true);
                }
            }
            synchronized (kg.b) {
                kg.h(this);
                kg.a.add(new WeakReference(this));
            }
        }
        this.S = true;
    }
    
    @Override
    public final void n(final int n) {
        int n2;
        if (n == 8) {
            n2 = 108;
        }
        else if ((n2 = n) == 9) {
            n2 = 109;
        }
        if (this.y && n2 == 108) {
            return;
        }
        if (this.u && n2 == 1) {
            this.u = false;
        }
        switch (n2) {
            default: {
                this.g.requestFeature(n2);
                return;
            }
            case 109: {
                this.U();
                this.v = true;
                return;
            }
            case 108: {
                this.U();
                this.u = true;
                return;
            }
            case 10: {
                this.U();
                this.w = true;
                return;
            }
            case 5: {
                this.U();
                this.O = true;
                return;
            }
            case 2: {
                this.U();
                this.N = true;
                return;
            }
            case 1: {
                this.U();
                this.y = true;
            }
        }
    }
    
    public final View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return this.K(s, context, set);
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.K(s, context, set);
    }
    
    public final int q() {
        final int t = this.T;
        if (t != -100) {
            return t;
        }
        return -100;
    }
    
    final int r(final Context context, int n) {
        switch (n) {
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
            case 3: {
                if (((kp)this.O(context)).a.isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            }
            case 0: {
                if (((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    final li a = ((ks)this.P(context)).a;
                    final lh c = a.c;
                    boolean b;
                    if (c.b > System.currentTimeMillis()) {
                        b = c.a;
                    }
                    else {
                        n = a.e(a.b, "android.permission.ACCESS_COARSE_LOCATION");
                        Location a2 = null;
                        Location a3;
                        if (n == 0) {
                            a3 = a.a("network");
                        }
                        else {
                            a3 = null;
                        }
                        if (a.e(a.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                            a2 = a.a("gps");
                        }
                        Location location = null;
                        Label_0247: {
                            if (a2 != null && a3 != null) {
                                location = a3;
                                if (a2.getTime() <= a3.getTime()) {
                                    break Label_0247;
                                }
                            }
                            else {
                                location = a3;
                                if (a2 == null) {
                                    break Label_0247;
                                }
                            }
                            location = a2;
                        }
                        if (location != null) {
                            final lh c2 = a.c;
                            final long currentTimeMillis = System.currentTimeMillis();
                            if (lg.a == null) {
                                lg.a = new lg();
                            }
                            final lg a4 = lg.a;
                            a4.a(currentTimeMillis - 86400000L, location.getLatitude(), location.getLongitude());
                            final long b2 = a4.b;
                            a4.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                            n = a4.d;
                            final long c3 = a4.c;
                            final long b3 = a4.b;
                            a4.a(currentTimeMillis + 86400000L, location.getLatitude(), location.getLongitude());
                            long c4 = a4.c;
                            long b4;
                            if (c3 != -1L && b3 != -1L) {
                                if (currentTimeMillis <= b3) {
                                    c4 = c3;
                                    if (currentTimeMillis > c3) {
                                        c4 = b3;
                                    }
                                }
                                b4 = c4 + 60000L;
                            }
                            else {
                                b4 = 43200000L + currentTimeMillis;
                            }
                            c2.a = (1 == n);
                            c2.b = b4;
                            b = c.a;
                        }
                        else {
                            n = Calendar.getInstance().get(11);
                            if (n < 6) {
                                n = 2;
                                return n;
                            }
                            if (n < 22) {
                                n = 1;
                                return n;
                            }
                            return 2;
                        }
                    }
                    if (!b) {
                        n = 1;
                        return n;
                    }
                    return 2;
                }
                return -1;
            }
            case -1:
            case 1:
            case 2: {
                return n;
            }
            case -100: {
                return -1;
            }
        }
    }
    
    final Context s() {
        final ju a = this.a();
        Context b;
        if (a != null) {
            b = a.b();
        }
        else {
            b = null;
        }
        Context f = b;
        if (b == null) {
            f = this.f;
        }
        return f;
    }
    
    public final Configuration t(final Context context, int n, final Configuration to) {
        switch (n) {
            default: {
                n = (context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30);
                break;
            }
            case 2: {
                n = 32;
                break;
            }
            case 1: {
                n = 16;
                break;
            }
        }
        final Configuration configuration = new Configuration();
        configuration.fontScale = 0.0f;
        if (to != null) {
            configuration.setTo(to);
        }
        configuration.uiMode = (n | (configuration.uiMode & 0xFFFFFFCF));
        return configuration;
    }
    
    final ku u(final Menu menu) {
        final ku[] q = this.Q;
        int i = 0;
        int length;
        if (q != null) {
            length = q.length;
        }
        else {
            length = 0;
        }
        while (i < length) {
            final ku ku = q[i];
            if (ku != null && ku.h == menu) {
                return ku;
            }
            ++i;
        }
        return null;
    }
    
    final Window$Callback v() {
        return this.g.getCallback();
    }
    
    public final CharSequence w() {
        final Object e = this.e;
        if (e instanceof Activity) {
            return ((Activity)e).getTitle();
        }
        return this.K;
    }
    
    final void x(final int n, final ku ku, final Menu menu) {
        Object h = menu;
        if (menu == null) {
            h = ku.h;
        }
        if (ku.m && !this.C) {
            this.h.b.onPanelClosed(n, (Menu)h);
        }
    }
    
    final void y(final mv mv) {
        if (this.P) {
            return;
        }
        this.P = true;
        this.k.g();
        final Window$Callback v = this.v();
        if (v != null && !this.C) {
            v.onPanelClosed(108, (Menu)mv);
        }
        this.P = false;
    }
    
    final void z(final ku ku, final boolean b) {
        if (b && ku.a == 0) {
            final py k = this.k;
            if (k != null) {
                if (k.t()) {
                    this.y(ku.h);
                    return;
                }
            }
        }
        final WindowManager windowManager = (WindowManager)this.f.getSystemService("window");
        if (windowManager != null && ku.m) {
            final ViewGroup e = ku.e;
            if (e != null) {
                windowManager.removeView((View)e);
                if (b) {
                    this.x(ku.a, ku, null);
                }
            }
        }
        ku.k = false;
        ku.l = false;
        ku.m = false;
        ku.f = null;
        ku.n = true;
        if (this.z == ku) {
            this.z = null;
        }
    }
}
