import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class fqf extends ljr
{
    final AtomicBoolean a;
    final /* synthetic */ long b;
    final /* synthetic */ lju c;
    final /* synthetic */ fqg d;
    
    public fqf(final fqg d, final lju lju, final long b, final lju c) {
        this.d = d;
        this.b = b;
        this.c = c;
        super(lju);
        this.a = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (!this.a.getAndSet(true)) {
            this.d.c.b.a(new Object[0]);
            this.d.c.d.b((double)(SystemClock.elapsedRealtime() - this.b), new Object[0]);
        }
        this.c.close();
    }
}
