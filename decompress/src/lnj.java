import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import android.util.LruCache;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnj implements lni
{
    public static final int a;
    public static final Map b;
    public static final loh c;
    public final LruCache d;
    public final LruCache e;
    public final log f;
    
    static {
        a = cp.b(ojk.class.getName());
        final nnt nnt = new nnt();
        nnt.d(0, "WIRETYPE_VARINT");
        nnt.d(1, "WIRETYPE_FIXED64");
        nnt.d(2, "WIRETYPE_LENGTH_DELIMITED");
        nnt.d(3, "WIRETYPE_START_GROUP");
        nnt.d(4, "WIRETYPE_END_GROUP");
        nnt.d(5, "WIRETYPE_FIXED32");
        nnt.b();
        b = new HashMap();
        c = new loh();
    }
    
    public lnj(final log f) {
        this.d = new lnn();
        this.e = new LruCache(100);
        this.f = f;
    }
    
    public static boolean a(final List list) {
        return !list.isEmpty();
    }
    
    public static boolean b(final int n, final int n2) {
        return n == lnj.a && n2 == 2;
    }
    
    public static boolean c(final lne lne, final List list, final lon lon, final niz niz) {
        for (final ooi ooi : list) {
            final ooh a = cp.a(ooi);
            lns a3;
            if (a.a == 1) {
                final lnu a2 = lnu.a;
                ood ood;
                if (a.a == 1) {
                    if ((ood = ood.b((int)a.b)) == null) {
                        ood = ood.a;
                    }
                }
                else {
                    ood = ood.a;
                }
                a3 = a2.a(ood, lne);
            }
            else {
                a3 = new loc(lnu.a, a, lne);
            }
            if (!a3.a()) {
                if (ovb.c()) {
                    final okt b = lon.b(3);
                    if (b.c) {
                        b.m();
                        b.c = false;
                    }
                    final ooj ooj = (ooj)b.b;
                    final ooj m = ooj.m;
                    ooj.i = ooi.bK;
                    ooj.a |= 0x80;
                    final ooh a4 = cp.a(ooi);
                    if (b.c) {
                        b.m();
                        b.c = false;
                    }
                    final ooj ooj2 = (ooj)b.b;
                    a4.getClass();
                    ooj2.j = a4;
                    ooj2.a |= 0x200;
                    if (niz.g()) {
                        b.B((int)niz.c());
                    }
                    lon.a(b);
                }
                return false;
            }
        }
        return true;
    }
    
    public static List d(final ptb ptb) {
        final ptc ptc = Collections.unmodifiableMap((Map<?, ? extends ptc>)ptb.c).get(-2032180703);
        if (ptc == null) {
            return nns.l();
        }
        return new olh(ptc.b, ptc.c);
    }
    
    public static List e(final ptf ptf) {
        final ptc ptc = Collections.unmodifiableMap((Map<?, ? extends ptc>)ptf.a).get(-2032180703);
        if (ptc == null) {
            return nns.l();
        }
        return new olh(ptc.b, ptc.c);
    }
}
