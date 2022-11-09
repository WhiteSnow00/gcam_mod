import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mlr extends mty implements mgx, mll
{
    public final oui a;
    public final oui b;
    public final mma c;
    public final AtomicReference d;
    private final ofb e;
    
    public mlr(final mgv mgv, final ofb e, final oui a, final oui b, final pii pii, final mma c) {
        final AtomicReference d = new AtomicReference();
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        mgv.a(e, mlo.a, pii);
        new mlq(a);
        d.set(c.a(1.0f));
    }
    
    @Override
    public final void k() {
        ofi.p(new mlp(this), this.e);
    }
}
