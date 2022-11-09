// 
// Decompiled by Procyon v0.6.0
// 

public final class lal
{
    public final /* synthetic */ lam a;
    
    public lal(final lam a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (lam.a) {
            final lam a = this.a;
            final int e = a.e;
            boolean b = true;
            if (e == 2) {
                a.e = 3;
                a.b = true;
            }
            else {
                b = false;
            }
            monitorexit(lam.a);
            if (b) {
                this.a.b();
            }
        }
    }
}
