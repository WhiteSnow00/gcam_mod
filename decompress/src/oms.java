import java.util.Arrays;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oms extends ojj implements RandomAccess
{
    public static final oms b;
    private Object[] c;
    private int d;
    
    static {
        (b = new oms(new Object[0], 0)).b();
    }
    
    public oms() {
        this(new Object[10], 0);
    }
    
    private oms(final Object[] c, final int d) {
        this.c = c;
        this.d = d;
    }
    
    private final String d(final int n) {
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(n);
        sb.append(", Size:");
        sb.append(d);
        return sb.toString();
    }
    
    private final void f(final int n) {
        if (n >= 0 && n < this.d) {
            return;
        }
        throw new IndexOutOfBoundsException(this.d(n));
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.bT();
        if (n >= 0) {
            final int d = this.d;
            if (n <= d) {
                final Object[] c = this.c;
                if (d < c.length) {
                    System.arraycopy(c, n, c, n + 1, d - n);
                }
                else {
                    final Object[] c2 = new Object[d * 3 / 2 + 1];
                    System.arraycopy(c, 0, c2, 0, n);
                    System.arraycopy(this.c, n, c2, n + 1, this.d - n);
                    this.c = c2;
                }
                this.c[n] = o;
                ++this.d;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.d(n));
    }
    
    @Override
    public final boolean add(final Object o) {
        this.bT();
        final int d = this.d;
        final Object[] c = this.c;
        if (d == c.length) {
            this.c = Arrays.copyOf(c, d * 3 / 2 + 1);
        }
        this.c[this.d++] = o;
        ++this.modCount;
        return true;
    }
    
    @Override
    public final Object get(final int n) {
        this.f(n);
        return this.c[n];
    }
    
    @Override
    public final Object remove(final int n) {
        this.bT();
        this.f(n);
        final Object[] c = this.c;
        final Object o = c[n];
        final int d = this.d;
        if (n < d - 1) {
            System.arraycopy(c, n + 1, c, n, d - n - 1);
        }
        --this.d;
        ++this.modCount;
        return o;
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        this.bT();
        this.f(n);
        final Object[] c = this.c;
        final Object o2 = c[n];
        c[n] = o;
        ++this.modCount;
        return o2;
    }
    
    @Override
    public final int size() {
        return this.d;
    }
}
