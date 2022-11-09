import android.widget.TextView;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crj implements csf
{
    public final Context a;
    public final bnv b;
    public final Activity c;
    public final eyt d;
    public final krr e;
    public final crw f;
    
    public crj(final Context a, final bnv b, final Activity c, final eyt d, final krr krr, final crw f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = krr.a("CamUnavailableHelp");
    }
    
    private final Runnable e(final int n, final int n2) {
        return new cri(this, n, n2);
    }
    
    @Override
    public final kc a(final int n) {
        final ndv ndv = new ndv(this.a);
        final TextView a = csb.a(this.a);
        a.setText(2131951815);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)a);
        ndv.f(false);
        ndv.g(2131951812, (DialogInterface$OnClickListener)new crh(this, n, 1));
        ndv.h(2131951876, (DialogInterface$OnClickListener)new crh(this, n));
        return ndv.b();
    }
    
    @Override
    public final kc b(final int n) {
        final ndv ndv = new ndv(this.a);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)csb.b(2131951817, this.a, this.e(5, n)));
        ndv.f(false);
        ndv.g(2131951812, (DialogInterface$OnClickListener)new crh(this, n, 2));
        return ndv.b();
    }
    
    @Override
    public final kc c(final int n) {
        final ndv ndv = new ndv(this.a);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)csb.b(2131951816, this.a, this.e(3, n)));
        ndv.f(false);
        ndv.g(2131951812, (DialogInterface$OnClickListener)new crh(this, n, 3));
        return ndv.b();
    }
    
    public final void d(final int n, final int n2) {
        final krr e = this.e;
        final String a = csi.a(n2);
        final String q = och.q(n);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 104 + String.valueOf(q).length());
        sb.append("Hardware help dialog for unavailability of any cameras due to reason: ");
        sb.append(a);
        sb.append(" at stage ");
        sb.append(q);
        sb.append(" Negative button clicked");
        e.b(sb.toString());
        this.d.P(4, n, n2, null, 0);
    }
}
