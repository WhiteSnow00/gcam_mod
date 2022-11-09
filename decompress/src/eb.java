import android.app.Dialog;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class eb extends ep
{
    final /* synthetic */ ep a;
    final /* synthetic */ ec b;
    
    public eb(final ec b, final ep a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final View aB(final int n) {
        if (this.a.aC()) {
            return this.a.aB(n);
        }
        final Dialog c = this.b.c;
        if (c != null) {
            return c.findViewById(n);
        }
        return null;
    }
    
    @Override
    public final boolean aC() {
        return this.a.aC() || this.b.f;
    }
}
