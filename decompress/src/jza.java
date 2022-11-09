import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.net.Uri;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jza extends jyt
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Uri f;
    public final Uri g;
    public final jzb h;
    public final long i;
    public final Uri j;
    public final jzc k;
    public final Uri l;
    private final byte[] m;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(18);
    }
    
    public jza(final String a, final int b, final boolean c, final String d, final int e, final Uri f, final Uri g, final jzb h, final long i, final Uri j, final jzc k, byte[] m, final Uri l) {
        final boolean empty = a.isEmpty();
        final boolean b2 = true;
        final boolean b3 = true;
        njo.d(empty ^ true);
        njo.d(b != 0);
        if (f != null && d == null) {
            njo.d(e == 3);
            j.getClass();
            k.getClass();
            if (l == null) {
                g.getClass();
            }
            else {
                njo.d(g == null && b3);
            }
        }
        else if (f == null && d != null) {
            njo.d(d.isEmpty() ^ true);
            boolean b4 = false;
            switch (e) {
                default: {
                    b4 = false;
                    break;
                }
                case 0:
                case 1:
                case 2:
                case 3: {
                    b4 = b2;
                    break;
                }
            }
            njo.d(b4);
        }
        else {
            if (f == null) {
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
        this.i = i;
        this.k = k;
        if (m == null) {
            m = new byte[0];
        }
        this.m = m;
        this.l = l;
    }
    
    public static jyz a() {
        return new jyz();
    }
    
    public final byte[] b() {
        final byte[] m = this.m;
        return Arrays.copyOf(m, m.length);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jza)) {
            return false;
        }
        final jza jza = (jza)o;
        return nqb.E(this.a, jza.a) && nqb.E(this.b, jza.b) && nqb.E(this.c, jza.c) && nqb.E(this.d, jza.d) && this.e == jza.e && nqb.E(this.f, jza.f) && nqb.E(this.g, jza.g) && nqb.E(this.j, jza.j) && nqb.E(this.h, jza.h) && this.i == jza.i && nqb.E(this.k, jza.k) && Arrays.equals(this.m, jza.m) && nqb.E(this.l, jza.l);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.h, this.i, this.k, Arrays.hashCode(this.m), this.l });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.j(parcel, 3, this.c);
        jwn.v(parcel, 4, this.d);
        jwn.n(parcel, 5, this.e);
        jwn.u(parcel, 6, (Parcelable)this.f, n);
        jwn.u(parcel, 7, (Parcelable)this.g, n);
        jwn.u(parcel, 9, (Parcelable)this.h, n);
        jwn.o(parcel, 10, this.i);
        jwn.u(parcel, 11, (Parcelable)this.j, n);
        jwn.u(parcel, 12, (Parcelable)this.k, n);
        jwn.q(parcel, 13, this.b());
        jwn.u(parcel, 14, (Parcelable)this.l, n);
        jwn.i(parcel, g);
    }
}
