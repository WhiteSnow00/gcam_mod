import java.util.concurrent.Executor;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmz
{
    public final bnv a;
    public final pii b;
    public final oui c;
    public final DialogInterface$OnClickListener d;
    public final hxd e;
    private final hyi f;
    private final kjm g;
    private final hyl h;
    
    public fmz(final hxd e, final bnv a, final hyl h, final hyi f, final pii b, final oui c, final kjm g) {
        this.d = (DialogInterface$OnClickListener)new fmy(this);
        this.a = a;
        this.e = e;
        this.h = h;
        this.f = f;
        this.b = b;
        this.c = c;
        this.g = g;
    }
    
    public final void a() {
        knf.f(this.h.a(), new fmx(this), this.g);
    }
    
    public final void b() {
        final hyi f = this.f;
        f.b = hyj.a;
        final hyl c = f.c;
    }
}
