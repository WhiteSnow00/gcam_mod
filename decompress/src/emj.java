// 
// Decompiled by Procyon v0.6.0
// 

public final class emj implements hub
{
    public final oui a;
    private final oui b;
    private final ofn c;
    private final oui d;
    private final oui e;
    private final ixn f;
    private final klv g;
    private final kjm h;
    private final kse i;
    private final bmq j;
    
    public emj(final bmq j, final ofn c, final oui b, final ixn f, final oui a, final oui d, final oui e, final klv g, final kjm h, final kse i) {
        this.j = j;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        this.i.f("EssentialUiInit#start");
        this.g.aR(hjg.e);
        if (bmx.m(this.j.a())) {
            ((crg)this.b.get()).h(lfu.a);
        }
        this.c.o(this.f);
        this.i.h("EssentialUiInit#prewarm");
        this.e.get();
        this.d.get();
        this.i.g();
        this.h.execute(this.i.c("EssentialUiInit#wire", new emi(this)));
    }
}
