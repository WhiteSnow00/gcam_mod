import java.util.Iterator;
import java.util.Calendar;
import java.util.GregorianCalendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apu implements apf
{
    public final apx a;
    
    public apu() {
        this.a = new apx(null, null, null);
    }
    
    public apu(final apx a) {
        this.a = a;
    }
    
    static final void m(final apx apx, final Object o, final aqj aqj) {
        apx.g().b(aqj);
        if (!apx.g().l()) {
            final String s = null;
            String s2;
            if (o == null) {
                s2 = null;
            }
            else if (o instanceof Boolean) {
                if (!(boolean)o) {
                    s2 = "False";
                }
                else {
                    s2 = "True";
                }
            }
            else if (o instanceof Integer) {
                s2 = String.valueOf((int)o);
            }
            else if (o instanceof Long) {
                s2 = String.valueOf((long)o);
            }
            else if (o instanceof Double) {
                s2 = String.valueOf((double)o);
            }
            else if (o instanceof apo) {
                s2 = zv.u((apo)o);
            }
            else if (o instanceof GregorianCalendar) {
                s2 = zv.u(apd.a((Calendar)o));
            }
            else if (o instanceof byte[]) {
                s2 = new String(api.a((byte[])o));
            }
            else {
                s2 = o.toString();
            }
            String b;
            if (s2 != null) {
                b = apn.b(s2);
            }
            else {
                b = s;
            }
            if (apx.g().m() && "xml:lang".equals(apx.a)) {
                apx.b = apn.a(b);
                return;
            }
            apx.b = b;
        }
        else {
            if (o != null && o.toString().length() > 0) {
                throw new ape("Composite nodes can't have values", 102);
            }
            apx.p();
        }
    }
    
    private static final Object n(int n, apx lowerCase) {
        final String b = lowerCase.b;
        Object o = null;
        switch (n) {
            default: {
                if (b == null && !lowerCase.g().l()) {
                    o = "";
                    break;
                }
                o = b;
                break;
            }
            case 6: {
                o = zv.v(b).a();
                break;
            }
            case 5: {
                o = zv.v(b);
                break;
            }
            case 4: {
                while (true) {
                    if (b != null) {
                        try {
                            if (b.length() != 0) {
                                o = new Double(Double.parseDouble(b));
                                break;
                            }
                            throw new ape("Empty convert-string", 5);
                        }
                        catch (final NumberFormatException ex) {
                            throw new ape("Invalid double string", 5);
                        }
                    }
                    continue;
                }
            }
            case 3: {
                while (true) {
                    if (b != null) {
                        try {
                            if (b.length() != 0) {
                                long n2;
                                if (b.startsWith("0x")) {
                                    n2 = Long.parseLong(b.substring(2), 16);
                                }
                                else {
                                    n2 = Long.parseLong(b);
                                }
                                o = new Long(n2);
                                break;
                            }
                            throw new ape("Empty convert-string", 5);
                        }
                        catch (final NumberFormatException ex2) {
                            throw new ape("Invalid long string", 5);
                        }
                    }
                    continue;
                }
            }
            case 2: {
                while (true) {
                    if (b != null) {
                        try {
                            if (b.length() != 0) {
                                if (b.startsWith("0x")) {
                                    n = Integer.parseInt(b.substring(2), 16);
                                }
                                else {
                                    n = Integer.parseInt(b);
                                }
                                o = new Integer(n);
                                break;
                            }
                            throw new ape("Empty convert-string", 5);
                        }
                        catch (final NumberFormatException ex3) {
                            throw new ape("Invalid integer string", 5);
                        }
                    }
                    continue;
                }
            }
            case 1: {
                if (b != null && b.length() != 0) {
                    lowerCase = (apx)b.toLowerCase();
                    boolean b2 = false;
                    try {
                        n = Integer.parseInt((String)lowerCase);
                        if (n != 0) {
                            b2 = true;
                        }
                    }
                    catch (final NumberFormatException ex4) {
                        if ("true".equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase)) {
                            b2 = true;
                        }
                    }
                    o = new Boolean(b2);
                    break;
                }
                throw new ape("Empty convert-string", 5);
            }
        }
        return o;
    }
    
    @Override
    public final aql a(final String s, final String s2) {
        aaf.g(s);
        aaf.f(s2);
        final apx f = acv.f(this.a, acw.b(s, s2), false, null);
        if (f != null) {
            return new apt(n(0, f));
        }
        return null;
    }
    
    @Override
    public final Integer b(final String s, final String s2) {
        return (Integer)this.l(s, s2, 2);
    }
    
    @Override
    public final void c(final String s, final String s2, final Object o) {
        this.d(s, s2, o, null);
    }
    
    public final Object clone() {
        return new apu((apx)this.a.clone());
    }
    
    @Override
    public final void d(final String s, final String s2, final Object o, aqj i) {
        aaf.g(s);
        aaf.f(s2);
        i = acv.i(i, o);
        final apx f = acv.f(this.a, acw.b(s, s2), true, i);
        if (f != null) {
            m(f, o, i);
            return;
        }
        throw new ape("Specified property does not exist", 102);
    }
    
    @Override
    public final boolean e(final String s, final String s2) {
        try {
            aaf.g(s);
            aaf.f(s2);
            return acv.f(this.a, acw.b(s, s2), false, null) != null;
        }
        catch (final ape ape) {
            return false;
        }
    }
    
    @Override
    public final aps f() {
        return new aps(this);
    }
    
    @Override
    public final void g(final String s, aqj i, final String s2, aqj j) {
        aaf.g("http://ns.google.com/photos/1.0/camera/");
        aaf.d(s);
        if ((i.a & 0xFFFFE1FF) != 0x0) {
            throw new ape("Only array form flags allowed for arrayOptions", 103);
        }
        i = acv.i(i, null);
        final aqd b = acw.b("http://ns.google.com/photos/1.0/camera/", s);
        apx apx = acv.f(this.a, b, false, null);
        if (apx != null) {
            if (!apx.g().d()) {
                throw new ape("The named property is not an array", 102);
            }
        }
        else {
            if (!i.d()) {
                throw new ape("Explicit arrayOptions required to create new array", 103);
            }
            apx = acv.f(this.a, b, true, i);
            if (apx == null) {
                throw new ape("Failure creating array node", 102);
            }
        }
        final apx apx2 = new apx("[]", null);
        j = acv.i(j, s2);
        final int n = apx.a() + 1;
        if (n > 0) {
            apx.l(n, apx2);
            m(apx2, s2, j);
            return;
        }
        throw new ape("Array index out of bounds", 104);
    }
    
    @Override
    public final void h() {
        try {
            aaf.g("http://ns.adobe.com/xmp/note/");
            aaf.f("HasExtendedXMP");
            final apx f = acv.f(this.a, acw.b("http://ns.adobe.com/xmp/note/", "HasExtendedXMP"), false, null);
            if (f != null) {
                acv.k(f);
            }
        }
        catch (final ape ape) {}
    }
    
    @Override
    public final void i(final String b) {
        aaf.g("http://purl.org/dc/elements/1.1/");
        aaf.d("rights");
        final String a = apn.a("");
        final String a2 = apn.a("x-default");
        final apx f = acv.f(this.a, acw.b("http://purl.org/dc/elements/1.1/", "rights"), true, new aqj(7680));
        if (f != null) {
            if (!f.g().i()) {
                if (f.s() || !f.g().j()) {
                    throw new ape("Specified property is no alt-text array", 102);
                }
                f.g().r();
            }
            final Iterator h = f.h();
            while (true) {
                while (h.hasNext()) {
                    final apx apx = h.next();
                    if (!apx.t() || !"xml:lang".equals(apx.f(1).a)) {
                        throw new ape("Language qualifier must be first", 102);
                    }
                    if (!"x-default".equals(apx.f(1).b)) {
                        continue;
                    }
                    final boolean b2 = true;
                    if (apx != null && f.a() > 1) {
                        f.o(apx);
                        f.l(1, apx);
                    }
                    if (f.g().i()) {
                        Object[] array = null;
                        Label_0647: {
                            if (!f.s()) {
                                array = new Object[] { new Integer(0), null };
                            }
                            else {
                                final Iterator h2 = f.h();
                                apx apx3;
                                apx apx2 = apx3 = null;
                                int n = 0;
                                while (h2.hasNext()) {
                                    final apx apx4 = h2.next();
                                    if (apx4.g().l()) {
                                        throw new ape("Alt-text array item is not simple", 102);
                                    }
                                    if (!apx4.t() || !"xml:lang".equals(apx4.f(1).a)) {
                                        throw new ape("Alt-text array item has no language qualifier", 102);
                                    }
                                    final String b3 = apx4.f(1).b;
                                    if (a2.equals(b3)) {
                                        array = new Object[] { new Integer(1), apx4 };
                                        break Label_0647;
                                    }
                                    apx apx5;
                                    int n2;
                                    if (a != null && b3.startsWith(a)) {
                                        if ((apx5 = apx2) == null) {
                                            apx5 = apx4;
                                        }
                                        n2 = n + 1;
                                    }
                                    else {
                                        n2 = n;
                                        apx5 = apx2;
                                        if ("x-default".equals(b3)) {
                                            apx3 = apx4;
                                            apx5 = apx2;
                                            n2 = n;
                                        }
                                    }
                                    n = n2;
                                    apx2 = apx5;
                                }
                                if (n == 1) {
                                    array = new Object[] { new Integer(2), apx2 };
                                }
                                else if (n > 1) {
                                    array = new Object[] { new Integer(3), apx2 };
                                }
                                else if (apx3 != null) {
                                    array = new Object[] { new Integer(4), apx3 };
                                }
                                else {
                                    array = new Object[] { new Integer(5), f.e(1) };
                                }
                            }
                        }
                        final int intValue = (int)array[0];
                        final apx apx6 = (apx)array[1];
                        final boolean equals = "x-default".equals(a2);
                        switch (intValue) {
                            default: {
                                throw new ape("Unexpected result from ChooseLocalizedText", 9);
                            }
                            case 5: {
                                acv.j(f, a2, b);
                                if (!equals) {
                                    break;
                                }
                                return;
                            }
                            case 4: {
                                if (apx != null && f.a() == 1) {
                                    apx.b = b;
                                }
                                acv.j(f, a2, b);
                                break;
                            }
                            case 3: {
                                acv.j(f, a2, b);
                                if (equals) {
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                if (b2 && apx != apx6 && apx != null && apx.b.equals(apx6.b)) {
                                    apx.b = b;
                                }
                                apx6.b = b;
                                break;
                            }
                            case 1: {
                                if (!equals) {
                                    if (b2 && apx != apx6 && apx != null && apx.b.equals(apx6.b)) {
                                        apx.b = b;
                                    }
                                    apx6.b = b;
                                    break;
                                }
                                final Iterator h3 = f.h();
                                while (h3.hasNext()) {
                                    final apx apx7 = h3.next();
                                    if (apx7 != apx) {
                                        final String b4 = apx7.b;
                                        String b5;
                                        if (apx != null) {
                                            b5 = apx.b;
                                        }
                                        else {
                                            b5 = null;
                                        }
                                        if (!b4.equals(b5)) {
                                            continue;
                                        }
                                        apx7.b = b;
                                    }
                                }
                                if (apx != null) {
                                    apx.b = b;
                                    break;
                                }
                                break;
                            }
                            case 0: {
                                acv.j(f, "x-default", b);
                                if (!equals) {
                                    acv.j(f, a2, b);
                                }
                                return;
                            }
                        }
                        if (!b2 && f.a() == 1) {
                            acv.j(f, "x-default", b);
                        }
                        return;
                    }
                    throw new ape("Localized text array is not alt-text", 102);
                }
                final apx apx = null;
                final boolean b2 = false;
                continue;
            }
        }
        throw new ape("Failed to find or create array node", 102);
    }
    
    @Override
    public final void j(final String s, final boolean b) {
        String s2;
        if (!b) {
            s2 = "False";
        }
        else {
            s2 = "True";
        }
        this.d("http://ns.google.com/photos/1.0/panorama/", s, s2, null);
    }
    
    @Override
    public final void k(final String s, final int n) {
        this.d("http://ns.google.com/photos/1.0/panorama/", s, new Integer(n), null);
    }
    
    public final Object l(final String s, final String s2, final int n) {
        aaf.g(s);
        aaf.f(s2);
        final apx f = acv.f(this.a, acw.b(s, s2), false, null);
        if (f == null) {
            return null;
        }
        if (n != 0 && f.g().l()) {
            throw new ape("Property must be simple when a value type is requested", 102);
        }
        return n(n, f);
    }
}
