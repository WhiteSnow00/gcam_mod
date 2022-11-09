import android.view.View;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imb implements imf
{
    public static final nsd a;
    public final crg b;
    public final cxl c;
    public img d;
    public niz e;
    public imc f;
    private final bql g;
    private final Handler h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/countdownui/CountdownController");
    }
    
    public imb(final bqm g, final bmz bmz, final crg b, final cxl c, final View view, final hkc hkc, final kjm kjm) {
        this.e = nii.a;
        this.g = g;
        this.b = b;
        this.c = c;
        this.h = kpo.e(bmz.i(), "CountdownHandler");
        hkc.a(hjq.i);
        kjm.b(new ima(this, view));
    }
    
    public final void a() {
        this.d.a();
        this.h.removeCallbacksAndMessages((Object)null);
        if (gnb.b() && !this.b.k()) {
            this.e.g();
        }
        a.l(imb.a.b(), "Unsupported to set torch on for countdown request", '\u0ad8');
    }
    
    public final void b(final int n) {
        final bqw h = this.g.h();
        if (h.r() && h.be().g()) {
            this.e = ((fvp)h.be().c()).d();
        }
        else {
            this.e = nii.a;
        }
        final img d = this.d;
        if (d.d()) {
            d.a();
        }
        d.c.addView((View)d, -1);
        d.b(true, n);
    }
    
    public final boolean c() {
        return this.d.d();
    }
}
