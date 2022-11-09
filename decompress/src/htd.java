import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class htd extends hsi
{
    final /* synthetic */ htf e;
    
    public htd(final htf e, final Context context) {
        this.e = e;
        super(context);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final htf e = this.e;
        if (!e.a) {
            if (!(boolean)e.b.c(hjq.z)) {
                e.d.b();
                return;
            }
            e.d.a(false);
        }
    }
}
