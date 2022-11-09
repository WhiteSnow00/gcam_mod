import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pca extends owz implements Callable
{
    final Callable a;
    
    public pca(final Callable a) {
        this.a = a;
    }
    
    @Override
    protected final void c(final oxa oxa) {
        final oxp f = psn.f();
        oxa.bV(f);
        if (!f.ca()) {
            try {
                final Object call = this.a.call();
                if (!f.ca()) {
                    if (call == null) {
                        oxa.e();
                        return;
                    }
                    oxa.a(call);
                }
            }
            finally {
                final Throwable t;
                psn.e(t);
                if (!f.ca()) {
                    oxa.b(t);
                    return;
                }
                pip.g(t);
            }
        }
    }
    
    @Override
    public final Object call() {
        return this.a.call();
    }
}
