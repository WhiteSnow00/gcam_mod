// 
// Decompiled by Procyon v0.6.0
// 

final class oeb implements odo
{
    final /* synthetic */ oee a;
    final /* synthetic */ odo b;
    
    public oeb(final oee a, final odo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final oey a() {
        if (!this.a.compareAndSet(oed.a, oed.c)) {
            return ofi.l();
        }
        return this.b.a();
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
