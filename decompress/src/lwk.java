import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lwk implements lwh
{
    private final lwh a;
    
    private lwk(final lwh a) {
        this.a = a;
    }
    
    public static lwk i(final lwh lwh) {
        return new lwk(lwh);
    }
    
    @Override
    public final lwh a(final Executor executor, final lva lva) {
        return this.a.a(executor, lva);
    }
    
    @Override
    public final lwh b(final Executor executor, final lwl lwl) {
        return this.a.b(executor, lwl);
    }
    
    @Override
    public final lwh c(final Executor executor, final lva lva, final lva lva2) {
        return this.a.c(executor, lva, lva2);
    }
    
    @Override
    public final oey d() {
        return this.a.d();
    }
    
    @Override
    public final boolean f() {
        return this.a.f();
    }
    
    @Override
    public final void h(final lvm lvm) {
        this.a.h(lvm);
    }
    
    public final lwk j(final Executor executor, final mdg mdg) {
        return new lwk(this.a.g(executor, mdg));
    }
    
    @Override
    public final String toString() {
        return this.getClass().getSimpleName();
    }
}
