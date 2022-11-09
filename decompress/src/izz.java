import com.google.android.apps.camera.ui.mars.MarsSwitch;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class izz extends jwn
{
    final /* synthetic */ jaa a;
    
    public izz(final jaa a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final jdh jdh) {
        final boolean ab = jwn.ab(jdh.a(), (View)this.a.a.g.a.a);
        final MarsSwitch i = this.a.a.b.i;
        if (i != null && i.a.getVisibility() == 0 && !ab) {
            final MarsSwitch j = this.a.a.b.i;
            if (j != null) {
                j.a.b();
            }
            return true;
        }
        return false;
    }
}
