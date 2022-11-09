import android.os.Trace;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mkk
{
    public static final mkk a;
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile mdx k;
    public final mkj l;
    public final mkd m;
    public final mkd n;
    
    static {
        a = new mkk();
    }
    
    public mkk() {
        this.l = new mkj();
        this.m = new mkd();
        this.n = new mkd();
    }
    
    public static void a(final String s, final long n) {
        Trace.setCounter(s, n - Process.getStartElapsedRealtime());
        Trace.setCounter(s, 0L);
    }
}
