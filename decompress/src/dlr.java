// 
// Decompiled by Procyon v0.6.0
// 

final class dlr extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ dlx b;
    
    public dlr(final kvs a, final dlx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void d(final ljm ljm) {
        final kvx b = this.a.b();
        if (b != null && ljm != null) {
            this.b.a(b.a, ljm);
        }
    }
}
