import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvo implements oun
{
    private final pii a;
    private final pii b;
    
    public dvo(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public static dvo a(final pii pii, final pii pii2) {
        return new dvo(pii, pii2);
    }
    
    public final BuildPayloadBurstSpecOptions b() {
        final cxl cxl = (cxl)this.a.get();
        final dwf dwf = (dwf)this.b.get();
        final BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions = new BuildPayloadBurstSpecOptions(GcamModuleJNI.new_BuildPayloadBurstSpecOptions__SWIG_0());
        final dwf c = dwf.c;
        float floatValue = -1.0f;
        if (dwf != c) {
            floatValue = (float)cxl.g(cxs.K).e(-1.0f);
        }
        buildPayloadBurstSpecOptions.b(floatValue);
        return buildPayloadBurstSpecOptions;
    }
}
