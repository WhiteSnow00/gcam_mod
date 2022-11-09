import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class lna
{
    public static final boolean a;
    
    static {
        boolean a2;
        try {
            SystemClock.elapsedRealtimeNanos();
        }
        finally {
            a2 = false;
        }
        a = a2;
    }
}
