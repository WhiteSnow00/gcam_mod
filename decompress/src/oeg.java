import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oeg
{
    public oef a;
    private final AtomicReference b;
    
    private oeg() {
        this.b = new AtomicReference((V)oev.a);
        this.a = new oef();
    }
    
    public static oeg a() {
        return new oeg();
    }
    
    public final oey b(final odo odo, final Executor executor) {
        executor.getClass();
        final oee oee = new oee(executor, this);
        final oeb oeb = new oeb(oee, odo);
        final ofn f = ofn.f();
        final oey oey = this.b.getAndSet(f);
        final ofv f2 = ofv.f(oeb);
        oey.d(f2, oee);
        final oey o = ofi.o(f2);
        final oec oec = new oec(f2, f, oey, o, oee);
        o.d(oec, odx.a);
        f2.d(oec, odx.a);
        return o;
    }
}
