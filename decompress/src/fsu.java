// 
// Decompiled by Procyon v0.6.0
// 

final class fsu implements fvb
{
    final /* synthetic */ fta a;
    final /* synthetic */ fte b;
    
    public fsu(final fte b, final fta a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.b.h.post((Runnable)new fst(this, this.a));
    }
    
    @Override
    public final void b(final long n) {
        this.b.h.post((Runnable)new fss(this, n, this.a));
    }
}
