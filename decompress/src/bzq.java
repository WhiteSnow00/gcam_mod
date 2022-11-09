// 
// Decompiled by Procyon v0.6.0
// 

final class bzq extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ kwz b;
    final /* synthetic */ bzs c;
    
    public bzq(final bzs c, final kvs a, final kwz b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.a.close();
    }
    
    @Override
    public final void b() {
        try {
            final bzs c = this.c;
            final kvs a = this.a;
            final kwz b = this.b;
            synchronized (c.c) {
                while (c.i.size() >= 5) {
                    ((bzr)c.i.removeFirst()).a.close();
                }
                c.i.addLast(new bzr(a, b));
            }
        }
        catch (final RuntimeException ex) {
            a.m(bzs.a.b(), "Frame is not ready.", '\u00fb', ex);
            this.a.close();
        }
    }
}
