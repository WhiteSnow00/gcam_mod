import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pag extends pae
{
    final Callable c;
    final oyc d;
    
    public pag(final owx owx, final Callable c, final oyc d) {
        super(owx);
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected final void k(final psr psr) {
        try {
            final Object call = this.c.call();
            phn.g(call, "The initial value supplied is null");
            this.b.i(new paf(psr, call, this.d));
        }
        finally {
            final Throwable t;
            phb.f(t, psr);
        }
    }
}
