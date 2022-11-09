import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnm extends pow implements pnl
{
    public final pnn a;
    
    public pnm(final pnn a) {
        this.a = a;
    }
    
    @Override
    public final boolean b(final Throwable t) {
        final ppb e = this.e();
        final boolean b = t instanceof CancellationException;
        final boolean b2 = false;
        boolean b3;
        if (b) {
            b3 = true;
        }
        else {
            b3 = b2;
            if (e.C(t)) {
                if (e.ci()) {
                    return true;
                }
                b3 = b2;
            }
        }
        return b3;
    }
    
    @Override
    public final void c(final Throwable t) {
        this.a.m(this.e());
    }
}
