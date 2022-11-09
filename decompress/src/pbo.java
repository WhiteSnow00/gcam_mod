import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbo extends owx
{
    final Object b;
    final oyf c;
    
    public pbo(final Object b, final oyf c) {
        this.b = b;
        this.c = c;
    }
    
    public final void k(final psr psr) {
        try {
            final psq psq = (psq)this.c.a(this.b);
            phn.g(psq, "The mapper returned a null Publisher");
            if (psq instanceof Callable) {
                try {
                    final Object call = ((Callable<Object>)psq).call();
                    if (call == null) {
                        phb.e(psr);
                        return;
                    }
                    psr.bY(new phc(psr, call));
                    return;
                }
                finally {
                    final Throwable t;
                    psn.e(t);
                    phb.f(t, psr);
                    return;
                }
            }
            psq.j(psr);
        }
        finally {
            final Throwable t2;
            phb.f(t2, psr);
        }
    }
}
