import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class jnv
{
    private long a;
    
    public jnv() {
    }
    
    public final void a() {
        this.a = 0L;
    }
    
    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }
    
    public final boolean c(final long n) {
        return this.a == 0L || SystemClock.elapsedRealtime() - this.a > n;
    }
}
