import java.util.concurrent.TimeUnit;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hca implements fey
{
    @Override
    public final boolean a(final nqe nqe) {
        return nqe.c(SystemClock.elapsedRealtimeNanos() - TimeUnit.NANOSECONDS.convert(5L, TimeUnit.SECONDS)).n(nqe);
    }
    
    @Override
    public final boolean b(final nqe nqe) {
        return false;
    }
}
