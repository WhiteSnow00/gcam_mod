import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ViewfinderProcessingOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvq implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    private final pii d;
    
    public dvq(final pii a, final pii b, final pii c, final pii d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dvq a(final pii pii, final pii pii2, final pii pii3, final pii pii4) {
        return new dvq(pii, pii2, pii3, pii4);
    }
    
    public final ViewfinderProcessingOptions b() {
        final dug dug = (dug)this.a.get();
        final dwf dwf = (dwf)this.b.get();
        final cxl cxl = (cxl)this.c.get();
        final dub dub = (dub)this.d.get();
        final ViewfinderProcessingOptions viewfinderProcessingOptions = new ViewfinderProcessingOptions(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_0());
        final boolean i = dug.i;
        if (dwf == dwf.c) {
            viewfinderProcessingOptions.b(true);
        }
        final cxo a = cxs.a;
        cxl.b();
        GcamModuleJNI.ViewfinderProcessingOptions_verbose_set(viewfinderProcessingOptions.a, viewfinderProcessingOptions, false);
        viewfinderProcessingOptions.c(dub.e());
        return viewfinderProcessingOptions;
    }
}
