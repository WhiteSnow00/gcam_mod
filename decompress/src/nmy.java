// 
// Decompiled by Procyon v0.6.0
// 

final class nmy extends nna
{
    final /* synthetic */ nnb a;
    
    public nmy(final nnb a) {
        this.a = a;
        super(a);
    }
    
    @Override
    public final Object a(final int n) {
        return this.a.b[n];
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsValue(o);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int k = nov.k(o);
        final int d = this.a.d(o, k);
        if (d != -1) {
            this.a.i(d, k);
            return true;
        }
        return false;
    }
}
