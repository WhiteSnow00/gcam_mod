import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esf
{
    public boolean a;
    private long b;
    private double c;
    
    public esf() {
        this.a = true;
    }
    
    public final double a() {
        if (this.a) {
            return 1.0;
        }
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final long b = this.b;
        final double c = this.c;
        final double n = (double)(elapsedRealtimeNanos - b);
        Double.isNaN(n);
        final double n2 = Math.min(c, n / 1.0E9) / this.c;
        if (Math.abs(-1.0 + n2) < 1.0E-4) {
            this.a = true;
        }
        return 1.0 - Math.exp(n2 * -6.5);
    }
    
    public final void b() {
        this.b = SystemClock.elapsedRealtimeNanos();
        this.c = 0.7;
        this.a = false;
    }
}
