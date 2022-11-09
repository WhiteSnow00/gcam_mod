import java.util.Iterator;
import java.util.Locale;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class cd
{
    @Deprecated
    public final Set a;
    @Deprecated
    public final boolean b;
    @Deprecated
    public final int c;
    
    private cd(final int c, final Set a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    static cd a(String s) {
        final LinkedHashSet set = new LinkedHashSet();
        int n;
        if (s.startsWith("integer")) {
            n = 1;
        }
        else {
            if (!s.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            n = 2;
        }
        s = s.substring(7).trim();
        final String[] split = ci.e.split(s);
        final int length = split.length;
        int i = 0;
        boolean b = true;
        int n2 = 0;
        while (i < length) {
            final String s2 = split[i];
            if (!s2.equals("\u2026")) {
                if (s2.equals("...")) {
                    b = false;
                    n2 = 1;
                }
                else {
                    if (n2 != 0) {
                        s = String.valueOf(s2);
                        if (s.length() != 0) {
                            s = "Can only have \u2026 at the end of samples: ".concat(s);
                        }
                        else {
                            s = new String("Can only have \u2026 at the end of samples: ");
                        }
                        throw new IllegalArgumentException(s);
                    }
                    final String[] split2 = ci.f.split(s2);
                    switch (split2.length) {
                        default: {
                            s = String.valueOf(s2);
                            if (s.length() != 0) {
                                s = "Ill-formed number range: ".concat(s);
                            }
                            else {
                                s = new String("Ill-formed number range: ");
                            }
                            throw new IllegalArgumentException(s);
                        }
                        case 2: {
                            final cb cb = new cb(split2[0]);
                            final cb cb2 = new cb(split2[1]);
                            b(n, cb);
                            b(n, cb2);
                            set.add(new cc(cb, cb2));
                            break;
                        }
                        case 1: {
                            final cb cb3 = new cb(split2[0]);
                            b(n, cb3);
                            set.add(new cc(cb3, cb3));
                            break;
                        }
                    }
                }
            }
            else {
                b = false;
                n2 = 1;
            }
            ++i;
        }
        return new cd(n, Collections.unmodifiableSet((Set<?>)set), b);
    }
    
    private static void b(int n, final cb cb) {
        int n2 = 0;
        if (n != 1) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (cb.b == 0) {
            n2 = 1;
        }
        if (n == n2) {
            return;
        }
        final String value = String.valueOf(cb);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
        sb.append("Ill-formed number range: ");
        sb.append(value);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Deprecated
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@");
        String s = null;
        switch (this.c) {
            default: {
                s = "DECIMAL";
                break;
            }
            case 1: {
                s = "INTEGER";
                break;
            }
        }
        sb.append(s.toLowerCase(Locale.ENGLISH));
        final Iterator iterator = this.a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final cc cc = (cc)iterator.next();
            if (n == 0) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(cc);
            n = 0;
        }
        if (!this.b) {
            sb.append(", \u2026");
        }
        return sb.toString();
    }
}
