// 
// Decompiled by Procyon v0.6.0
// 

final class nmx extends nna
{
    final /* synthetic */ nnb a;
    
    public nmx(final nnb a) {
        this.a = a;
        super(a);
    }
    
    @Override
    public final Object a(final int n) {
        return this.a.a[n];
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int k = nov.k(o);
        final int c = this.a.c(o, k);
        if (c != -1) {
            this.a.h(c, k);
            return true;
        }
        return false;
    }
}
