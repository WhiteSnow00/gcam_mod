import java.util.Collections;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

final class ocg extends AbstractList implements RandomAccess, Serializable
{
    private static final long serialVersionUID = 0L;
    final float[] a;
    final int b;
    final int c;
    
    public ocg(final float[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return o instanceof Float && och.e(this.a, (float)o, this.b, this.c) != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ocg)) {
            return super.equals(o);
        }
        final ocg ocg = (ocg)o;
        final int size = this.size();
        if (ocg.size() == size) {
            for (int i = 0; i < size; ++i) {
                if (this.a[this.b + i] != ocg.a[ocg.b + i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int i = this.b;
        int n = 1;
        while (i < this.c) {
            n = n * 31 + Float.valueOf(this.a[i]).hashCode();
            ++i;
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (o instanceof Float) {
            final int e = och.e(this.a, (float)o, this.b, this.c);
            if (e >= 0) {
                return e - this.b;
            }
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return false;
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        if (o instanceof Float) {
            final float[] a = this.a;
            final float floatValue = (float)o;
            final int b = this.b;
            int i = this.c - 1;
            while (true) {
                while (i >= b) {
                    final int n = i;
                    if (a[i] != floatValue) {
                        --i;
                    }
                    else {
                        if (n >= 0) {
                            return n - this.b;
                        }
                        return -1;
                    }
                }
                final int n = -1;
                continue;
            }
        }
        return -1;
    }
    
    @Override
    public final int size() {
        return this.c - this.b;
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        njo.n(n, n2, this.size());
        if (n == n2) {
            return Collections.emptyList();
        }
        final float[] a = this.a;
        final int b = this.b;
        return new ocg(a, n + b, b + n2);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.size() * 12);
        sb.append('[');
        sb.append(this.a[this.b]);
        for (int i = this.b + 1; i < this.c; ++i) {
            sb.append(", ");
            sb.append(this.a[i]);
        }
        sb.append(']');
        return sb.toString();
    }
}
