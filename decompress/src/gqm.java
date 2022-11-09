import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqm extends gqt
{
    private final gqr a;
    private final kse b;
    
    public gqm(final gue gue, final gqr a, final kse b, final gnu gnu, final Set set, final gfg gfg) {
        super(gue, gfg, set, b, gnu);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        this.b.f("pckHdrZsl#captureImage");
        super.c(gff, gen);
        this.b.g();
    }
    
    @Override
    protected final boolean d(final List list, final gff gff, final gen gen) {
        this.b.f("pckHdrZsl#process");
        this.a.g(list, gff, gen);
        this.b.g();
        return true;
    }
}
