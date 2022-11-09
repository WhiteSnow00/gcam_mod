import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfl implements gep
{
    public final oey a;
    public final krr b;
    public final klr c;
    public final kkz d;
    public final AtomicInteger e;
    private final fxz f;
    private final blv g;
    
    public gfl(final fxz f, final oey a, final krq krq, final blv g) {
        this.d = new kkz(false);
        this.e = new AtomicInteger(0);
        this.f = f;
        this.b = krq.a("PictureTakerImpl");
        this.g = g;
        this.a = a;
        this.c = new klr(new gfh(this, f));
        a.d(new gfi(this), odx.a);
    }
    
    @Override
    public final klj a() {
        return klb.c(this.c);
    }
    
    @Override
    public final klj b() {
        return this.d;
    }
    
    @Override
    public final oey c(final gen gen) {
        final boolean a = this.f.a();
        boolean b = false;
        if (a) {
            this.b.d("Take picture was invoked, but the executor is shutting down!");
            gen.c.f();
            return ofi.n(false);
        }
        final ofn f = ofn.f();
        final kkz d = this.d;
        if (this.e.incrementAndGet() > 0) {
            b = true;
        }
        d.aR(b);
        this.c.c();
        this.f.b(new gfk(this, new gfj(this, f), gen, this.g));
        return f;
    }
}
