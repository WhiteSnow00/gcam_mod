// 
// Decompiled by Procyon v0.6.0
// 

public final class dml implements dkx
{
    public final lgr a;
    public final Object b;
    public lgq c;
    public final dni d;
    
    public dml(final lgr a, final dni d) {
        this.b = new Object();
        this.a = a;
        this.d = d;
    }
    
    @Override
    public final void b(final kvs kvs, final kwz kwz) {
        synchronized (this.b) {
            final lgq c = this.c;
            if (c != null) {
                final kvx b = kvs.b();
                if (b != null) {
                    final long a = b.a;
                    c.b(-3000000L + a, 3000000L + a, new dmk(this, a));
                }
            }
        }
    }
}
