import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ntj implements nsw
{
    private static final Set d;
    public final String a;
    public final StringBuilder b;
    public boolean c;
    private final String e;
    
    static {
        d = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    }
    
    public ntj(final StringBuilder b) {
        this.c = false;
        this.e = "[CONTEXT ";
        this.a = " ]";
        this.b = b;
    }
    
    private static int b(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 < ' ' || char1 == '\"' || char1 == '\\') {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    @Override
    public final void a(String string, final Object o) {
        final boolean c = this.c;
        final char c2 = ' ';
        if (c) {
            this.b.append(' ');
        }
        else {
            if (this.b.length() > 0) {
                final StringBuilder b = this.b;
                char c3;
                if (b.length() <= 1000) {
                    if (this.b.indexOf("\n") != -1) {
                        c3 = '\n';
                    }
                    else {
                        c3 = c2;
                    }
                }
                else {
                    c3 = '\n';
                }
                b.append(c3);
            }
            this.b.append(this.e);
            this.c = true;
        }
        final StringBuilder b2 = this.b;
        b2.append(string);
        b2.append('=');
        if (o == null) {
            b2.append(true);
            return;
        }
        if (ntj.d.contains(o.getClass())) {
            b2.append(o);
            return;
        }
        b2.append('\"');
        string = o.toString();
        int n = 0;
    Label_0325_Outer:
        while (true) {
            final int b3 = b(string, n);
            if (b3 == -1) {
                break;
            }
            b2.append(string, n, b3);
            n = b3 + 1;
            while (true) {
                char char1;
                switch (char1 = string.charAt(b3)) {
                    default: {
                        b2.append('\ufffd');
                        continue Label_0325_Outer;
                    }
                    case '\"':
                    case '\\': {
                        b2.append("\\");
                        b2.append(char1);
                        continue Label_0325_Outer;
                    }
                    case '\r': {
                        char1 = 'r';
                        continue;
                    }
                    case '\n': {
                        char1 = 'n';
                        continue;
                    }
                    case '\t': {
                        char1 = 't';
                        continue;
                    }
                }
                break;
            }
        }
        b2.append(string, n, string.length());
        b2.append('\"');
    }
}
