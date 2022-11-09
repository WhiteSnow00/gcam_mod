import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ejz implements bsk
{
    public final oey a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final oui g;
    private final kjm h;
    private final Executor i;
    private final AtomicBoolean j;
    private final kkg k;
    private final kse l;
    private final krr m;
    private final ihp n;
    private oey o;
    
    public ejz(final pii b, final pii c, final pii d, final pii e, final pii f, final oui g, final kjm h, final Executor i, final oey a, final krq krq, final kkg k, final kse l, final ihp n) {
        this.b = b;
        this.c = c;
        this.g = g;
        this.h = h;
        this.i = i;
        this.a = a;
        this.k = k;
        this.l = l;
        this.n = n;
        this.d = d;
        this.e = e;
        this.f = f;
        this.j = new AtomicBoolean(false);
        this.m = krq.a("ActivityUiStartup");
    }
    
    @Override
    public final oey aP() {
        if (this.j.getAndSet(true)) {
            return this.o;
        }
        this.l.f("ActivityUiStartup");
        final kjm h = this.h;
        final oui g = this.g;
        g.getClass();
        h.execute(new die(g, 3));
        this.n.c();
        final ejy ejy = new ejy(this);
        final bsj a = bsj.a(this.i);
        a.d = this.k;
        a.b = this.l;
        a.c = this.m;
        a.d(this.b, "ActivityStartup");
        a.e(this.d, "WiringStartup");
        a.d(this.c, "CameraActivityController");
        a.d(ejy, "Interactivity");
        a.e(this.e, "ShotStartup");
        a.e(this.f, "SmartsStartup");
        this.o = a.c();
        this.l.i();
        this.l.g();
        return this.o;
    }
}
