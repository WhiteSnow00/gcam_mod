import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgc extends ljr
{
    private final AtomicBoolean a;
    
    public lgc(final lju lju) {
        super(lju);
        this.a = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (!this.a.getAndSet(true)) {
            super.close();
        }
    }
}
