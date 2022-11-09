import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.io.OutputStreamWriter;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqb
{
    static final Set a;
    public apu b;
    public apk c;
    public OutputStreamWriter d;
    public aqk e;
    public int f;
    public int g;
    
    static {
        a = new HashSet(Arrays.asList("xml:lang", "rdf:resource", "rdf:ID", "rdf:bagID", "rdf:nodeID"));
    }
    
    public aqb() {
        this.f = 1;
    }
    
    private final void k(final String s, final boolean b) {
        this.d(apn.h(s, b));
    }
    
    private final void l(final apx apx, final boolean b, final int n) {
        if (!b && !apx.s()) {
            return;
        }
        this.e(n);
        String s;
        if (!b) {
            s = "</rdf:";
        }
        else {
            s = "<rdf:";
        }
        this.d(s);
        if (apx.g().j()) {
            this.d("Alt");
        }
        else if (apx.g().k()) {
            this.d("Seq");
        }
        else {
            this.d("Bag");
        }
        if (b && !apx.s()) {
            this.d("/>");
        }
        else {
            this.d(">");
        }
        this.f();
    }
    
    private static final boolean m(final apx apx) {
        return !apx.t() && !apx.g().p() && !apx.g().l() && !"[]".equals(apx.a);
    }
    
    private final void n(String s, String s2, final Set set) {
        if (s2 == null) {
            final int index = s.indexOf(58);
            if (index >= 0) {
                s2 = s.substring(0, index);
                s.substring(index + 1);
                s = s2;
            }
            else {
                s = "";
            }
            if (s == null || s.length() <= 0) {
                return;
            }
            s2 = aph.a.b(s.concat(":"));
            this.n(s, s2, set);
        }
        if (!set.contains(s)) {
            this.f();
            this.e(4);
            this.d("xmlns:");
            this.d(s);
            this.d("=\"");
            this.d(s2);
            this.c(34);
            set.add(s);
        }
    }
    
    public final void a(apx apx, final int n) {
        final Iterator h = apx.h();
        while (h.hasNext()) {
            final apx apx2 = h.next();
            if (!m(apx2)) {
                String a = apx2.a;
                final boolean equals = "[]".equals(a);
                int booleanValue = 1;
                if (equals) {
                    a = "rdf:li";
                }
                this.e(n);
                this.c(60);
                this.d(a);
                final Iterator i = apx2.i();
                final boolean b = false;
                boolean b2 = false;
                boolean equals2 = false;
                while (i.hasNext()) {
                    apx = (apx)i.next();
                    if (!aqb.a.contains(apx.a)) {
                        b2 = true;
                    }
                    else {
                        equals2 = "rdf:resource".equals(apx.a);
                        this.c(32);
                        this.d(apx.a);
                        this.d("=\"");
                        this.k(apx.b, true);
                        this.c(34);
                    }
                }
                int booleanValue2;
                if (b2) {
                    this.d(" rdf:parseType=\"Resource\">");
                    this.f();
                    final int n2 = n + 1;
                    this.b(apx2, true, n2);
                    final Iterator j = apx2.i();
                    while (j.hasNext()) {
                        this.b((apx)j.next(), false, n2);
                    }
                    booleanValue2 = 1;
                }
                else if (!apx2.g().l()) {
                    Boolean b3 = Boolean.TRUE;
                    Boolean b4 = Boolean.TRUE;
                    if (apx2.g().p()) {
                        this.d(" rdf:resource=\"");
                        this.k(apx2.b, true);
                        this.d("\"/>");
                        this.f();
                        b3 = Boolean.FALSE;
                    }
                    else {
                        final String b5 = apx2.b;
                        if (b5 != null && b5.length() != 0) {
                            this.c(62);
                            this.k(apx2.b, false);
                            b4 = Boolean.FALSE;
                        }
                        else {
                            this.d("/>");
                            this.f();
                            b3 = Boolean.FALSE;
                        }
                    }
                    final Object[] array = { b3, b4 };
                    booleanValue = (((boolean)array[0]) ? 1 : 0);
                    booleanValue2 = (((boolean)array[1]) ? 1 : 0);
                }
                else if (apx2.g().d()) {
                    this.c(62);
                    this.f();
                    final int n3 = n + 1;
                    this.l(apx2, true, n3);
                    if (apx2.g().i()) {
                        acv.l(apx2);
                    }
                    this.a(apx2, n + 2);
                    this.l(apx2, false, n3);
                    booleanValue2 = 1;
                }
                else {
                    final Iterator h2 = apx2.h();
                    boolean b6 = false;
                    int n4 = 0;
                    while (h2.hasNext()) {
                        final boolean m = m(h2.next());
                        final boolean b7 = ((b6 ? 1 : 0) | ((m ? 1 : 0) ^ 0x1)) != 0x0;
                        final int n5 = n4 | (m ? 1 : 0);
                        b6 = b7;
                        if ((n4 = n5) != 0) {
                            b6 = b7;
                            n4 = n5;
                            if (b7) {
                                b6 = b7;
                                n4 = n5;
                                break;
                            }
                            continue;
                        }
                    }
                    if (equals2 && b6) {
                        throw new ape("Can't mix rdf:resource qualifier and element fields", 202);
                    }
                    int n6;
                    if (!apx2.s()) {
                        this.d(" rdf:parseType=\"Resource\"/>");
                        this.f();
                        n6 = (b ? 1 : 0);
                    }
                    else if (!b6) {
                        this.h(apx2, n + 1);
                        this.d("/>");
                        this.f();
                        n6 = (b ? 1 : 0);
                    }
                    else if (n4 == 0) {
                        this.d(" rdf:parseType=\"Resource\">");
                        this.f();
                        this.a(apx2, n + 1);
                        n6 = 1;
                    }
                    else {
                        this.c(62);
                        this.f();
                        final int n7 = n + 1;
                        this.e(n7);
                        this.d("<rdf:Description");
                        this.h(apx2, n + 2);
                        this.d(">");
                        this.f();
                        this.a(apx2, n7);
                        this.e(n7);
                        this.d("</rdf:Description>");
                        this.f();
                        n6 = 1;
                    }
                    final int n8 = 1;
                    booleanValue = n6;
                    booleanValue2 = n8;
                }
                if (booleanValue == 0) {
                    continue;
                }
                if (booleanValue2 != 0) {
                    this.e(n);
                }
                this.d("</");
                this.d(a);
                this.c(62);
                this.f();
            }
        }
    }
    
    public final void b(apx apx, final boolean b, final int n) {
        final String a = apx.a;
        String s;
        if (b) {
            s = "rdf:value";
        }
        else {
            s = a;
            if ("[]".equals(a)) {
                s = "rdf:li";
            }
        }
        this.e(n);
        this.c(60);
        this.d(s);
        final Iterator i = apx.i();
        final boolean b2 = false;
        boolean b3 = false;
        boolean equals = false;
        boolean b4;
        while (true) {
            final boolean hasNext = i.hasNext();
            b4 = true;
            if (!hasNext) {
                break;
            }
            final apx apx2 = i.next();
            if (!aqb.a.contains(apx2.a)) {
                b3 = true;
            }
            else {
                equals = "rdf:resource".equals(apx2.a);
                if (b) {
                    continue;
                }
                this.c(32);
                this.d(apx2.a);
                this.d("=\"");
                this.k(apx2.b, true);
                this.c(34);
            }
        }
        int n3;
        if (b3 && !b) {
            if (equals) {
                throw new ape("Can't mix rdf:resource and general qualifiers", 202);
            }
            this.d(" rdf:parseType=\"Resource\">");
            this.f();
            final int n2 = n + 1;
            this.b(apx, true, n2);
            final Iterator j = apx.i();
            while (j.hasNext()) {
                final apx apx3 = j.next();
                if (!aqb.a.contains(apx3.a)) {
                    this.b(apx3, false, n2);
                }
            }
            n3 = 1;
        }
        else if (!apx.g().l()) {
            if (apx.g().p()) {
                this.d(" rdf:resource=\"");
                this.k(apx.b, true);
                this.d("\"/>");
                this.f();
                n3 = (b2 ? 1 : 0);
            }
            else {
                final String b5 = apx.b;
                if (b5 != null && !"".equals(b5)) {
                    this.c(62);
                    this.k(apx.b, false);
                    n3 = 1;
                    b4 = false;
                }
                else {
                    this.d("/>");
                    this.f();
                    n3 = (b2 ? 1 : 0);
                }
            }
        }
        else if (apx.g().d()) {
            this.c(62);
            this.f();
            final int n4 = n + 1;
            this.l(apx, true, n4);
            if (apx.g().i()) {
                acv.l(apx);
            }
            final Iterator h = apx.h();
            while (h.hasNext()) {
                this.b((apx)h.next(), false, n + 2);
            }
            this.l(apx, false, n4);
            n3 = 1;
        }
        else if (!equals) {
            if (!apx.s()) {
                this.d(" rdf:parseType=\"Resource\"/>");
                this.f();
                n3 = (b2 ? 1 : 0);
            }
            else {
                this.d(" rdf:parseType=\"Resource\">");
                this.f();
                final Iterator h2 = apx.h();
                while (h2.hasNext()) {
                    this.b((apx)h2.next(), false, n + 1);
                }
                n3 = 1;
            }
        }
        else {
            final Iterator h3 = apx.h();
            while (h3.hasNext()) {
                apx = (apx)h3.next();
                if (!m(apx)) {
                    throw new ape("Can't mix rdf:resource and complex fields", 202);
                }
                this.f();
                this.e(n + 1);
                this.c(32);
                this.d(apx.a);
                this.d("=\"");
                this.k(apx.b, true);
                this.c(34);
            }
            this.d("/>");
            this.f();
            n3 = (b2 ? 1 : 0);
        }
        if (n3 != 0) {
            if (b4) {
                this.e(n);
            }
            this.d("</");
            this.d(s);
            this.c(62);
            this.f();
        }
    }
    
    public final void c(final int n) {
        this.d.write(n);
    }
    
    public final void d(final String s) {
        this.d.write(s);
    }
    
    public final void e(int i) {
        while (i > 0) {
            this.d.write(this.e.d);
            --i;
        }
    }
    
    public final void f() {
        this.d.write(this.e.c);
    }
    
    public final void g() {
        this.c(34);
        final String a = this.b.a.a;
        if (a != null) {
            this.k(a, true);
        }
        this.c(34);
    }
    
    public final boolean h(apx apx, final int n) {
        final Iterator h = apx.h();
        boolean b = true;
        while (h.hasNext()) {
            apx = (apx)h.next();
            if (m(apx)) {
                this.f();
                this.e(n);
                this.d(apx.a);
                this.d("=\"");
                this.k(apx.b, true);
                this.c(34);
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final void i(final apx apx, final Set set) {
        if (apx.g().n()) {
            final String b = apx.b;
            this.n(b.substring(0, b.length() - 1), apx.a, set);
        }
        else if (apx.g().o()) {
            final Iterator h = apx.h();
            while (h.hasNext()) {
                this.n(((apx)h.next()).a, null, set);
            }
        }
        final Iterator h2 = apx.h();
        while (h2.hasNext()) {
            this.i((apx)h2.next(), set);
        }
        final Iterator i = apx.i();
        while (i.hasNext()) {
            final apx apx2 = i.next();
            this.n(apx2.a, null, set);
            this.i(apx2, set);
        }
    }
    
    public final void j(int i) {
        while (i > 0) {
            this.d.write(32);
            --i;
        }
    }
}
