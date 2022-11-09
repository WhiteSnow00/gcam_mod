import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmm implements lmo, lmp
{
    @Override
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
