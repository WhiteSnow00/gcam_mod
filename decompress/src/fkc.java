// 
// Decompiled by Procyon v0.6.0
// 

public final class fkc
{
    public final krr a;
    private final kjk b;
    
    public fkc(final krr krr) {
        this.b = new kjk();
        this.a = krr.a("EndOnShutdown");
    }
    
    public final fkl a(final fkl fkl) {
        final fkb fkb = new fkb(this, fkl);
        this.b.c(fkb.a);
        return fkb;
    }
    
    public final void b() {
        synchronized (this) {
            this.b.close();
        }
    }
}
