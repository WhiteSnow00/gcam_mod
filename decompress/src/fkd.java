import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkd
{
    private volatile boolean a;
    
    public fkd() {
        this.a = false;
    }
    
    public final long a() {
        monitorenter(this);
        try {
            long elapsedRealtimeNanos;
            if (!this.a) {
                elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            }
            else {
                elapsedRealtimeNanos = 4611686018427387903L;
            }
            monitorexit(this);
            return elapsedRealtimeNanos;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.a = true;
        }
    }
}
