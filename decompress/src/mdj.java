import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdj
{
    public final AtomicInteger a;
    public final mde b;
    public volatile boolean c;
    
    public mdj(final mde b) {
        this.b = b;
        this.a = new AtomicInteger(1);
        this.c = false;
    }
}
