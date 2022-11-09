import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klo implements klj
{
    public final /* synthetic */ Object a;
    
    public klo(final Object a) {
        this.a = a;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        executor.execute(new kln(kri, this.a));
        return klq.a;
    }
    
    @Override
    public final Object aQ() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("Obs.of");
        d.a(this.a);
        return d.toString();
    }
}
