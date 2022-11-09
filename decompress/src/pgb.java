import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class pgb extends AtomicBoolean implements Runnable, oxp
{
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;
    
    public pgb(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void bX() {
        this.lazySet(true);
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void run() {
        if (this.get()) {
            return;
        }
        try {
            this.a.run();
        }
        finally {
            this.lazySet(true);
        }
    }
}
