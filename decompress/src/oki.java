import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

final class oki extends ojj implements RandomAccess, olj, omq
{
    private static final oki b;
    private double[] c;
    private int d;
    
    static {
        (b = new oki(new double[0], 0)).b();
    }
    
    public oki() {
        this(new double[10], 0);
    }
    
    private oki(final double[] c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    private final String f(final int n) {
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(n);
        sb.append(", Size:");
        sb.append(d);
        return sb.toString();
    }
    
    private final void g(final int n) {
        if (n >= 0 && n < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.f(n));
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.bT();
        olk.h(collection);
        if (!(collection instanceof oki)) {
            return super.addAll(collection);
        }
        final oki oki = (oki)collection;
        final int d = oki.d;
        if (d == 0) {
            return false;
        }
        final int d2 = this.d;
        if (Integer.MAX_VALUE - d2 >= d) {
            final int d3 = d2 + d;
            final double[] c = this.c;
            if (d3 > c.length) {
                this.c = Arrays.copyOf(c, d3);
            }
            System.arraycopy(oki.c, 0, this.c, this.d, oki.d);
            this.d = d3;
            ++this.modCount;
            return true;
        }
        throw new OutOfMemoryError();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final void d(final double n) {
        this.bT();
        final int d = this.d;
        final double[] c = this.c;
        if (d == c.length) {
            final double[] c2 = new double[d * 3 / 2 + 1];
            System.arraycopy(c, 0, c2, 0, d);
            this.c = c2;
        }
        this.c[this.d++] = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof oki)) {
            return super.equals(o);
        }
        final oki oki = (oki)o;
        if (this.d != oki.d) {
            return false;
        }
        final double[] c = oki.c;
        for (int i = 0; i < this.d; ++i) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(c[i])) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.d; ++i) {
            n = n * 31 + olk.c(Double.doubleToLongBits(this.c[i]));
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Double)) {
            return -1;
        }
        final double doubleValue = (double)o;
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.bT();
        if (n2 >= n) {
            final double[] c = this.c;
            System.arraycopy(c, n2, c, n, this.d - n2);
            this.d -= n2 - n;
            ++this.modCount;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }
    
    @Override
    public final int size() {
        return this.d;
    }
}
