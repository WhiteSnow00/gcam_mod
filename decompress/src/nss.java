import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

final class nss
{
    public static final nsp a;
    public final AtomicLong b;
    public final AtomicLong c;
    public final AtomicInteger d;
    
    static {
        a = new nsp();
    }
    
    public nss() {
        this.b = new AtomicLong();
        this.c = new AtomicLong();
        this.d = new AtomicInteger();
    }
    
    static nsr a(final TimeUnit timeUnit) {
        return new nsr(timeUnit);
    }
}
