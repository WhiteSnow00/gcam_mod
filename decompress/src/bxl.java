import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxl implements bxu
{
    final /* synthetic */ Executor a;
    final /* synthetic */ Set b;
    
    public bxl(final Executor a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void f(final jbm jbm) {
        this.a.execute(new bxk(this.b, jbm));
    }
}
