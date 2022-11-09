import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oci implements Serializable
{
    private static final oci b;
    public final int a;
    private final int[] c;
    
    static {
        b = new oci(new int[0]);
    }
    
    public oci(final int[] c) {
        final int length = c.length;
        this.c = c;
        this.a = length;
    }
    
    public final int a(final int n) {
        njo.v(n, this.a);
        return this.c[n];
    }
    
    public final boolean b() {
        return this.a == 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof oci)) {
            return false;
        }
        final oci oci = (oci)o;
        if (this.a == oci.a) {
            for (int i = 0; i < this.a; ++i) {
                if (this.a(i) != oci.a(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int n = 1;
        for (int i = 0; i < this.a; ++i) {
            n = n * 31 + this.c[i];
        }
        return n;
    }
    
    Object readResolve() {
        if (this.b()) {
            return oci.b;
        }
        return this;
    }
    
    @Override
    public final String toString() {
        if (this.b()) {
            return "[]";
        }
        final StringBuilder sb = new StringBuilder(this.a * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.a; ++i) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }
    
    Object writeReplace() {
        final int a = this.a;
        final int[] c = this.c;
        if (a < c.length) {
            return new oci(Arrays.copyOfRange(c, 0, a));
        }
        return this;
    }
}
