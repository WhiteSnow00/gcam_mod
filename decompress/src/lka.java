import java.util.Comparator;
import android.util.ArraySet;
import android.util.ArrayMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class lka implements ljz
{
    public final ArrayMap a;
    
    public lka(final lkp lkp, final boolean b) {
        this.a = new ArrayMap();
        final nog d = noi.D();
        d.i(lkp.e);
        d.i(lkp.f);
        final noi f = d.f();
        final int size = f.size();
        int n = 1;
        if (size == 1) {
            return;
        }
        final ArraySet set = new ArraySet(f.size());
        final ArraySet set2 = new ArraySet(f.size());
        final nrv bn = f.bN();
        while (bn.hasNext()) {
            final lkd lkd = bn.next();
            final String d2 = lkd.e.i().d;
            final String value = String.valueOf(lkd.e.i().a);
            final String b2 = lkd.e.i().b;
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 1 + b2.length());
            sb.append(value);
            sb.append("|");
            sb.append(b2);
            final String string = sb.toString();
            if (!set.add((Object)d2)) {
                break;
            }
            if (!set2.add((Object)string)) {
                break;
            }
        }
        if (set.size() == f.size() && set2.size() == f.size()) {
            return;
        }
        if (!b) {
            final ArraySet set3 = new ArraySet(f.size());
            final nrv bn2 = f.bN();
            while (bn2.hasNext()) {
                final lkd lkd2 = bn2.next();
                final String c = lkd2.c;
                final String d3 = lkd2.e.i().d;
                final StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 1 + d3.length());
                sb2.append(c);
                sb2.append("|");
                sb2.append(d3);
                if (!set3.add((Object)sb2.toString())) {
                    break;
                }
            }
            if (set3.size() == f.size()) {
                return;
            }
        }
        final bzj r = bzj.r;
        noq p2 = null;
        Label_0454: {
            if (nrr.k(r, f) && f instanceof noq) {
                p2 = (noq)f;
                if (!p2.bO()) {
                    break Label_0454;
                }
            }
            final Object[] g = nov.g(f);
            p2 = noq.P(r, g.length, g);
        }
        final nrv bn3 = p2.bN();
        lkd lkd3 = null;
        while (bn3.hasNext()) {
            final lkd lkd4 = bn3.next();
            int n2 = n;
            Label_0579: {
                if (lkd3 != null) {
                    if (lkd3.b == lkd4.b && (!nov.H(lkd3.c, lkd4.c) || !nov.H(lkd3.e.i().d, lkd4.e.i().d))) {
                        n2 = n;
                        if (!b) {
                            break Label_0579;
                        }
                        n2 = n;
                        if (nov.H(lkd3.c, lkd4.c)) {
                            break Label_0579;
                        }
                    }
                    n2 = n + 1;
                }
            }
            this.a.put((Object)lkd4, (Object)n2);
            lkd3 = lkd4;
            n = n2;
        }
    }
}
