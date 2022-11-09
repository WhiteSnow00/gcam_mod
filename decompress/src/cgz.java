// 
// Decompiled by Procyon v0.6.0
// 

final class cgz implements kvp
{
    final /* synthetic */ ofn a;
    final /* synthetic */ chc b;
    
    public cgz(final chc b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final kst kst, final long n) {
        synchronized (this.b.c) {
            final ofn a = this.a;
            final cfo h = this.b.h;
            h.getClass();
            a.a(new dga(h.a, kst, n));
        }
    }
    
    @Override
    public final void b() {
        final chc b = this.b;
        final ctr f = b.f;
        synchronized (b.c) {
            final lfh a = b.l.a;
            final cfo h = b.h;
            h.getClass();
            final lfu l = a.a(h.a).l();
            monitorexit(b.c);
            f.g(l);
        }
    }
}
