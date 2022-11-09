import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class meu implements meq
{
    private static final nsd a;
    private final Context b;
    private final Executor c;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/federatedlearning/FederatedLearningExampleStoreImpl");
    }
    
    public meu(final Context b, final Executor c) {
        this.b = b;
        this.c = c;
    }
    
    private final void i(final String s, final kdq kdq) {
        ofi.q(new met(this, s, s, ofz.a(s).intValue(), kdq), this.c);
    }
    
    @Override
    public void a(final String s, List s2) {
        final ojw v = ojw.v(this.b.getPackageName());
        final jzm a = mew.a(this.b);
        s2 = nqb.s(nqb.s(s2, new mes(v)), fzt.n);
        jzm.a(s);
        if (jzf.b(a.a, a.d)) {
            ofi.w(a.b.a(new jzk(s, s2)), new doh(2), this.c);
            return;
        }
        throw new jzl();
    }
    
    @Override
    public void b(final String s) {
        this.i(s, mer.a);
    }
    
    @Override
    public void c(final String s) {
        this.i(s, mer.c);
    }
}
