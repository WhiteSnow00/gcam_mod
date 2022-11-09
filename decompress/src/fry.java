import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fry implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public fry(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static fry b(final pii pii, final pii pii2, final pii pii3) {
        return new fry(pii, pii2, pii3);
    }
    
    public final fqo a() {
        return new fqo((fut)this.a.get(), (Handler)this.b.get(), (gry)this.c.get());
    }
}
