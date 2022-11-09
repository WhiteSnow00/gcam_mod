import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class ob implements Runnable
{
    final /* synthetic */ og a;
    private final oe b;
    
    public ob(final og a, final oe b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final mv c = this.a.c;
        if (c != null) {
            final mt b = c.b;
            if (b != null) {
                b.E(c);
            }
        }
        final View view = (View)this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.h()) {
            this.a.i = this.b;
        }
        this.a.k = null;
    }
}
