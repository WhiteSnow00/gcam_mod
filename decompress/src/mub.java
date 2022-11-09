import java.util.concurrent.Executor;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mub extends msu
{
    private final omj a;
    
    public mub(final omj a) {
        this.a = a;
    }
    
    @Override
    public final oey a(final IOException ex, final mtl mtl) {
        if (!(ex.getCause() instanceof olm)) {
            return ofi.m(ex);
        }
        final oey n = ofi.n(this.a);
        final mtm a = mtl.a;
        return oco.i(odg.i(n, nhu.b(new mth(a)), a.c), IOException.class, new mua(ex), odx.a);
    }
}
