// 
// Decompiled by Procyon v0.6.0
// 

final class eow implements eip
{
    final /* synthetic */ epb a;
    
    public eow(final epb a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        final epb a = this.a;
        if (!a.q && a.x()) {
            if (!b) {
                final epb a2 = this.a;
                a2.o = true;
                a2.w();
            }
            this.a.g.A(b);
        }
    }
    
    @Override
    public final void e(final boolean b) {
        if (b && this.a.x()) {
            this.a.k.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (b && this.a.x()) {
            this.a.k.A();
        }
    }
}
