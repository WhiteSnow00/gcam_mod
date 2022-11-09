import java.util.concurrent.RejectedExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public class pqn extends poo
{
    private final pql b;
    
    public pqn(final int n, final int n2, final long n3) {
        this.b = new pql(n, n2, n3);
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        try {
            pql.f(this.b, runnable);
        }
        catch (final RejectedExecutionException ex) {
            pof.b.cj(pjq, runnable);
        }
    }
    
    @Override
    public void close() {
        this.b.close();
    }
    
    public final void j(final Runnable runnable, final pqr pqr, final boolean b) {
        runnable.getClass();
        try {
            this.b.b(runnable, pqr, b);
        }
        catch (final RejectedExecutionException ex) {
            pof.b.s(pql.h(runnable, pqr));
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[scheduler = ");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }
}
