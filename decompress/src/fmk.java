import java.util.concurrent.Executor;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmk
{
    public final AccessibilityManager a;
    public final djf b;
    public final dho c;
    public final fxu d;
    public final flq e;
    public final gkw f;
    
    public fmk(final AccessibilityManager a, final dho c, final fxu d, final gkw f, final flq e, final djf b, final cxl cxl) {
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        f.getClass();
        this.f = f;
        e.getClass();
        this.e = e;
        b.getClass();
        this.b = b;
        final cxo a2 = cxr.a;
        cxl.f();
    }
    
    public final krc a(final klj klj, final kjm kjm) {
        return klj.a(new fmi(this), kjm);
    }
    
    public final void b(final boolean a) {
        final ksl b = this.b.a.b;
        b.a = a;
        b.c();
    }
    
    public final void c(final kre c) {
        final ksl b = this.b.a.b;
        if (c.equals(b.c) && b.b != null) {
            return;
        }
        b.c = c;
        b.c();
    }
}
