import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnb implements lmy
{
    @Override
    public final long a() {
        return System.currentTimeMillis();
    }
    
    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
    
    @Override
    public final long c() {
        long elapsedRealtimeNanos;
        if (lna.a) {
            elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        }
        else {
            elapsedRealtimeNanos = SystemClock.elapsedRealtime() * 1000000L;
        }
        return elapsedRealtimeNanos;
    }
}
