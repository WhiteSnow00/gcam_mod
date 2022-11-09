// 
// Decompiled by Procyon v0.6.0
// 

public final class fqp implements frl
{
    private final frl a;
    private lju b;
    private boolean c;
    
    public fqp(final frl a) {
        this.b = null;
        this.c = false;
        this.a = a;
    }
    
    @Override
    public final void a(lju lju) {
        synchronized (this) {
            if (this.c) {
                this.a.a(lju);
                return;
            }
            final lgb lgb = new lgb(lju);
            lju = this.b;
            if (lju != null) {
                lju.close();
            }
            lju = lgb.k();
            lju.getClass();
            this.b = new fty(lju, lgb.d() + 100000L);
            this.a.a(lgb);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.c = true;
            final lju b = this.b;
            if (b != null) {
                this.a.a(b);
                this.b = null;
            }
            monitorexit(this);
            this.a.close();
        }
    }
}
