import java.io.ObjectOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class cb extends Number implements Comparable
{
    private static final long serialVersionUID = -4756200506571685661L;
    @Deprecated
    public final double a;
    @Deprecated
    public final int b;
    @Deprecated
    public final int c;
    @Deprecated
    public final long d;
    @Deprecated
    public final long e;
    @Deprecated
    public final long f;
    @Deprecated
    public final boolean g;
    
    @Deprecated
    public cb(final double n, final int b) {
        int n2;
        if (b == 0) {
            n2 = 0;
        }
        else {
            double n3;
            if (n < 0.0) {
                n3 = -n;
            }
            else {
                n3 = n;
            }
            final int n4 = (int)Math.pow(10.0, b);
            final double n5 = n4;
            Double.isNaN(n5);
            n2 = (int)(Math.round(n3 * n5) % n4);
        }
        final long d = n2;
        final boolean g = n < 0.0;
        this.g = g;
        double a;
        if (g) {
            a = -n;
        }
        else {
            a = n;
        }
        this.a = a;
        this.b = b;
        this.d = d;
        long f;
        if (n > 1.0E18) {
            f = 1000000000000000000L;
        }
        else {
            f = (long)n;
        }
        this.f = f;
        if (d == 0L) {
            this.e = 0L;
            this.c = 0;
        }
        else {
            int c;
            long e;
            for (c = b, e = d; e % 10L == 0L; e /= 10L, --c) {}
            this.e = e;
            this.c = c;
        }
        Math.pow(10.0, b);
    }
    
    @Deprecated
    public cb(String trim) {
        final double double1 = Double.parseDouble(trim);
        trim = trim.trim();
        final int n = trim.indexOf(46) + 1;
        int n2;
        if (n == 0) {
            n2 = 0;
        }
        else {
            n2 = trim.length() - n;
        }
        this(double1, n2);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }
    
    @Deprecated
    @Override
    public final double doubleValue() {
        double a;
        if (this.g) {
            a = -this.a;
        }
        else {
            a = this.a;
        }
        return a;
    }
    
    @Deprecated
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof cb)) {
            return false;
        }
        final cb cb = (cb)o;
        return this.a == cb.a && this.b == cb.b && this.d == cb.d;
    }
    
    @Deprecated
    @Override
    public final float floatValue() {
        return (float)this.a;
    }
    
    @Deprecated
    @Override
    public final int hashCode() {
        return (int)(this.d + (this.b + (int)(this.a * 37.0)) * 37);
    }
    
    @Deprecated
    @Override
    public final int intValue() {
        return (int)this.f;
    }
    
    @Deprecated
    @Override
    public final long longValue() {
        return this.f;
    }
    
    @Deprecated
    @Override
    public final String toString() {
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(14);
        sb.append("%.");
        sb.append(b);
        sb.append("f");
        return String.format(sb.toString(), this.a);
    }
}
