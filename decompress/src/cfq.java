// 
// Decompiled by Procyon v0.6.0
// 

final class cfq implements liq
{
    final /* synthetic */ cfr a;
    
    public cfq(final cfr a) {
        this.a = a;
    }
    
    @Override
    public final void aY(final kra kra) {
        final Integer a = this.a.a(kra);
        synchronized (this.a.d) {
            final cfr a2 = this.a;
            if (!a2.e) {
                a2.b.aR(a);
            }
            this.a.c.aR(kra.b(a));
        }
    }
}
