import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfm implements hfk
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final pii g;
    private final pii h;
    private final pii i;
    
    public hfm(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
    }
    
    @Override
    public final hfl a(final hio hio, final String s, final btl btl, final hie hie, final gxa gxa, final niz niz) {
        final Executor executor = (Executor)this.a.get();
        executor.getClass();
        final Object value = this.b.get();
        final hfu a = haj.a();
        final Object value2 = this.c.get();
        final dck dck = (dck)this.d.get();
        dck.getClass();
        final hhu hhu = (hhu)this.e.get();
        hhu.getClass();
        final jdi jdi = (jdi)this.f.get();
        jdi.getClass();
        this.g.get().getClass();
        this.h.get().getClass();
        this.i.get().getClass();
        hio.getClass();
        return new hfl(executor, (hha)value, a, (huz)value2, dck, hhu, jdi, hio, s, btl, hie, gxa, niz);
    }
}
