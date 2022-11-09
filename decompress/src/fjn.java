import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjn
{
    public final dtb a;
    public final AtomicInteger b;
    private final kre c;
    
    public fjn(final dtb a, final kre c) {
        this.b = new AtomicInteger(0);
        this.a = a;
        this.c = c;
    }
    
    public final fjm a() {
        synchronized (this) {
            if (this.b.getAndIncrement() == 0) {
                final kre c = this.c;
                this.a.f(new kre(c.a, c.b), "mv-gyro-session");
            }
            return new fjm(this);
        }
    }
}
