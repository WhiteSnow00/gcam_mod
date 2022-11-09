import android.widget.TextView;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crs implements csh
{
    public final Context a;
    public final bnv b;
    public final Activity c;
    public final crw d;
    private final eyt e;
    private final krr f;
    
    public crs(final Context a, final bnv b, final Activity c, final eyt e, final krr krr, final crw d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = krr.a("FallbackHelper");
    }
    
    private final Runnable g(final lfu lfu, final int n, final int n2, final int n3) {
        return new crr(this, lfu, n, n2, n3);
    }
    
    @Override
    public final kc a(final int n, final int n2, final lfu lfu) {
        final ndv ndv = new ndv(this.a);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)csb.b(2131951816, this.a, this.g(lfu, n, n2, 3)));
        ndv.h(2131951812, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2, 1));
        ndv.g(2131951877, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2));
        return ndv.b();
    }
    
    @Override
    public final kc b(final int n, final int n2, final lfu lfu) {
        final ndv ndv = new ndv(this.a);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)csb.b(2131951817, this.a, this.g(lfu, n, n2, 5)));
        ndv.h(2131951812, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2, 2));
        ndv.g(2131951877, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2, 3));
        return ndv.b();
    }
    
    @Override
    public final kc c(final int n, final int n2, final lfu lfu) {
        final ndv ndv = new ndv(this.a);
        final TextView a = csb.a(this.a);
        a.setText(2131951815);
        ndv.r(this.a.getResources().getString(2131951818));
        ndv.s((View)a);
        ndv.h(2131951876, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2, 4));
        ndv.g(2131951877, (DialogInterface$OnClickListener)new crq(this, lfu, n, n2, 5));
        return ndv.b();
    }
    
    @Override
    public final void d(final lfu lfu, final int n, final int n2, final int n3, final int n4) {
        final krr f = this.f;
        final String value = String.valueOf(lfu);
        String s = null;
        switch (n) {
            default: {
                s = "SWITCH";
                break;
            }
            case 2: {
                s = "AUTOMATIC";
                break;
            }
        }
        final String a = csi.a(n2);
        final String q = och.q(n3);
        final String string = Integer.toString(n4 - 1);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 131 + String.valueOf(s).length() + String.valueOf(a).length() + String.valueOf(q).length() + String.valueOf(string).length());
        sb.append("Hardware help dialog when falling back to working camera. defective camera: ");
        sb.append(value);
        sb.append(" Trigger reason ");
        sb.append(s);
        sb.append(" Fallback reason ");
        sb.append(a);
        sb.append(" at stage ");
        sb.append(q);
        sb.append(" event type ");
        sb.append(string);
        f.b(sb.toString());
        this.e.P(n4, n3, n2, lfu, n);
    }
    
    public final void e(final lfu lfu, final int n, final int n2, final int n3) {
        this.d(lfu, n, n2, n3, 4);
    }
    
    public final void f(final lfu lfu, final int n, final int n2, final int n3) {
        this.d(lfu, n, n2, n3, 3);
    }
}
