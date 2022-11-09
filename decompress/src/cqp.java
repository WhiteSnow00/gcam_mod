// 
// Decompiled by Procyon v0.6.0
// 

public final class cqp
{
    private final niz a;
    private final cxl b;
    private final cek c;
    
    public cqp(final niz a, final cxl b, final cek c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final cfo cfo) {
        if (this.a.g()) {
            this.b();
            if (cfo.y == lfu.b && this.c.d()) {
                final kmv e = cfo.e;
                final kmt d = cfo.d;
                if (!this.b.k(cwv.F) || e != kmv.i || d.i != 60) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final void b() {
        final cxl b = this.b;
        final cxo a = cwv.a;
        b.f();
    }
}
