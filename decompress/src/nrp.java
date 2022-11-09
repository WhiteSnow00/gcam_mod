// 
// Decompiled by Procyon v0.6.0
// 

final class nrp extends npv
{
    final /* synthetic */ nrs a;
    final /* synthetic */ nru b;
    
    public nrp(final nru b, final nrs a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final int a() {
        int n;
        if ((n = this.a.b) == 0) {
            n = this.b.bK(this.b());
        }
        return n;
    }
    
    @Override
    public final Object b() {
        return this.a.a;
    }
}
