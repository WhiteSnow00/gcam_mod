import android.content.Context;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iel extends FrameLayout
{
    final /* synthetic */ ieo a;
    
    public iel(final ieo a, final Context context) {
        this.a = a;
        super(context);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final jcb a = jcb.a(this.a.i.getDefaultDisplay(), this.a.c);
        if (!b && ((jcb)this.a.b.d).equals(a)) {
            return;
        }
        this.a.b(a);
    }
}
