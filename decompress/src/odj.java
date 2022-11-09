import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.Set;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class odj extends odn
{
    private static final Logger c;
    public nnj a;
    private final boolean f;
    private final boolean g;
    
    static {
        c = Logger.getLogger(odj.class.getName());
    }
    
    public odj(final nnj a, final boolean f, final boolean g) {
        super(a.size());
        a.getClass();
        this.a = a;
        this.f = f;
        this.g = g;
    }
    
    private final void t(final Throwable t) {
        t.getClass();
        if (this.f && !this.a(t)) {
            Set set = super.seenExceptions;
            if (set == null) {
                final Set o = nrr.o();
                this.f(o);
                odn.b.b(this, o);
                set = super.seenExceptions;
                set.getClass();
            }
            if (v(set, t)) {
                u(t);
                return;
            }
        }
        if (t instanceof Error) {
            u(t);
        }
    }
    
    private static void u(final Throwable t) {
        String s;
        if (!(t instanceof Error)) {
            s = "Got more than one input Future failure. Logging failures after the first";
        }
        else {
            s = "Input Future failed with Error";
        }
        odj.c.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", s, t);
    }
    
    private static boolean v(final Set set, Throwable cause) {
        while (cause != null) {
            if (!set.add(cause)) {
                return false;
            }
            cause = cause.getCause();
        }
        return true;
    }
    
    @Override
    protected final String bp() {
        final nnj a = this.a;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8);
            sb.append("futures=");
            sb.append(value);
            return sb.toString();
        }
        return super.bp();
    }
    
    @Override
    protected final void c() {
        final nnj a = this.a;
        int n = 1;
        this.s(1);
        final boolean cancelled = this.isCancelled();
        if (a == null) {
            n = 0;
        }
        if ((n & (cancelled ? 1 : 0)) != 0x0) {
            final boolean p = this.p();
            final nrv bn = a.bN();
            while (bn.hasNext()) {
                ((Future)bn.next()).cancel(p);
            }
        }
    }
    
    @Override
    public final void f(final Set set) {
        set.getClass();
        if (!this.isCancelled()) {
            final Throwable k = this.k();
            k.getClass();
            v(set, k);
        }
    }
    
    public abstract void g(final int p0, final Object p1);
    
    public final void h(final int n, final Future future) {
        try {
            this.g(n, ofi.u(future));
        }
        catch (final ExecutionException ex) {
            this.t(ex.getCause());
        }
        finally {
            final Throwable t;
            this.t(t);
        }
    }
    
    public final void i(final nnj nnj) {
        final int a = odn.b.a(this);
        int n = 0;
        njo.p(a >= 0, "Less than 0 remaining futures");
        if (a == 0) {
            if (nnj != null) {
                final nrv bn = nnj.bN();
                while (bn.hasNext()) {
                    final Future future = bn.next();
                    if (!future.isCancelled()) {
                        this.h(n, future);
                    }
                    ++n;
                }
            }
            super.seenExceptions = null;
            this.q();
            this.s(2);
        }
    }
    
    public abstract void q();
    
    final void r() {
        final nnj a = this.a;
        a.getClass();
        if (a.isEmpty()) {
            this.q();
            return;
        }
        if (this.f) {
            final nrv bn = this.a.bN();
            int n = 0;
            while (bn.hasNext()) {
                final oey oey = bn.next();
                oey.d(new odh(this, oey, n), odx.a);
                ++n;
            }
        }
        else {
            nnj a2;
            if (this.g) {
                a2 = this.a;
            }
            else {
                a2 = null;
            }
            final odi odi = new odi(this, a2);
            final nrv bn2 = this.a.bN();
            while (bn2.hasNext()) {
                ((oey)bn2.next()).d(odi, odx.a);
            }
        }
    }
    
    public void s(final int n) {
        this.a = null;
    }
}
