import java.util.Locale;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cl implements Cloneable
{
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public final int f;
    private boolean g;
    
    static {
        final String a = bm.a();
        final int hashCode = a.hashCode();
        int h2 = 1;
        int n = 0;
        Label_0073: {
            switch (hashCode) {
                case -99796978: {
                    if (a.equals("DOUBLE_OPTIONAL")) {
                        n = 0;
                        break Label_0073;
                    }
                    break;
                }
                case -413919155: {
                    if (a.equals("DOUBLE_REQUIRED")) {
                        n = 1;
                        break Label_0073;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 1: {
                h2 = 2;
            }
            case 0: {
                h = h2;
                e = new int[] { 1, 2, 3, 4, 5, 6 };
            }
        }
    }
    
    public cl() {
        new ArrayList();
        throw null;
    }
    
    public cl(final String s) {
        this.b = new ArrayList();
        this.f = cl.h;
        this.i(s);
    }
    
    private final int j(int i) {
        while (i < this.a.length()) {
            final char char1 = this.a.charAt(i);
            if ((char1 < '0' && "+-.".indexOf(char1) < 0) || (char1 > '9' && char1 != 'e' && char1 != 'E' && char1 != '\u221e')) {
                break;
            }
            ++i;
        }
        return i;
    }
    
    private final int k(int i) {
        final String a = this.a;
        final byte[] a2 = bp.a;
        while (i < a.length()) {
            final char char1 = a.charAt(i);
            Label_0125: {
                if (char1 <= '\u00ff') {
                    if (bp.a[char1] != 0) {
                        break;
                    }
                }
                else if (char1 >= '\u200e') {
                    if (char1 <= '\u3030') {
                        if ((bp.c[bp.b[char1 - '\u2000' >> 5]] >> (char1 & '\u001f') & 0x1) == 0x0) {
                            break Label_0125;
                        }
                    }
                    else {
                        if (char1 < '\ufd3e' || char1 > '\ufe46') {
                            break Label_0125;
                        }
                        if (char1 > '\ufd3f') {
                            if (char1 < '\ufe45') {
                                break Label_0125;
                            }
                        }
                    }
                    break;
                }
            }
            ++i;
        }
        return i;
    }
    
    private final int l(int n) {
        final String a = this.a;
        final byte[] a2 = bp.a;
        while (n < a.length() && bp.a(a.charAt(n))) {
            ++n;
        }
        return n;
    }
    
    private final String m() {
        return o(this.a, 0);
    }
    
    private final String n(final int n) {
        return o(this.a, n);
    }
    
    private static String o(final String s, final int n) {
        final StringBuilder sb = new StringBuilder(44);
        if (n == 0) {
            sb.append("\"");
        }
        else {
            sb.append("[at pattern index ");
            sb.append(n);
            sb.append("] \"");
        }
        if (s.length() - n <= 24) {
            String substring = s;
            if (n != 0) {
                substring = s.substring(n);
            }
            sb.append(substring);
        }
        else {
            int n2 = n + 20;
            final int n3 = n2 - 1;
            if (Character.isHighSurrogate(s.charAt(n3))) {
                n2 = n3;
            }
            sb.append(s, n, n2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }
    
    private final void p(final double n, final int n2, final int n3) {
        final ArrayList c = this.c;
        int size;
        if (c == null) {
            this.c = new ArrayList();
            size = 0;
        }
        else {
            size = c.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(n);
        this.v(14, n2, n3, size);
    }
    
    private final void q(final int n, final int n2, final boolean b) {
        int n3 = n + 1;
        char c = this.a.charAt(n);
        int n4 = 0;
        Label_0138: {
            int n5;
            if (c == '-') {
                if (n3 == n2) {
                    break Label_0138;
                }
                c = this.a.charAt(n3);
                n5 = 1;
                ++n3;
            }
            else if (c == '+') {
                if (n3 == n2) {
                    break Label_0138;
                }
                c = this.a.charAt(n3);
                n5 = 0;
                ++n3;
            }
            else {
                n5 = 0;
            }
            if (c != '\u221e') {
                int n7;
                for (int n6 = n3; c >= '0' && c <= '9'; c = this.a.charAt(n6), ++n6, n4 = n7) {
                    n7 = n4 * 10 + (c - '0');
                    if (n7 > n5 + 32767) {
                        break;
                    }
                    if (n6 == n2) {
                        if (n5 != 0) {
                            n7 = -n7;
                        }
                        this.v(13, n, n2 - n, n7);
                        return;
                    }
                }
                this.p(Double.parseDouble(this.a.substring(n, n2)), n, n2 - n);
                return;
            }
            if (b && n3 == n2) {
                double n8;
                if (n5 == 0) {
                    n8 = Double.POSITIVE_INFINITY;
                }
                else {
                    n8 = Double.NEGATIVE_INFINITY;
                }
                this.p(n8, n, n2 - n);
                return;
            }
        }
        final String value = String.valueOf(this.a.substring(n, n2));
        String concat;
        if (value.length() != 0) {
            concat = "Bad syntax for numeric value: ".concat(value);
        }
        else {
            concat = new String("Bad syntax for numeric value: ");
        }
        throw new NumberFormatException(concat);
    }
    
    private final boolean r(final int n) {
        return n > 0 || this.b.get(0).e == 1;
    }
    
    private final boolean s(int n) {
        final int n2 = n + 1;
        n = this.a.charAt(n);
        boolean b = false;
        if (n == 115 || n == 83) {
            n = n2 + 1;
            final char char1 = this.a.charAt(n2);
            if (char1 == 'e' || char1 == 'E') {
                final int n3 = n + 1;
                n = this.a.charAt(n);
                if (n == 108 || n == 76) {
                    n = n3 + 1;
                    final char char2 = this.a.charAt(n3);
                    if (char2 == 'e' || char2 == 'E') {
                        final char char3 = this.a.charAt(n);
                        if (char3 == 'c' || char3 == 'C') {
                            n = this.a.charAt(n + 1);
                            if (n != 116) {
                                if (n == 84) {
                                    return true;
                                }
                            }
                            else {
                                b = true;
                            }
                        }
                    }
                }
            }
        }
        return b;
    }
    
    private final int t(int i, int j, final int n, int n2) {
        int n3 = n2;
        if (n > 32767) {
            throw new IndexOutOfBoundsException();
        }
        final int size = this.b.size();
        this.v(1, i, j, n);
        i += j;
    Label_0032:
        while (i < this.a.length()) {
            j = i + 1;
            i = this.a.charAt(i);
            Label_4017: {
                if (i == 39) {
                    if (j == this.a.length()) {
                        this.v(4, j, 0, 39);
                    }
                    else {
                        final char char1 = this.a.charAt(j);
                        if (char1 == '\'') {
                            i = j + 1;
                            this.v(3, j, 1, 0);
                            continue;
                        }
                        Label_0189: {
                            if (this.f != 2 && char1 != '{' && char1 != '}') {
                                if (n3 == 3) {
                                    if (char1 == '|') {
                                        break Label_0189;
                                    }
                                    i = 3;
                                }
                                else {
                                    i = n3;
                                }
                                if (!jp.k(i) || char1 != '#') {
                                    this.v(4, j, 0, 39);
                                    break Label_4017;
                                }
                            }
                        }
                        this.v(3, j - 1, 1, 0);
                        i = j;
                        while (true) {
                            j = this.a.indexOf(39, i + 1);
                            if (j < 0) {
                                i = this.a.length();
                                this.v(4, i, 0, 39);
                                continue Label_0032;
                            }
                            i = j + 1;
                            if (i >= this.a.length() || this.a.charAt(i) != '\'') {
                                this.v(3, j, 1, 0);
                                continue Label_0032;
                            }
                            this.v(3, i, 1, 0);
                        }
                    }
                }
                else if (jp.k(n2) && i == 35) {
                    this.v(5, j - 1, 1, 0);
                }
                else if (i == 123) {
                    i = j - 1;
                    final int size2 = this.b.size();
                    this.v(6, i, 1, 0);
                    final int l = this.l(i + 1);
                    if (l == this.a.length()) {
                        final String value = String.valueOf(this.m());
                        String concat;
                        if (value.length() != 0) {
                            concat = "Unmatched '{' braces in message ".concat(value);
                        }
                        else {
                            concat = new String("Unmatched '{' braces in message ");
                        }
                        throw new IllegalArgumentException(concat);
                    }
                    final int k = this.k(l);
                    final String a = this.a;
                    Label_0585: {
                        if (l >= k) {
                            i = -2;
                        }
                        else {
                            int n4 = l + 1;
                            i = a.charAt(l);
                            Label_0583: {
                                if (i == 48) {
                                    if (n4 == k) {
                                        i = 0;
                                        break Label_0585;
                                    }
                                    j = 1;
                                    i = 0;
                                }
                                else {
                                    if (i < 49 || i > 57) {
                                        break Label_0583;
                                    }
                                    i -= 48;
                                    j = 0;
                                }
                                while (n4 < k) {
                                    final char char2 = a.charAt(n4);
                                    if (char2 < '0' || char2 > '9') {
                                        break Label_0583;
                                    }
                                    j |= ((i < 214748364 ^ true) ? 1 : 0);
                                    i = i * 10 + (char2 - '0');
                                    ++n4;
                                }
                                if (j != 0) {
                                    i = -2;
                                }
                                break Label_0585;
                            }
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        j = k - l;
                        if (j > 65535 || i > 32767) {
                            final String value2 = String.valueOf(this.n(l));
                            String concat2;
                            if (value2.length() != 0) {
                                concat2 = "Argument number too large: ".concat(value2);
                            }
                            else {
                                concat2 = new String("Argument number too large: ");
                            }
                            throw new IndexOutOfBoundsException(concat2);
                        }
                        this.v(8, l, j, i);
                    }
                    else {
                        if (i != -1) {
                            final String value3 = String.valueOf(this.n(l));
                            String concat3;
                            if (value3.length() != 0) {
                                concat3 = "Bad argument syntax: ".concat(value3);
                            }
                            else {
                                concat3 = new String("Bad argument syntax: ");
                            }
                            throw new IllegalArgumentException(concat3);
                        }
                        i = k - l;
                        if (i > 65535) {
                            final String value4 = String.valueOf(this.n(l));
                            String concat4;
                            if (value4.length() != 0) {
                                concat4 = "Argument name too long: ".concat(value4);
                            }
                            else {
                                concat4 = new String("Argument name too long: ");
                            }
                            throw new IndexOutOfBoundsException(concat4);
                        }
                        this.d = true;
                        this.v(9, l, i, 0);
                    }
                    j = this.l(k);
                    if (j == this.a.length()) {
                        final String value5 = String.valueOf(this.m());
                        String concat5;
                        if (value5.length() != 0) {
                            concat5 = "Unmatched '{' braces in message ".concat(value5);
                        }
                        else {
                            concat5 = new String("Unmatched '{' braces in message ");
                        }
                        throw new IllegalArgumentException(concat5);
                    }
                    i = this.a.charAt(j);
                    Label_3623: {
                        if (i == 125) {
                            i = 1;
                        }
                        else {
                            if (i != 44) {
                                final String value6 = String.valueOf(this.n(l));
                                String concat6;
                                if (value6.length() != 0) {
                                    concat6 = "Bad argument syntax: ".concat(value6);
                                }
                                else {
                                    concat6 = new String("Bad argument syntax: ");
                                }
                                throw new IllegalArgumentException(concat6);
                            }
                            int n5;
                            for (n5 = (i = this.l(j + 1)); i < this.a.length(); ++i) {
                                j = this.a.charAt(i);
                                if ((j < 97 || j > 122) && (j < 65 || j > 90)) {
                                    break;
                                }
                            }
                            int n6 = i - n5;
                            final int m = this.l(i);
                            if (m == this.a.length()) {
                                final String value7 = String.valueOf(this.m());
                                String concat7;
                                if (value7.length() != 0) {
                                    concat7 = "Unmatched '{' braces in message ".concat(value7);
                                }
                                else {
                                    concat7 = new String("Unmatched '{' braces in message ");
                                }
                                throw new IllegalArgumentException(concat7);
                            }
                            Label_3833: {
                                if (n6 != 0) {
                                    i = this.a.charAt(m);
                                    if ((j = i) != 44) {
                                        if (i != 125) {
                                            break Label_3833;
                                        }
                                        j = 125;
                                    }
                                    if (n6 > 65535) {
                                        final String value8 = String.valueOf(this.n(l));
                                        String concat8;
                                        if (value8.length() != 0) {
                                            concat8 = "Argument type name too long: ".concat(value8);
                                        }
                                        else {
                                            concat8 = new String("Argument type name too long: ");
                                        }
                                        throw new IndexOutOfBoundsException(concat8);
                                    }
                                    Label_1739: {
                                        if (n6 == 6) {
                                            i = n5 + 1;
                                            final char char3 = this.a.charAt(n5);
                                            if (char3 == 'c' || char3 == 'C') {
                                                final int n7 = i + 1;
                                                final char char4 = this.a.charAt(i);
                                                if (char4 == 'h' || char4 == 'H') {
                                                    final int n8 = n7 + 1;
                                                    final char char5 = this.a.charAt(n7);
                                                    if (char5 == 'o' || char5 == 'O') {
                                                        final int n9 = n8 + 1;
                                                        final char char6 = this.a.charAt(n8);
                                                        if (char6 == 'i' || char6 == 'I') {
                                                            final char char7 = this.a.charAt(n9);
                                                            if (char7 == 'c' || char7 == 'C') {
                                                                final char char8 = this.a.charAt(n9 + 1);
                                                                if (char8 == 'e') {
                                                                    i = 3;
                                                                    break Label_1739;
                                                                }
                                                                if (char8 == 'E') {
                                                                    i = 3;
                                                                    break Label_1739;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            final char char9 = this.a.charAt(n5);
                                            if (char9 == 'p' || char9 == 'P') {
                                                final int n10 = i + 1;
                                                i = this.a.charAt(i);
                                                if (i == 108 || i == 76) {
                                                    final int n11 = n10 + 1;
                                                    i = this.a.charAt(n10);
                                                    if (i == 117 || i == 85) {
                                                        i = n11 + 1;
                                                        final char char10 = this.a.charAt(n11);
                                                        if (char10 == 'r' || char10 == 'R') {
                                                            final char char11 = this.a.charAt(i);
                                                            if (char11 == 'a' || char11 == 'A') {
                                                                i = this.a.charAt(i + 1);
                                                                if (i == 108 || i == 76) {
                                                                    i = 4;
                                                                    break Label_1739;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (this.s(n5)) {
                                                i = 5;
                                            }
                                            else {
                                                i = 2;
                                            }
                                        }
                                        else if (n6 == 13) {
                                            Label_1730: {
                                                if (this.s(n5)) {
                                                    final int n12 = n5 + 6;
                                                    i = n12 + 1;
                                                    final char char12 = this.a.charAt(n12);
                                                    if (char12 == 'o' || char12 == 'O') {
                                                        final int n13 = i + 1;
                                                        i = this.a.charAt(i);
                                                        if (i == 114 || i == 82) {
                                                            i = n13 + 1;
                                                            final char char13 = this.a.charAt(n13);
                                                            if (char13 == 'd' || char13 == 'D') {
                                                                final int n14 = i + 1;
                                                                i = this.a.charAt(i);
                                                                if (i == 105 || i == 73) {
                                                                    i = n14 + 1;
                                                                    final char char14 = this.a.charAt(n14);
                                                                    if (char14 == 'n' || char14 == 'N') {
                                                                        final char char15 = this.a.charAt(i);
                                                                        if (char15 == 'a' || char15 == 'A') {
                                                                            i = this.a.charAt(i + 1);
                                                                            if (i == 108 || i == 76) {
                                                                                i = 6;
                                                                                break Label_1730;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i = 2;
                                            }
                                            n6 = 13;
                                        }
                                        else {
                                            i = 2;
                                        }
                                    }
                                    ((ck)this.b.get(size2)).c = (short)(i - 1);
                                    if (i == 2) {
                                        this.v(10, n5, n6, 0);
                                    }
                                    if (j == 125) {
                                        if (i != 2) {
                                            final String value9 = String.valueOf(this.n(l));
                                            String concat9;
                                            if (value9.length() != 0) {
                                                concat9 = "No style field for complex argument: ".concat(value9);
                                            }
                                            else {
                                                concat9 = new String("No style field for complex argument: ");
                                            }
                                            throw new IllegalArgumentException(concat9);
                                        }
                                        j = m;
                                        break Label_3623;
                                    }
                                    else {
                                        final int n15 = m + 1;
                                        if (i == 2) {
                                            j = n15;
                                            int n16 = 0;
                                            while (j < this.a.length()) {
                                                final int n17 = j + 1;
                                                j = this.a.charAt(j);
                                                if (j == 39) {
                                                    j = this.a.indexOf(39, n17);
                                                    if (j < 0) {
                                                        final String value10 = String.valueOf(this.n(n15));
                                                        String concat10;
                                                        if (value10.length() != 0) {
                                                            concat10 = "Quoted literal argument style text reaches to the end of the message: ".concat(value10);
                                                        }
                                                        else {
                                                            concat10 = new String("Quoted literal argument style text reaches to the end of the message: ");
                                                        }
                                                        throw new IllegalArgumentException(concat10);
                                                    }
                                                    ++j;
                                                }
                                                else {
                                                    if (j == 123) {
                                                        j = n16 + 1;
                                                    }
                                                    else {
                                                        if (j != 125) {
                                                            j = n17;
                                                            continue;
                                                        }
                                                        if (n16 > 0) {
                                                            j = n16 - 1;
                                                        }
                                                        else {
                                                            j = n17 - 1;
                                                            final int n18 = j - n15;
                                                            if (n18 > 65535) {
                                                                final String value11 = String.valueOf(this.n(n15));
                                                                String concat11;
                                                                if (value11.length() != 0) {
                                                                    concat11 = "Argument style text too long: ".concat(value11);
                                                                }
                                                                else {
                                                                    concat11 = new String("Argument style text too long: ");
                                                                }
                                                                throw new IndexOutOfBoundsException(concat11);
                                                            }
                                                            this.v(11, n15, n18, 0);
                                                            break Label_3623;
                                                        }
                                                    }
                                                    n16 = j;
                                                    j = n17;
                                                }
                                            }
                                            final String value12 = String.valueOf(this.m());
                                            String concat12;
                                            if (value12.length() != 0) {
                                                concat12 = "Unmatched '{' braces in message ".concat(value12);
                                            }
                                            else {
                                                concat12 = new String("Unmatched '{' braces in message ");
                                            }
                                            throw new IllegalArgumentException(concat12);
                                        }
                                        if (i == 3) {
                                            final int l2 = this.l(n15);
                                            if (l2 != this.a.length()) {
                                                j = l2;
                                                if (this.a.charAt(l2) != '}') {
                                                    while (true) {
                                                        final int j2 = this.j(j);
                                                        final int n19 = j2 - j;
                                                        if (n19 == 0) {
                                                            final String value13 = String.valueOf(this.n(n15));
                                                            String concat13;
                                                            if (value13.length() != 0) {
                                                                concat13 = "Bad choice pattern syntax: ".concat(value13);
                                                            }
                                                            else {
                                                                concat13 = new String("Bad choice pattern syntax: ");
                                                            }
                                                            throw new IllegalArgumentException(concat13);
                                                        }
                                                        if (n19 > 65535) {
                                                            final String value14 = String.valueOf(this.n(j));
                                                            String concat14;
                                                            if (value14.length() != 0) {
                                                                concat14 = "Choice number too long: ".concat(value14);
                                                            }
                                                            else {
                                                                concat14 = new String("Choice number too long: ");
                                                            }
                                                            throw new IndexOutOfBoundsException(concat14);
                                                        }
                                                        this.q(j, j2, true);
                                                        j = this.l(j2);
                                                        if (j == this.a.length()) {
                                                            final String value15 = String.valueOf(this.n(n15));
                                                            String concat15;
                                                            if (value15.length() != 0) {
                                                                concat15 = "Bad choice pattern syntax: ".concat(value15);
                                                            }
                                                            else {
                                                                concat15 = new String("Bad choice pattern syntax: ");
                                                            }
                                                            throw new IllegalArgumentException(concat15);
                                                        }
                                                        final char char16 = this.a.charAt(j);
                                                        if (char16 != '#' && char16 != '<' && char16 != '\u2264') {
                                                            final String n20 = this.n(n15);
                                                            final StringBuilder sb = new StringBuilder(String.valueOf(n20).length() + 65);
                                                            sb.append("Expected choice separator (#<\u2264) instead of '");
                                                            sb.append(char16);
                                                            sb.append("' in choice pattern ");
                                                            sb.append(n20);
                                                            throw new IllegalArgumentException(sb.toString());
                                                        }
                                                        this.v(12, j, 1, 0);
                                                        j = this.t(j + 1, 0, n + 1, 3);
                                                        if (j == this.a.length()) {
                                                            break;
                                                        }
                                                        if (this.a.charAt(j) == '}') {
                                                            if (!this.r(n)) {
                                                                final String value16 = String.valueOf(this.n(n15));
                                                                String concat16;
                                                                if (value16.length() != 0) {
                                                                    concat16 = "Bad choice pattern syntax: ".concat(value16);
                                                                }
                                                                else {
                                                                    concat16 = new String("Bad choice pattern syntax: ");
                                                                }
                                                                throw new IllegalArgumentException(concat16);
                                                            }
                                                            break;
                                                        }
                                                        else {
                                                            j = this.l(j + 1);
                                                        }
                                                    }
                                                    break Label_3623;
                                                }
                                            }
                                            final String value17 = String.valueOf(this.m());
                                            String concat17;
                                            if (value17.length() != 0) {
                                                concat17 = "Missing choice argument pattern in ".concat(value17);
                                            }
                                            else {
                                                concat17 = new String("Missing choice argument pattern in ");
                                            }
                                            throw new IllegalArgumentException(concat17);
                                        }
                                        int n21 = n15;
                                        boolean b = false;
                                        j = 1;
                                        while (true) {
                                            final int l3 = this.l(n21);
                                            final int length = this.a.length();
                                            final boolean b2 = l3 == length;
                                            if (l3 != length && this.a.charAt(l3) != '}') {
                                                if (jp.k(i) && this.a.charAt(l3) == '=') {
                                                    final int n22 = l3 + 1;
                                                    j = this.j(n22);
                                                    final int n23 = j - l3;
                                                    if (n23 == 1) {
                                                        final String lowerCase = jp.j(i).toLowerCase(Locale.ENGLISH);
                                                        final String n24 = this.n(n15);
                                                        final StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 21 + String.valueOf(n24).length());
                                                        sb2.append("Bad ");
                                                        sb2.append(lowerCase);
                                                        sb2.append(" pattern syntax: ");
                                                        sb2.append(n24);
                                                        throw new IllegalArgumentException(sb2.toString());
                                                    }
                                                    if (n23 > 65535) {
                                                        final String value18 = String.valueOf(this.n(l3));
                                                        String concat18;
                                                        if (value18.length() != 0) {
                                                            concat18 = "Argument selector too long: ".concat(value18);
                                                        }
                                                        else {
                                                            concat18 = new String("Argument selector too long: ");
                                                        }
                                                        throw new IndexOutOfBoundsException(concat18);
                                                    }
                                                    this.v(12, l3, n23, 0);
                                                    this.q(n22, j, false);
                                                }
                                                else {
                                                    final int k2 = this.k(l3);
                                                    final int n25 = k2 - l3;
                                                    if (n25 == 0) {
                                                        final String lowerCase2 = jp.j(i).toLowerCase(Locale.ENGLISH);
                                                        final String n26 = this.n(n15);
                                                        final StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase2).length() + 21 + String.valueOf(n26).length());
                                                        sb3.append("Bad ");
                                                        sb3.append(lowerCase2);
                                                        sb3.append(" pattern syntax: ");
                                                        sb3.append(n26);
                                                        throw new IllegalArgumentException(sb3.toString());
                                                    }
                                                    int n27;
                                                    if (jp.k(i)) {
                                                        if ((n27 = n25) == 6) {
                                                            if (k2 < this.a.length()) {
                                                                if (this.a.regionMatches(l3, "offset:", 0, 7)) {
                                                                    if (j == 0) {
                                                                        final String value19 = String.valueOf(this.n(n15));
                                                                        String concat19;
                                                                        if (value19.length() != 0) {
                                                                            concat19 = "Plural argument 'offset:' (if present) must precede key-message pairs: ".concat(value19);
                                                                        }
                                                                        else {
                                                                            concat19 = new String("Plural argument 'offset:' (if present) must precede key-message pairs: ");
                                                                        }
                                                                        throw new IllegalArgumentException(concat19);
                                                                    }
                                                                    j = this.l(k2 + 1);
                                                                    n21 = this.j(j);
                                                                    if (n21 == j) {
                                                                        final String value20 = String.valueOf(this.n(n15));
                                                                        String concat20;
                                                                        if (value20.length() != 0) {
                                                                            concat20 = "Missing value for plural 'offset:' ".concat(value20);
                                                                        }
                                                                        else {
                                                                            concat20 = new String("Missing value for plural 'offset:' ");
                                                                        }
                                                                        throw new IllegalArgumentException(concat20);
                                                                    }
                                                                    if (n21 - j > 65535) {
                                                                        final String value21 = String.valueOf(this.n(j));
                                                                        String concat21;
                                                                        if (value21.length() != 0) {
                                                                            concat21 = "Plural offset value too long: ".concat(value21);
                                                                        }
                                                                        else {
                                                                            concat21 = new String("Plural offset value too long: ");
                                                                        }
                                                                        throw new IndexOutOfBoundsException(concat21);
                                                                    }
                                                                    this.q(j, n21, false);
                                                                    j = 0;
                                                                    continue;
                                                                }
                                                                else {
                                                                    n27 = 6;
                                                                }
                                                            }
                                                            else {
                                                                n27 = 6;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        n27 = n25;
                                                    }
                                                    if (n27 > 65535) {
                                                        final String value22 = String.valueOf(this.n(l3));
                                                        String concat22;
                                                        if (value22.length() != 0) {
                                                            concat22 = "Argument selector too long: ".concat(value22);
                                                        }
                                                        else {
                                                            concat22 = new String("Argument selector too long: ");
                                                        }
                                                        throw new IndexOutOfBoundsException(concat22);
                                                    }
                                                    this.v(12, l3, n27, 0);
                                                    j = k2;
                                                    if (this.a.regionMatches(l3, "other", 0, n27)) {
                                                        b = true;
                                                        j = k2;
                                                    }
                                                }
                                                j = this.l(j);
                                                if (j == this.a.length() || this.a.charAt(j) != '{') {
                                                    final String lowerCase3 = jp.j(i).toLowerCase(Locale.ENGLISH);
                                                    final String n28 = this.n(l3);
                                                    final StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase3).length() + 37 + String.valueOf(n28).length());
                                                    sb4.append("No message fragment after ");
                                                    sb4.append(lowerCase3);
                                                    sb4.append(" selector: ");
                                                    sb4.append(n28);
                                                    throw new IllegalArgumentException(sb4.toString());
                                                }
                                                n21 = this.t(j, 1, n + 1, i);
                                                j = 0;
                                            }
                                            else {
                                                if (b2 == this.r(n)) {
                                                    final String lowerCase4 = jp.j(i).toLowerCase(Locale.ENGLISH);
                                                    final String n29 = this.n(n15);
                                                    final StringBuilder sb5 = new StringBuilder(String.valueOf(lowerCase4).length() + 21 + String.valueOf(n29).length());
                                                    sb5.append("Bad ");
                                                    sb5.append(lowerCase4);
                                                    sb5.append(" pattern syntax: ");
                                                    sb5.append(n29);
                                                    throw new IllegalArgumentException(sb5.toString());
                                                }
                                                if (b) {
                                                    j = l3;
                                                    break Label_3623;
                                                }
                                                final String lowerCase5 = jp.j(i).toLowerCase(Locale.ENGLISH);
                                                final String m2 = this.m();
                                                final StringBuilder sb6 = new StringBuilder(String.valueOf(lowerCase5).length() + 39 + String.valueOf(m2).length());
                                                sb6.append("Missing 'other' keyword in ");
                                                sb6.append(lowerCase5);
                                                sb6.append(" pattern in ");
                                                sb6.append(m2);
                                                throw new IllegalArgumentException(sb6.toString());
                                            }
                                        }
                                    }
                                }
                            }
                            final String value23 = String.valueOf(this.n(l));
                            String concat23;
                            if (value23.length() != 0) {
                                concat23 = "Bad argument syntax: ".concat(value23);
                            }
                            else {
                                concat23 = new String("Bad argument syntax: ");
                            }
                            throw new IllegalArgumentException(concat23);
                        }
                    }
                    this.u(size2, 7, j, 1, i - 1);
                    i = j + 1;
                    continue;
                }
                else {
                    if (n > 0 && i == 125) {
                        i = 125;
                    }
                    else {
                        if (n3 != 3 || i != 124) {
                            break Label_4017;
                        }
                        n3 = 3;
                    }
                    if (n3 == 3 && i == 125) {
                        i = 0;
                    }
                    else {
                        i = 1;
                    }
                    n2 = j - 1;
                    this.u(size, 2, n2, i, n);
                    if (n3 == 3) {
                        return n2;
                    }
                    return j;
                }
            }
            i = j;
        }
        if (n > 0 && (n != 1 || n3 != 3 || this.b.get(0).e == 1)) {
            final String value24 = String.valueOf(this.m());
            String concat24;
            if (value24.length() != 0) {
                concat24 = "Unmatched '{' braces in message ".concat(value24);
            }
            else {
                concat24 = new String("Unmatched '{' braces in message ");
            }
            throw new IllegalArgumentException(concat24);
        }
        this.u(size, 2, i, 0, n);
        return i;
    }
    
    private final void u(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.b.get(n).d = this.b.size();
        this.v(n2, n3, n4, n5);
    }
    
    private final void v(final int n, final int n2, final int n3, final int n4) {
        this.b.add(new ck(n, n2, n3, n4));
    }
    
    public final double a(final ck ck) {
        final int e = ck.e;
        if (e == 13) {
            return ck.c;
        }
        if (e == 14) {
            return this.c.get(ck.c);
        }
        return -1.23456789E8;
    }
    
    public final int b() {
        return this.b.size();
    }
    
    public final int c(final int n) {
        final int d = this.b.get(n).d;
        if (d < n) {
            return n;
        }
        return d;
    }
    
    public final Object clone() {
        return this.e();
    }
    
    public final ck d(final int n) {
        return this.b.get(n);
    }
    
    public final cl e() {
        try {
            final cl cl = (cl)super.clone();
            cl.b = (ArrayList)this.b.clone();
            final ArrayList c = this.c;
            if (c != null) {
                cl.c = (ArrayList)c.clone();
            }
            cl.g = false;
            return cl;
        }
        catch (final CloneNotSupportedException ex) {
            throw new cm(ex);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final cl cl = (cl)o;
        final int f = this.f;
        final int f2 = cl.f;
        if (f != 0) {
            if (f == f2) {
                final String a = this.a;
                if (a == null) {
                    if (cl.a != null) {
                        return false;
                    }
                }
                else if (!a.equals(cl.a)) {
                    return false;
                }
                if (this.b.equals(cl.b)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }
    
    public final String f(final ck ck) {
        final int a = ck.a;
        return this.a.substring(a, ck.b + a);
    }
    
    public final boolean g(final ck ck, final String s) {
        return this.a.regionMatches(ck.a, s, 0, ck.b);
    }
    
    public final int h(final int n) {
        return this.b.get(n).e;
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f;
        if (f != 0) {
            final String a = this.a;
            int hashCode;
            if (a != null) {
                hashCode = a.hashCode();
            }
            else {
                hashCode = 0;
            }
            return (f * 37 + hashCode) * 37 + this.b.hashCode();
        }
        throw null;
    }
    
    public final void i(final String a) {
        this.a = a;
        this.d = false;
        this.b.clear();
        final ArrayList c = this.c;
        if (c != null) {
            c.clear();
        }
        this.t(0, 0, 0, 1);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
