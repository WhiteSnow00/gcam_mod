import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dch implements oun
{
    private final pii a;
    
    public dch(final pii a) {
        this.a = a;
    }
    
    public final Duration a() {
        final Duration ofSeconds = Duration.ofSeconds((long)(int)((cxl)this.a.get()).a(cxr.o).e(30));
        pqf.k(ofSeconds);
        return ofSeconds;
    }
}
