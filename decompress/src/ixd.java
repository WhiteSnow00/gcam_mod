import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixd implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public ixd(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final ixc a() {
        final WindowManager a = ((efx)this.a).a();
        final cxl cxl = (cxl)this.b.get();
        final lfh a2 = ((kqo)this.c).a();
        ((fiu)this.d).a();
        return new ixc(a, cxl, a2);
    }
}
