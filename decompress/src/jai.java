import android.graphics.PointF;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class jai extends jwn
{
    final /* synthetic */ jaj a;
    
    public jai(final jaj a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final jdh jdh) {
        if (!this.a.a.i.A()) {
            return false;
        }
        final gjj i = this.a.a.i;
        final PointF a = jdh.a();
        if (i.e.k(cya.d)) {
            if (jwn.ab(a, (View)i.aS)) {
                return false;
            }
            if (jwn.ab(a, i.aU.c())) {
                return false;
            }
        }
        else if (jwn.ab(a, i.aT)) {
            return false;
        }
        this.a.a.i.f();
        return true;
    }
}
