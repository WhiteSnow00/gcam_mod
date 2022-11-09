import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdt extends kjk
{
    private static final nsd a;
    private final pii b;
    private final AtomicBoolean c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/lifecycle/TwoStageShutdown");
    }
    
    public gdt(final pii b, final kkp kkp) {
        super(kkp);
        this.b = b;
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final boolean a() {
        return this.c.get();
    }
    
    @Override
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        final Iterator iterator = ((ous)this.b).a().iterator();
        final Throwable t = null;
        while (iterator.hasNext()) {
            final gds gds = (gds)iterator.next();
            try {
                gds.run();
            }
            finally {
                a.m(gdt.a.b(), "Error thrown while running shutdown task", '\u0711', t);
            }
        }
        super.close();
        if (t == null) {
            return;
        }
        throw new RuntimeException(t);
    }
}
