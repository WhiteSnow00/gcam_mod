import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

final class oep implements Runnable
{
    final Future a;
    final oen b;
    
    public oep(final Future a, final oen b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        Object o = this.a;
        if (o instanceof ofx) {
            o = ((ofx)o).k();
            if (o != null) {
                this.b.a((Throwable)o);
                return;
            }
        }
        try {
            o = ofi.u(this.a);
            this.b.b(o);
        }
        catch (final Error o) {
            goto Label_0062;
        }
        catch (final RuntimeException ex) {}
        catch (final ExecutionException ex2) {
            this.b.a(ex2.getCause());
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.a(this.b);
        return c.toString();
    }
}
