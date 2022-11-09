import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyl implements dyr
{
    public static final nsd a;
    public final fxu b;
    public final oui c;
    public final Executor d;
    public final kse e;
    public final AtomicLong f;
    public final Map g;
    private final dyp i;
    private final dty j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/deblurfusion/PostProcessingDeblurFusionImageSaverImpl");
    }
    
    public dyl(final dyp i, final fxu b, final dty j, final oui c, final Executor d, final kse e) {
        this.f = new AtomicLong(0L);
        this.i = i;
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = new HashMap();
    }
    
    private final dyk d(final gen gen, final dtx dtx) {
        final String s = gen.b.s();
        dyk dyk;
        if ((dyk = this.g.get(s)) == null) {
            dyk = new dyk(this, gen, dtx, this.i);
            this.g.put(s, dyk);
        }
        return dyk;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return this.d(gen, this.j.a());
    }
    
    @Override
    public final dws c(final gen gen) {
        return this.d(gen, this.j.a());
    }
}
