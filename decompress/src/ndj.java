import android.os.Bundle;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ndj extends ht
{
    final /* synthetic */ ndm b;
    
    public ndj(final ndm b) {
        this.b = b;
    }
    
    @Override
    public final void d(final View view, final jc jc) {
        super.d(view, jc);
        if (this.b.d) {
            jc.b(1048576);
            jc.h(true);
            return;
        }
        jc.h(false);
    }
    
    @Override
    public final boolean j(final View view, final int n, final Bundle bundle) {
        int n2 = n;
        if (n == 1048576) {
            final ndm b = this.b;
            if (b.d) {
                b.cancel();
                return true;
            }
            n2 = 1048576;
        }
        return super.j(view, n2, bundle);
    }
}
