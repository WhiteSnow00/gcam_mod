import java.util.Collection;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pco extends pcj
{
    final Callable b;
    
    public pco(final oxf oxf, final Callable b) {
        super(oxf);
        this.b = b;
    }
    
    @Override
    protected final void g(final oxg oxg) {
        try {
            this.a.f(new pcn(oxg, ((oyr)this.b).a()));
        }
        finally {
            final Throwable t;
            psn.e(t);
            oyk.g(t, oxg);
        }
    }
}
