import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gla implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    
    public gla(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final gkz a() {
        return new gkz(((efu)this.a).a(), (lit)this.b.get(), ((efx)this.c).a(), ((dak)this.d).a(), ((ejp)this.e).b(), (Executor)this.f.get(), (kse)this.g.get());
    }
}
