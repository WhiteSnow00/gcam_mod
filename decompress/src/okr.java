import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okr extends ojj implements RandomAccess, ole, omq
{
    public static final okr b;
    private float[] c;
    private int d;
    
    static {
        (b = new okr(new float[0], 0)).b();
    }
    
    public okr() {
        this(new float[10], 0);
    }
    
    private okr(final float[] c, final int d) {
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
        if (!(collection instanceof okr)) {
            return super.addAll(collection);
        }
        final okr okr = (okr)collection;
        final int d = okr.d;
        if (d == 0) {
            return false;
        }
        final int d2 = this.d;
        if (Integer.MAX_VALUE - d2 >= d) {
            final int d3 = d2 + d;
            final float[] c = this.c;
            if (d3 > c.length) {
                this.c = Arrays.copyOf(c, d3);
            }
            System.arraycopy(okr.c, 0, this.c, this.d, okr.d);
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
    public final float d(final int n) {
        this.i(n);
        return this.c[n];
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof okr)) {
            return super.equals(o);
        }
        final okr okr = (okr)o;
        if (this.d != okr.d) {
            return false;
        }
        final float[] c = okr.c;
        for (int i = 0; i < this.d; ++i) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(c[i])) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final ole f(final int n) {
        if (n >= this.d) {
            return new okr(Arrays.copyOf(this.c, n), this.d);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public final void g(final float n) {
        this.bT();
        final int d = this.d;
        final float[] c = this.c;
        if (d == c.length) {
            final float[] c2 = new float[d * 3 / 2 + 1];
            System.arraycopy(c, 0, c2, 0, d);
            this.c = c2;
        }
        this.c[this.d++] = n;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.d; ++i) {
            n = n * 31 + Float.floatToIntBits(this.c[i]);
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof Float)) {
            return -1;
        }
        final float floatValue = (float)o;
        for (int d = this.d, i = 0; i < d; ++i) {
            if (this.c[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.bT();
        if (n2 >= n) {
            final float[] c = this.c;
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
