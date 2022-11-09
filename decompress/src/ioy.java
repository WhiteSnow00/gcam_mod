import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioy
{
    public final ihg a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;
    public final boolean e;
    
    public ioy(final Context context, final ihg a, final pii pii, final boolean e, final hdo hdo, final cxl cxl) {
        this.a = a;
        this.e = e;
        final FrameLayout b = new FrameLayout(context);
        this.b = b;
        int n;
        if (!cxl.k(cxr.at)) {
            n = 2131624006;
        }
        else {
            n = 2131624005;
        }
        View.inflate(context, n, (ViewGroup)b);
        b.findViewById(2131427689).setOnClickListener((View$OnClickListener)new iow(context));
        final FrameLayout c = new FrameLayout(context);
        this.c = c;
        int n2;
        if (!cxl.k(cxr.at)) {
            n2 = 2131624146;
        }
        else {
            n2 = 2131624145;
        }
        View.inflate(context, n2, (ViewGroup)c);
        c.findViewById(2131427853).setOnClickListener((View$OnClickListener)new iox(this, hdo, pii));
        final FrameLayout d = new FrameLayout(context);
        this.d = d;
        int n3;
        if (!cxl.k(cxr.at)) {
            n3 = 2131624018;
        }
        else {
            n3 = 2131624017;
        }
        View.inflate(context, n3, (ViewGroup)d);
        d.findViewById(2131427689).setOnClickListener((View$OnClickListener)new iow(context, 2));
    }
}
