import java.util.concurrent.TimeoutException;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqg implements fus
{
    final /* synthetic */ long a;
    final /* synthetic */ fus b;
    final /* synthetic */ fqi c;
    
    public fqg(final fqi c, final long a, final fus b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.c.a.a("cancelled");
        this.c.c.b((double)(SystemClock.elapsedRealtime() - this.a), "cancelled");
        this.b.a();
    }
    
    @Override
    public final void b(final Throwable t) {
        if (t instanceof TimeoutException) {
            this.c.a.a("timeout");
            this.c.c.b((double)(SystemClock.elapsedRealtime() - this.a), "timeout");
        }
        else {
            this.c.a.a("failed");
            this.c.c.b((double)(SystemClock.elapsedRealtime() - this.a), "failed");
        }
        this.b.b(t);
    }
    
    @Override
    public final void c(final lju lju) {
        this.c.a.a("success");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.c.c.b((double)(elapsedRealtime - this.a), "success");
        this.b.c(new fqf(this, lju, elapsedRealtime, lju));
    }
}
