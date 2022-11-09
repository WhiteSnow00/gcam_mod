import java.util.concurrent.Executor;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkn implements krc, bkk
{
    public final dgn a;
    public final iru b;
    public final ofn c;
    public final ofn d;
    final View$OnClickListener e;
    final View$OnClickListener f;
    private final krc g;
    private boolean h;
    
    public bkn(final dgn a, final fvt fvt, final fwd fwd, final dgm dgm, final iru b) {
        this.c = ofn.f();
        this.d = ofn.f();
        this.e = (View$OnClickListener)new bkl(this, 1);
        final bkl f = new bkl(this);
        this.f = (View$OnClickListener)f;
        this.a = a;
        this.b = b;
        a.n((View$OnClickListener)f);
        this.g = dgm.b.a(new bkm(this, fwd, fvt), odx.a);
    }
    
    @Override
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.g.close();
        this.a.n(null);
        if (!this.c.isDone()) {
            this.c.o(false);
        }
        if (!this.d.isDone()) {
            this.d.o(false);
        }
    }
}
