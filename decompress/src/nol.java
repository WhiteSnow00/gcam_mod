import java.util.Arrays;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nol extends nnt
{
    private transient Object[] c;
    private transient Object[] d;
    private final Comparator e;
    
    public nol(final Comparator e) {
        e.getClass();
        this.e = e;
        this.c = new Object[4];
        this.d = new Object[4];
    }
    
    public final non a() {
        final int b = this.b;
        int i = 0;
        switch (b) {
            default: {
                final Object[] copy = Arrays.copyOf(this.c, b);
                Arrays.sort(copy, this.e);
                final Object[] array = new Object[this.b];
                while (i < this.b) {
                    if (i > 0) {
                        final int n = i - 1;
                        if (this.e.compare(copy[n], copy[i]) == 0) {
                            final String value = String.valueOf(copy[n]);
                            final String value2 = String.valueOf(copy[i]);
                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length());
                            sb.append("keys required to be distinct but compared as equal: ");
                            sb.append(value);
                            sb.append(" and ");
                            sb.append(value2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    array[Arrays.binarySearch(copy, this.c[i], this.e)] = this.d[i];
                    ++i;
                }
                return new non(new nqs(nns.g(copy), this.e), nns.g(array));
            }
            case 1: {
                return new non(new nqs(nns.m(this.c[0]), this.e), nns.m(this.d[0]));
            }
            case 0: {
                return non.f(this.e);
            }
        }
    }
    
    public final void c(final Object o, final Object o2) {
        final int n = this.b + 1;
        final int length = this.c.length;
        if (n > length) {
            final int a = nni.a(length, n);
            this.c = Arrays.copyOf(this.c, a);
            this.d = Arrays.copyOf(this.d, a);
        }
        nqb.A(o, o2);
        final Object[] c = this.c;
        final int b = this.b;
        c[b] = o;
        this.d[b] = o2;
        this.b = b + 1;
    }
}
