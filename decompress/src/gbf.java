import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbf implements gbl, krc
{
    public final Executor a;
    public final gyu b;
    public final jdi c;
    public final hdd d;
    public final kse e;
    private final hdz f;
    private final klv g;
    private final AtomicBoolean h;
    private final gae i;
    
    public gbf(final Executor a, final jdi c, final hdd d, final hdz f, final kse e) {
        this.h = new AtomicBoolean(false);
        this.a = a;
        this.g = new kkz(2);
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
        this.b = new gys();
        this.i = new gae(2);
    }
    
    public final oey b(final gyb gyb) {
        if (gyb.a.a() != 35) {
            gyb.a.close();
            return ofi.m(new kuw("Only YUV_420_888 images are supported"));
        }
        final hdz f = this.f;
        final lfu g = gyb.g;
        g.getClass();
        if (f.c(g)) {
            hdz.e(gyb.a, gyb.b);
        }
        return this.i.a(new gbd(this, gyb));
    }
    
    @Override
    public final void close() {
        if (this.h.compareAndSet(false, true)) {
            this.i.close();
            this.g.aR(0);
        }
    }
}
