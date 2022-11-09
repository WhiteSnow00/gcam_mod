// 
// Decompiled by Procyon v0.6.0
// 

final class pan implements pss
{
    final psr a;
    final Object b;
    boolean c;
    
    public pan(final Object b, final psr a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void cb(final long n) {
        if (n > 0L && !this.c) {
            this.c = true;
            final psr a = this.a;
            a.ce(this.b);
            a.cc();
        }
    }
}
