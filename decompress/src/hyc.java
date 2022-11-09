// 
// Decompiled by Procyon v0.6.0
// 

public final class hyc
{
    public final klv a;
    public final klv b;
    public final klv c;
    public final klv d;
    public final hko e;
    public final hkn f;
    public final hkc g;
    public final hkd h;
    
    public hyc(final klv a, final klv b, final klv c, final klv d, final hko e, final hkn f, final hkc g, final hkd h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a() {
        if (this.g.c(hjq.D)) {
            this.h.d(hjq.D, false);
        }
        this.a.aR(this.g.c(hjq.F));
        this.b.aR(this.g.c(hjq.G));
        this.c.aR(this.g.c(hjq.H));
        this.h.d(hjq.r, this.g.c(hjq.I));
        this.d.aR(this.g.c(hjq.J));
        this.e.aR(hjh.a((String)this.g.c(hjq.K)));
        this.f.a.aR(hjd.a((String)this.g.c(hjq.L)));
    }
    
    public final void b(final hyj hyj) {
        if (hyj.b >= 1000000000L && (boolean)this.g.c(hjq.D) && (boolean)this.g.c(hjq.E)) {
            this.a();
        }
        this.h.d(hjq.E, hyj.b < 1000000000L);
    }
}
