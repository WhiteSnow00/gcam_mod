// 
// Decompiled by Procyon v0.6.0
// 

final class fop extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ foq b;
    
    public fop(final foq b, final kvs a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b() {
        this.a.close();
        if (this.b.a.h.compareAndSet(false, true)) {
            this.b.a.d.execute(new foo(this));
        }
    }
}
