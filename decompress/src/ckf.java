import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ckf implements krc
{
    public final kof a;
    public cke b;
    private final AtomicLong c;
    
    public ckf(final kof a) {
        this.c = new AtomicLong(0L);
        this.a = a;
        this.b = cke.a;
    }
    
    @Override
    public final void close() {
        this.c.set(0L);
        this.b = cke.a;
    }
}
