import android.os.Trace;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class krz implements ksj
{
    private final String b;
    private final AtomicInteger c;
    
    public krz(final String b) {
        this.b = b;
        this.c = new AtomicInteger(0);
    }
    
    @Override
    public final void a() {
        Trace.setCounter(this.b, (long)this.c.decrementAndGet());
    }
    
    @Override
    public final void b() {
        Trace.setCounter(this.b, (long)this.c.incrementAndGet());
    }
    
    @Override
    public final void c(final int n) {
        this.c.set(n);
        Trace.setCounter(this.b, (long)this.c.get());
    }
}
