import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdl extends oxc
{
    final pho a;
    pdj b;
    
    public pdl(final pho a) {
        this.a = a;
    }
    
    static final void l(final pdj pdj) {
        final oxp b = pdj.b;
    }
    
    final void b(final pdj pdj) {
        ((pdi)this.a).b(pdj.get());
    }
    
    final void c(final pdj pdj) {
        synchronized (this) {
            final pdj b = this.b;
            if (b != null && b == pdj) {
                l(pdj);
                final long c = pdj.c - 1L;
                pdj.c = c;
                if (c == 0L) {
                    this.b = null;
                    this.b(pdj);
                }
            }
        }
    }
    
    @Override
    protected final void g(final oxg oxg) {
        monitorenter(this);
        try {
            pdj b;
            if ((b = this.b) == null) {
                b = new pdj(this);
                this.b = b;
            }
            final long c = b.c + 1L;
            b.c = c;
            final boolean d = b.d;
            final int n = 1;
            boolean b2;
            if (!d && c == 1L) {
                b.d = true;
                b2 = true;
            }
            else {
                b2 = false;
            }
            monitorexit(this);
            this.a.f(new pdk(oxg, this, b));
            if (b2) {
                final pho a = this.a;
                pdi pdi;
                pdh pdh;
                pdh pdh2;
                do {
                    pdi = (pdi)a;
                    pdh = pdi.b.get();
                    if (pdh != null) {
                        pdh2 = pdh;
                        if (pdh.get() != pdh.b) {
                            break;
                        }
                    }
                    pdh2 = new pdh(pdi.b);
                } while (!pdi.b.compareAndSet(pdh, pdh2));
                int n2;
                if (!pdh2.c.get() && pdh2.c.compareAndSet(false, true)) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                try {
                    b.a(pdh2);
                    if (n2 != 0) {
                        pdi.a.f(pdh2);
                    }
                }
                finally {
                    final Throwable t;
                    psn.e(t);
                    throw phi.a(t);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void k(final pdj pdj) {
        synchronized (this) {
            if (pdj.c == 0L && pdj == this.b) {
                this.b = null;
                final oxp oxp = pdj.get();
                oyj.g(pdj);
                final pho a = this.a;
                if (oxp == null) {
                    pdj.e = true;
                }
                else {
                    ((pdi)a).b(oxp);
                }
            }
        }
    }
}
