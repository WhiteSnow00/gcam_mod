import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crl implements csg
{
    public final crw a;
    private final kjm b;
    private final ctr c;
    private final csf d;
    private final eyt e;
    private final krr f;
    private final crz g;
    
    public crl(final csf d, final kjm b, final ctr c, final crw a, final eyt e, final krr krr, final crz g) {
        this.d = d;
        this.b = b;
        this.c = c;
        this.a = a;
        this.e = e;
        this.g = g;
        this.f = krr.a("CamUnavailableHndlr");
    }
    
    @Override
    public final void a() {
        this.c.i();
    }
    
    @Override
    public final void b() {
        this.c.j();
        ofi.w(this.c.c(), new crk(this), this.b);
    }
    
    @Override
    public final void c() {
        this.c.k();
        ofi.w(this.c.d(), new crk(this, 1), this.b);
    }
    
    public final void d(final ctk ctk, int d, final int n, final int n2) {
        this.f.b(ctk.toString());
        d = csb.d(ctk, d, n, this.a.g());
        kc kc;
        if (d == 4) {
            kc = this.d.a(n2);
        }
        else if (d == 3) {
            kc = this.d.c(n2);
        }
        else {
            kc = this.d.b(n2);
        }
        if (this.g.b(kc)) {
            final krr f = this.f;
            final String a = csi.a(n2);
            final String q = och.q(d);
            final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 88 + String.valueOf(q).length());
            sb.append("Showing hardware help dialog for unavailability of any cameras due to reason: ");
            sb.append(a);
            sb.append(" at stage ");
            sb.append(q);
            f.b(sb.toString());
            this.e.P(2, d, n2, null, 0);
        }
    }
}
