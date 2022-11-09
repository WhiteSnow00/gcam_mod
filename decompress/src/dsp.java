// 
// Decompiled by Procyon v0.6.0
// 

final class dsp implements lgq
{
    final /* synthetic */ lgq a;
    final /* synthetic */ dsq b;
    
    public dsp(final dsq b, final lgq a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final String a() {
        return this.a.a();
    }
    
    @Override
    public final void b(final long n, final long n2, final lgp lgp) {
        this.a.b(n, n2, lgp);
    }
    
    @Override
    public final void close() {
        this.a.close();
        synchronized (this.b) {
            this.b.a.remove(this);
        }
    }
}
