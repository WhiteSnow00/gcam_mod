import android.os.PowerManager$WakeLock;
import android.os.PowerManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxe
{
    private final PowerManager a;
    private final String b;
    private final long c;
    private PowerManager$WakeLock d;
    
    public gxe(final PowerManager a, final long c) {
        this.a = a;
        this.b = "ProcessingService";
        this.c = c;
    }
    
    public final void a(final String s) {
        synchronized (this) {
            final PowerManager a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder(b.length() + 1 + String.valueOf(s).length());
            sb.append(b);
            sb.append(":");
            sb.append(s);
            final PowerManager$WakeLock wakeLock = a.newWakeLock(1, sb.toString());
            wakeLock.acquire(this.c);
            final PowerManager$WakeLock d = this.d;
            if (d != null) {
                d.release();
            }
            this.d = wakeLock;
        }
    }
    
    public final void b() {
        synchronized (this) {
            final PowerManager$WakeLock d = this.d;
            if (d != null) {
                d.release();
                this.d = null;
            }
        }
    }
}
