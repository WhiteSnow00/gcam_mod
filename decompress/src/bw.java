import java.text.AttributedString;
import java.text.AttributedCharacterIterator;
import java.text.ParsePosition;
import java.util.List;
import java.util.Iterator;
import java.io.Serializable;
import java.io.IOException;
import java.util.Date;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.Map;
import java.util.Locale;
import java.text.Format;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bw extends Format
{
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    private static final Locale g;
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient cl b;
    public transient Map c;
    private transient DateFormat h;
    private transient NumberFormat i;
    private transient bv j;
    private transient bv k;
    
    static {
        d = new String[] { "number", "date", "time", "spellout", "ordinal", "duration" };
        e = new String[] { "", "currency", "percent", "integer" };
        f = new String[] { "", "short", "medium", "long", "full" };
        g = new Locale("");
    }
    
    public bw(String f, final Locale a) {
        this.a = a;
        try {
            final cl b = this.b;
            if (b == null) {
                this.b = new cl(f);
            }
            else {
                b.i(f);
            }
            final Map c = this.c;
            if (c != null) {
                c.clear();
            }
            int n;
            for (int b2 = this.b.b(), i = 1; i < b2 - 2; i = n + 1) {
                final ck d = this.b.d(i);
                if (d.e != 6) {
                    n = i;
                }
                else {
                    n = i;
                    if (d.b() == 2) {
                        final int n2 = i + 2;
                        final cl b3 = this.b;
                        n = n2 + 1;
                        final String f2 = b3.f(b3.d(n2));
                        f = "";
                        final ck d2 = this.b.d(n);
                        if (d2.e == 11) {
                            f = this.b.f(d2);
                            ++n;
                        }
                        Format format = null;
                        Label_0569: {
                            switch (c(f2, bw.d)) {
                                default: {
                                    final StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 22);
                                    sb.append("Unknown format type \"");
                                    sb.append(f2);
                                    sb.append("\"");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                case 2: {
                                    switch (c(f, bw.f)) {
                                        default: {
                                            format = new SimpleDateFormat(f, this.a);
                                            break Label_0569;
                                        }
                                        case 4: {
                                            format = DateFormat.getTimeInstance(0, this.a);
                                            break Label_0569;
                                        }
                                        case 3: {
                                            format = DateFormat.getTimeInstance(1, this.a);
                                            break Label_0569;
                                        }
                                        case 2: {
                                            format = DateFormat.getTimeInstance(2, this.a);
                                            break Label_0569;
                                        }
                                        case 1: {
                                            format = DateFormat.getTimeInstance(3, this.a);
                                            break Label_0569;
                                        }
                                        case 0: {
                                            format = DateFormat.getTimeInstance(2, this.a);
                                            break Label_0569;
                                        }
                                    }
                                    break;
                                }
                                case 1: {
                                    switch (c(f, bw.f)) {
                                        default: {
                                            format = new SimpleDateFormat(f, this.a);
                                            break Label_0569;
                                        }
                                        case 4: {
                                            format = DateFormat.getDateInstance(0, this.a);
                                            break Label_0569;
                                        }
                                        case 3: {
                                            format = DateFormat.getDateInstance(1, this.a);
                                            break Label_0569;
                                        }
                                        case 2: {
                                            format = DateFormat.getDateInstance(2, this.a);
                                            break Label_0569;
                                        }
                                        case 1: {
                                            format = DateFormat.getDateInstance(3, this.a);
                                            break Label_0569;
                                        }
                                        case 0: {
                                            format = DateFormat.getDateInstance(2, this.a);
                                            break Label_0569;
                                        }
                                    }
                                    break;
                                }
                                case 0: {
                                    switch (c(f, bw.e)) {
                                        default: {
                                            format = new DecimalFormat(f, new DecimalFormatSymbols(this.a));
                                            break Label_0569;
                                        }
                                        case 3: {
                                            format = NumberFormat.getIntegerInstance(this.a);
                                            break Label_0569;
                                        }
                                        case 2: {
                                            format = NumberFormat.getPercentInstance(this.a);
                                            break Label_0569;
                                        }
                                        case 1: {
                                            format = NumberFormat.getCurrencyInstance(this.a);
                                            break Label_0569;
                                        }
                                        case 0: {
                                            format = NumberFormat.getInstance(this.a);
                                            break Label_0569;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        if (this.c == null) {
                            this.c = new HashMap();
                        }
                        this.c.put(i, format);
                    }
                }
            }
        }
        catch (final RuntimeException ex) {
            final cl b4 = this.b;
            if (b4 != null) {
                b4.a = null;
                b4.d = false;
                b4.b.clear();
                final ArrayList c2 = b4.c;
                if (c2 != null) {
                    c2.clear();
                }
            }
            final Map c3 = this.c;
            if (c3 != null) {
                c3.clear();
            }
            throw ex;
        }
    }
    
    public static final String a(final Locale locale, final String s, final Object... array) {
        final StringBuilder sb = new StringBuilder(s.length());
        new bw(s, locale).f(0, null, null, null, array, new br(sb), null);
        return sb.toString();
    }
    
    private static final int c(String lowerCase, final String[] array) {
        final byte[] a = bp.a;
        final int length = lowerCase.length();
        final int n = 0;
        String substring = lowerCase;
        Label_0123: {
            if (length != 0) {
                if (!bp.a(lowerCase.charAt(0))) {
                    substring = lowerCase;
                    if (!bp.a(lowerCase.charAt(lowerCase.length() - 1))) {
                        break Label_0123;
                    }
                }
                int length2;
                int n2;
                for (length2 = lowerCase.length(), n2 = 0; n2 < length2 && bp.a(lowerCase.charAt(n2)); ++n2) {}
                int n3;
                if (n2 < (n3 = length2)) {
                    while (true) {
                        final int n4 = length2 - 1;
                        n3 = length2;
                        if (!bp.a(lowerCase.charAt(n4))) {
                            break;
                        }
                        length2 = n4;
                    }
                }
                substring = lowerCase.substring(n2, n3);
            }
        }
        lowerCase = substring.toLowerCase(bw.g);
        for (int i = n; i < array.length; ++i) {
            if (lowerCase.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
    
    private final void d(final Object o, final br br, final FieldPosition fieldPosition) {
        if (o != null && !(o instanceof Map)) {
            this.e((Object[])o, null, br, fieldPosition);
            return;
        }
        this.e(null, (Map)o, br, fieldPosition);
    }
    
    private final void e(final Object[] array, final Map map, final br br, final FieldPosition fieldPosition) {
        if (array != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        this.f(0, null, array, map, null, br, fieldPosition);
    }
    
    private final void f(int i, final bu bu, final Object[] array, final Map map, final Object[] array2, final br br, final FieldPosition fieldPosition) {
        bw bw = this;
        br br2 = br;
        final cl b = bw.b;
        String a = b.a;
        final int a2 = b.d(i).a();
        int n = i + 1;
        i = a2;
        FieldPosition fieldPosition2 = fieldPosition;
        while (true) {
            final ck d = bw.b.d(n);
            final int e = d.e;
            final int a3 = d.a;
            try {
                br2.a.append(a, i, a3);
                br2.b += a3 - i;
                if (e == 2) {
                    return;
                }
                i = d.a();
                br br3 = null;
                bw bw2 = null;
                String s2 = null;
                FieldPosition fieldPosition4 = null;
                Label_3019: {
                    if (e == 5) {
                        if (bu.h) {
                            br2.c(bu.f, bu.c, bu.g);
                        }
                        else {
                            br2.b(this.b(), bu.c);
                        }
                    }
                    else if (e == 6) {
                        final int n2 = i = bw.b.c(n);
                        final int b2 = d.b();
                        int n3 = n + 1;
                        final ck d2 = bw.b.d(n3);
                        final String f = bw.b.f(d2);
                        Serializable value = null;
                        Object value2 = null;
                        boolean b3 = false;
                        Label_0453: {
                            if (array != null) {
                                final short c = d2.c;
                                if (br2.c != null) {
                                    value = c;
                                }
                                else {
                                    value = null;
                                }
                                if (c >= 0 && c < array.length) {
                                    value2 = array[c];
                                    b3 = false;
                                }
                                else {
                                    value2 = null;
                                    b3 = true;
                                }
                            }
                            else {
                                if (array2 != null) {
                                    while (true) {
                                        for (int j = 0; j < 2; j += 2) {
                                            if (f.equals(array2[j].toString())) {
                                                value2 = array2[j + 1];
                                                b3 = false;
                                                value = f;
                                                break Label_0453;
                                            }
                                        }
                                        value2 = null;
                                        b3 = true;
                                        continue;
                                    }
                                }
                                if (map != null) {
                                    if (map.containsKey(f)) {
                                        value2 = map.get(f);
                                        value = f;
                                        b3 = false;
                                    }
                                    else {
                                        value = f;
                                        value2 = null;
                                        b3 = true;
                                    }
                                }
                                else {
                                    value = f;
                                    value2 = null;
                                    b3 = true;
                                }
                            }
                        }
                        ++n3;
                        int b4 = br2.b;
                        Serializable s3 = null;
                        Label_2896: {
                            if (b3) {
                                final StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 2);
                                sb.append("{");
                                sb.append(f);
                                sb.append("}");
                                br2.a(sb.toString());
                                final FieldPosition fieldPosition3 = fieldPosition2;
                                final Serializable s = value;
                                br3 = br2;
                                bw2 = bw;
                                s2 = a;
                                fieldPosition4 = fieldPosition3;
                                s3 = s;
                            }
                            else if (value2 == null) {
                                br2.a("null");
                                final FieldPosition fieldPosition5 = fieldPosition2;
                                final Serializable s4 = value;
                                br3 = br2;
                                bw2 = bw;
                                s2 = a;
                                fieldPosition4 = fieldPosition5;
                                s3 = s4;
                            }
                            else if (bu != null && bu.e == n3 - 2) {
                                if (bu.d == 0.0) {
                                    br2.c(bu.f, bu.c, bu.g);
                                    final FieldPosition fieldPosition6 = fieldPosition2;
                                    final Serializable s5 = value;
                                    br3 = br2;
                                    bw2 = bw;
                                    s2 = a;
                                    fieldPosition4 = fieldPosition6;
                                    s3 = s5;
                                }
                                else {
                                    br2.b(bu.f, value2);
                                    final FieldPosition fieldPosition7 = fieldPosition2;
                                    final Serializable s6 = value;
                                    br3 = br2;
                                    bw2 = bw;
                                    s2 = a;
                                    fieldPosition4 = fieldPosition7;
                                    s3 = s6;
                                }
                            }
                            else {
                                final Map c2 = bw.c;
                                if (c2 != null) {
                                    final Format format = c2.get(n3 - 2);
                                    if (format != null) {
                                        br2.b(format, value2);
                                        final FieldPosition fieldPosition8 = fieldPosition2;
                                        final Serializable s7 = value;
                                        br3 = br2;
                                        bw2 = bw;
                                        s2 = a;
                                        fieldPosition4 = fieldPosition8;
                                        s3 = s7;
                                        break Label_2896;
                                    }
                                }
                                if (b2 != 1) {
                                    final Map c3 = bw.c;
                                    if (c3 == null || !c3.containsKey(n3 - 2)) {
                                        if (b2 == 3) {
                                            if (value2 instanceof Number) {
                                                final double doubleValue = ((Number)value2).doubleValue();
                                                final cl b5 = bw.b;
                                                final int b6 = b5.b();
                                                int n4 = n3 + 2;
                                                while (true) {
                                                    final int n5 = b5.c(n4) + 1;
                                                    if (n5 >= b6) {
                                                        break;
                                                    }
                                                    final int n6 = n5 + 1;
                                                    final ck d3 = b5.d(n5);
                                                    if (d3.e == 7) {
                                                        break;
                                                    }
                                                    final double a4 = b5.a(d3);
                                                    if (b5.a.charAt(((ck)b5.b.get(n6)).a) == '<') {
                                                        if (doubleValue <= a4) {
                                                            break;
                                                        }
                                                    }
                                                    else if (doubleValue < a4) {
                                                        break;
                                                    }
                                                    n4 = n6 + 1;
                                                }
                                                this.g(n4, null, array, map, array2, br);
                                                final FieldPosition fieldPosition9 = fieldPosition2;
                                                final Serializable s8 = value;
                                                br3 = br2;
                                                bw2 = bw;
                                                s2 = a;
                                                fieldPosition4 = fieldPosition9;
                                                s3 = s8;
                                                break Label_2896;
                                            }
                                            final String value3 = String.valueOf(value2);
                                            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 18);
                                            sb2.append("'");
                                            sb2.append(value3);
                                            sb2.append("' is not a Number");
                                            throw new IllegalArgumentException(sb2.toString());
                                        }
                                        else if (jp.k(b2)) {
                                            if (value2 instanceof Number) {
                                                bv bv;
                                                if (b2 == 4) {
                                                    if (bw.j == null) {
                                                        bw.j = new bv(bw, 1);
                                                    }
                                                    bv = bw.j;
                                                }
                                                else {
                                                    if (bw.k == null) {
                                                        bw.k = new bv(bw, 2);
                                                    }
                                                    bv = bw.k;
                                                }
                                                final Number n7 = (Number)value2;
                                                final cl b7 = bw.b;
                                                final ck ck = b7.b.get(n3);
                                                double a5;
                                                if (jp.i(ck.e)) {
                                                    a5 = b7.a(ck);
                                                }
                                                else {
                                                    a5 = 0.0;
                                                }
                                                final bu bu2 = new bu(n3, f, n7, a5);
                                                final cl b8 = bw.b;
                                                final double doubleValue2 = n7.doubleValue();
                                                final int b9 = b8.b();
                                                final ck d4 = b8.d(n3);
                                                double a6;
                                                int n8;
                                                if (jp.i(d4.e)) {
                                                    a6 = b8.a(d4);
                                                    n8 = n3 + 1;
                                                }
                                                else {
                                                    a6 = 0.0;
                                                    n8 = n3;
                                                }
                                                final String s9 = null;
                                                final int n9 = 0;
                                                int n10 = 0;
                                                final int n11 = i;
                                                i = b4;
                                                String s10 = a;
                                                String a7 = s9;
                                                final Serializable s11 = value;
                                                bu bu3 = bu2;
                                                int n12 = n9;
                                                int n13 = n8;
                                                final FieldPosition fieldPosition10 = fieldPosition2;
                                                while (true) {
                                                    s2 = s10;
                                                    int n14 = n13 + 1;
                                                    final ck d5 = b8.d(n13);
                                                    if (d5.e == 7) {
                                                        b4 = i;
                                                        i = n10;
                                                        break;
                                                    }
                                                    if (jp.i(b8.h(n14))) {
                                                        final int n15 = n14 + 1;
                                                        if (doubleValue2 == b8.a(b8.d(n14))) {
                                                            b4 = i;
                                                            i = n15;
                                                            break;
                                                        }
                                                        n14 = n15;
                                                    }
                                                    else if (n12 == 0) {
                                                        if (b8.g(d5, "other")) {
                                                            if (n10 == 0) {
                                                                if (a7 != null && a7.equals("other")) {
                                                                    n10 = n14;
                                                                    n12 = 1;
                                                                }
                                                                else {
                                                                    n10 = n14;
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            if (a7 == null) {
                                                                final int n16 = i;
                                                                final double n17 = doubleValue2 - a6;
                                                                if (bv.b == null) {
                                                                    bv.b = ci.d(bv.a.a, bv.c);
                                                                }
                                                                final int n18 = n12;
                                                                final bw a8 = bv.a;
                                                                final int a9 = bu3.a;
                                                                final int b10 = a8.b.b();
                                                                int n19 = n16;
                                                                bu bu4 = bu3;
                                                                i = a9;
                                                                if (jp.i(a8.b.d(a9).e)) {
                                                                    i = a9 + 1;
                                                                    bu4 = bu3;
                                                                    n19 = n16;
                                                                }
                                                                while (true) {
                                                                    int n20 = i + 1;
                                                                    final ck d6 = a8.b.d(i);
                                                                    if (d6.e == 7) {
                                                                        i = 0;
                                                                        break;
                                                                    }
                                                                    if (a8.b.g(d6, "other")) {
                                                                        i = n20;
                                                                        break;
                                                                    }
                                                                    if (jp.i(a8.b.h(n20))) {
                                                                        ++n20;
                                                                    }
                                                                    i = a8.b.c(n20) + 1;
                                                                    if (i >= b10) {
                                                                        i = 0;
                                                                        break;
                                                                    }
                                                                }
                                                                final bw a10 = bv.a;
                                                                final String b11 = bu4.b;
                                                                ++i;
                                                                bu3 = bu4;
                                                                int e3;
                                                                while (true) {
                                                                    final ck d7 = a10.b.d(i);
                                                                    final int e2 = d7.e;
                                                                    if (e2 == 2) {
                                                                        e3 = 0;
                                                                        break;
                                                                    }
                                                                    if (e2 == 5) {
                                                                        e3 = -1;
                                                                        break;
                                                                    }
                                                                    if (e2 == 6) {
                                                                        final int b12 = d7.b();
                                                                        if (b11.length() != 0) {
                                                                            if (b12 == 1 || b12 == 2) {
                                                                                final ck d8 = a10.b.d(i + 1);
                                                                                e3 = i;
                                                                                if (a10.b.g(d8, b11)) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        i = a10.b.c(i);
                                                                    }
                                                                    ++i;
                                                                }
                                                                if ((bu3.e = e3) > 0) {
                                                                    final Map c4 = bv.a.c;
                                                                    if (c4 != null) {
                                                                        bu3.f = (Format)c4.get(e3);
                                                                    }
                                                                }
                                                                if (bu3.f == null) {
                                                                    bu3.f = bv.a.b();
                                                                    bu3.h = true;
                                                                }
                                                                bu3.g = bu3.f.format(bu3.c);
                                                                final ch h = bv.b.h;
                                                                Label_2192: {
                                                                    if (!Double.isInfinite(n17)) {
                                                                        if (Double.isNaN(n17)) {
                                                                            i = 0;
                                                                        }
                                                                        else {
                                                                            double n21;
                                                                            if (n17 < 0.0) {
                                                                                n21 = -n17;
                                                                            }
                                                                            else {
                                                                                n21 = n17;
                                                                            }
                                                                            if (n21 < 1.0E9) {
                                                                                final long n22 = (long)(n21 * 1000000.0);
                                                                                int n23 = 10;
                                                                                for (i = 6; i > 0; --i) {
                                                                                    if (n22 % 1000000L % n23 != 0L) {
                                                                                        break Label_2192;
                                                                                    }
                                                                                    n23 *= 10;
                                                                                }
                                                                                i = 0;
                                                                            }
                                                                            else {
                                                                                final String format2 = String.format(Locale.ENGLISH, "%1.15e", n21);
                                                                                final int lastIndex = format2.lastIndexOf(101);
                                                                                final int n24 = i = lastIndex + 1;
                                                                                if (format2.charAt(n24) == '+') {
                                                                                    i = n24 + 1;
                                                                                }
                                                                                i = lastIndex - 2 - Integer.parseInt(format2.substring(i));
                                                                                if (i < 0) {
                                                                                    i = 0;
                                                                                }
                                                                                else {
                                                                                    for (int n25 = lastIndex - 1; i > 0 && format2.charAt(n25) == '0'; --i, --n25) {}
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        i = 0;
                                                                    }
                                                                }
                                                                final cb cb = new cb(n17, i);
                                                                Label_2299: {
                                                                    if (!Double.isInfinite(cb.a) && !Double.isNaN(cb.a)) {
                                                                        while (true) {
                                                                            for (final cg cg : h.b) {
                                                                                if (cg.b.a(cb)) {
                                                                                    a7 = cg.a;
                                                                                    break Label_2299;
                                                                                }
                                                                            }
                                                                            cg cg = null;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    a7 = "other";
                                                                }
                                                                if (n10 != 0 && a7.equals("other")) {
                                                                    n12 = 1;
                                                                    i = n19;
                                                                }
                                                                else {
                                                                    n12 = n18;
                                                                    i = n19;
                                                                }
                                                            }
                                                            if (n12 == 0 && b8.g(d5, a7)) {
                                                                final int n26 = n14;
                                                                n12 = 1;
                                                                n10 = n14;
                                                                n14 = n26;
                                                            }
                                                        }
                                                    }
                                                    n13 = b8.c(n14) + 1;
                                                    if (n13 >= b9) {
                                                        b4 = i;
                                                        i = n10;
                                                        break;
                                                    }
                                                    s10 = s2;
                                                }
                                                final Serializable s12 = s11;
                                                this.g(i, bu3, array, map, array2, br);
                                                bw2 = this;
                                                br3 = br;
                                                i = n11;
                                                fieldPosition4 = fieldPosition10;
                                                s3 = s12;
                                                break Label_2896;
                                            }
                                            final String value4 = String.valueOf(value2);
                                            final StringBuilder sb3 = new StringBuilder(String.valueOf(value4).length() + 18);
                                            sb3.append("'");
                                            sb3.append(value4);
                                            sb3.append("' is not a Number");
                                            throw new IllegalArgumentException(sb3.toString());
                                        }
                                        else {
                                            final FieldPosition fieldPosition11 = fieldPosition2;
                                            final Serializable s13 = value;
                                            final int n27 = b4;
                                            final int n28 = i;
                                            if (b2 == 5) {
                                                final cl b13 = this.b;
                                                final String string = value2.toString();
                                                final int b14 = b13.b();
                                                int n29 = 0;
                                                int n30 = n3;
                                                int k;
                                                do {
                                                    final int n31 = n30 + 1;
                                                    final ck d9 = b13.d(n30);
                                                    if (d9.e == 7) {
                                                        i = n29;
                                                        break;
                                                    }
                                                    if (b13.g(d9, string)) {
                                                        i = n31;
                                                        break;
                                                    }
                                                    if ((i = n29) == 0) {
                                                        if (b13.g(d9, "other")) {
                                                            i = n31;
                                                        }
                                                        else {
                                                            i = 0;
                                                        }
                                                    }
                                                    k = (n30 = b13.c(n31) + 1);
                                                    n29 = i;
                                                } while (k < b14);
                                                this.g(i, null, array, map, array2, br);
                                                br3 = br;
                                                bw2 = this;
                                                s2 = a;
                                                i = n28;
                                                fieldPosition4 = fieldPosition11;
                                                s3 = s13;
                                                b4 = n27;
                                                break Label_2896;
                                            }
                                            final String l = jp.j(b2);
                                            final StringBuilder sb4 = new StringBuilder(l.length() + 19);
                                            sb4.append("unexpected argType ");
                                            sb4.append(l);
                                            throw new IllegalStateException(sb4.toString());
                                        }
                                    }
                                }
                                s3 = value;
                                final FieldPosition fieldPosition12 = fieldPosition2;
                                i = n2;
                                s2 = a;
                                if (value2 instanceof Number) {
                                    final NumberFormat b15 = this.b();
                                    br3 = br;
                                    br3.b(b15, value2);
                                    bw2 = bw;
                                    fieldPosition4 = fieldPosition12;
                                }
                                else {
                                    br3 = br;
                                    if (value2 instanceof Date) {
                                        if (bw.h == null) {
                                            bw.h = DateFormat.getDateTimeInstance(3, 3, bw.a);
                                        }
                                        br3.b(bw.h, value2);
                                        bw2 = bw;
                                        fieldPosition4 = fieldPosition12;
                                    }
                                    else {
                                        br3.a(value2.toString());
                                        fieldPosition4 = fieldPosition12;
                                        bw2 = bw;
                                    }
                                }
                            }
                        }
                        final List c5 = br3.c;
                        if (c5 != null) {
                            final int b16 = br3.b;
                            final int n32 = b4;
                            if (n32 < b16) {
                                c5.add(new bs(s3, n32, b16));
                            }
                        }
                        if (fieldPosition4 != null) {
                            if (bt.a.equals(fieldPosition4.getFieldAttribute())) {
                                fieldPosition4.setBeginIndex(b4);
                                fieldPosition4.setEndIndex(br3.b);
                                fieldPosition4 = null;
                            }
                        }
                        final int a11 = bw2.b.d(i).a();
                        n = i;
                        i = a11;
                        break Label_3019;
                    }
                    br3 = br2;
                    final String s14 = a;
                    fieldPosition4 = fieldPosition2;
                    bw2 = bw;
                    s2 = s14;
                }
                br2 = br3;
                ++n;
                final String s15 = s2;
                fieldPosition2 = fieldPosition4;
                bw = bw2;
                a = s15;
            }
            catch (final IOException ex) {
                throw new co(ex);
            }
        }
    }
    
    private final void g(final int n, final bu bu, final Object[] array, final Map map, final Object[] array2, final br br) {
        if (this.b.f != 2) {
            this.f(n, bu, array, map, array2, br, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }
    
    private final void h(final String s, final ParsePosition parsePosition, final Object[] array, final Map map) {
        if (s == null) {
            return;
        }
        final cl b = this.b;
        String a = b.a;
        int n = b.d(0).a();
        int index = parsePosition.getIndex();
        final ParsePosition parsePosition2 = new ParsePosition(0);
        int n2 = 1;
        while (true) {
            final int n3 = 1;
            final ck d = this.b.d(n2);
            final int e = d.e;
            final int n4 = d.a - n;
            if (n4 != 0 && !a.regionMatches(n, s, index, n4)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            final int n5 = index + n4;
            if (e == 2) {
                parsePosition.setIndex(n5);
                return;
            }
            int n7;
            int n17;
            if (e != 3 && e != 4) {
                final int c = this.b.c(n2);
                final int b2 = d.b();
                ++n2;
                final ck d2 = this.b.d(n2);
                int c2;
                Serializable value;
                String s2;
                if (array != null) {
                    c2 = d2.c;
                    value = c2;
                    s2 = null;
                }
                else {
                    if (d2.e == 9) {
                        s2 = this.b.f(d2);
                    }
                    else {
                        s2 = Integer.toString(d2.c);
                    }
                    value = s2;
                    c2 = 0;
                }
                int n6 = n2 + 1;
                final Map c3 = this.c;
                String s3 = null;
                Object value2 = null;
                int n8 = 0;
                Label_1070: {
                    if (c3 != null) {
                        final Format format = c3.get(n6 - 2);
                        if (format != null) {
                            parsePosition2.setIndex(n5);
                            final Object object = format.parseObject(s, parsePosition2);
                            if (parsePosition2.getIndex() == n5) {
                                parsePosition.setErrorIndex(n5);
                                return;
                            }
                            n7 = parsePosition2.getIndex();
                            s3 = s2;
                            value2 = object;
                            n8 = n3;
                            break Label_1070;
                        }
                    }
                    if (b2 != 1) {
                        final Map c4 = this.c;
                        if (c4 == null || !c4.containsKey(n6 - 2)) {
                            if (b2 == 3) {
                                parsePosition2.setIndex(n5);
                                final cl b3 = this.b;
                                final int index2 = parsePosition2.getIndex();
                                double n9 = Double.NaN;
                                int index3 = index2;
                                final String s4 = a;
                                while (true) {
                                    int c5;
                                    cl cl2;
                                    String s6;
                                    String s7;
                                    for (cl cl = b3; cl.h(n6) != 7; n6 = c5 + 1, s7 = s6, cl = cl2, s2 = s7) {
                                        final double a2 = cl.a(cl.d(n6));
                                        int n10 = n6 + 2;
                                        c5 = cl.c(n10);
                                        final String a3 = cl.a;
                                        int n11 = cl.d(n10).a();
                                        int n12 = 0;
                                        String s5 = s2;
                                        cl2 = cl;
                                        while (true) {
                                            ++n10;
                                            s6 = s5;
                                            final ck d3 = cl2.d(n10);
                                            if (n10 == c5 || d3.e == 3) {
                                                final int n13 = d3.a - n11;
                                                if (n13 != 0 && !s.regionMatches(index2, a3, n11, n13)) {
                                                    n12 = -1;
                                                    break;
                                                }
                                                n12 += n13;
                                                if (n10 == c5) {
                                                    break;
                                                }
                                                n11 = d3.a();
                                            }
                                            s5 = s6;
                                        }
                                        if (n12 >= 0) {
                                            final int n14 = n12 + index2;
                                            if (n14 > index3) {
                                                if (n14 == s.length()) {
                                                    index3 = n14;
                                                    n9 = a2;
                                                    s3 = s6;
                                                    a = s4;
                                                    if (index3 == index2) {
                                                        parsePosition2.setErrorIndex(index2);
                                                    }
                                                    else {
                                                        parsePosition2.setIndex(index3);
                                                    }
                                                    if (parsePosition2.getIndex() == n5) {
                                                        parsePosition.setErrorIndex(n5);
                                                        return;
                                                    }
                                                    value2 = n9;
                                                    n7 = parsePosition2.getIndex();
                                                    n8 = 1;
                                                    break Label_1070;
                                                }
                                                else {
                                                    index3 = n14;
                                                    n9 = a2;
                                                }
                                            }
                                        }
                                    }
                                    s3 = s2;
                                    continue;
                                }
                            }
                            if (!jp.k(b2) && b2 != 5) {
                                final String j = jp.j(b2);
                                final StringBuilder sb = new StringBuilder(j.length() + 19);
                                sb.append("unexpected argType ");
                                sb.append(j);
                                throw new IllegalStateException(sb.toString());
                            }
                            throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                        }
                    }
                    final String s8 = a;
                    final StringBuilder sb2 = new StringBuilder();
                    final cl b4 = this.b;
                    final String a4 = b4.a;
                    int n15 = b4.d(c).a();
                    int n16 = c + 1;
                    while (true) {
                        final ck d4 = this.b.d(n16);
                        final int e2 = d4.e;
                        sb2.append(a4, n15, d4.a);
                        if (e2 == 6 || e2 == 2) {
                            break;
                        }
                        n15 = d4.a();
                        ++n16;
                    }
                    final String string = sb2.toString();
                    if (string.length() != 0) {
                        n7 = s.indexOf(string, n5);
                    }
                    else {
                        n7 = s.length();
                    }
                    if (n7 < 0) {
                        parsePosition.setErrorIndex(n5);
                        return;
                    }
                    String substring = s.substring(n5, n7);
                    final String string2 = value.toString();
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 2);
                    sb3.append("{");
                    sb3.append(string2);
                    sb3.append("}");
                    final boolean equals = substring.equals(sb3.toString());
                    if (equals) {
                        substring = null;
                    }
                    n8 = ((equals ^ true) ? 1 : 0);
                    final String s9 = substring;
                    s3 = s2;
                    a = s8;
                    value2 = s9;
                }
                if (n8 != 0) {
                    if (array != null) {
                        array[c2] = value2;
                    }
                    else if (map != null) {
                        map.put(s3, value2);
                    }
                }
                n = this.b.d(c).a();
                n17 = c;
            }
            else {
                n = d.a();
                n17 = n2;
                n7 = n5;
            }
            final int n18 = n17 + 1;
            index = n7;
            n2 = n18;
        }
    }
    
    public final NumberFormat b() {
        if (this.i == null) {
            this.i = NumberFormat.getInstance(this.a);
        }
        return this.i;
    }
    
    @Override
    public final StringBuffer format(final Object o, final StringBuffer sb, final FieldPosition fieldPosition) {
        this.d(o, new br(sb), fieldPosition);
        return sb;
    }
    
    @Override
    public final AttributedCharacterIterator formatToCharacterIterator(final Object o) {
        if (o != null) {
            final StringBuilder sb = new StringBuilder();
            final br br = new br(sb);
            br.c = new ArrayList();
            this.d(o, br, null);
            final AttributedString attributedString = new AttributedString(sb.toString());
            for (final bs bs : br.c) {
                attributedString.addAttribute(bs.a, bs.b, bs.c, bs.d);
            }
            return attributedString.getIterator();
        }
        throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
    }
    
    @Override
    public final int hashCode() {
        return this.b.a.hashCode();
    }
    
    @Override
    public final Object parseObject(final String s, final ParsePosition parsePosition) {
        if (!this.b.d) {
            int n = 0;
            short n2 = -1;
        Label_0103:
            while (true) {
                int c;
                if ((c = n) != 0) {
                    c = this.b.c(n);
                }
                while (true) {
                    int i;
                    do {
                        ++c;
                        i = this.b.h(c);
                        if (i == 6) {
                            if (c < 0) {
                                break Label_0103;
                            }
                            final short c2 = this.b.d(c + 1).c;
                            n = c;
                            if (c2 > n2) {
                                n2 = c2;
                                n = c;
                                continue Label_0103;
                            }
                            continue Label_0103;
                        }
                    } while (i != 2);
                    c = -1;
                    continue;
                }
            }
            final Object[] array = new Object[n2 + 1];
            final int index = parsePosition.getIndex();
            this.h(s, parsePosition, array, null);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return array;
        }
        else {
            final HashMap hashMap = new HashMap();
            final int index2 = parsePosition.getIndex();
            this.h(s, parsePosition, null, hashMap);
            if (parsePosition.getIndex() == index2) {
                return null;
            }
            return hashMap;
        }
    }
}
