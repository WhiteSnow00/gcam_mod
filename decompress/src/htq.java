import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htq implements hub
{
    private final kse a;
    private final htm b;
    private final AtomicBoolean c;
    
    public htq(final htm b, final kse a) {
        this.c = new AtomicBoolean(false);
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (!this.c.getAndSet(true)) {
            this.a.f("AudioInit");
            this.b.d();
            this.a.g();
        }
    }
}
