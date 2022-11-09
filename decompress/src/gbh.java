import java.util.concurrent.Executor;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

final class gbh implements gdg
{
    public static final nsd a;
    public final gxp b;
    public final Rect c;
    public final Executor d;
    private final boa e;
    private final gci f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/imagesaver/imagesavers/YuvImageBackendImageSaver");
    }
    
    public gbh(final boa e, final gxp b, final gij gij, final gci f) {
        this.e = e;
        this.b = b;
        this.f = f;
        this.c = gij.c;
        this.d = mcn.h("BckndYuvEx");
    }
    
    @Override
    public final gdf a(final gen gen) {
        final kra d = this.e.d();
        return new gap(new gbg(this, gen.b, d, new gbj(gen.b, d), new gcj(this.f.a, gcf.b)));
    }
    
    @Override
    public final gdf b(final gen gen) {
        return this.a(gen);
    }
}
