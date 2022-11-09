import java.util.logging.Level;
import android.util.Log;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nva extends num
{
    private static final Set a;
    private static final ntw b;
    private final String c;
    private final boolean d;
    
    static {
        b = ntz.a(a = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(nsh.a, ntf.a))));
    }
    
    public nva(final String s, final String s2, final boolean b, final boolean d) {
        super(s2);
        this.c = nvb.d(s, s2, b);
        this.d = d;
    }
    
    public static void e(final ntk ntk, final String s, final boolean b) {
        final nto a = nto.a;
        final ntp j = ntk.j();
        final int b2 = j.b();
        nug c;
        if (b2 == 0) {
            c = nug.c;
        }
        else if (b2 <= 28) {
            c = new nue(a, j);
        }
        else {
            c = new nuf(a, j);
        }
        final boolean b3 = b ^ true;
        String s2;
        if (!b3 && !nuk.b(ntk, c, nva.a)) {
            s2 = nuk.a(ntk);
        }
        else {
            final StringBuilder sb = new StringBuilder();
            if (b3 && ntk.k() != null) {
                sb.append("(REDACTED) ");
                sb.append(ntk.k().b);
            }
            else {
                if (ntk.k() != null) {
                    final nvs nvs = new nvs(ntk.k(), ntk.C(), sb);
                    final String c2 = nvs.c();
                    int i = nvv.b(c2, 0);
                    int n = 0;
                    int n2 = -1;
                Label_0197:
                    while (i >= 0) {
                        int k;
                        final int n3 = k = i + 1;
                        int n4 = 0;
                        while (k < c2.length()) {
                            final int n5 = k + 1;
                            final char char1 = c2.charAt(k);
                            final char c3 = (char)(char1 - '0');
                            if (c3 >= '\n') {
                                int n9;
                                int n10;
                                int n11;
                                int l;
                                if (char1 == '$') {
                                    if (n5 - 1 - n3 == 0) {
                                        throw nvu.b("missing index", c2, i, n5);
                                    }
                                    if (c2.charAt(n3) == '0') {
                                        throw nvu.b("index has leading zero", c2, i, n5);
                                    }
                                    if (n5 == c2.length()) {
                                        throw nvu.c("unterminated parameter", c2, i);
                                    }
                                    c2.charAt(n5);
                                    final int n6 = n4 - 1;
                                    final int n7 = n5;
                                    final int n8 = n5 + 1;
                                    n9 = n;
                                    n10 = n6;
                                    n11 = n7;
                                    l = n8;
                                }
                                else if (char1 == '<') {
                                    if (n2 == -1) {
                                        throw nvu.b("invalid relative parameter", c2, i, n5);
                                    }
                                    if (n5 == c2.length()) {
                                        throw nvu.c("unterminated parameter", c2, i);
                                    }
                                    c2.charAt(n5);
                                    final int n12 = n5;
                                    final int n13 = n5 + 1;
                                    n9 = n;
                                    n10 = n2;
                                    n11 = n12;
                                    l = n13;
                                }
                                else {
                                    final int n14 = n;
                                    final int n15 = n + 1;
                                    l = n5;
                                    n11 = n3;
                                    n10 = n14;
                                    n9 = n15;
                                }
                                --l;
                                while (l < c2.length()) {
                                    if ((char)((c2.charAt(l) & 0xFFFFFFDF) - 65) < '\u001a') {
                                        final int n16 = l + 1;
                                        final char char2 = c2.charAt(l);
                                        final int n17 = char2 & ' ';
                                        final nth b4 = nth.b(c2, n11, l, n17 == 0);
                                        final ntg ntg = ntg.k[ntg.a(char2)];
                                        ntg ntg2 = null;
                                        Label_0644: {
                                            if (n17 != 0) {
                                                ntg2 = ntg;
                                            }
                                            else {
                                                if (ntg != null) {
                                                    ntg2 = ntg;
                                                    if ((ntg.n & 0x80) != 0x0) {
                                                        break Label_0644;
                                                    }
                                                }
                                                ntg2 = null;
                                            }
                                        }
                                        nvn b5;
                                        int e;
                                        if (ntg2 != null) {
                                            if (!b4.e(ntg2.n, ntg2.m.f)) {
                                                throw nvu.b("invalid format specifier", c2, i, n16);
                                            }
                                            b5 = nvp.b(n10, ntg2, b4);
                                            e = n16;
                                        }
                                        else if (char2 != 't' && char2 != 'T') {
                                            if (char2 != 'h' && char2 != 'H') {
                                                throw nvu.b("invalid format specification", c2, i, n16);
                                            }
                                            if (!b4.e(160, false)) {
                                                throw nvu.b("invalid format specification", c2, i, n16);
                                            }
                                            b5 = new nvq(b4, n10);
                                            e = n16;
                                        }
                                        else {
                                            if (!b4.e(160, false)) {
                                                throw nvu.b("invalid format specification", c2, i, n16);
                                            }
                                            e = n16 + 1;
                                            if (e > c2.length()) {
                                                throw nvu.a("truncated format specifier", c2, i);
                                            }
                                            final nvl nvl = nvl.F.get(c2.charAt(n16));
                                            if (nvl == null) {
                                                throw nvu.a("illegal date/time conversion", c2, n16);
                                            }
                                            b5 = new nvm(b4, n10, nvl);
                                        }
                                        final int a2 = b5.a;
                                        if (a2 < 32) {
                                            nvs.a |= 1 << a2;
                                        }
                                        nvs.b = Math.max(nvs.b, a2);
                                        nvs.b().a(nvs.d, nvs.c(), nvs.e, i);
                                        final Object[] c4 = nvs.c;
                                        final int a3 = b5.a;
                                        if (a3 < c4.length) {
                                            final Object o = c4[a3];
                                            if (o != null) {
                                                b5.a(nvs, o);
                                            }
                                            else {
                                                nvs.d.append("null");
                                            }
                                        }
                                        else {
                                            nvs.d.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        nvs.e = e;
                                        i = nvv.b(c2, e);
                                        n = n9;
                                        n2 = n10;
                                        continue Label_0197;
                                    }
                                    ++l;
                                }
                                throw nvu.c("unterminated parameter", c2, i);
                            }
                            n4 = n4 * 10 + c3;
                            if (n4 >= 1000000) {
                                throw nvu.b("index too large", c2, i, n5);
                            }
                            k = n5;
                        }
                        throw nvu.c("unterminated parameter", c2, i);
                    }
                    final int a4 = nvs.a;
                    if ((a4 + 1 & a4) != 0x0 || (nvs.b > 31 && a4 != -1)) {
                        throw new nvu(String.format("unreferenced arguments [first missing index=%d]", Integer.numberOfTrailingZeros(-1 ^ a4)));
                    }
                    nvs.b().a(nvs.d, nvs.c(), nvs.e, nvs.c().length());
                    final StringBuilder d = nvs.d;
                    if (ntk.C().length > nvs.b + 1) {
                        d.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    }
                }
                else {
                    sb.append(ntn.b(ntk.l()));
                }
                nuk.c(c, nva.b, sb);
            }
            s2 = sb.toString();
        }
        final Throwable t = (Throwable)ntk.j().d(nsh.a);
        switch (nvb.e(ntk.m())) {
            default: {
                Log.e(s, s2, t);
                return;
            }
            case 5: {
                Log.w(s, s2, t);
            }
            case 2:
            case 3:
            case 4: {}
        }
    }
    
    @Override
    public final void c(final ntk ntk) {
        e(ntk, this.c, this.d);
    }
    
    @Override
    public final boolean d(final Level level) {
        final int e = nvb.e(level);
        return Log.isLoggable(this.c, e) || Log.isLoggable("all", e);
    }
}
