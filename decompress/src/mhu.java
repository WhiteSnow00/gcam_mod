import java.util.Iterator;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mhu extends mep
{
    public mhu(final oui oui, final Context context) {
        super("CrashMetric", oui, context);
    }
    
    @Override
    public final noi a(final psp psp) {
        if ((psp.a & 0x40) != 0x0) {
            psc psc;
            if ((psc = psp.g) == null) {
                psc = psc.l;
            }
            ocd ocd;
            if ((ocd = psc.j) == null) {
                ocd = ocd.d;
            }
            final nog d = noi.D();
            occ occ;
            if ((occ = ocd.b) == null) {
                occ = occ.f;
            }
            d.g(occ.c);
            final Iterator<Object> iterator = ocd.c.iterator();
            while (iterator.hasNext()) {
                d.g(iterator.next().c);
            }
            return d.f();
        }
        return nqr.a;
    }
}
