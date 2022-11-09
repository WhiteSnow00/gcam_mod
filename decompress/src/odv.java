import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class odv extends oex
{
    private final Executor a;
    final /* synthetic */ odw b;
    
    public odv(final odw b, final Executor a) {
        this.b = b;
        a.getClass();
        this.a = a;
    }
    
    public abstract void c(final Object p0);
    
    @Override
    public final void d(final Throwable t) {
        odw.t(this.b);
        if (t instanceof ExecutionException) {
            this.b.a(t.getCause());
            return;
        }
        if (t instanceof CancellationException) {
            this.b.cancel(false);
            return;
        }
        this.b.a(t);
    }
    
    @Override
    public final void e(final Object o) {
        odw.t(this.b);
        this.c(o);
    }
    
    final void f() {
        try {
            this.a.execute(this);
        }
        catch (final RejectedExecutionException ex) {
            this.b.a(ex);
        }
    }
    
    @Override
    public final boolean g() {
        return this.b.isDone();
    }
}
