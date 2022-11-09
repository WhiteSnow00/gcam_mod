import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ozl implements owu
{
    final AtomicReference a;
    final owu b;
    
    public ozl(final AtomicReference a, final owu b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        oyj.h(this.a, oxp);
    }
    
    @Override
    public final void e() {
        this.b.e();
    }
}
