import java.util.Map;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.Locale;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ci implements Serializable
{
    public static final ci a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final ca i;
    private static final cg j;
    private static final long serialVersionUID = 1L;
    public final ch h;
    
    static {
        final cg cg = j = new cg("other", i = new bx(), null, null);
        final ch ch = new ch();
        ch.a(cg);
        a = new ci(ch);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }
    
    private ci(final ch h) {
        this.h = h;
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator iterator = h.b.iterator();
        while (iterator.hasNext()) {
            set.add(((cg)iterator.next()).a);
        }
        Collections.unmodifiableSet((Set<?>)set);
    }
    
    public static cg a(String s) {
        if (s.length() == 0) {
            return ci.j;
        }
        s = s.toLowerCase(Locale.ENGLISH);
        final int index = s.indexOf(58);
        if (index == -1) {
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 34);
            sb.append("missing ':' in rule description '");
            sb.append(s);
            sb.append("'");
            throw new ParseException(sb.toString(), 0);
        }
        final String trim = s.substring(0, index).trim();
        for (int i = 0; i < trim.length(); ++i) {
            final char char1 = trim.charAt(i);
            if (char1 < 'a' || char1 > 'z') {
                final StringBuilder sb2 = new StringBuilder(String.valueOf(trim).length() + 22);
                sb2.append("keyword '");
                sb2.append(trim);
                sb2.append(" is not valid");
                throw new ParseException(sb2.toString(), 0);
            }
        }
        final String trim2 = s.substring(index + 1).trim();
        final String[] split = ci.b.split(trim2);
        Object o = null;
        cd a = null;
        switch (split.length) {
            default: {
                s = String.valueOf(trim2);
                if (s.length() != 0) {
                    s = "Too many samples in ".concat(s);
                }
                else {
                    s = new String("Too many samples in ");
                }
                throw new IllegalArgumentException(s);
            }
            case 3: {
                o = cd.a(split[1]);
                a = cd.a(split[2]);
                if (((cd)o).c == 1 && a.c == 2) {
                    break;
                }
                s = String.valueOf(trim2);
                if (s.length() != 0) {
                    s = "Must have @integer then @decimal in ".concat(s);
                }
                else {
                    s = new String("Must have @integer then @decimal in ");
                }
                throw new IllegalArgumentException(s);
            }
            case 2: {
                o = cd.a(split[1]);
                if (((cd)o).c == 2) {
                    a = (cd)o;
                    o = null;
                    break;
                }
                a = null;
                break;
            }
            case 1: {
                o = null;
                a = null;
                break;
            }
        }
        final boolean equals = trim.equals("other");
        if (equals == (split[0].length() == 0)) {
            cd cd;
            ca ca;
            if (equals) {
                final ca j = ci.i;
                cd = a;
                ca = j;
            }
            else {
                final String[] split2 = ci.c.split(split[0]);
                ca ca2 = null;
                int k = 0;
                final cd cd2 = a;
                while (k < split2.length) {
                    final String[] split3 = ci.d.split(split2[k]);
                    int l = 0;
                    ca ca3 = null;
                    final int n = k;
                    while (l < split3.length) {
                        final ca m = ci.i;
                        final String trim3 = split3[l].trim();
                        final ArrayList list = new ArrayList();
                        int n2 = 0;
                        int n3 = -1;
                        while (n2 < trim3.length()) {
                            final char char2 = trim3.charAt(n2);
                            int n4;
                            if (char2 <= ' ' && (char2 == ' ' || char2 == '\t' || char2 == '\n' || char2 == '\f' || char2 == '\r')) {
                                if ((n4 = n3) >= 0) {
                                    list.add(trim3.substring(n3, n2));
                                    n4 = -1;
                                }
                            }
                            else if (char2 <= '=' && char2 >= '!' && (char2 == '!' || char2 == '%' || char2 == ',' || char2 == '.' || char2 == '=')) {
                                if (n3 >= 0) {
                                    list.add(trim3.substring(n3, n2));
                                }
                                list.add(trim3.substring(n2, n2 + 1));
                                n4 = -1;
                            }
                            else if ((n4 = n3) < 0) {
                                n4 = n2;
                            }
                            ++n2;
                            n3 = n4;
                        }
                        if (n3 >= 0) {
                            list.add(trim3.substring(n3));
                        }
                        final String[] array = (String[])list.toArray(new String[list.size()]);
                        Object o2 = array[0];
                        try {
                            int n5 = 0;
                            Label_0887: {
                                switch (((String)o2).hashCode()) {
                                    case 119: {
                                        if (((String)o2).equals("w")) {
                                            n5 = 5;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 118: {
                                        if (((String)o2).equals("v")) {
                                            n5 = 4;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 116: {
                                        if (((String)o2).equals("t")) {
                                            n5 = 3;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 110: {
                                        if (((String)o2).equals("n")) {
                                            n5 = 0;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 106: {
                                        if (((String)o2).equals("j")) {
                                            n5 = 6;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 105: {
                                        if (((String)o2).equals("i")) {
                                            n5 = 1;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                    case 102: {
                                        if (((String)o2).equals("f")) {
                                            n5 = 2;
                                            break Label_0887;
                                        }
                                        break;
                                    }
                                }
                                n5 = -1;
                            }
                            int n6 = 0;
                            switch (n5) {
                                default: {
                                    throw new IllegalArgumentException();
                                }
                                case 6: {
                                    n6 = 7;
                                    break;
                                }
                                case 5: {
                                    n6 = 6;
                                    break;
                                }
                                case 4: {
                                    n6 = 5;
                                    break;
                                }
                                case 3: {
                                    n6 = 4;
                                    break;
                                }
                                case 2: {
                                    n6 = 3;
                                    break;
                                }
                                case 1: {
                                    n6 = 2;
                                    break;
                                }
                                case 0: {
                                    n6 = 1;
                                    break;
                                }
                            }
                            ca ca5;
                            if (array.length > 1) {
                                o2 = array[1];
                                int n7;
                                int int1;
                                if (!"mod".equals(o2) && !"%".equals(o2)) {
                                    n7 = 2;
                                    int1 = 0;
                                }
                                else {
                                    int1 = Integer.parseInt(array[2]);
                                    o2 = f(array, 3, trim3);
                                    n7 = 4;
                                }
                                boolean b;
                                if ("not".equals(o2)) {
                                    o2 = f(array, n7, trim3);
                                    if ("=".equals(o2)) {
                                        throw g((String)o2, trim3);
                                    }
                                    b = false;
                                    ++n7;
                                }
                                else if ("!".equals(o2)) {
                                    o2 = f(array, n7, trim3);
                                    if (!"=".equals(o2)) {
                                        throw g((String)o2, trim3);
                                    }
                                    ++n7;
                                    b = false;
                                }
                                else {
                                    b = true;
                                }
                                String s2;
                                boolean equals2;
                                boolean b2;
                                int n9;
                                if (!"is".equals(o2) && !"in".equals(o2) && !"=".equals(o2)) {
                                    if (!"within".equals(o2)) {
                                        throw g((String)o2, trim3);
                                    }
                                    final int n8 = n7 + 1;
                                    s2 = f(array, n7, trim3);
                                    equals2 = false;
                                    b2 = false;
                                    n9 = n8;
                                }
                                else {
                                    equals2 = "is".equals(o2);
                                    if (equals2 && !b) {
                                        throw g((String)o2, trim3);
                                    }
                                    final int n10 = n7 + 1;
                                    s2 = f(array, n7, trim3);
                                    b2 = true;
                                    n9 = n10;
                                }
                                if ("not".equals(s2)) {
                                    if (!equals2 && !b) {
                                        throw g(s2, trim3);
                                    }
                                    s2 = f(array, n9, trim3);
                                    b ^= true;
                                    ++n9;
                                }
                                final ArrayList list2 = new ArrayList();
                                double min = 9.223372036854776E18;
                                double max = -9.223372036854776E18;
                                ca ca4 = ca3;
                                o2 = o;
                                final String[] array2 = array;
                                while (true) {
                                    ca5 = ca4;
                                    final long long1 = Long.parseLong(s2);
                                    final int length = array2.length;
                                    long long2 = 0L;
                                    Label_1561: {
                                        if (n9 < length) {
                                            final int n11 = n9 + 1;
                                            s2 = f(array2, n9, trim3);
                                            if (s2.equals(".")) {
                                                final int n12 = n11 + 1;
                                                final String f = f(array2, n11, trim3);
                                                if (!f.equals(".")) {
                                                    throw g(f, trim3);
                                                }
                                                n9 = n12 + 1;
                                                s2 = f(array2, n12, trim3);
                                                long2 = Long.parseLong(s2);
                                                if (n9 >= length) {
                                                    break Label_1561;
                                                }
                                                final int n13 = n9 + 1;
                                                s2 = f(array2, n9, trim3);
                                                if (s2.equals(",")) {
                                                    n9 = n13;
                                                    break Label_1561;
                                                }
                                                throw g(s2, trim3);
                                            }
                                            else {
                                                if (!s2.equals(",")) {
                                                    throw g(s2, trim3);
                                                }
                                                n9 = n11;
                                            }
                                        }
                                        long2 = long1;
                                    }
                                    if (long1 > long2) {
                                        final StringBuilder sb3 = new StringBuilder(41);
                                        sb3.append(long1);
                                        sb3.append("~");
                                        sb3.append(long2);
                                        throw g(sb3.toString(), trim3);
                                    }
                                    if (int1 != 0 && long2 >= int1) {
                                        final StringBuilder sb4 = new StringBuilder(36);
                                        sb4.append(long2);
                                        sb4.append(">mod=");
                                        sb4.append(int1);
                                        throw g(sb4.toString(), trim3);
                                    }
                                    list2.add(long1);
                                    list2.add(long2);
                                    min = Math.min(min, (double)long1);
                                    max = Math.max(max, (double)long2);
                                    if (n9 >= length) {
                                        if (s2.equals(",")) {
                                            throw g(s2, trim3);
                                        }
                                        long[] array3;
                                        if (list2.size() == 2) {
                                            array3 = null;
                                        }
                                        else {
                                            final int size = list2.size();
                                            array3 = new long[size];
                                            for (int n14 = 0; n14 < size; ++n14) {
                                                array3[n14] = (long)list2.get(n14);
                                            }
                                        }
                                        if (min != max && equals2 && !b) {
                                            throw g("is not <range>", trim3);
                                        }
                                        ca3 = new cf(int1, b, n6, b2, min, max, array3);
                                        break;
                                    }
                                    else {
                                        s2 = f(array2, n9, trim3);
                                        ++n9;
                                        ca4 = ca5;
                                    }
                                }
                            }
                            else {
                                o2 = o;
                                ca5 = ca3;
                                ca3 = m;
                            }
                            if (ca5 != null) {
                                ca3 = new by(ca5, ca3);
                            }
                            ++l;
                            o = o2;
                            continue;
                        }
                        catch (final Exception ex) {
                            throw g((String)o2, trim3);
                        }
                        break;
                    }
                    if (ca2 == null) {
                        ca2 = ca3;
                    }
                    else {
                        ca2 = new ce(ca2, ca3);
                    }
                    k = n + 1;
                }
                ca = ca2;
                cd = cd2;
            }
            return new cg(trim, ca, (cd)o, cd);
        }
        throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
    }
    
    public static ci b(String substring) {
        final String trim = substring.trim();
        ci a;
        if (trim.length() == 0) {
            a = ci.a;
        }
        else {
            final ch ch = new ch();
            substring = trim;
            if (trim.endsWith(";")) {
                substring = trim.substring(0, trim.length() - 1);
            }
            final String[] split = ci.g.split(substring);
            for (int i = 0; i < split.length; ++i) {
                final cg a2 = a(split[i].trim());
                final cd c = a2.c;
                boolean b = true;
                if (c == null) {
                    if (a2.d == null) {
                        b = false;
                    }
                }
                ch.a |= b;
                ch.a(a2);
            }
            final Iterator iterator = ch.b.iterator();
            cg cg = null;
            while (iterator.hasNext()) {
                final cg cg2 = (cg)iterator.next();
                if ("other".equals(cg2.a)) {
                    iterator.remove();
                    cg = cg2;
                }
            }
            cg a3;
            if ((a3 = cg) == null) {
                a3 = a("other:");
            }
            ch.b.add(a3);
            a = new ci(ch);
        }
        return a;
    }
    
    public static void c(final StringBuilder sb, final double n, final double n2, final boolean b) {
        if (b) {
            sb.append(",");
        }
        if (n == n2) {
            sb.append(e(n));
            return;
        }
        final String e = e(n);
        final String e2 = e(n2);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(e).length() + 2 + String.valueOf(e2).length());
        sb2.append(e);
        sb2.append("..");
        sb2.append(e2);
        sb.append(sb2.toString());
    }
    
    public static ci d(final Locale locale, final int n) {
        final cj a = cj.a;
        a.b();
        Map map;
        if (n == 1) {
            map = a.b;
        }
        else {
            map = a.c;
        }
        final String s = map.get(locale.getLanguage());
        ci ci;
        if (s != null && s.trim().length() != 0) {
            if ((ci = a.a(s)) == null) {
                return ci.a;
            }
        }
        else {
            ci = ci.a;
        }
        return ci;
    }
    
    private static String e(final double n) {
        final long n2 = (long)n;
        String s;
        if (n == n2) {
            s = String.valueOf(n2);
        }
        else {
            s = String.valueOf(n);
        }
        return s;
    }
    
    private static String f(final String[] array, final int n, final String s) {
        if (n < array.length) {
            return array[n];
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 26);
        sb.append("missing token at end of '");
        sb.append(s);
        sb.append("'");
        throw new ParseException(sb.toString(), -1);
    }
    
    private static ParseException g(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 25 + String.valueOf(s2).length());
        sb.append("unexpected token '");
        sb.append(s);
        sb.append("' in '");
        sb.append(s2);
        sb.append("'");
        return new ParseException(sb.toString(), -1);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ci) {
            final ci ci = (ci)o;
            if (ci != null && this.toString().equals(ci.toString())) {
                return true;
            }
        }
        return false;
    }
    
    @Deprecated
    @Override
    public final int hashCode() {
        return this.h.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.h.toString();
    }
}
