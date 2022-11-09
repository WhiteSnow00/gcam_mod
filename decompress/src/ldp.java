// 
// Decompiled by Procyon v0.6.0
// 

final class ldp extends ljr
{
    boolean a;
    final /* synthetic */ ldt b;
    private final long c;
    
    public ldp(final ldt b, final lju lju, final kvx kvx) {
        this.b = b;
        super(lju);
        this.a = false;
        b.g.a.i.a(lju.c(), lju.b(), lju.a());
        b.h.b();
        this.c = kvx.a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            monitorexit(this);
            this.b.g.a.j.a(this.c(), this.b(), this.a());
            this.b.h.a();
            super.close();
            this.b.b();
        }
    }
    
    @Override
    public final long d() {
        return this.c;
    }
}
