import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class nsx
{
    public final String a;
    public final boolean b;
    public final long c;
    private final Class d;
    
    protected nsx(String a, final Class d, final boolean b) {
        if (a.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        int i = 0;
        if (!oce.i(a.charAt(0))) {
            if (a.length() != 0) {
                a = "identifier must start with an ASCII letter: ".concat(a);
            }
            else {
                a = new String("identifier must start with an ASCII letter: ");
            }
            throw new IllegalArgumentException(a);
        }
        for (int j = 1; j < a.length(); ++j) {
            final char char1 = a.charAt(j);
            if (!oce.i(char1) && (char1 < '0' || char1 > '9') && char1 != '_') {
                if (a.length() != 0) {
                    a = "identifier must contain only ASCII letters, digits or underscore: ".concat(a);
                }
                else {
                    a = new String("identifier must contain only ASCII letters, digits or underscore: ");
                }
                throw new IllegalArgumentException(a);
            }
        }
        this.a = a;
        this.d = d;
        this.b = b;
        int identityHashCode = System.identityHashCode(this);
        long c = 0L;
        while (i < 5) {
            c |= 1L << (identityHashCode & 0x3F);
            identityHashCode >>>= 6;
            ++i;
        }
        this.c = c;
    }
    
    public static nsx c(final String s, final Class clazz) {
        return new nsx(s, clazz, false);
    }
    
    public void a(final Iterator iterator, final nsw nsw) {
        if (this.b) {
            while (iterator.hasNext()) {
                this.b(iterator.next(), nsw);
            }
            return;
        }
        throw new IllegalStateException("non repeating key");
    }
    
    public void b(final Object o, final nsw nsw) {
        nsw.a(this.a, o);
    }
    
    public final Object d(final Object o) {
        return this.d.cast(o);
    }
    
    @Override
    public final String toString() {
        final String name = this.getClass().getName();
        final String a = this.a;
        final String name2 = this.d.getName();
        final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 3 + a.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append("/");
        sb.append(a);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }
}
