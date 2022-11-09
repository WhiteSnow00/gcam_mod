import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class odw extends odj
{
    private odv c;
    
    public odw(final nnj nnj, final boolean b, final Executor executor, final Callable callable) {
        super(nnj, b, false);
        this.c = new odu(this, callable, executor);
        this.r();
    }
    
    public odw(final nnj nnj, final boolean b, final Executor executor, final odo odo) {
        super(nnj, b, false);
        this.c = new odt(this, odo, executor);
        this.r();
    }
    
    @Override
    public final void g(final int n, final Object o) {
    }
    
    @Override
    protected final void m() {
        final odv c = this.c;
        if (c != null) {
            c.h();
        }
    }
    
    @Override
    public final void q() {
        final odv c = this.c;
        if (c != null) {
            c.f();
        }
    }
    
    @Override
    public final void s(final int n) {
        super.s(n);
        if (n == 1) {
            this.c = null;
        }
    }
}
