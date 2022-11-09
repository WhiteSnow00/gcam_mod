// 
// Decompiled by Procyon v0.6.0
// 

final class fch implements hrk
{
    final /* synthetic */ fci a;
    
    public fch(final fci a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        if (this.a.b.compareAndSet(true, false)) {
            this.a.b();
        }
    }
    
    @Override
    public final void b() {
        this.a.b.set(true);
    }
}
