import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class ksr implements kso
{
    public final krr a;
    public final Set b;
    public volatile int c;
    private final Executor d;
    
    public ksr(final krr krr, final Executor executor) {
        this.b = new HashSet();
        this.c = 1;
        this.a = krr.a("AudioRestrictApi");
        this.d = ofi.e(executor);
    }
    
    @Override
    public final void a(final int n) {
        this.d.execute(new ksp(this, n));
    }
    
    @Override
    public final void b(final kuh kuh) {
        this.d.execute(new ksq(this, kuh, 1));
    }
    
    @Override
    public final void c(final kuh kuh) {
        this.d.execute(new ksq(this, kuh));
    }
}
