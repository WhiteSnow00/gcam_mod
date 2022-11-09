import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixb implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public ixb(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ixa a() {
        final WindowManager a = ((efx)this.a).a();
        final cxl cxl = (cxl)this.b.get();
        ((fiu)this.c).a();
        return new ixa(a, cxl);
    }
}
