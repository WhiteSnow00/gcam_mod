import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlu
{
    public final List a;
    public final List b;
    public dla c;
    public final List d;
    private final dni e;
    
    public dlu(final dni e) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = dld.a;
        this.d = new ArrayList();
        this.e = e;
    }
    
    public final dly a() {
        return new dly(this.e, this.c, new dlm(this), new dls(this), new dlt(this));
    }
    
    public final void b(final dkx dkx) {
        this.b.add(dkx);
    }
    
    public final void c(final dky dky) {
        this.a.add(dky);
    }
    
    public final void d(final dlx dlx) {
        this.b(new dln(dlx));
    }
}
