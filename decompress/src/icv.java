// 
// Decompiled by Procyon v0.6.0
// 

final class icv implements eip
{
    final /* synthetic */ jjb a;
    final /* synthetic */ icy b;
    
    public icv(final icy b, final jjb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        if (!b) {
            final iep l = this.b.L;
            if (l != null) {
                l.a();
            }
        }
    }
    
    @Override
    public final void e(final boolean b) {
        if (b) {
            this.a.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (b) {
            this.a.A();
        }
    }
}
