import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apy
{
    private static final Map a;
    
    static {
        final Map map = a = new HashMap();
        final aqj aqj = new aqj();
        aqj.q();
        map.put("dc:contributor", aqj);
        map.put("dc:language", aqj);
        map.put("dc:publisher", aqj);
        map.put("dc:relation", aqj);
        map.put("dc:subject", aqj);
        map.put("dc:type", aqj);
        final aqj aqj2 = new aqj();
        aqj2.q();
        aqj2.t();
        map.put("dc:creator", aqj2);
        map.put("dc:date", aqj2);
        final aqj aqj3 = new aqj();
        aqj3.q();
        aqj3.t();
        aqj3.s();
        aqj3.r();
        map.put("dc:description", aqj3);
        map.put("dc:rights", aqj3);
        map.put("dc:title", aqj3);
    }
    
    static void a(final apu apu, final aqi aqi) {
        final apx a = apu.a;
        acv.g(a, "http://purl.org/dc/elements/1.1/", true);
        final Iterator h = apu.a.h();
        while (h.hasNext()) {
            final apx c = h.next();
            if ("http://purl.org/dc/elements/1.1/".equals(c.a)) {
                for (int i = 1; i <= c.a(); ++i) {
                    final apx e = c.e(i);
                    final aqj aqj = apy.a.get(e.a);
                    if (aqj != null) {
                        if ((e.g().a & 0x300) == 0x0) {
                            final apx apx = new apx(e.a, aqj);
                            e.a = "[]";
                            apx.k(e);
                            apx.c = c;
                            c.j().set(i - 1, apx);
                            if (aqj.i() && !e.g().c()) {
                                e.m(new apx("xml:lang", "x-default", null));
                            }
                        }
                        else {
                            e.g().f(7680, false);
                            e.g().b(aqj);
                            if (aqj.i()) {
                                c(e);
                            }
                        }
                    }
                }
            }
            else if ("http://ns.adobe.com/exif/1.0/".equals(c.a)) {
                final apx e2 = acv.e(c, "exif:GPSTimeStamp", false);
                if (e2 != null) {
                    try {
                        final apo v = zv.v(e2.b);
                        if (v.a == 0 && v.b == 0 && v.c == 0) {
                            apx apx2;
                            if ((apx2 = acv.e(c, "exif:DateTimeOriginal", false)) == null) {
                                apx2 = acv.e(c, "exif:DateTimeDigitized", false);
                            }
                            final apo v2 = zv.v(apx2.b);
                            final Calendar a2 = v.a();
                            a2.set(1, v2.a);
                            a2.set(2, v2.b);
                            a2.set(5, v2.c);
                            e2.b = zv.u(new apo(a2));
                        }
                    }
                    catch (final ape ape) {}
                }
                final apx e3 = acv.e(c, "exif:UserComment", false);
                if (e3 == null) {
                    continue;
                }
                c(e3);
            }
            else if ("http://ns.adobe.com/xmp/1.0/DynamicMedia/".equals(c.a)) {
                final apx e4 = acv.e(c, "xmpDM:copyright", false);
                if (e4 == null) {
                    continue;
                }
                try {
                    final apx g = acv.g(apu.a, "http://purl.org/dc/elements/1.1/", true);
                    final String b = e4.b;
                    final apx e5 = acv.e(g, "dc:rights", false);
                    if (e5 != null && e5.s()) {
                        int n;
                        if ((n = acv.d(e5, "x-default")) < 0) {
                            apu.i(e5.e(1).b);
                            n = acv.d(e5, "x-default");
                        }
                        final apx e6 = e5.e(n);
                        final String b2 = e6.b;
                        int index = b2.indexOf("\n\n");
                        if (index < 0) {
                            if (!b.equals(b2)) {
                                final StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 2 + String.valueOf(b).length());
                                sb.append(b2);
                                sb.append("\n\n");
                                sb.append(b);
                                e6.b = sb.toString();
                            }
                        }
                        else {
                            index += 2;
                            if (!b2.substring(index).equals(b)) {
                                final String value = String.valueOf(b2.substring(0, index));
                                final String value2 = String.valueOf(b);
                                String concat;
                                if (value2.length() != 0) {
                                    concat = value.concat(value2);
                                }
                                else {
                                    concat = new String(value);
                                }
                                e6.b = concat;
                            }
                        }
                    }
                    else {
                        final String value3 = String.valueOf(b);
                        String concat2;
                        if (value3.length() != 0) {
                            concat2 = "\n\n".concat(value3);
                        }
                        else {
                            concat2 = new String("\n\n");
                        }
                        apu.i(concat2);
                    }
                    e4.c.o(e4);
                }
                catch (final ape ape2) {}
            }
            else {
                if (!"http://ns.adobe.com/xap/1.0/rights/".equals(c.a)) {
                    continue;
                }
                final apx e7 = acv.e(c, "xmpRights:UsageTerms", false);
                if (e7 == null) {
                    continue;
                }
                c(e7);
            }
        }
        if (a.g) {
            a.g = false;
            final boolean h2 = aqi.h(4);
            for (final apx apx3 : Collections.unmodifiableList((List<? extends apx>)new ArrayList<apx>(a.j()))) {
                if (apx3.g) {
                    final Iterator h3 = apx3.h();
                    while (h3.hasNext()) {
                        final apx apx4 = h3.next();
                        if (apx4.h) {
                            apx4.h = false;
                            final apz e8 = aph.a.e(apx4.a);
                            if (e8 == null) {
                                continue;
                            }
                            final apx h4 = acv.h(a, e8.a, null, true);
                            h4.f = false;
                            final String b3 = e8.b;
                            final String c2 = e8.c;
                            String concat3;
                            if (c2.length() != 0) {
                                concat3 = b3.concat(c2);
                            }
                            else {
                                concat3 = new String(b3);
                            }
                            final apx e9 = acv.e(h4, concat3, false);
                            if (e9 == null) {
                                if (e8.d.d()) {
                                    final String b4 = e8.b;
                                    final String c3 = e8.c;
                                    String concat4;
                                    if (c3.length() != 0) {
                                        concat4 = b4.concat(c3);
                                    }
                                    else {
                                        concat4 = new String(b4);
                                    }
                                    apx4.a = concat4;
                                    h4.k(apx4);
                                    h3.remove();
                                }
                                else {
                                    final String b5 = e8.b;
                                    final String c4 = e8.c;
                                    String concat5;
                                    if (c4.length() != 0) {
                                        concat5 = b5.concat(c4);
                                    }
                                    else {
                                        concat5 = new String(b5);
                                    }
                                    final apx apx5 = new apx(concat5, e8.d.b());
                                    h4.k(apx5);
                                    d(h3, apx4, apx5);
                                }
                            }
                            else if (e8.d.d()) {
                                if (h2) {
                                    b(apx4, e9, true);
                                }
                                h3.remove();
                            }
                            else {
                                apx apx6;
                                if (e8.d.c()) {
                                    final int d = acv.d(e9, "x-default");
                                    if (d != -1) {
                                        apx6 = e9.e(d);
                                    }
                                    else {
                                        apx6 = null;
                                    }
                                }
                                else if (e9.s()) {
                                    apx6 = e9.e(1);
                                }
                                else {
                                    apx6 = null;
                                }
                                if (apx6 == null) {
                                    d(h3, apx4, e9);
                                }
                                else {
                                    if (h2) {
                                        b(apx4, apx6, true);
                                    }
                                    h3.remove();
                                }
                            }
                        }
                    }
                    apx3.g = false;
                }
            }
        }
        final String a3 = a.a;
        if (a3 != null && a3.length() >= 36) {
            String s2;
            final String s = s2 = a.a.toLowerCase();
            if (s.startsWith("uuid:")) {
                s2 = s.substring(5);
            }
            if (apn.c(s2)) {
                final apx f = acv.f(a, acw.b("http://ns.adobe.com/xap/1.0/mm/", "InstanceID"), true, null);
                if (f == null) {
                    throw new ape("Failure creating xmpMM:InstanceID", 9);
                }
                f.e = null;
                final String value4 = String.valueOf(s2);
                String concat6;
                if (value4.length() != 0) {
                    concat6 = "uuid:".concat(value4);
                }
                else {
                    concat6 = new String("uuid:");
                }
                f.b = concat6;
                f.p();
                final aqj g2 = f.g();
                g2.v(false);
                g2.u(false);
                g2.w(false);
                f.d = null;
                a.a = null;
            }
        }
        final Iterator h5 = a.h();
        while (h5.hasNext()) {
            if (!((apx)h5.next()).s()) {
                h5.remove();
            }
        }
    }
    
    private static void b(final apx apx, final apx apx2, final boolean b) {
        if (!apx.b.equals(apx2.b) || apx.a() != apx2.a()) {
            throw new ape("Mismatch between alias and base nodes", 203);
        }
        if (!b && (!apx.a.equals(apx2.a) || !apx.g().equals(apx2.g()) || apx.b() != apx2.b())) {
            throw new ape("Mismatch between alias and base nodes", 203);
        }
        final Iterator h = apx.h();
        final Iterator h2 = apx2.h();
        while (h.hasNext() && h2.hasNext()) {
            b(h.next(), (apx)h2.next(), false);
        }
        final Iterator i = apx.i();
        final Iterator j = apx2.i();
        while (i.hasNext() && j.hasNext()) {
            b(i.next(), (apx)j.next(), false);
        }
    }
    
    private static void c(final apx apx) {
        if (apx != null && apx.g().d()) {
            final aqj g = apx.g();
            g.t();
            g.s();
            g.r();
            final Iterator h = apx.h();
            while (h.hasNext()) {
                final apx apx2 = h.next();
                if (apx2.g().l()) {
                    h.remove();
                }
                else {
                    if (apx2.g().c()) {
                        continue;
                    }
                    final String b = apx2.b;
                    if (b != null && b.length() != 0) {
                        apx2.m(new apx("xml:lang", "x-repair", null));
                    }
                    else {
                        h.remove();
                    }
                }
            }
        }
    }
    
    private static void d(final Iterator iterator, final apx apx, final apx apx2) {
        if (apx2.g().i()) {
            if (apx.g().c()) {
                throw new ape("Alias to x-default already has a language qualifier", 203);
            }
            apx.m(new apx("xml:lang", "x-default", null));
        }
        iterator.remove();
        apx.a = "[]";
        apx2.k(apx);
    }
}
