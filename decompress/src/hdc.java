import j$.time.Duration;
import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdc
{
    private final Range a;
    private final Duration b;
    private final Duration c;
    private long d;
    private long e;
    private int f;
    
    public hdc(final Range a, final Duration b, final Duration c) {
        this.d = -1L;
        this.e = -1L;
        this.f = 0;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final float n, final long n2) {
        synchronized (this) {
            if (this.d >= 0L && this.a.contains((Comparable)n)) {
                this.f = Math.min(this.f + 1, 5);
                this.e = n2;
                return;
            }
            this.d = n2;
            this.f = 0;
            this.e = -1L;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.f = 0;
            this.d = -1L;
            this.e = -1L;
        }
    }
    
    public final boolean c(final long n) {
        monitorenter(this);
        try {
            while (true) {
                Label_0066: {
                    if (this.f < 5 || n - this.d < this.b.toNanos()) {
                        break Label_0066;
                    }
                    final long e = this.e;
                    if (e <= -1L || n - e > this.c.toNanos()) {
                        break Label_0066;
                    }
                    final boolean b = true;
                    monitorexit(this);
                    return b;
                }
                final boolean b = false;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
