// 
// Decompiled by Procyon v0.6.0
// 

public final class gew implements gfg
{
    private final gfg a;
    private final niz b;
    private final efp c;
    private final efp d;
    private final fxu e;
    private final efp f;
    private final boolean g;
    private final boolean h;
    private final krr i;
    private final hkc j;
    
    public gew(final gfg a, final niz b, final fxu e, final oui oui, final oui oui2, final oui oui3, final boolean g, final boolean h, final krq krq, final hkc j) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = efp.a(oui);
        this.c = efp.a(oui2);
        this.d = efp.a(oui3);
        this.g = g;
        this.h = h;
        this.i = krq.a("MicrovideoCapCmd");
        this.j = j;
    }
    
    @Override
    public final klj a() {
        return this.a.a();
    }
    
    @Override
    public final klj b() {
        return this.a.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        if (this.f.c() && !(boolean)this.j.c(hjq.R)) {
            ((haw)this.f.b()).a.set(true);
        }
        final boolean b = this.g ^ true;
        final boolean i = gen.a.i;
        final krr j = this.i;
        final boolean c = this.c.c();
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57);
        sb.append("captureImage: microvideoApi present=");
        sb.append(c);
        sb.append(" primaryCommand=");
        sb.append(value);
        j.f(sb.toString());
        final hhy b2 = gen.b;
        niz niz;
        if (b2 instanceof hgs) {
            niz = niz.i(b2);
        }
        else {
            niz = nii.a;
        }
        if (!niz.g()) {
            final krr k = this.i;
            final String value2 = String.valueOf(b2);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 33);
            sb2.append("Capture session not a Photo one: ");
            sb2.append(value2);
            k.h(sb2.toString());
        }
        final boolean c2 = this.c.c();
        final fjv fjv = null;
        fjv a = null;
        if (c2 && (b || i) && niz.g()) {
            final int b3 = boa.b(gen.a.a, this.e);
            if (this.d.c()) {
                a = ((fjw)this.d.b()).a(gen.b.d(), gen.b.h());
            }
            final hgs hgs = (hgs)niz.c();
            final fet fet = (fet)this.c.b();
            final boolean h = this.h;
            oey oey;
            if (a != null) {
                oey = a.a;
            }
            else {
                oey = ofi.n(nii.a);
            }
            hgs.c = niz.i(fet.a(b2, b3, h, oey));
        }
        else {
            a = fjv;
        }
        if (!b && !i && this.b.g()) {
            ((gfg)this.b.c()).c(gff, gen);
        }
        else {
            this.a.c(gff, gen);
        }
        if (a != null) {
            synchronized (a.f) {
                if (!a.c) {
                    a.a.o(nii.a);
                }
                a.b.close();
            }
        }
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.a = true;
        c.b("primaryCommand", this.a);
        c.b("fallback", this.b.f());
        return c.toString();
    }
}
