import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class fjz implements krc
{
    public final AtomicReference a;
    
    public fjz(final fkb fkb) {
        (this.a = new AtomicReference()).set(fkb);
    }
    
    public final void a() {
        this.a.set(null);
    }
    
    @Override
    public final void close() {
        final fkb fkb = this.a.getAndSet(null);
        if (fkb != null) {
            fkb.b();
        }
    }
}
