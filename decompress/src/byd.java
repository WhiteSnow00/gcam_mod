// 
// Decompiled by Procyon v0.6.0
// 

final class byd implements oen
{
    final /* synthetic */ bye a;
    final /* synthetic */ jzt b;
    
    public byd(final bye a, final jzt b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.m(bye.a.b(), "Failed to get results", '\u00ca', t);
        this.b.a(njt.b(t));
    }
    
    @Override
    public final void b(final Object o) {
        Object o2 = this.a.b;
        synchronized (o2) {
            if (this.a.b.isEmpty()) {
                this.b.b(null, null);
                return;
            }
            final nja nja = this.a.b.removeFirst();
            monitorexit(o2);
            o2 = nja.a;
            this.b.b((byte[])nja.b, ((byx)o2).g());
        }
    }
}
