import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyb implements dyq
{
    private final AtomicBoolean a;
    
    public dyb(final AtomicBoolean a) {
        this.a = a;
    }
    
    @Override
    public final int a(final ljm ljm) {
        if (!this.a.get()) {
            final nsx a = ntf.a;
            return 2;
        }
        if (ljm.d(jll.d) == null) {
            final nsx a2 = ntf.a;
            return 1;
        }
        final Boolean b = (Boolean)ljm.d(jll.e);
        if (b != null && b) {
            return 3;
        }
        final nsx a3 = ntf.a;
        return 2;
    }
}
