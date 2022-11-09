import android.view.ViewConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eis
{
    private static final long g;
    public final Object a;
    public final lmm b;
    public final long c;
    public final eir d;
    public long e;
    public int f;
    
    static {
        long n = ViewConfiguration.getLongPressTimeout();
        if (n <= 0L) {
            n = 400L;
        }
        g = n * 1000000L;
    }
    
    public eis(final eir d) {
        final long g = eis.g;
        final lmm b = new lmm();
        this.a = new Object();
        boolean b2 = true;
        this.f = 1;
        d.getClass();
        if (g <= 0L) {
            b2 = false;
        }
        njo.d(b2);
        this.d = d;
        this.c = g;
        this.b = b;
    }
}
