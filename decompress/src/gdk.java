import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdk implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public gdk(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static gdk a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new gdk(pii, pii2, pii3, pii4);
    }
    
    public final gdi b() {
        return new gdi(((ous)this.a).a(), (ofn)this.b.get(), (Executor)this.c.get(), (kse)this.d.get());
    }
}
