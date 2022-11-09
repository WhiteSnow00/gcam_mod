import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class lbu extends ksm
{
    private final kvp a;
    private long b;
    
    public lbu(final kvp a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.b();
    }
    
    @Override
    public final void c(final kst kst) {
        final long b = this.b;
        long n = 0L;
        if (b != 0L) {
            n = SystemClock.elapsedRealtimeNanos() - this.b;
        }
        this.a.a(kst, n);
    }
    
    @Override
    public final void d(final ljg ljg) {
        this.b = SystemClock.elapsedRealtimeNanos();
    }
}
