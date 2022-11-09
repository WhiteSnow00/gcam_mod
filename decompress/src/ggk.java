import android.hardware.camera2.CaptureRequest$Key;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggk implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public ggk(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public ggk(final pii b, final pii a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public static ggk a(final pii pii, final pii pii2) {
        return new ggk(pii, pii2);
    }
    
    public final Boolean b() {
        final int c = this.c;
        boolean b = false;
        switch (c) {
            default: {
                final niz niz = (niz)((ouo)this.b).a;
                final pii a = this.a;
                if (niz.g() && (boolean)niz.c() && (boolean)a.get()) {
                    b = true;
                }
                return b;
            }
            case 1: {
                final klv klv = (klv)this.b.get();
                final cxl cxl = (cxl)this.a.get();
                final CaptureRequest$Key a2 = jll.a;
                final cxm a3 = cxj.a;
                cxl.d();
                ((Boolean)klv.aQ()).booleanValue();
                cxl.b();
                return false;
            }
            case 0: {
                return ggj.f((niz)this.a.get(), (Map)this.b.get());
            }
        }
    }
}
