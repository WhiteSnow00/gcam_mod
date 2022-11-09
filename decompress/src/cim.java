// 
// Decompiled by Procyon v0.6.0
// 

public final class cim
{
    public final ckn a;
    public final kna b;
    private final knq c;
    private final knq d;
    
    public cim(final ckn a, final kna b, final knq c, final knq d, final byte[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final kno a(final lfj lfj, final kmv kmv, final jbm jbm) {
        knq knq;
        if (jbm == jbm.f) {
            knq = this.d;
        }
        else {
            knq = this.c;
        }
        final niz a = knq.a(kmv, lfj, this.a.b(), this.a.b.a(cwv.a), this.a.b.j(cwv.s));
        njo.p(a.g(), "No supported CamcorderProfile.");
        a.c();
        return (kno)a.c();
    }
}
