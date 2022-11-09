import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxn implements bxv
{
    final /* synthetic */ Executor a;
    final /* synthetic */ Set b;
    
    public bxn(final Executor a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void bn(final jbm jbm, final float n) {
        this.a.execute(new bxm(this.b, jbm, n));
    }
}
