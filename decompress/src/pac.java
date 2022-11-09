// 
// Decompiled by Procyon v0.6.0
// 

final class pac implements owu
{
    final /* synthetic */ pad a;
    private final oxl b;
    
    public pac(final pad a, final oxl b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void bV(final oxp oxp) {
        this.b.bV(oxp);
    }
    
    @Override
    public final void e() {
        final Object b = this.a.b;
        if (b == null) {
            this.b.b(new NullPointerException("The value supplied is null"));
            return;
        }
        this.b.d(b);
    }
}
