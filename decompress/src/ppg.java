// 
// Decompiled by Procyon v0.6.0
// 

public final class ppg
{
    public static final ThreadLocal a;
    public static final ppg b;
    
    static {
        b = new ppg();
        a = new ThreadLocal();
    }
    
    private ppg() {
    }
    
    public final pol a() {
        final ThreadLocal a = ppg.a;
        final pol pol = a.get();
        if (pol != null) {
            return pol;
        }
        final pnj pnj = new pnj(Thread.currentThread());
        a.set(pnj);
        return pnj;
    }
}
