import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public final class laj
{
    public final kjk a;
    public final lhf b;
    public final lcq c;
    public final lah d;
    public final pii e;
    public Runnable f;
    
    public laj(final lcq c, final kjk a, final lah d, final pii e) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.e = e;
        final lhf b = new lhf(1L);
        a.c(b);
        this.b = b;
    }
    
    final lag a() {
        final oey c = this.b.c(1L);
        try {
            final lhc lhc = c.get();
            if (!this.a.a()) {
                final kjk a = this.a;
                final lag a2 = this.d.a(lhc, this.f, this.c, ((las)this.e).a());
                a.c(a2);
                return a2;
            }
            lhc.close();
            throw new kuw("Frameserver is closed.");
        }
        catch (final InterruptedException ex) {
            c.cancel(true);
            try {
                ((lhc)ofi.u(c)).close();
            }
            catch (final CancellationException ex2) {}
            catch (final ExecutionException ex3) {
                ex.addSuppressed(ex3);
            }
            throw ex;
        }
        catch (final ExecutionException ex4) {
            throw new kuw(ex4);
        }
    }
}
