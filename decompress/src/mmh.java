import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmh
{
    public static final nsd a;
    private static final mmd e;
    public volatile mmm b;
    public volatile mmd c;
    public volatile int d;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/sampling/Sampler");
        e = mmd.a(Integer.MAX_VALUE);
    }
    
    public mmh(final Context context, final Executor executor, final mml mml, final oui oui, final pii pii) {
        this.b = mml.a;
        this.d = 3;
        this.c = mmh.e;
        ofi.p(new mme(this, context, mml, oui, pii, executor), executor);
    }
}
