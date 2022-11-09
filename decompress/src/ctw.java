import j$.util.function.IntFunction;
import j$.util.function.Function;
import j$.util.DesugarArrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ctw implements ctr
{
    public final csn a;
    public final CameraFatalErrorTrackerDatabase b;
    private final Executor c;
    
    public ctw(final csn a, final CameraFatalErrorTrackerDatabase b, final Executor c, final cxl cxl) {
        this.a = a;
        this.b = b;
        this.c = c;
        final cxo a2 = cxr.a;
        cxl.c();
    }
    
    public static ctq l(final lfu lfu) {
        ctq ctq;
        if (lfu == lfu.a) {
            ctq = ctq.e;
        }
        else {
            ctq = ctq.f;
        }
        return ctq;
    }
    
    private static ctq m(final lfu lfu) {
        ctq ctq;
        if (lfu == lfu.a) {
            ctq = ctq.c;
        }
        else {
            ctq = ctq.d;
        }
        return ctq;
    }
    
    private final oey n(final ctq ctq) {
        return ofi.q(new ctu(this, ctq), this.c);
    }
    
    private final void o(final ctq ctq) {
        this.c.execute(new cts(this, ctq));
    }
    
    private final void p(final ctq... array) {
        this.c.execute(new ctt(this, array));
    }
    
    @Override
    public final oey a(final lfu lfu) {
        return this.n(l(lfu));
    }
    
    @Override
    public final oey b(final lfu lfu) {
        return this.n(m(lfu));
    }
    
    @Override
    public final oey c() {
        return this.n(ctq.a);
    }
    
    @Override
    public final oey d() {
        return this.n(ctq.b);
    }
    
    @Override
    public final void e(final lfu... array) {
        this.p((ctq[])DesugarArrays.stream((Object[])array).map((Function)cdd.f).toArray((IntFunction)cvf.b));
    }
    
    @Override
    public final void f(final lfu lfu) {
        this.o(l(lfu));
    }
    
    @Override
    public final void g(final lfu lfu) {
        this.p(m(lfu), ctq.b);
    }
    
    @Override
    public final void h(final lfu lfu) {
        this.o(m(lfu));
    }
    
    @Override
    public final void i() {
        this.p(ctq.a);
    }
    
    @Override
    public final void j() {
        this.o(ctq.a);
    }
    
    @Override
    public final void k() {
        this.o(ctq.b);
    }
}
