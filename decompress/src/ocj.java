import java.util.Collections;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ocj extends AbstractList implements RandomAccess, Serializable
{
    private static final long serialVersionUID = 0L;
    final int[] a;
    final int b;
    final int c;
    
    public ocj(final int[] a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return o instanceof Integer && ofi.z(this.a, (int)o, this.b, this.c) != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ocj)) {
            return super.equals(o);
        }
        final ocj ocj = (ocj)o;
        final int size = this.size();
        if (ocj.size() == size) {
            for (int i = 0; i < size; ++i) {
                if (this.a[this.b + i] != ocj.a[ocj.b + i]) {
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
            n = n * 31 + this.a[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (o instanceof Integer) {
            final int z = ofi.z(this.a, (int)o, this.b, this.c);
            if (z >= 0) {
                return z - this.b;
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
        if (o instanceof Integer) {
            final int[] a = this.a;
            final int intValue = (int)o;
            final int b = this.b;
            int i = this.c - 1;
            while (true) {
                while (i >= b) {
                    final int n = i;
                    if (a[i] != intValue) {
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
        final int[] a = this.a;
        final int b = this.b;
        return new ocj(a, n + b, b + n2);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.size() * 5);
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
