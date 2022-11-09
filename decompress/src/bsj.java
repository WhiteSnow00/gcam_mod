import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsj
{
    public final Executor a;
    public kse b;
    public krr c;
    public kkg d;
    private final ofn e;
    private oey f;
    
    private bsj(final Executor a) {
        this.a = a;
        final ofn f = ofn.f();
        this.e = f;
        this.f = f;
    }
    
    public static bsj a(final Executor executor) {
        return new bsj(executor);
    }
    
    public final hub b(final hub hub, final String s) {
        final Runnable c = this.b.c(s, hub);
        c.getClass();
        return new dex(c, 1);
    }
    
    public final oey c() {
        final boolean done = this.e.isDone();
        boolean b = false;
        if (!done && !this.e.isCancelled()) {
            b = true;
        }
        njo.o(b);
        if (this.d != null || this.c != null) {
            ofi.w(this.f, new bsi(this), odx.a);
        }
        this.e.o(true);
        return this.f;
    }
    
    public final void d(final pii pii, final String s) {
        final krr c = this.c;
        if (c != null) {
            String concat;
            if (s.length() != 0) {
                concat = "Futures.transform: ".concat(s);
            }
            else {
                concat = new String("Futures.transform: ");
            }
            c.b(concat);
        }
        kse b;
        if ((b = this.b) == null) {
            b = new ksb();
        }
        final oey i = odg.i(this.f, new bsg(b, s, pii), this.a);
        this.f = i;
        final krr c2 = this.c;
        if (c2 != null) {
            dap.c(c2, i, s.concat(" complete."), s.concat(" failed!"));
        }
    }
    
    public final void e(final pii pii, final String s) {
        ofi.w(this.f, new bsh(this, s, pii), this.a);
    }
}
