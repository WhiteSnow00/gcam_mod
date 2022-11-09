import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public class lyv implements lyt
{
    public final lyp a;
    private final lwh b;
    
    protected lyv(final lyp a, final lwh b) {
        this.a = a;
        this.b = b;
        if (a.g() && lwt.e(b) == null) {
            Log.e("GLContextObject", "Creating non-ready GL object on GL thread. This will likely cause a deadlock.");
        }
        lya.c();
    }
    
    public static lwh h(final lyp lyp, final Callable callable) {
        if (lyp.g()) {
            try {
                return lwt.b(callable.call());
            }
            catch (final Exception ex) {
                return new lvw(ofi.m(lwi.a(ex)));
            }
        }
        return lwt.a(lyp, callable);
    }
    
    @Override
    public final lwk a() {
        lya.d();
        return lwk.i(this.i(ftm.d, new lvb()));
    }
    
    @Override
    public final void close() {
        lwt.f(this.a());
    }
    
    @Override
    public final mae g() {
        if (this.a.g()) {
            return this.j();
        }
        throw new IllegalStateException("raw should only be called from the GLContext thread");
    }
    
    public final lwh i(final lzq lzq, final lva lva) {
        return h(this.a, new lyu(this, lva, lzq));
    }
    
    public final mae j() {
        if (!this.a.g()) {
            return (mae)lwt.f(this.b);
        }
        final mae mae = (mae)lwt.e(this.b);
        if (mae != null) {
            return mae;
        }
        throw new RuntimeException("Waiting for incomplete GL object while on GL thread. This deadlocks the process.");
    }
}
