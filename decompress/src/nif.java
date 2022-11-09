import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class nif extends nju
{
    public nif() {
    }
    
    @Override
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
