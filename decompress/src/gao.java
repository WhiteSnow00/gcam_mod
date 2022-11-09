import android.graphics.Rect;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gao implements gdg
{
    public final krr a;
    public final kse b;
    public final gxp c;
    public final Executor d;
    public final Rect e;
    private final boa f;
    private final gdg g;
    private final gye h;
    
    public gao(final krq krq, final boa f, final gxp c, final gij gij, final gye h, final gdg g, final kse b) {
        this.a = krq.a("LSRprcssngIS");
        this.b = b;
        this.f = f;
        this.g = g;
        this.c = c;
        this.d = mcn.e("LuckyShotEx");
        this.e = gij.c;
        this.h = h;
    }
    
    @Override
    public final gdf a(final gen gen) {
        final gdf a = this.g.a(gen);
        a.getClass();
        return new gan(this, gen, a, this.f, this.h);
    }
    
    @Override
    public final gdf b(final gen gen) {
        final gdf b = this.g.b(gen);
        b.getClass();
        return new gan(this, gen, b, this.f, this.h);
    }
}
