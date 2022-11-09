import android.content.res.Resources$Theme;
import android.view.LayoutInflater;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ActionMode$Callback;
import java.util.List;
import android.view.View;
import android.view.Menu;
import android.view.KeyEvent;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ko extends me
{
    final /* synthetic */ kw a;
    
    public ko(final kw a, final Window$Callback window$Callback) {
        this.a = a;
        super(window$Callback);
    }
    
    @Override
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.a.F(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            final kw a = this.a;
            final int keyCode = keyEvent.getKeyCode();
            final ju a2 = a.a();
            if (a2 == null || !a2.n(keyCode, keyEvent)) {
                final ku z = a.z;
                if (z == null || !a.M(z, keyEvent.getKeyCode(), keyEvent)) {
                    if (a.z == null) {
                        final ku l = a.L(0);
                        a.H(l, keyEvent);
                        final boolean m = a.M(l, keyEvent.getKeyCode(), keyEvent);
                        l.k = false;
                        if (m) {
                            return true;
                        }
                    }
                    return false;
                }
                final ku z2 = a.z;
                if (z2 != null) {
                    z2.l = true;
                }
            }
        }
        return true;
    }
    
    @Override
    public final void onContentChanged() {
    }
    
    @Override
    public final boolean onCreatePanelMenu(final int n, final Menu menu) {
        int n2 = n;
        if (n == 0) {
            if (!(menu instanceof mv)) {
                return false;
            }
            n2 = 0;
        }
        return super.onCreatePanelMenu(n2, menu);
    }
    
    @Override
    public final boolean onMenuOpened(final int n, final Menu menu) {
        super.onMenuOpened(n, menu);
        final kw a = this.a;
        if (n == 108) {
            final ju a2 = a.a();
            if (a2 != null) {
                a2.d(true);
            }
        }
        return true;
    }
    
    @Override
    public final void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
        final kw a = this.a;
        if (n == 108) {
            final ju a2 = a.a();
            if (a2 != null) {
                a2.d(false);
            }
        }
        else if (n == 0) {
            final ku l = a.L(0);
            if (l.m) {
                a.z(l, false);
            }
        }
    }
    
    @Override
    public final boolean onPreparePanel(final int n, final View view, final Menu menu) {
        mv mv;
        if (menu instanceof mv) {
            mv = (mv)menu;
        }
        else {
            mv = null;
        }
        int n2 = n;
        if (n == 0) {
            if (mv == null) {
                return false;
            }
            n2 = 0;
        }
        if (mv != null) {
            mv.i = true;
        }
        final boolean onPreparePanel = super.onPreparePanel(n2, view, menu);
        if (mv != null) {
            mv.i = false;
        }
        return onPreparePanel;
    }
    
    @Override
    public final void onProvideKeyboardShortcuts(final List list, final Menu menu, final int n) {
        final mv h = this.a.L(0).h;
        if (h != null) {
            super.onProvideKeyboardShortcuts(list, (Menu)h, n);
            return;
        }
        super.onProvideKeyboardShortcuts(list, menu, n);
    }
    
    @Override
    public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    @Override
    public final ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, int complexToDimensionPixelSize) {
        final kw a = this.a;
        if (a.q) {
            switch (complexToDimensionPixelSize) {
                case 0: {
                    final lx lx = new lx(a.f, actionMode$Callback);
                    final kw a2 = this.a;
                    final lu l = a2.l;
                    if (l != null) {
                        l.f();
                    }
                    final kn kn = new kn(a2, lx);
                    final ju a3 = a2.a();
                    if (a3 != null) {
                        a2.l = a3.c(kn);
                    }
                    lu lu;
                    if ((lu = a2.l) == null) {
                        a2.B();
                        final lu i = a2.l;
                        if (i != null) {
                            i.f();
                        }
                        if (a2.m == null) {
                            if (a2.x) {
                                final TypedValue typedValue = new TypedValue();
                                final Resources$Theme theme = a2.f.getTheme();
                                theme.resolveAttribute(2130968588, typedValue, true);
                                Object f;
                                if (typedValue.resourceId != 0) {
                                    final Resources$Theme theme2 = a2.f.getResources().newTheme();
                                    theme2.setTo(theme);
                                    theme2.applyStyle(typedValue.resourceId, true);
                                    f = new lv(a2.f, 0);
                                    ((Context)f).getTheme().setTo(theme2);
                                }
                                else {
                                    f = a2.f;
                                }
                                a2.m = new ActionBarContextView((Context)f);
                                (a2.n = new PopupWindow((Context)f, (AttributeSet)null, 2130968604)).setWindowLayoutType(2);
                                a2.n.setContentView((View)a2.m);
                                a2.n.setWidth(-1);
                                ((Context)f).getTheme().resolveAttribute(2130968582, typedValue, true);
                                complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, ((Context)f).getResources().getDisplayMetrics());
                                a2.m.e = complexToDimensionPixelSize;
                                a2.n.setHeight(-2);
                                a2.o = new kk(a2);
                            }
                            else {
                                final ViewStubCompat viewStubCompat = (ViewStubCompat)a2.s.findViewById(2131427403);
                                if (viewStubCompat != null) {
                                    viewStubCompat.a = LayoutInflater.from(a2.s());
                                    a2.m = (ActionBarContextView)viewStubCompat.a();
                                }
                            }
                        }
                        if (a2.m != null) {
                            a2.B();
                            a2.m.i();
                            final lw j = new lw(a2.m.getContext(), a2.m, kn);
                            if (kn.c(j, (Menu)j.a)) {
                                j.g();
                                a2.m.h(j);
                                a2.l = j;
                                if (a2.I()) {
                                    a2.m.setAlpha(0.0f);
                                    final in p2 = ik.p((View)a2.m);
                                    p2.b(1.0f);
                                    (a2.p = p2).d(new kl(a2));
                                }
                                else {
                                    a2.m.setAlpha(1.0f);
                                    a2.m.setVisibility(0);
                                    a2.m.sendAccessibilityEvent(32);
                                    if (a2.m.getParent() instanceof View) {
                                        ik.D((View)a2.m.getParent());
                                    }
                                }
                                if (a2.n != null) {
                                    a2.g.getDecorView().post(a2.o);
                                }
                            }
                            else {
                                a2.l = null;
                            }
                        }
                        lu = a2.l;
                    }
                    if (lu != null) {
                        return lx.e(lu);
                    }
                    return null;
                }
            }
        }
        return super.onWindowStartingActionMode(actionMode$Callback, complexToDimensionPixelSize);
    }
}
