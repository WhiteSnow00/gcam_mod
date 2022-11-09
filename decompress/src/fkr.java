import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkr
{
    public static final fjx a;
    public static final fjx b;
    
    static {
        a = new fjx(20.0f, 300.0f);
        b = new fjx(40.0f, 600.0f);
    }
    
    public static List a(final fjo fjo, final ddm ddm) {
        final fku fku = new fku(1);
        float n;
        if (!ddm.c()) {
            n = 0.15f;
        }
        else {
            n = 0.5f;
        }
        final fkt fkt = new fkt(n);
        final fku fku2 = new fku();
        fky fky;
        if (ddm.c()) {
            fky = fkx.a(fjo, fkr.b);
        }
        else {
            fky = fkx.a(fjo, fkr.a);
        }
        return nqb.p(fku, fkt, fku2, fky, new fkw(fjo), new fku(2));
    }
}
