import android.os.SystemClock;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwn implements Runnable
{
    private final bnl a;
    private final Activity b;
    
    public gwn(final Activity b, final bnl a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        if (!this.a.b() && (bmx.n(this.b.getIntent()) || bmx.q(this.b.getIntent().getAction()))) {
            final mkk a = mkk.a;
            final Activity b = this.b;
            if (mrm.f() && a.j == 0L) {
                mkk.a("Primes-tti-end-and-length-ms", a.j = SystemClock.elapsedRealtime());
                a.l.j = true;
                try {
                    b.reportFullyDrawn();
                }
                catch (final RuntimeException ex) {}
            }
        }
    }
}
