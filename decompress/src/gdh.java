import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdh extends ljr
{
    private final AtomicBoolean a;
    
    public gdh(final lju lju) {
        super(lju);
        this.a = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        super.close();
        this.a.getAndSet(true);
    }
}
