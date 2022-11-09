import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class der
{
    private final float a;
    
    public der(final cxl cxl) {
        this.a = (float)cxl.g(cxr.bg).c();
    }
    
    public static final lfj b(final lfh lfh, final cxl cxl, final lfu lfu) {
        final cxo a = cxr.a;
        cxl.b();
        cxl.b();
        final kts kts = new kts(new ktp(lfh), lfh);
        kts.b = new ktr(kts.b, new kto(lfu));
        (kts.b = new ktr(kts.b, new ktn(kts))).b();
        final lfg a2 = kts.b.a();
        if (a2 == null) {
            return null;
        }
        return ((lff)a2).a;
    }
    
    public final float a(final lfg lfg) {
        final double c = lfe.c(lfg);
        final List t = lfg.t();
        final float a = this.a;
        final double c2 = lfe.c(lfg);
        final Iterator iterator = lfg.t().iterator();
        double n = -100.0;
        float floatValue = -1.0f;
        while (iterator.hasNext()) {
            final Float n2 = (Float)iterator.next();
            final double a2 = lfe.a(n2, c2);
            final double n3 = a;
            Double.isNaN(n3);
            final double abs = Math.abs(a2 - n3);
            Double.isNaN(n3);
            if (abs < Math.abs(n - n3)) {
                floatValue = n2;
                n = a2;
            }
        }
        return (float)(c / lfe.b(lfe.a(floatValue, c), Collections.min((Collection<? extends Float>)t)));
    }
}
