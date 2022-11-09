import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crv
{
    public final kjm a;
    public final csh b;
    public final krr c;
    public final crz d;
    public final crw e;
    private final ctr f;
    
    public crv(final kjm a, final ctr f, final csh b, final crw e, final krr krr, final crz d) {
        this.a = a;
        this.f = f;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = krr.a("FallbackHandler");
    }
    
    public final void a(final lfu lfu, final int n, final int n2) {
        oey oey;
        int n3;
        int n4;
        if (n2 == 3) {
            oey = this.f.b(lfu);
            n3 = this.e.d();
            n4 = this.e.c();
        }
        else {
            oey = this.f.a(lfu);
            n3 = this.e.b();
            n4 = this.e.a();
        }
        ofi.w(oey, new cru(this, lfu, n, n2, n3, n4), this.a);
    }
}
