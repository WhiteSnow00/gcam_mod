import java.util.concurrent.Semaphore;
import j$.time.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckx implements oun
{
    private final /* synthetic */ int a;
    
    public ckx() {
    }
    
    public ckx(final int a) {
        this.a = a;
    }
    
    public static cnz a() {
        return new cnz();
    }
    
    public static dat b() {
        return new dat();
    }
    
    public static final Executor c() {
        return new kjs(d());
    }
    
    public static ScheduledExecutorService d() {
        return mcn.l("shot-loss");
    }
    
    public static final ofb e() {
        final ofb d = ofi.d(d());
        pqf.k(d);
        return d;
    }
    
    public static Clock f() {
        final Clock systemUTC = Clock.systemUTC();
        pqf.k(systemUTC);
        return systemUTC;
    }
    
    public static del g() {
        return new del();
    }
}
