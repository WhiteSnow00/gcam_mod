import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klr implements klj
{
    private final njp a;
    private final kkz b;
    private final klj c;
    
    public klr(final njp a) {
        this.a = a;
        final kkz b = new kkz(a.a());
        this.b = b;
        this.c = kld.c(b);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.c.a(kri, executor);
    }
    
    @Override
    public final Object aQ() {
        return this.b.d;
    }
    
    public final void c() {
        this.b.aR(this.a.a());
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("PollingObs");
        d.a(this.a);
        return d.toString();
    }
}
