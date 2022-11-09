import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iak implements Runnable
{
    final /* synthetic */ iam a = a;
    private final /* synthetic */ int b;
    
    public iak(final iam a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final iam a = this.a;
                a.k.a(a.n);
                return;
            }
            case 0: {
                final ScheduledFuture t = this.a.t;
                if (t != null) {
                    t.cancel(true);
                }
                final ScheduledFuture s = this.a.s;
                if (s != null) {
                    s.cancel(true);
                }
                this.a.b();
                this.a.u.o(null);
            }
        }
    }
}
