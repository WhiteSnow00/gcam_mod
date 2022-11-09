import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class klt implements klv
{
    final /* synthetic */ Object a;
    
    public klt(final Object a) {
        this.a = a;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        executor.execute(new kln(kri, this.a, 2));
        return klu.a;
    }
    
    @Override
    public final Object aQ() {
        return this.a;
    }
    
    @Override
    public final void aR(final Object o) {
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("Prop.of");
        d.a(this.a);
        return d.toString();
    }
}
