import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqn
{
    public final AtomicInteger a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    
    public cqn() {
        this.a = new AtomicInteger(0);
        this.b = new AtomicInteger(0);
        this.c = new AtomicInteger(0);
    }
    
    public final int a() {
        return this.b.get();
    }
    
    public final int b() {
        return this.c.incrementAndGet();
    }
}
