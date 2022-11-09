import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jhh implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public jhh(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final jhg a() {
        return new jhg((Executor)this.a.get(), ((krp)this.b).a(), ((jhj)this.c).a(), ((jhi)this.d).a(), ((jhk)this.e).a());
    }
}
