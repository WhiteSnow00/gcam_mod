import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjk implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    
    public cjk(final pii a, final pii b, final pii c, final pii d, final pii e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final cjj a() {
        return new cjj((hhu)this.a.get(), (cek)this.b.get(), ((cgp)this.c).a(), (Executor)this.d.get(), (hkc)this.e.get());
    }
}
