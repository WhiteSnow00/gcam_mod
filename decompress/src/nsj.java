import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.io.PrintStream;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nsj implements nsu, ntk
{
    private static final String a;
    public final long b;
    public nsi c;
    private final Level d;
    private nsm e;
    private nul f;
    private Object[] g;
    
    static {
        a = new String();
    }
    
    protected nsj(final Level d) {
        final long a = nuj.a();
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        oce.g(d, "level");
        this.d = d;
        this.b = a;
    }
    
    private final void K(String s, final Object... g) {
        this.g = g;
        for (int i = 0; i < g.length; ++i) {
            final Object o = g[i];
            if (o instanceof nse) {
                g[i] = ((nse)o).a();
            }
        }
        if (s != nsj.a) {
            this.f = new nul(this.a(), s);
        }
        s = (String)this.c();
        try {
            ((nry)s).a.c(this);
        }
        catch (final RuntimeException ex) {
            try {
                ((nry)s).a.b(ex, this);
            }
            catch (final RuntimeException ex2) {
                final PrintStream err = System.err;
                s = String.valueOf(ex2.getMessage());
                if (s.length() != 0) {
                    s = "logging error: ".concat(s);
                }
                else {
                    s = new String("logging error: ");
                }
                err.println(s);
                ex2.printStackTrace(System.err);
            }
            catch (final ntm ntm) {
                throw ntm;
            }
        }
    }
    
    private final boolean L() {
        if (this.e == null) {
            this.e = nuj.f().a(nsj.class, 1);
        }
        nsm nsm;
        if (this.e != nsm.a) {
            nsm e = this.e;
            final nsi c = this.c;
            nsm = e;
            if (c != null) {
                nsm = e;
                if (c.b > 0) {
                    oce.g(e, "logSiteKey");
                    final int b = c.b;
                    int n = 0;
                    while (true) {
                        nsm = e;
                        if (n >= b) {
                            break;
                        }
                        nsn b2 = e;
                        if (nsh.d.equals(c.c(n))) {
                            final Object e2 = c.e(n);
                            if (e2 instanceof nsv) {
                                b2 = ((nsv)e2).b();
                            }
                            else {
                                b2 = new nsy(e, e2);
                            }
                        }
                        ++n;
                        e = (nsm)b2;
                    }
                }
            }
        }
        else {
            nsm = null;
        }
        if (!this.b(nsm)) {
            return false;
        }
        final nvk j = nuj.j();
        if (!j.c.isEmpty()) {
            this.n(nsh.f, j);
        }
        return true;
    }
    
    @Override
    public final void A(final String s, final Object o, final Object o2, final Object o3, final Object o4, final Object o5) {
        if (this.L()) {
            this.K(s, o, o2, o3, o4, o5);
        }
    }
    
    @Override
    public final boolean B() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(nsh.e));
    }
    
    @Override
    public final Object[] C() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }
    
    @Override
    public final void D(final float n, final Object o) {
        if (this.L()) {
            this.K("Focal length needed = %g / available: %s", n, o);
        }
    }
    
    @Override
    public final nsu E(final int n) {
        final nsl e = new nsl(n);
        if (this.e == null) {
            this.e = e;
        }
        return this.d();
    }
    
    @Override
    public final nsu F(final TimeUnit timeUnit) {
        if (this.B()) {
            return this.d();
        }
        this.n(nsh.c, nss.a(timeUnit));
        return this.d();
    }
    
    @Override
    public final void G(final float n, final float n2) {
        if (this.L()) {
            this.K("Avoiding b/115930193, modeListWidth=%g myWidth=%g", n, n2);
        }
    }
    
    @Override
    public final void H(final int n, final long n2) {
        if (this.L()) {
            this.K("Not restoring video id %d since it is too small (size: %d)", n, n2);
        }
    }
    
    @Override
    public final void I(final Object o, final boolean b) {
        if (this.L()) {
            this.K("Placeholder drawable removed: key=%s evicted=%b", o, b);
        }
    }
    
    @Override
    public final void J(final long n, final Object o) {
        if (this.L()) {
            this.K("Trying to correct timestamp to %d but it was already set as %d", n, o);
        }
    }
    
    protected abstract nvt a();
    
    protected boolean b(final nsn nsn) {
        throw null;
    }
    
    protected abstract nry c();
    
    protected abstract nsu d();
    
    @Override
    public final long e() {
        return this.b;
    }
    
    @Override
    public final nsm f() {
        final nsm e = this.e;
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }
    
    @Override
    public final nsu g(final nsx nsx, final Object o) {
        oce.g(nsx, "metadata key");
        if (o != null) {
            this.n(nsx, o);
        }
        return this.d();
    }
    
    @Override
    public final nsu h(final Throwable t) {
        return this.g(nsh.a, t);
    }
    
    @Override
    public final nsu i(final nsz nsz) {
        oce.g(nsz, "stack size");
        if (nsz != nsz.e) {
            this.n(nsh.g, nsz);
        }
        return this.d();
    }
    
    @Override
    public final ntp j() {
        final nsi c = this.c;
        if (c != null) {
            return c;
        }
        return nto.a;
    }
    
    @Override
    public final nul k() {
        return this.f;
    }
    
    @Override
    public final Object l() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }
    
    @Override
    public final Level m() {
        return this.d;
    }
    
    protected final void n(final nsx nsx, final Object o) {
        if (this.c == null) {
            this.c = new nsi();
        }
        final nsi c = this.c;
        if (!nsx.b) {
            final int a = c.a(nsx);
            if (a != -1) {
                final Object[] a2 = c.a;
                oce.g(o, "metadata value");
                a2[a + a + 1] = o;
                return;
            }
        }
        final int n = c.b + 1;
        final Object[] a3 = c.a;
        final int length = a3.length;
        if (n + n > length) {
            c.a = Arrays.copyOf(a3, length + length);
        }
        final Object[] a4 = c.a;
        final int b = c.b;
        oce.g(nsx, "metadata key");
        a4[b + b] = nsx;
        final Object[] a5 = c.a;
        final int b2 = c.b;
        oce.g(o, "metadata value");
        a5[b2 + b2 + 1] = o;
        ++c.b;
    }
    
    @Override
    public final void o(final String s) {
        if (this.L()) {
            this.K(nsj.a, s);
        }
    }
    
    @Override
    public final void p(final String s, final int n) {
        if (this.L()) {
            this.K(s, n);
        }
    }
    
    @Override
    public final void q(final String s, final long n) {
        if (this.L()) {
            this.K(s, n);
        }
    }
    
    @Override
    public final void r(final String s, final Object o) {
        if (this.L()) {
            this.K(s, o);
        }
    }
    
    @Override
    public final void s(final String s, final int n, final int n2) {
        if (this.L()) {
            this.K(s, n, n2);
        }
    }
    
    @Override
    public final void t(final String s, final int n, final Object o) {
        if (this.L()) {
            this.K(s, n, o);
        }
    }
    
    @Override
    public final void u(final String s, final long n, final long n2) {
        if (this.L()) {
            this.K(s, n, n2);
        }
    }
    
    @Override
    public final void v(final String s, final Object o, final int n) {
        if (this.L()) {
            this.K(s, o, n);
        }
    }
    
    @Override
    public final void w(final String s, final Object o, final long n) {
        if (this.L()) {
            this.K(s, o, n);
        }
    }
    
    @Override
    public final void x(final String s, final Object o, final Object o2) {
        if (this.L()) {
            this.K(s, o, o2);
        }
    }
    
    @Override
    public final void y(final String s, final Object o, final Object o2, final Object o3) {
        if (this.L()) {
            this.K(s, o, o2, o3);
        }
    }
    
    @Override
    public final void z(final String s, final Object o, final Object o2, final Object o3, final Object o4) {
        if (this.L()) {
            this.K(s, o, o2, o3, o4);
        }
    }
}
