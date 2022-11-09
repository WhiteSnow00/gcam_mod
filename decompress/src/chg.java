// 
// Decompiled by Procyon v0.6.0
// 

final class chg implements kvp
{
    final /* synthetic */ ofn a;
    final /* synthetic */ chj b;
    
    public chg(final chj b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final kst kst, final long n) {
        synchronized (this.b.c) {
            final ofn a = this.a;
            final cfo f = this.b.f;
            f.getClass();
            a.a(new dga(f.a, kst, n));
        }
    }
    
    @Override
    public final void b() {
        final chj b = this.b;
        final ctr j = b.j;
        synchronized (b.c) {
            final lfh a = b.k.a;
            final cfo f = b.f;
            f.getClass();
            final lfu l = a.a(f.a).l();
            monitorexit(b.c);
            j.g(l);
        }
    }
}
