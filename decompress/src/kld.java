import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kld implements klj
{
    private final klj a;
    
    private kld(final klj a) {
        this.a = a;
    }
    
    public static klj c(final klj klj) {
        if (klj instanceof kld) {
            return klj;
        }
        return new kld(klj);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.a.a(new klc(executor, kri), new klw());
    }
    
    @Override
    public final Object aQ() {
        return this.a.aQ();
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("FilteredObs");
        d.a(this.a);
        return d.toString();
    }
}
