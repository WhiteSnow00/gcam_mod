import android.view.Window;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Bundle;
import android.arch.lifecycle.LiveData$LifecycleBoundObserver;
import android.content.Context;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

public class ec extends ei implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    public final DialogInterface$OnDismissListener a;
    private final DialogInterface$OnCancelListener ac;
    private int ad;
    private int ae;
    private boolean af;
    private int ag;
    private boolean ah;
    private final u ai;
    private boolean aj;
    public boolean b;
    public Dialog c;
    public boolean d;
    public boolean e;
    public boolean f;
    
    public ec() {
        new dx(this);
        this.ac = (DialogInterface$OnCancelListener)new dy(this);
        this.a = (DialogInterface$OnDismissListener)new dz(this);
        this.ad = 0;
        this.ae = 0;
        this.af = true;
        this.b = true;
        this.ag = -1;
        this.ai = new ea(this);
        this.f = false;
    }
    
    @Override
    public final ep bE() {
        return new eb(this, super.bE());
    }
    
    @Override
    public final void d(final Context context) {
        super.d(context);
        final t y = super.Y;
        final u ai = this.ai;
        s.a("observeForever");
        final q q = new q(y, ai);
        final r r = (r)y.c.f(ai, q);
        if (!(r instanceof LiveData$LifecycleBoundObserver)) {
            if (r == null) {
                q.d(true);
            }
            if (!this.e) {
                this.d = false;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
    
    @Override
    public final void e(final Bundle bundle) {
        super.e(bundle);
        new Handler();
        this.b = (this.F == 0);
        if (bundle != null) {
            this.ad = bundle.getInt("android:style", 0);
            this.ae = bundle.getInt("android:theme", 0);
            this.af = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.ag = bundle.getInt("android:backStackId", -1);
        }
    }
    
    @Override
    public final void f() {
        super.f();
        final Dialog c = this.c;
        if (c != null) {
            this.aj = true;
            c.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.c.dismiss();
            if (!this.d) {
                this.onDismiss((DialogInterface)this.c);
            }
            this.c = null;
            this.f = false;
        }
    }
    
    @Override
    public final void g() {
        super.g();
        if (!this.e && !this.d) {
            this.d = true;
        }
        super.Y.f(this.ai);
    }
    
    @Override
    public final void h(final Bundle bundle) {
        final Dialog c = this.c;
        if (c != null) {
            final Bundle onSaveInstanceState = c.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int ad = this.ad;
        if (ad != 0) {
            bundle.putInt("android:style", ad);
        }
        final int ae = this.ae;
        if (ae != 0) {
            bundle.putInt("android:theme", ae);
        }
        if (!this.af) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        final int ag = this.ag;
        if (ag != -1) {
            bundle.putInt("android:backStackId", ag);
        }
    }
    
    @Override
    public final void i() {
        super.i();
        final Dialog c = this.c;
        if (c != null) {
            this.aj = false;
            c.show();
            final View decorView = this.c.getWindow().getDecorView();
            gz.w(decorView, this);
            a.b(decorView, this);
            aal.b(decorView, this);
        }
    }
    
    @Override
    public final void j() {
        super.j();
        final Dialog c = this.c;
        if (c != null) {
            c.hide();
        }
    }
    
    @Override
    public final void k(Bundle bundle) {
        super.k(bundle);
        if (this.c != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.c.onRestoreInstanceState(bundle);
            }
        }
    }
    
    @Override
    public final void l(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.l(layoutInflater, viewGroup, bundle);
        if (this.O == null && this.c != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.c.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public Dialog m() {
        if (fi.R(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            sb.toString();
        }
        return new Dialog(this.t(), this.ae);
    }
    
    @Override
    public final LayoutInflater n() {
        final LayoutInflater u = this.U();
        if (this.b && !this.ah) {
            if (!this.f) {
                try {
                    this.ah = true;
                    final Dialog m = this.m();
                    this.c = m;
                    if (this.b) {
                        switch (this.ad) {
                            case 3: {
                                final Window window = m.getWindow();
                                if (window != null) {
                                    window.addFlags(24);
                                }
                            }
                            case 1:
                            case 2: {
                                m.requestWindowFeature(1);
                                break;
                            }
                        }
                        final Context s = this.s();
                        if (s instanceof Activity) {
                            this.c.setOwnerActivity((Activity)s);
                        }
                        this.c.setCancelable(this.af);
                        this.c.setOnCancelListener(this.ac);
                        this.c.setOnDismissListener(this.a);
                        this.f = true;
                    }
                    else {
                        this.c = null;
                    }
                }
                finally {
                    this.ah = false;
                }
            }
            if (fi.R(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
                sb.toString();
            }
            final Dialog c = this.c;
            LayoutInflater cloneInContext = u;
            if (c != null) {
                cloneInContext = u.cloneInContext(c.getContext());
            }
            return cloneInContext;
        }
        if (fi.R(2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
            sb2.toString();
        }
        return u;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        if (!this.aj) {
            if (fi.R(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                sb.toString();
            }
            if (!this.d) {
                this.d = true;
                this.e = false;
                final Dialog c = this.c;
                if (c != null) {
                    c.setOnDismissListener((DialogInterface$OnDismissListener)null);
                    this.c.dismiss();
                }
                this.aj = true;
                if (this.ag < 0) {
                    final fr i = this.x().i();
                    i.j(this);
                    i.g();
                    return;
                }
                final fi x = this.x();
                final int ag = this.ag;
                if (ag >= 0) {
                    x.C(new fh(x, ag), false);
                    this.ag = -1;
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Bad id: ");
                sb2.append(ag);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }
}
