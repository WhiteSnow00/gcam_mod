import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class odg extends oeh implements Runnable
{
    oey a;
    Object b;
    
    public odg(final oey a, final Object b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static oey h(final oey oey, final nir nir, final Executor executor) {
        nir.getClass();
        final odf odf = new odf(oey, nir);
        oey.d(odf, ofi.f(executor, odf));
        return odf;
    }
    
    public static oey i(final oey oey, final odp odp, final Executor executor) {
        executor.getClass();
        final ode ode = new ode(oey, odp);
        oey.d(ode, ofi.f(executor, ode));
        return ode;
    }
    
    @Override
    protected final String bp() {
        final oey a = this.a;
        final Object b = this.b;
        final String bp = super.bp();
        String string;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
            sb.append("inputFuture=[");
            sb.append(value);
            sb.append("], ");
            string = sb.toString();
        }
        else {
            string = "";
        }
        if (b != null) {
            final String value2 = String.valueOf(b);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 11 + String.valueOf(value2).length());
            sb2.append(string);
            sb2.append("function=[");
            sb2.append(value2);
            sb2.append("]");
            return sb2.toString();
        }
        if (bp != null) {
            final String value3 = String.valueOf(string);
            String concat;
            if (bp.length() != 0) {
                concat = value3.concat(bp);
            }
            else {
                concat = new String(value3);
            }
            return concat;
        }
        return null;
    }
    
    @Override
    protected final void c() {
        this.n(this.a);
        this.a = null;
        this.b = null;
    }
    
    public abstract Object f(final Object p0, final Object p1);
    
    public abstract void g(final Object p0);
    
    @Override
    public final void run() {
        final oey a = this.a;
        final Object b = this.b;
        final boolean cancelled = this.isCancelled();
        boolean b2 = true;
        final boolean b3 = a == null;
        if (b != null) {
            b2 = false;
        }
        if (cancelled | b3 | b2) {
            return;
        }
        this.a = null;
        if (a.isCancelled()) {
            this.e(a);
            return;
        }
        try {
            final Object u = ofi.u(a);
            try {
                final Object f = this.f(b, u);
                this.b = null;
                this.g(f);
            }
            finally {
                try {
                    final Throwable t;
                    this.a(t);
                }
                finally {
                    this.b = null;
                }
            }
        }
        catch (final Error error) {
            this.a(error);
        }
        catch (final RuntimeException ex) {
            this.a(ex);
        }
        catch (final ExecutionException ex2) {
            this.a(ex2.getCause());
        }
        catch (final CancellationException ex3) {
            this.cancel(false);
        }
    }
}
