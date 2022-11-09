import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epl implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public epl(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final epk a() {
        return new epk(((efz)this.a).b(), (kjm)this.b.get(), ((ejq)this.c).a(), (bqm)this.d.get(), (Executor)this.e.get());
    }
}
