import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ojo extends ojj implements RandomAccess, ola, omq
{
    public static final ojo b;
    private boolean[] c;
    private int d;
    
    static {
        (b = new ojo(new boolean[0], 0)).b();
    }
    
    public ojo() {
        this(new boolean[10], 0);
    }
    
    private ojo(final boolean[] c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    private final String g(final int n) {
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(n);
        sb.append(", Size:");
        sb.append(d);
        return sb.toString();
    }
    
    private final void h(final int n) {
        if (n >= 0 && n < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.g(n));
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        this.bT();
        olk.h(collection);
        if (!(collection instanceof ojo)) {
            return super.addAll(collection);
        }
        final ojo ojo = (ojo)collection;
        final int d = ojo.d;
        if (d == 0) {
            return false;
        }
        final int d2 = this.d;
        if (Integer.MAX_VALUE - d2 >= d) {
            final int d3 = d2 + d;
            final boolean[] c = this.c;
            if (d3 > c.length) {
                this.c = Arrays.copyOf(c, d3);
            }
            System.arraycopy(ojo.c, 0, this.c, this.d, ojo.d);
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
    public final ola d(final int n) {
        if (n >= this.d) {
            return new ojo(Arrays.copyOf(this.c, n), this.d);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ojo)) {
            return super.equals(o);
        }
        final ojo ojo = (ojo)o;
        if (this.d != ojo.d) {
            return false;
        }
        final boolean[] c = ojo.c;
        for (int i = 0; i < this.d; ++i) {
            if (this.c[i] != c[i]) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final void f(final boolean b) {
        this.bT();
        final int d = this.d;
        final boolean[] c = this.c;
        if (d == c.length) {
            final boolean[] c2 = new boolean[d * 3 / 2 + 1];
            System.arraycopy(c, 0, c2, 0, d);
            this.c = c2;
        }
        this.c[this.d++] = b;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.d; ++i) {
            n = n * 31 + olk.a(this.c[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Boolean)) {
            return -1;
        }
        final boolean booleanValue = (boolean)o;
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.bT();
        if (n2 >= n) {
            final boolean[] c = this.c;
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
