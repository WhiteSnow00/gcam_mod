import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klb implements klj
{
    private final klj a;
    
    private klb(final klj a) {
        this.a = a;
    }
    
    public static klj c(final klj klj) {
        return kld.c(new klb(klj));
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        final kjk kjk = new kjk();
        kjk.c(this.a.a(new kla(kri, executor, kjk), new klw()));
        return kjk;
    }
    
    @Override
    public final Object aQ() {
        return ((klj)this.a.aQ()).aQ();
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("DerefObs");
        d.a(this.a);
        return d.toString();
    }
}
