import android.os.Parcel;
import java.util.Arrays;
import android.util.Base64;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcn extends jwc implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(11);
    }
    
    public kcn(final String a, final long b, final boolean c, final double d, final String e, final byte[] f, final int g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    private static int g(int n, final int n2) {
        if (n < n2) {
            n = -1;
        }
        else {
            if (n == n2) {
                return 0;
            }
            n = 1;
        }
        return n;
    }
    
    public final double a() {
        if (this.g == 3) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a double type");
    }
    
    public final long b() {
        if (this.g == 1) {
            return this.b;
        }
        throw new IllegalArgumentException("Not a long type");
    }
    
    public final String c() {
        if (this.g == 4) {
            final String e = this.e;
            jvu.a(e);
            return e;
        }
        throw new IllegalArgumentException("Not a String type");
    }
    
    public final String d(StringBuilder sb) {
        sb.append("Flag(");
        sb.append(this.a);
        sb.append(", ");
        final int g = this.g;
        switch (g) {
            default: {
                final String a = this.a;
                sb = new StringBuilder(String.valueOf(a).length() + 27);
                sb.append("Invalid type: ");
                sb.append(a);
                sb.append(", ");
                sb.append(g);
                throw new AssertionError((Object)sb.toString());
            }
            case 5: {
                sb.append("'");
                sb.append(Base64.encodeToString((byte[])jvu.a(this.f), 3));
                sb.append("'");
                break;
            }
            case 4: {
                sb.append("'");
                final String e = this.e;
                jvu.a(e);
                sb.append(e);
                sb.append("'");
                break;
            }
            case 3: {
                sb.append(this.d);
                break;
            }
            case 2: {
                sb.append(this.c);
                break;
            }
            case 1: {
                sb.append(this.b);
                break;
            }
        }
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
    
    public final boolean e() {
        if (this.g == 2) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kcn) {
            final kcn kcn = (kcn)o;
            if (lwt.o(this.a, kcn.a)) {
                final int g = this.g;
                if (g == kcn.g) {
                    if (this.h == kcn.h) {
                        switch (g) {
                            default: {
                                final StringBuilder sb = new StringBuilder(31);
                                sb.append("Invalid enum value: ");
                                sb.append(g);
                                throw new AssertionError((Object)sb.toString());
                            }
                            case 5: {
                                return Arrays.equals(this.f, kcn.f);
                            }
                            case 4: {
                                return lwt.o(this.e, kcn.e);
                            }
                            case 3: {
                                return this.d == kcn.d;
                            }
                            case 2: {
                                return this.c == kcn.c;
                            }
                            case 1: {
                                return this.b == kcn.b;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public final byte[] f() {
        if (this.g == 5) {
            return (byte[])jvu.a(this.f);
        }
        throw new IllegalArgumentException("Not a bytes type");
    }
    
    @Override
    public final String toString() {
        return this.d(new StringBuilder());
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        if (!kbr.b(this.a)) {
            jwn.v(parcel, 2, this.a);
        }
        final long b = this.b;
        if (b != 0L) {
            jwn.o(parcel, 3, b);
        }
        if (this.c) {
            jwn.j(parcel, 4, true);
        }
        final double d = this.d;
        if (d != 0.0) {
            jwn.m(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        if (!kbr.b(this.e)) {
            jwn.v(parcel, 6, this.e);
        }
        if (!kbr.b(this.f)) {
            jwn.q(parcel, 7, this.f);
        }
        if (!kbr.a(this.g)) {
            jwn.n(parcel, 8, this.g);
        }
        if (!kbr.a(this.h)) {
            jwn.n(parcel, 9, this.h);
        }
        jwn.i(parcel, g);
    }
}
