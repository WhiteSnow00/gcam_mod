// 
// Decompiled by Procyon v0.6.0
// 

final class fps implements clt
{
    final /* synthetic */ fpt a;
    
    public fps(final fpt a) {
        this.a = a;
    }
    
    @Override
    public final void a(final clp clp, final clp clp2, final boolean b) {
        if (clp2 != clp && (clp == clp.c || clp == clp.e || clp2 == clp.c || clp2 == clp.e)) {
            this.a.d.execute(new fpr(this));
        }
    }
}
