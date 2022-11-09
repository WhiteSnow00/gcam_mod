import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nuq
{
    private static final AtomicBoolean a;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public static void a(final nup nup) {
        if (!nuq.a.compareAndSet(false, true)) {
            throw new IllegalStateException("Logger backend configuration may only occur once.");
        }
        nuo a;
        if ((a = nup.a) == null) {
            a = new nuy();
        }
        if (nuw.a.compareAndSet(null, a)) {
            nuw.e();
            return;
        }
        throw new IllegalStateException("Logger backends can only be configured once.");
    }
}
