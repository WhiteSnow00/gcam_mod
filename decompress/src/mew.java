import com.google.android.libraries.performance.primes.federatedlearning.PrimesExampleStoreDataTtlService;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import java.util.concurrent.Executors;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mew
{
    private static final lmy a;
    private static final Random b;
    private static final ofa c;
    private static final Object d;
    private static jzm e;
    
    static {
        a = new lnb();
        b = new Random();
        final ofp ofp = new ofp();
        ofp.c("PrimesBrellaExampleStore-%d");
        c = ofi.b(Executors.newSingleThreadExecutor(ofp.b(ofp)));
        d = new Object();
    }
    
    public static jzm a(final Context context) {
        final Context applicationContext = context.getApplicationContext();
        synchronized (mew.d) {
            if (mew.e == null) {
                final lmy a = mew.a;
                final Random b = mew.b;
                final ofa c = mew.c;
                mew.e = new jzm(applicationContext, new jzq(applicationContext, a, b, c), c, PrimesExampleStoreDataTtlService.class);
            }
            return mew.e;
        }
    }
}
