import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brm implements brj
{
    private final pii a;
    private final pii b;
    
    public brm(final pii b, final pii a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        final hvd hvd = (hvd)this.a.get();
        int a;
        if (hvd != null) {
            a = hvd.a();
        }
        else {
            a = 0;
        }
        if (t instanceof lfq) {
            ((eyt)this.b.get()).O(12, null, t, -1, -1, a, nns.l(), nns.l(), kst.b, false);
            return;
        }
        if (t instanceof lfp) {
            ((eyt)this.b.get()).O(11, null, t.getCause(), -1, -1, a, nns.l(), new ArrayList(), kst.a(((lfp)t).a), false);
            return;
        }
        ((eyt)this.b.get()).x(t, a);
    }
}
