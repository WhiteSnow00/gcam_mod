import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class pic extends AtomicBoolean implements oxp
{
    private static final long serialVersionUID = 3562861878281475070L;
    final oxg a;
    final pid b;
    
    public pic(final oxg a, final pid b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void bX() {
        if (this.compareAndSet(false, true)) {
            this.b.k(this);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
}
