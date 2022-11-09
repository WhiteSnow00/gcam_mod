import android.widget.ListAdapter;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.DialogInterface$OnCancelListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.ViewGroup;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class kb
{
    public final jx a;
    private final int b;
    
    public kb(final Context context) {
        this(context, kc.a(context, 0));
    }
    
    public kb(final Context context, final int b) {
        this.a = new jx((Context)new ContextThemeWrapper(context, kc.a(context, b)));
        this.b = b;
    }
    
    public final Context a() {
        return this.a.a;
    }
    
    public kc b() {
        final kc kc = new kc(this.a.a, this.b);
        final jx a = this.a;
        final ka a2 = kc.a;
        final View e = a.e;
        if (e != null) {
            a2.w = e;
        }
        else {
            final CharSequence d = a.d;
            if (d != null) {
                a2.a(d);
            }
            final Drawable c = a.c;
            if (c != null) {
                a2.s = c;
                a2.r = 0;
                final ImageView t = a2.t;
                if (t != null) {
                    t.setVisibility(0);
                    a2.t.setImageDrawable(c);
                }
            }
        }
        final CharSequence f = a.f;
        if (f != null) {
            a2.e = f;
            final TextView v = a2.v;
            if (v != null) {
                v.setText(f);
            }
        }
        final CharSequence g = a.g;
        if (g != null) {
            a2.e(-1, g, a.h);
        }
        final CharSequence i = a.i;
        if (i != null) {
            a2.e(-2, i, a.j);
        }
        if (a.n != null) {
            final AlertController$RecycleListView f2 = (AlertController$RecycleListView)a.b.inflate(a2.B, (ViewGroup)null);
            int n;
            if (a.q) {
                n = a2.C;
            }
            else {
                n = a2.D;
            }
            Object n2 = a.n;
            if (n2 == null) {
                n2 = new jz(a.a, n);
            }
            a2.x = (ListAdapter)n2;
            a2.y = a.r;
            if (a.o != null) {
                f2.setOnItemClickListener((AdapterView$OnItemClickListener)new jw(a, a2));
            }
            if (a.q) {
                f2.setChoiceMode(1);
            }
            a2.f = f2;
        }
        final View p = a.p;
        if (p != null) {
            a2.g = p;
            a2.h = false;
        }
        kc.setCancelable(this.a.k);
        if (this.a.k) {
            kc.setCanceledOnTouchOutside(true);
        }
        kc.setOnCancelListener((DialogInterface$OnCancelListener)null);
        kc.setOnDismissListener(this.a.l);
        final DialogInterface$OnKeyListener m = this.a.m;
        if (m != null) {
            kc.setOnKeyListener(m);
        }
        return kc;
    }
    
    public final kc c() {
        final kc b = this.b();
        b.show();
        return b;
    }
    
    public final void d(final DialogInterface$OnKeyListener m) {
        this.a.m = m;
    }
    
    public final void e(final CharSequence d) {
        this.a.d = d;
    }
    
    public void f(final boolean k) {
        this.a.k = k;
    }
    
    public final void g(final int n, final DialogInterface$OnClickListener j) {
        final jx a = this.a;
        a.i = a.a.getText(n);
        this.a.j = j;
    }
    
    public final void h(final int n, final DialogInterface$OnClickListener h) {
        final jx a = this.a;
        a.g = a.a.getText(n);
        this.a.h = h;
    }
}
