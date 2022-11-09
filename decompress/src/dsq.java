import java.util.Locale;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsq implements lgr
{
    public final Set a;
    private final lgr b;
    private final kjk c;
    private final AtomicBoolean d;
    
    public dsq(final lgr b, final kjk c) {
        this.d = new AtomicBoolean(false);
        this.a = new HashSet();
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final lgq a(final String s) {
        final lgq a = this.b.a(s);
        if (a == null) {
            return null;
        }
        if (!this.d.getAndSet(true)) {
            this.c.c(new dsn(this));
        }
        final dsp dsp = new dsp(this, a);
        synchronized (this) {
            this.a.add(dsp);
            return dsp;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a.isEmpty()) {
                return;
            }
            throw new IllegalStateException(String.format(Locale.US, "%d gyro sessions, e.g. %s, leaked", this.a.size(), this.a.iterator().next().a()));
        }
    }
}
