// 
// Decompiled by Procyon v0.6.0
// 

final class azf implements awo
{
    final /* synthetic */ bbv a;
    final /* synthetic */ azg b;
    
    public azf(final azg b, final bbv a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Object c) {
        if (this.b.f(this.a)) {
            final azg b = this.b;
            final bbv a = this.a;
            final ayg o = b.a.o;
            if (c != null && o.c(a.c.g())) {
                b.c = c;
                b.b.b();
                return;
            }
            final axv b2 = b.b;
            final awc a2 = a.a;
            final awp c2 = a.c;
            b2.e(a2, c, c2, c2.g(), b.d);
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        if (this.b.f(this.a)) {
            final azg b = this.b;
            final bbv a = this.a;
            final axv b2 = b.b;
            final axt d = b.d;
            final awp c = a.c;
            b2.d(d, ex, c, c.g());
        }
    }
}
