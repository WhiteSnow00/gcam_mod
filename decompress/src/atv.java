import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atv
{
    private static final aub a;
    private int b;
    private boolean c;
    
    static {
        a = new aub("CamStateHolder");
    }
    
    public atv() {
        this.c(1);
        this.c = false;
    }
    
    public final int a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.c = true;
        }
    }
    
    public final void c(final int b) {
        synchronized (this) {
            if (this.b != b) {
                final aub a = atv.a;
                Integer.toBinaryString(b);
                auc.g(a);
            }
            this.b = b;
            this.notifyAll();
        }
    }
    
    public final boolean d() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final void e(final int n) {
        final aub a = atv.a;
        Integer.toBinaryString(n);
        auc.g(a);
        final long uptimeMillis = SystemClock.uptimeMillis();
        monitorenter(this);
        try {
            while ((this.a() | n) != n) {
                try {
                    this.wait(3500L);
                }
                catch (final InterruptedException ex) {
                    if (SystemClock.uptimeMillis() > uptimeMillis + 3500L) {
                        auc.c(atv.a, "Timeout waiting.");
                    }
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
