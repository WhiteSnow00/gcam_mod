import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oco extends oeh implements Runnable
{
    oey a;
    Class b;
    Object c;
    
    public oco(final oey a, final Class b, final Object c) {
        a.getClass();
        this.a = a;
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public static oey h(final oey oey, final Class clazz, final nir nir, final Executor executor) {
        final ocn ocn = new ocn(oey, clazz, nir);
        oey.d(ocn, ofi.f(executor, ocn));
        return ocn;
    }
    
    public static oey i(final oey oey, final Class clazz, final odp odp, final Executor executor) {
        final ocm ocm = new ocm(oey, clazz, odp);
        oey.d(ocm, ofi.f(executor, ocm));
        return ocm;
    }
    
    @Override
    protected final String bp() {
        final oey a = this.a;
        final Class b = this.b;
        final Object c = this.c;
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
        if (b != null && c != null) {
            final String value2 = String.valueOf(b);
            final String value3 = String.valueOf(c);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 29 + String.valueOf(value2).length() + String.valueOf(value3).length());
            sb2.append(string);
            sb2.append("exceptionType=[");
            sb2.append(value2);
            sb2.append("], fallback=[");
            sb2.append(value3);
            sb2.append("]");
            return sb2.toString();
        }
        if (bp != null) {
            final String value4 = String.valueOf(string);
            String concat;
            if (bp.length() != 0) {
                concat = value4.concat(bp);
            }
            else {
                concat = new String(value4);
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
        this.c = null;
    }
    
    public abstract Object f(final Object p0, final Throwable p1);
    
    public abstract void g(final Object p0);
    
    @Override
    public final void run() {
        final oey a = this.a;
        final Class b = this.b;
        final Object c = this.c;
        boolean b2 = true;
        final boolean b3 = a == null;
        final boolean b4 = b == null;
        if (c != null) {
            b2 = false;
        }
        if ((b2 | (b3 | b4)) || this.isCancelled()) {
            return;
        }
        this.a = null;
        Object u = null;
        try {
            Throwable k;
            if (a instanceof ofx) {
                k = ((ofx)a).k();
            }
            else {
                k = null;
            }
            if (k == null) {
                u = ofi.u(a);
            }
            else {
                u = null;
            }
        }
        catch (final ExecutionException u) {
            if (((Throwable)u).getCause() == null) {
                final String value = String.valueOf(a.getClass());
                final String value2 = String.valueOf(((ExecutionException)u).getClass());
                u = new StringBuilder(String.valueOf(value).length() + 35 + String.valueOf(value2).length());
                ((StringBuilder)u).append("Future type ");
                ((StringBuilder)u).append(value);
                ((StringBuilder)u).append(" threw ");
                ((StringBuilder)u).append(value2);
                ((StringBuilder)u).append(" without a cause");
                final NullPointerException ex = new NullPointerException(((StringBuilder)u).toString());
                goto Label_0124;
            }
            goto Label_0124;
        }
        final Throwable t;
        if (t == null) {
            this.o(u);
            return;
        }
        if (b.isInstance(t)) {
            try {
                final Object f = this.f(c, t);
                this.b = null;
                this.c = null;
                this.g(f);
                return;
            }
            finally {
                try {
                    final Throwable t2;
                    this.a(t2);
                    return;
                }
                finally {
                    this.b = null;
                    this.c = null;
                }
            }
        }
        this.e(a);
    }
}
