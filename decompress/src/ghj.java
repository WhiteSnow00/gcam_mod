// 
// Decompiled by Procyon v0.6.0
// 

final class ghj implements kvv, krc
{
    public final Object a;
    public boolean b;
    final /* synthetic */ ghl c;
    private final njp d;
    private long e;
    
    public ghj(final ghl c, final njp d) {
        this.c = c;
        this.a = new Object();
        this.d = d;
    }
    
    @Override
    public final void a(final lbe lbe) {
        final kvx b = lbe.b();
        if (b == null) {
            return;
        }
        final long b2 = b.b;
        if (b2 < this.e + (int)this.d.a()) {
            return;
        }
        this.e = b2;
        kwp.l(lbe, new ghh(this, b));
    }
    
    @Override
    public final void close() {
        synchronized (this.c.c) {
            this.c.e.d();
        }
    }
}
