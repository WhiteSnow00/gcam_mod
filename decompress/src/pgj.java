import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgj extends oxj
{
    private static final pgm b;
    final ThreadFactory a;
    
    static {
        b = new pgm("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5))));
    }
    
    public pgj() {
        final pgm b = pgj.b;
        this.a = b;
    }
    
    @Override
    public final oxi a() {
        return new pgk(this.a);
    }
}
