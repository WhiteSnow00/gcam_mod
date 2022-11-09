import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pem extends oxk
{
    final Callable a;
    
    public pem(final Callable a) {
        this.a = a;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        try {
            final oxm oxm = this.a.call();
            phn.g(oxm, "The singleSupplier returned a null SingleSource");
            oxm.m(oxl);
        }
        finally {
            final Throwable t;
            psn.e(t);
            oyk.h(t, oxl);
        }
    }
}
