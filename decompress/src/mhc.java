import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhc
{
    static final long a;
    public final nir b;
    public volatile boolean c;
    private final njn d;
    private volatile Process e;
    
    static {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
    
    public mhc(final nju nju) {
        this.c = false;
        this.b = new mhb(this);
        this.d = njn.b(nju);
    }
    
    public final void a(final String s) {
        if (s.isEmpty()) {
            return;
        }
        if (this.e != null) {
            try {
                if (this.e.exitValue() != 0) {
                    this.c = true;
                    this.e = null;
                }
            }
            catch (final IllegalThreadStateException ex) {
                return;
            }
        }
        if (this.c) {
            return;
        }
        synchronized (this) {
            final njn d = this.d;
            if (d.a && d.a(TimeUnit.MILLISECONDS) < mhc.a) {
                return;
            }
            this.d.c();
            this.d.d();
            this.e = (Process)this.b.a(s);
        }
    }
}
