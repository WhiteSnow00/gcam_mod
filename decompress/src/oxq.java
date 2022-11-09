import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class oxq extends AtomicReference implements oxp
{
    private static final long serialVersionUID = 6537757548749041217L;
    
    public oxq(final Object o) {
        super(o);
    }
    
    protected abstract void b(final Object p0);
    
    @Override
    public final void bX() {
        if (this.get() != null) {
            final Object andSet = this.getAndSet(null);
            if (andSet != null) {
                this.b(andSet);
            }
        }
    }
    
    @Override
    public final boolean ca() {
        return this.get() == null;
    }
}
