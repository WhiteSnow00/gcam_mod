import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvw implements lwh
{
    protected final oey a;
    
    public lvw(final oey a) {
        this.a = a;
    }
    
    @Override
    public final lwh a(final Executor executor, final lva lva) {
        executor.getClass();
        lva.getClass();
        final oey a = this.a;
        final lvv lvv = new lvv(a, new lvp(lva), null, executor, lxi.a, null, null);
        a.d(lvv, odx.a);
        return lvv.a;
    }
    
    @Override
    public final lwh b(final Executor executor, final lwl lwl) {
        lwl.getClass();
        final oey a = this.a;
        final lvv lvv = new lvv(a, new lvr(lwl), null, executor, lxi.a, null, null);
        a.d(lvv, odx.a);
        return lvv.a;
    }
    
    @Override
    public final lwh c(final Executor executor, final lva lva, final lva lva2) {
        executor.getClass();
        lva.getClass();
        lva2.getClass();
        final oey a = this.a;
        final lvv lvv = new lvv(a, new lvp(lva), new lvp(lva2), executor, lxi.a, null, null);
        a.d(lvv, odx.a);
        return lvv.a;
    }
    
    @Override
    public final oey d() {
        return this.a;
    }
    
    @Override
    public final Object e() {
        try {
            final Object value = this.a.get();
            if (value != null) {
                return value;
            }
            throw lwi.a(new IllegalStateException("Result value was null"));
        }
        catch (final ExecutionException ex) {
            throw lwi.a(ex.getCause());
        }
    }
    
    @Override
    public final boolean f() {
        return this.a.isDone();
    }
    
    @Override
    public final lwh g(final Executor executor, final mdg mdg) {
        final lwb lwb = new lwb(mdg, 1);
        final lwc lwc = new lwc(mdg, 1);
        executor.getClass();
        final oey a = this.a;
        final lvv lvv = new lvv(a, new lvr(lwb), new lvr(lwc), executor, lxi.a, null, null);
        a.d(lvv, odx.a);
        return lvv.a;
    }
    
    @Override
    public final void h(final lvm lvm) {
        final oey a = this.a;
        a.d(new lvo(a), odx.a);
    }
}
