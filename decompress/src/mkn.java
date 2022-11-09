import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkn
{
    public static final nsd a;
    public final mgu b;
    public final oui c;
    public final ofb d;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricRecordingService");
    }
    
    public mkn(final mgv mgv, final ofb d, final Executor executor, final oui c, final pii pii, final oui oui) {
        this.c = c;
        this.d = d;
        this.b = mgv.a(executor, oui, pii);
    }
}
