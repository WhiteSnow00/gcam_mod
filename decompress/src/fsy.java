// 
// Decompiled by Procyon v0.6.0
// 

final class fsy implements fus
{
    final /* synthetic */ ftc a;
    final /* synthetic */ fte b;
    
    public fsy(final fte b, final ftc a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.h.post((Runnable)new fsw(this, this.a, 1));
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.h.post((Runnable)new fsw(this, this.a));
    }
    
    @Override
    public final void c(final lju lju) {
        this.b.h.post((Runnable)new fsx(this, this.a, lju));
    }
}
