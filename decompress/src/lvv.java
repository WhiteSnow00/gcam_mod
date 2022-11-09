import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class lvv implements Runnable
{
    protected final lxh a;
    protected final oey b;
    protected final lvs c;
    protected final lvs d;
    protected final Executor e;
    protected final lza f;
    
    public lvv(final oey b, final lvs c, final lvs d, final Executor e, final lza f, final byte[] array, final byte[] array2) {
        this.a = lxh.i();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private final void b(final Throwable t) {
        final lwi a = lwi.a(t);
        if (this.d != null) {
            try {
                this.e.execute(new lvu(this, a));
                return;
            }
            finally {
                this.a(t);
                return;
            }
        }
        this.a.l(a);
    }
    
    protected final void a(final Throwable t) {
        this.a.l(lwi.a(t));
    }
    
    @Override
    public final void run() {
        try {
            final Object c = okn.C(this.b);
            if (c == null) {
                this.a(new IllegalStateException("Result value is null"));
                return;
            }
            try {
                this.e.execute(new lvt(this, c));
            }
            finally {
                final Throwable t;
                this.a(t);
            }
        }
        catch (final ExecutionException ex) {
            this.b(ex.getCause());
        }
        finally {
            final Throwable t2;
            this.b(t2);
        }
    }
    
    @Override
    public final String toString() {
        return this.c.toString();
    }
}
