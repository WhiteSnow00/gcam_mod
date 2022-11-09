import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lwg implements lwh
{
    private final Object a;
    
    public lwg(final Object a) {
        this.a = a;
    }
    
    private final lwh i(final Executor executor, final lva lva) {
        final lxh i = lxh.i();
        k(executor, new lxb(this.a, lva, i, 1), i);
        return i;
    }
    
    private final lwh j(final Executor executor, final lwl lwl) {
        final lxh i = lxh.i();
        k(executor, new lwd(this.a, lwl, executor, i), i);
        return i;
    }
    
    private static void k(final Executor executor, final Runnable runnable, final lxh lxh) {
        try {
            executor.execute(runnable);
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    @Override
    public final lwh a(final Executor executor, final lva lva) {
        return this.i(executor, lva);
    }
    
    @Override
    public final lwh b(final Executor executor, final lwl lwl) {
        return this.j(executor, lwl);
    }
    
    @Override
    public final lwh c(final Executor executor, final lva lva, final lva lva2) {
        return this.i(executor, lva);
    }
    
    @Override
    public final oey d() {
        return ofi.n(this.a);
    }
    
    @Override
    public final Object e() {
        return this.a;
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final lwh g(final Executor executor, final mdg mdg) {
        final lwb lwb = new lwb(mdg);
        new lwc(mdg);
        return this.j(executor, lwb);
    }
    
    @Override
    public final void h(final lvm lvm) {
    }
}
