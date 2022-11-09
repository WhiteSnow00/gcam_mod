// 
// Decompiled by Procyon v0.6.0
// 

public final class fxz
{
    public final kse a;
    public final kjm b;
    public final Object c;
    public ofa d;
    public boolean e;
    
    public fxz(final krq krq, final kse a, final kjm b) {
        this.b = b;
        this.a = a;
        krq.a("CommandExecutor");
        this.c = new Object();
        this.e = false;
    }
    
    public final boolean a() {
        synchronized (this.c) {
            return this.e;
        }
    }
    
    public final void b(final fxx fxx) {
        synchronized (this.c) {
            if (this.e) {
                ofi.n(null);
                return;
            }
            if (this.d == null) {
                this.d = ofi.b(fyd.a());
            }
            final ofa d = this.d;
            d.getClass();
            d.a(new fxy(this, fxx));
        }
    }
}
