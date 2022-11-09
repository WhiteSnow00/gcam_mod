import android.support.v7.widget.ActionMenuView;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lf extends ju
{
    final pz a;
    boolean b;
    public final Window$Callback c;
    private boolean d;
    private boolean e;
    private final ArrayList f;
    private final Runnable g;
    private final lb h;
    
    public lf(final Toolbar toolbar, final CharSequence charSequence, final Window$Callback window$Callback) {
        this.f = new ArrayList();
        this.g = new la(this);
        final lb lb = new lb(this);
        this.h = lb;
        final ty a = new ty(toolbar, false);
        this.a = a;
        final le le = new le(this, window$Callback);
        this.c = (Window$Callback)le;
        a.d = (Window$Callback)le;
        toolbar.v = lb;
        a.p(charSequence);
    }
    
    @Override
    public final int a() {
        return ((ty)this.a).b;
    }
    
    @Override
    public final Context b() {
        return this.a.b();
    }
    
    @Override
    public final void d(final boolean e) {
        if (e == this.e) {
            return;
        }
        this.e = e;
        for (int size = this.f.size(), i = 0; i < size; ++i) {
            ((jt)this.f.get(i)).a();
        }
    }
    
    @Override
    public final void e() {
        ((ty)this.a).a.removeCallbacks(this.g);
    }
    
    @Override
    public final void f(final boolean b) {
    }
    
    @Override
    public final void g(final boolean b) {
        this.w(4, 4);
    }
    
    @Override
    public final void h(final boolean b) {
    }
    
    @Override
    public final void i(final CharSequence charSequence) {
        this.a.m(charSequence);
    }
    
    @Override
    public final void j(final CharSequence charSequence) {
        this.a.p(charSequence);
    }
    
    @Override
    public final boolean k() {
        return this.a.s();
    }
    
    @Override
    public final boolean l() {
        if (this.a.r()) {
            this.a.e();
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean m() {
        ((ty)this.a).a.removeCallbacks(this.g);
        ik.A((View)((ty)this.a).a, this.g);
        return true;
    }
    
    @Override
    public final boolean n(final int n, final KeyEvent keyEvent) {
        final Menu v = this.v();
        if (v != null) {
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
            v.setQwertyMode(qwertyMode);
            return v.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    @Override
    public final boolean o(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.p();
        }
        return true;
    }
    
    @Override
    public final boolean p() {
        return this.a.v();
    }
    
    @Override
    public final void q() {
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
        this.a.j(null);
    }
    
    @Override
    public final void u() {
        final pz a = this.a;
        a.m(a.b().getText(2131952475));
    }
    
    public final Menu v() {
        if (!this.d) {
            final pz a = this.a;
            final lc t = new lc(this);
            final ld u = new ld(this);
            final Toolbar a2 = ((ty)a).a;
            a2.t = t;
            a2.u = u;
            final ActionMenuView a3 = a2.a;
            if (a3 != null) {
                a3.i(t, u);
            }
            this.d = true;
        }
        return ((ty)this.a).a.g();
    }
    
    public final void w(final int n, final int n2) {
        final pz a = this.a;
        a.i((n & n2) | (~n2 & ((ty)a).b));
    }
}
