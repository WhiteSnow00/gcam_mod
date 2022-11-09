import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pct extends pcj
{
    final int b;
    
    public pct(final oxf oxf, final int b) {
        super(oxf);
        this.b = b;
    }
    
    public final void g(final oxg oxg) {
        final oxf a = this.a;
        if (a instanceof Callable) {
            try {
                final oxf call = ((Callable<oxf>)a).call();
                if (call != null) {
                    try {
                        final oxf oxf = call;
                        if (oxf instanceof Callable) {
                            try {
                                final Object call2 = ((Callable<Object>)oxf).call();
                                if (call2 == null) {
                                    oyk.e(oxg);
                                    return;
                                }
                                final pdm pdm = new pdm(oxg, call2);
                                oxg.bV(pdm);
                                pdm.run();
                                return;
                            }
                            finally {
                                final Throwable t;
                                psn.e(t);
                                oyk.g(t, oxg);
                                return;
                            }
                        }
                        oxf.f(oxg);
                        return;
                    }
                    finally {
                        final Throwable t2;
                        psn.e(t2);
                        oyk.g(t2, oxg);
                        return;
                    }
                }
                oyk.e(oxg);
                return;
            }
            finally {
                final Throwable t3;
                psn.e(t3);
                oyk.g(t3, oxg);
                return;
            }
        }
        a.f(new pcs(oxg, this.b));
    }
}
