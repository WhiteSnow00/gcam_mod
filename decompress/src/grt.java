import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grt implements oun
{
    private final pii a;
    private final /* synthetic */ int b;
    
    public grt(final pii a) {
        this.a = a;
    }
    
    public grt(final pii a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public static grt a(final pii pii) {
        return new grt(pii);
    }
    
    public static grt b(final pii pii) {
        return new grt(pii, 1);
    }
    
    public static grt c(final pii pii) {
        return new grt(pii, 2);
    }
    
    public static grt d(final pii pii) {
        return new grt(pii, 3);
    }
    
    public static grt e(final pii pii) {
        return new grt(pii, 5);
    }
    
    public static grt f(final pii pii) {
        return new grt(pii, 6);
    }
    
    public static grt g(final pii pii) {
        return new grt(pii, 7);
    }
    
    public static grt h(final pii pii) {
        return new grt(pii, 8);
    }
    
    public static grt i(final pii pii) {
        return new grt(pii, 16);
    }
}
