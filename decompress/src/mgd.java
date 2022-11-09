import java.util.regex.Matcher;
import java.util.List;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class mgd
{
    private static final njk b;
    private static final Pattern c;
    final ConcurrentHashMap a;
    
    static {
        b = njk.b('/');
        c = Pattern.compile("^(\\*[a-z]+\\*).*");
    }
    
    public mgd() {
        this.a = new ConcurrentHashMap();
    }
    
    static String a(final String s) {
        final List f = mgd.b.f(s);
        if (f.size() != 3) {
            return "MALFORMED";
        }
        return (String)f.get(0);
    }
    
    final pri b(pri pri) {
        prd prd;
        if ((prd = pri.d) == null) {
            prd = prd.d;
        }
        pri pri2 = pri;
        if ((prd.a & 0x1) != 0x0) {
            prd prd2;
            if ((prd2 = pri.d) == null) {
                prd2 = prd.d;
            }
            final okt okt = (okt)prd2.H(5);
            okt.o(prd2);
            final Long n = (Long)this.a.get((Object)((prd)okt.b).b);
            n.getClass();
            final okt okt2 = (okt)pri.H(5);
            okt2.o(pri);
            final long longValue = n;
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final prd prd3 = (prd)okt.b;
            prd3.a |= 0x1;
            prd3.b = longValue;
            if (okt2.c) {
                okt2.m();
                okt2.c = false;
            }
            pri = (pri)okt2.b;
            final prd d = (prd)okt.h();
            d.getClass();
            pri.d = d;
            pri.a |= 0x4;
            pri2 = (pri)okt2.h();
        }
        return pri2;
    }
    
    final pri c(int a, pri pri) {
        prd prd;
        if ((prd = pri.d) == null) {
            prd = prd.d;
        }
        if ((prd.a & 0x2) != 0x0) {
            prd prd2;
            if ((prd2 = pri.d) == null) {
                prd2 = prd.d;
            }
            final okt okt = (okt)prd2.H(5);
            okt.o(prd2);
            final okt okt2 = (okt)pri.H(5);
            okt2.o(pri);
            String s = ((prd)okt.b).c;
            final Long a2 = ofz.a(s);
            a2.getClass();
            final long longValue = a2;
            final ConcurrentHashMap a3 = this.a;
            final Long value = longValue;
            if (!a3.containsKey((Object)value)) {
                switch (a - 1) {
                    case 2: {
                        s = "--";
                        break;
                    }
                    case 1: {
                        s = a(s);
                        break;
                    }
                    case 0: {
                        final Matcher matcher = mgd.c.matcher(s);
                        if (!matcher.matches()) {
                            break;
                        }
                        if (!s.startsWith("*sync*/")) {
                            s = matcher.group(1);
                            break;
                        }
                        final String value2 = String.valueOf(a(s.substring(7)));
                        if (value2.length() != 0) {
                            s = "*sync*/".concat(value2);
                            break;
                        }
                        s = new String("*sync*/");
                        break;
                    }
                }
                final Long a4 = ofz.a(s);
                if (a4 != null) {
                    this.a.putIfAbsent((Object)value, (Object)a4);
                }
            }
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final prd prd3 = (prd)okt.b;
            a = (prd3.a | 0x1);
            prd3.a = a;
            prd3.b = longValue;
            prd3.a = (a & 0xFFFFFFFD);
            prd3.c = prd.d.c;
            if (okt2.c) {
                okt2.m();
                okt2.c = false;
            }
            pri = (pri)okt2.b;
            final prd d = (prd)okt.h();
            d.getClass();
            pri.d = d;
            pri.a |= 0x4;
            return (pri)okt2.h();
        }
        return pri;
    }
}
