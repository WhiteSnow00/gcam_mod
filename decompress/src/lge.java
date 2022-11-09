import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class lge extends ljr
{
    final /* synthetic */ lgf a;
    private final AtomicBoolean b;
    
    public lge(final lgf a, final lju lju) {
        this.a = a;
        super(lju);
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (!this.b.getAndSet(true)) {
            super.close();
            final lgf a = this.a;
            synchronized (a.a) {
                --a.c;
                if (a.b) {
                    a.j();
                }
            }
        }
    }
    
    public final void finalize() {
        this.close();
        super.finalize();
    }
}
