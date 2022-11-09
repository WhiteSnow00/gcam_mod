import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccp implements oen
{
    final /* synthetic */ ccs a;
    private final /* synthetic */ int b;
    
    public ccp(final ccs a) {
        this.a = a;
    }
    
    public ccp(final ccs a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                a.m(ccs.a.c(), "Failed to capture video cover image.", '\u0163', t);
                return;
            }
            case 0: {
                a.k(ccs.a.b(), "CamcorderSnapshot is not available: %s", t, '\u0164');
                final cce cce = (cce)this.a.b;
                cce.d.a(t, cce.b);
                this.a.d.k(true);
            }
        }
    }
}
