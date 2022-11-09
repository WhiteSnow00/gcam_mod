import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghs extends kmg
{
    private final boolean a;
    private final boolean b;
    
    public ghs(final fxu fxu, final ggu ggu, final klj klj, final klj klj2, final klj klj3, final dxr dxr) {
        boolean b = false;
        super(klq.b(ggu, klj, klj2, klj3, dxr.a));
        this.a = fxu.G();
        if (fxu.l() == lfu.a) {
            b = true;
        }
        this.b = b;
    }
    
    private static fzp d(final ghd ghd, final boolean b) {
        if (!ghd.a && !ghd.b) {
            if (ghd.d) {
                return fzp.c;
            }
            return fzp.a;
        }
        else if (b) {
            if (ghd.d) {
                return fzp.d;
            }
            return fzp.b;
        }
        else {
            if (ghd.d) {
                return fzp.c;
            }
            return fzp.a;
        }
    }
}
