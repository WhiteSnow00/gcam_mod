import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okz extends ojj implements RandomAccess, olf, omq
{
    public static final okz b;
    private int[] c;
    private int d;
    
    static {
        (b = new okz(new int[0], 0)).b();
    }
    
    public okz() {
        this(new int[10], 0);
    }
    
    private okz(final int[] c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    private final String h(final int n) {
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(n);
        sb.append(", Size:");
        sb.append(d);
        return sb.toString();
    }
    
    private final void i(final int n) {
        if (n >= 0 && n < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.h(n));
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.bT();
        olk.h(collection);
        if (!(collection instanceof okz)) {
            return super.addAll(collection);
        }
        final okz okz = (okz)collection;
        final int d = okz.d;
        if (d == 0) {
            return false;
        }
        final int d2 = this.d;
        if (Integer.MAX_VALUE - d2 >= d) {
            final int d3 = d2 + d;
            final int[] c = this.c;
            if (d3 > c.length) {
                this.c = Arrays.copyOf(c, d3);
            }
            System.arraycopy(okz.c, 0, this.c, this.d, okz.d);
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
    
    @Override
    public final int d(final int n) {
        this.i(n);
        return this.c[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof okz)) {
            return super.equals(o);
        }
        final okz okz = (okz)o;
        if (this.d != okz.d) {
            return false;
        }
        final int[] c = okz.c;
        for (int i = 0; i < this.d; ++i) {
            if (this.c[i] != c[i]) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final olf f(final int n) {
        if (n >= this.d) {
            return new okz(Arrays.copyOf(this.c, n), this.d);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final void g(final int n) {
        this.bT();
        final int d = this.d;
        final int[] c = this.c;
        if (d == c.length) {
            final int[] c2 = new int[d * 3 / 2 + 1];
            System.arraycopy(c, 0, c2, 0, d);
            this.c = c2;
        }
        this.c[this.d++] = n;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.d; ++i) {
            n = n * 31 + this.c[i];
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Integer)) {
            return -1;
        }
        final int intValue = (int)o;
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.bT();
        if (n2 >= n) {
            final int[] c = this.c;
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
