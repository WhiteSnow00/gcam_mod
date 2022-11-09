import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsr implements fvp
{
    private static final AtomicInteger e;
    public final kjk a;
    public final krr b;
    public final kkp c;
    public oey d;
    private final kwd f;
    private final gsd g;
    private final Executor h;
    private final AtomicBoolean i;
    private final bjj j;
    private final del k;
    private final gsy l;
    private final gdi m;
    
    static {
        e = new AtomicInteger(0);
    }
    
    public gsr(final kjk a, final kwd f, final krr krr, final gep gep, final kjm kjm, final fwk fwk, final klj klj, final klj klj2, final klj klj3, final klj klj4, final oey oey, final Executor h, final gdi m, final kkp c, final bjj j, final ggu ggu, final del k) {
        this.i = new AtomicBoolean(false);
        this.a = a;
        this.f = f;
        final int andIncrement = gsr.e.getAndIncrement();
        final StringBuilder sb = new StringBuilder(24);
        sb.append("PckOneCamera-");
        sb.append(andIncrement);
        this.b = krr.a(sb.toString());
        this.g = new gsd(gep, kjm);
        this.h = h;
        this.m = m;
        this.c = c;
        this.j = j;
        this.k = k;
        this.l = new gsy(gep, fwk.a, klj, klj2, klj3, klj4, oey, ggu);
    }
    
    @Override
    public final bkx a(final bjz bjz) {
        return this.j.a(bjz);
    }
    
    @Override
    public final krc c(final kvp kvp) {
        return this.k.c(kvp);
    }
    
    @Override
    public final void close() {
        if (this.i.compareAndSet(false, true)) {
            this.f.close();
            this.h.execute(new gsq(this));
        }
    }
    
    @Override
    public final niz d() {
        return niz.i(this.f);
    }
    
    @Override
    public final oey e() {
        this.b.b("start");
        this.f.e();
        final oey o = ofi.o(this.m.a());
        synchronized (this) {
            dap.c(this.b, o, "OneCamera started.", "OneCamera failed to start!");
            return this.d = o;
        }
    }
    
    @Override
    public final oey f(final fvn fvn, final hhy hhy) {
        final gsd g = this.g;
        final gep a = g.a;
        final kjm b = g.b;
        return a.c(new gen(fvn, hhy, new gei(fvn, b, hhy), new ger(hhy, b)));
    }
    
    @Override
    public final boolean g() {
        return this.i.get();
    }
    
    @Override
    public final gsy h() {
        return this.l;
    }
    
    @Override
    public final kjk i() {
        return this.a;
    }
}
