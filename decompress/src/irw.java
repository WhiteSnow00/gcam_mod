import java.util.EnumMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irw
{
    private final efm a;
    private final Map b;
    
    public irw(final Context e, final efm a, final cxl cxl) {
        this.a = a;
        final boolean k = cxl.k(cxr.at);
        final EnumMap b = new EnumMap((Class<K>)irv.class);
        for (final irv irv : irv.values()) {
            final irg irg = new irg();
            irg.d = e.getString(irv.i);
            irg.e = e;
            irg.h = 11;
            irg.b = 5000;
            irg.g = k;
            b.put((Object)irv, irg.a());
        }
        this.b = b;
    }
    
    public final void a(final irv irv) {
        final irf irf = this.b.get(irv);
        if (irf != null) {
            this.a.e(irf);
        }
    }
}
