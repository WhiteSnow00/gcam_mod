import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krb
{
    public final long a;
    public final long b;
    
    public krb(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public krb(final krb krb) {
        this.a = krb.a;
        this.b = krb.b;
    }
    
    public static String a(final krb[] array) {
        if (array == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        while (true) {
            final int length = array.length;
            if (n >= length) {
                break;
            }
            sb.append(array[n].a);
            sb.append("/");
            sb.append(array[n].b);
            if (n != length - 1) {
                sb.append(",");
            }
            ++n;
        }
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof krb) {
            final krb krb = (krb)o;
            if (this.a == krb.a && this.b == krb.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final long b = this.b;
        final StringBuilder sb = new StringBuilder(41);
        sb.append(a);
        sb.append("/");
        sb.append(b);
        return sb.toString();
    }
}
