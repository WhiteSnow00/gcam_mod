import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzo implements oun
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
    private final pii j;
    private final pii k;
    
    public dzo(final pii a, final pii b, final pii c, final pii d, final pii e, final pii f, final pii g, final pii h, final pii i, final pii j, final pii k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final dzn a() {
        final Executor executor = (Executor)this.a.get();
        final cxl cxl = (cxl)this.b.get();
        ((gnc)this.c).a();
        return new dzn(executor, cxl, (klv)this.d.get(), (hzf)this.e.get(), (hzf)this.f.get(), (hkd)this.g.get(), (iru)this.h.get(), (crg)this.i.get(), ((ejp)this.j).b(), (klv)this.k.get());
    }
}
