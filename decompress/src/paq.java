import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class paq extends owx
{
    final Callable b;
    
    public paq(final Callable b) {
        this.b = b;
    }
    
    public final void k(final psr psr) {
        final Throwable t;
        try {
            phn.g(((oyt)this.b).a, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        }
        finally {
            psn.e(t);
        }
        phb.f(t, psr);
    }
}
