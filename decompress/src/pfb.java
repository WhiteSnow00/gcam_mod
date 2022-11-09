import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfb extends oxk
{
    final Callable a;
    
    public pfb(final Callable a) {
        this.a = a;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        final oxp f = psn.f();
        oxl.bV(f);
        if (f.ca()) {
            return;
        }
        try {
            final Object call = this.a.call();
            phn.g(call, "The callable returned a null value");
            if (!f.ca()) {
                oxl.d(call);
            }
        }
        finally {
            final Throwable t;
            psn.e(t);
            if (!f.ca()) {
                oxl.b(t);
                return;
            }
            pip.g(t);
        }
    }
}
