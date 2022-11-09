import java.util.Iterator;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acw
{
    static void a(final MediaMetadataRetriever mediaMetadataRetriever, final MediaDataSource dataSource) {
        mediaMetadataRetriever.setDataSource(dataSource);
    }
    
    public static aqd b(final String s, final String a) {
        if (s == null || a == null) {
            throw new ape("Parameter must not be null", 4);
        }
        final aqd aqd = new aqd();
        final aqc aqc = new aqc();
        aqc.a = a;
        while (aqc.e < aqc.a.length() && "/[*".indexOf(aqc.a.charAt(aqc.e)) < 0) {
            ++aqc.e;
        }
        final int e = aqc.e;
        final int d = aqc.d;
        if (e != d) {
            final String d2 = d(s, aqc.a.substring(d, e));
            final apz e2 = aph.a.e(d2);
            if (e2 == null) {
                aqd.c(new aqe(s, Integer.MIN_VALUE));
                aqd.c(new aqe(d2, 1));
            }
            else {
                aqd.c(new aqe(e2.a, Integer.MIN_VALUE));
                final aqe aqe = new aqe(d(e2.a, e2.c), 1);
                aqe.a();
                aqe.d = e2.d.a;
                aqd.c(aqe);
                if (e2.d.c()) {
                    final aqe aqe2 = new aqe("[?xml:lang='x-default']", 5);
                    aqe2.a();
                    aqe2.d = e2.d.a;
                    aqd.c(aqe2);
                }
                else if (e2.d.h(512)) {
                    final aqe aqe3 = new aqe("[1]", 3);
                    aqe3.a();
                    aqe3.d = e2.d.a;
                    aqd.c(aqe3);
                }
            }
            while (aqc.e < a.length()) {
                final int e3 = aqc.e;
                aqc.d = e3;
                if (a.charAt(e3) == '/' && ++aqc.d >= a.length()) {
                    throw new ape("Empty XMPPath segment", 102);
                }
                if (a.charAt(aqc.d) == '*') {
                    final int d3 = aqc.d + 1;
                    aqc.d = d3;
                    if (d3 >= a.length() || a.charAt(aqc.d) != '[') {
                        throw new ape("Missing '[' after '*'", 102);
                    }
                }
                final int d4 = aqc.d;
                aqc.e = d4;
                aqe aqe4;
                if (a.charAt(d4) != '[') {
                    aqc.b = aqc.d;
                    while (aqc.e < aqc.a.length() && "/[*".indexOf(aqc.a.charAt(aqc.e)) < 0) {
                        ++aqc.e;
                    }
                    final int e4 = aqc.e;
                    aqc.c = e4;
                    final int d5 = aqc.d;
                    if (e4 == d5) {
                        throw new ape("Empty XMPPath segment", 102);
                    }
                    aqe4 = new aqe(aqc.a.substring(d5, e4), 1);
                }
                else {
                    final int e5 = aqc.e + 1;
                    aqc.e = e5;
                    if (aqc.a.charAt(e5) >= '0' && aqc.a.charAt(aqc.e) <= '9') {
                        while (aqc.e < aqc.a.length() && aqc.a.charAt(aqc.e) >= '0' && aqc.a.charAt(aqc.e) <= '9') {
                            ++aqc.e;
                        }
                        aqe4 = new aqe(null, 3);
                    }
                    else {
                        while (aqc.e < aqc.a.length() && aqc.a.charAt(aqc.e) != ']' && aqc.a.charAt(aqc.e) != '=') {
                            ++aqc.e;
                        }
                        if (aqc.e >= aqc.a.length()) {
                            throw new ape("Missing ']' or '=' for array index", 102);
                        }
                        if (aqc.a.charAt(aqc.e) == ']') {
                            if (!"[last()".equals(aqc.a.substring(aqc.d, aqc.e))) {
                                throw new ape("Invalid non-numeric array index", 102);
                            }
                            aqe4 = new aqe(null, 4);
                        }
                        else {
                            aqc.b = aqc.d + 1;
                            int e6 = aqc.e;
                            aqc.c = e6;
                            ++e6;
                            aqc.e = e6;
                            final char char1 = aqc.a.charAt(e6);
                            if (char1 != '\'' && char1 != '\"') {
                                throw new ape("Invalid quote in array selector", 102);
                            }
                            ++aqc.e;
                            while (aqc.e < aqc.a.length()) {
                                if (aqc.a.charAt(aqc.e) == char1) {
                                    if (aqc.e + 1 >= aqc.a.length()) {
                                        break;
                                    }
                                    if (aqc.a.charAt(aqc.e + 1) != char1) {
                                        break;
                                    }
                                    ++aqc.e;
                                }
                                ++aqc.e;
                            }
                            if (aqc.e >= aqc.a.length()) {
                                throw new ape("No terminating quote for array selector", 102);
                            }
                            ++aqc.e;
                            aqe4 = new aqe(null, 6);
                        }
                    }
                    if (aqc.e >= aqc.a.length() || aqc.a.charAt(aqc.e) != ']') {
                        throw new ape("Missing ']' for array index", 102);
                    }
                    final int e7 = aqc.e + 1;
                    aqc.e = e7;
                    aqe4.a = aqc.a.substring(aqc.d, e7);
                }
                final int b = aqe4.b;
                if (b == 1) {
                    if (aqe4.a.charAt(0) == '@') {
                        final String value = String.valueOf(aqe4.a.substring(1));
                        String concat;
                        if (value.length() != 0) {
                            concat = "?".concat(value);
                        }
                        else {
                            concat = new String("?");
                        }
                        aqe4.a = concat;
                        if (!"?xml:lang".equals(aqe4.a)) {
                            throw new ape("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (aqe4.a.charAt(0) == '?') {
                        ++aqc.b;
                        aqe4.b = 2;
                    }
                    e(aqc.a.substring(aqc.b, aqc.c));
                }
                else if (b == 6) {
                    if (aqe4.a.charAt(1) == '@') {
                        final String value2 = String.valueOf(aqe4.a.substring(2));
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "[?".concat(value2);
                        }
                        else {
                            concat2 = new String("[?");
                        }
                        aqe4.a = concat2;
                        if (!aqe4.a.startsWith("[?xml:lang=")) {
                            throw new ape("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (aqe4.a.charAt(1) == '?') {
                        final int b2 = aqc.b + 1;
                        aqc.b = b2;
                        aqe4.b = 5;
                        e(aqc.a.substring(b2, aqc.c));
                    }
                }
                aqd.c(aqe4);
            }
            return aqd;
        }
        throw new ape("Empty initial XMPPath step", 102);
    }
    
    public static void c(final apu b, final OutputStream outputStream, final aqk e) {
        if (e.h(4096)) {
            b.a.r();
        }
        final aqb aqb = new aqb();
        try {
            aqb.c = new apk(outputStream);
            aqb.d = new OutputStreamWriter(aqb.c, e.b());
            aqb.b = b;
            aqb.e = e;
            aqb.g = e.b;
            aqb.d = new OutputStreamWriter(aqb.c, e.b());
            if (aqb.e.c() | aqb.e.d()) {
                aqb.f = 2;
            }
            if (aqb.e.i()) {
                if (aqb.e.k() | aqb.e.j()) {
                    throw new ape("Inconsistent options for exact size serialize", 103);
                }
                if ((aqb.e.b & aqb.f - 1) != 0x0) {
                    throw new ape("Exact size must be a multiple of the Unicode element", 103);
                }
            }
            else if (aqb.e.l()) {
                if (aqb.e.k() | aqb.e.j()) {
                    throw new ape("Inconsistent options for read-only packet", 103);
                }
                aqb.g = 0;
            }
            else if (aqb.e.k()) {
                if (aqb.e.j()) {
                    throw new ape("Inconsistent options for non-packet serialize", 103);
                }
                aqb.g = 0;
            }
            else {
                if (aqb.g == 0) {
                    aqb.g = aqb.f * 2048;
                }
                if (aqb.e.j() && !aqb.b.e("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                    aqb.g += aqb.f * 10000;
                }
            }
            if (!aqb.e.k()) {
                aqb.e(0);
                aqb.d("<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                aqb.f();
            }
            aqb.e(0);
            aqb.d("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
            aph.e();
            aqb.d("Adobe XMP Core 5.1.0-jc003");
            aqb.d("\">");
            aqb.f();
            aqb.e(1);
            aqb.d("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
            aqb.f();
            if (aqb.e.h(64)) {
                aqb.e(2);
                aqb.d("<rdf:Description rdf:about=");
                aqb.g();
                final HashSet set = new HashSet();
                set.add("xml");
                set.add("rdf");
                final Iterator h = aqb.b.a.h();
                while (h.hasNext()) {
                    aqb.i((apx)h.next(), set);
                }
                final Iterator h2 = aqb.b.a.h();
                boolean b2 = true;
                while (h2.hasNext()) {
                    b2 &= aqb.h(h2.next(), 3);
                }
                if (!b2) {
                    aqb.c(62);
                    aqb.f();
                    final Iterator h3 = aqb.b.a.h();
                    while (h3.hasNext()) {
                        aqb.a((apx)h3.next(), 3);
                    }
                    aqb.e(2);
                    aqb.d("</rdf:Description>");
                    aqb.f();
                }
                else {
                    aqb.d("/>");
                    aqb.f();
                }
            }
            else if (aqb.b.a.a() > 0) {
                final Iterator h4 = aqb.b.a.h();
                while (h4.hasNext()) {
                    final apx apx = h4.next();
                    aqb.e(2);
                    aqb.d("<rdf:Description rdf:about=");
                    aqb.g();
                    final HashSet set2 = new HashSet();
                    set2.add("xml");
                    set2.add("rdf");
                    aqb.i(apx, set2);
                    aqb.c(62);
                    aqb.f();
                    final Iterator h5 = apx.h();
                    while (h5.hasNext()) {
                        aqb.b((apx)h5.next(), false, 3);
                    }
                    aqb.e(2);
                    aqb.d("</rdf:Description>");
                    aqb.f();
                }
            }
            else {
                aqb.e(2);
                aqb.d("<rdf:Description rdf:about=");
                aqb.g();
                aqb.d("/>");
                aqb.f();
            }
            aqb.e(1);
            aqb.d("</rdf:RDF>");
            aqb.f();
            aqb.e(0);
            aqb.d("</x:xmpmeta>");
            aqb.f();
            String concat = "";
            if (!aqb.e.k()) {
                final String value = String.valueOf(String.valueOf("").concat("<?xpacket end=\""));
                char c;
                if (!aqb.e.l()) {
                    c = 'w';
                }
                else {
                    c = 'r';
                }
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 1);
                sb.append(value);
                sb.append(c);
                concat = String.valueOf(sb.toString()).concat("\"?>");
            }
            aqb.d.flush();
            final int length = concat.length();
            if (aqb.e.i()) {
                final int n = aqb.c.a + length * aqb.f;
                final int g = aqb.g;
                if (n > g) {
                    throw new ape("Can't fit into specified packet size", 107);
                }
                aqb.g = g - n;
            }
            aqb.g /= aqb.f;
            final int length2 = aqb.e.c.length();
            final int g2 = aqb.g;
            if (g2 >= length2) {
                aqb.g = g2 - length2;
                int g3;
                while (true) {
                    g3 = aqb.g;
                    final int n2 = length2 + 100;
                    if (g3 < n2) {
                        break;
                    }
                    aqb.j(100);
                    aqb.f();
                    aqb.g -= n2;
                }
                aqb.j(g3);
                aqb.f();
            }
            else {
                aqb.j(g2);
            }
            aqb.d(concat);
            aqb.d.flush();
            aqb.c.close();
        }
        catch (final IOException ex) {
            throw new ape("Error writing to the OutputStream", 0);
        }
    }
    
    private static String d(String s, final String s2) {
        if (s.length() == 0) {
            throw new ape("Schema namespace URI is required", 101);
        }
        if (s2.charAt(0) == '?' || s2.charAt(0) == '@') {
            throw new ape("Top level name must not be a qualifier", 102);
        }
        if (s2.indexOf(47) >= 0 || s2.indexOf(91) >= 0) {
            throw new ape("Top level name must be simple", 102);
        }
        final String a = aph.a.a(s);
        if (a == null) {
            throw new ape("Unregistered schema namespace URI", 101);
        }
        final int index = s2.indexOf(58);
        if (index < 0) {
            f(s2);
            s = String.valueOf(s2);
            if (s.length() != 0) {
                s = a.concat(s);
            }
            else {
                s = new String(a);
            }
            return s;
        }
        f(s2.substring(0, index));
        f(s2.substring(index));
        final String substring = s2.substring(0, index + 1);
        s = aph.a.a(s);
        if (s == null) {
            throw new ape("Unknown schema namespace prefix", 101);
        }
        if (substring.equals(s)) {
            return s2;
        }
        throw new ape("Schema namespace URI and prefix mismatch", 101);
    }
    
    private static void e(String substring) {
        final int index = substring.indexOf(58);
        if (index > 0) {
            substring = substring.substring(0, index);
            if (apn.f(substring)) {
                if (aph.a.b(substring) != null) {
                    return;
                }
                throw new ape("Unknown namespace prefix for qualified name", 102);
            }
        }
        throw new ape("Ill-formed qualified name", 102);
    }
    
    private static void f(final String s) {
        if (apn.e(s)) {
            return;
        }
        throw new ape("Bad XML name", 102);
    }
}
