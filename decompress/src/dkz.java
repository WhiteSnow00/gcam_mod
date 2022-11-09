import j$.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkz
{
    public final float[] a;
    private final dlb b;
    private final long c;
    
    public dkz(final dlb b, final long c, final float[] a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    public static dkz c(final dlb dlb, final long n) {
        return new dkz(dlb, n, new float[0]);
    }
    
    public static dkz d(final dlb dlb, final long n, final float[] array, final int n2, final int n3) {
        final float[] array2 = new float[n3];
        System.arraycopy(array, n2, array2, 0, n3);
        return new dkz(dlb, n, array2);
    }
    
    public final float a() {
        final float[] a = this.a;
        final int length = a.length;
        if (length == 1) {
            return a[0];
        }
        if (length == 0) {
            return Float.NaN;
        }
        throw new IllegalStateException("Attempting to treat multi-dimensional feature as singular!");
    }
    
    public final float b(final int n) {
        return this.a[n];
    }
    
    public final boolean e() {
        return this.a.length == 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dkz)) {
            return false;
        }
        final dkz dkz = (dkz)o;
        return this.c == dkz.c && this.b.equals(dkz.b) && Arrays.equals(this.a, dkz.a);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.b, this.c }) * 31 + Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final long c = this.c;
        final String string = Arrays.toString(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 24);
        sb.append("f(");
        sb.append(c);
        sb.append(")=");
        sb.append(string);
        return sb.toString();
    }
}
