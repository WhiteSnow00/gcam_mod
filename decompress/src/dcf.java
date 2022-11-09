import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dcf implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    
    public dcf(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final dce a() {
        final dkc dkc = (dkc)this.a.get();
        return new dce((brk)this.b.get(), (kjm)this.c.get(), ((krp)this.d).a(), (kse)this.e.get(), ckx.f(), ((dch)this.f).a(), (ScheduledExecutorService)this.g.get(), (dcj)this.h.get());
    }
}
