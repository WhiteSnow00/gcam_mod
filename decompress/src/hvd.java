import java.util.concurrent.TimeUnit;
import android.os.SystemClock;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvd
{
    private final LinkedList a;
    private final eyt b;
    
    public hvd(final eyt b) {
        this.a = new LinkedList();
        this.b = b;
    }
    
    public final int a() {
        monitorenter(this);
        try {
            int b;
            if (this.a.size() > 0) {
                b = this.a.getLast().b;
            }
            else {
                b = 0;
            }
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final hvc b() {
        monitorenter(this);
        try {
            while (!this.a.isEmpty()) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final ezb ezb = this.a.removeFirst();
                if (uptimeMillis - ezb.a <= 60000L) {
                    final hvc hvc = new hvc();
                    hvc.b = ezb.b;
                    hvc.a = uptimeMillis - ezb.a;
                    monitorexit(this);
                    return hvc;
                }
            }
            monitorexit(this);
            return null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final huz huz) {
        synchronized (this) {
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            final long convert = TimeUnit.MILLISECONDS.convert(elapsedRealtimeNanos, TimeUnit.NANOSECONDS);
            this.a.add(new ezb(SystemClock.uptimeMillis(), this.a.size()));
            this.b.Q(8, null, null, null, huz.b());
            final hvb a = huz.a();
            if (a != null) {
                a.b = elapsedRealtimeNanos;
            }
            huz.s(convert);
        }
    }
}
