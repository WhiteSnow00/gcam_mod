import com.integrity.annotations.PaiConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fdz
{
    private final boolean a;
    private final gen b;
    private final fxu c;
    private final efp d;
    private final efp e;
    private final efp f;
    private final oui g;
    
    public fdz(final niz niz, final oui oui, final oui oui2, final oui oui3, final oui g, final fxu c, final gen b) {
        this.a = (boolean)niz.e(false);
        this.d = efp.a(oui);
        this.e = efp.a(oui2);
        this.f = efp.a(oui3);
        this.g = g;
        this.b = b;
        this.c = c;
    }
    
    private static fur d(final gue gue) {
        return new gpu(gue, 1);
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    public niz a() {
        if (!this.d.c()) {
            return nii.a;
        }
        final gen b = this.b;
        return niz.i(((fet)this.d.b()).a(b.b, boa.b(b.a.a, this.c), false, ofi.n(nii.a)));
    }
    
    public final void b() {
        if (this.a) {
            ((fun)this.e.b()).k(d((gue)this.g.get()), this.b);
            ((fuu)this.f.b()).f(this.b.b.h());
        }
    }
    
    public final void c() {
        if (this.a) {
            ((fun)this.e.b()).i(d((gue)this.g.get()), this.b);
        }
    }
}
