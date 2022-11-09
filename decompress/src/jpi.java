import android.os.Parcelable;
import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpi extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final jpq a;
    public byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final kcl[] g;
    public final boolean h;
    public ouf i;
    public final jpa j;
    public final jpa k;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(13);
    }
    
    public jpi(final jpq a, final ouf i, final jpa j, final String[] d, final boolean b) {
        this.a = a;
        this.i = i;
        this.j = j;
        this.k = null;
        this.c = null;
        this.d = d;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = true;
    }
    
    public jpi(final jpq a, final byte[] b, final int[] c, final String[] d, final int[] e, final byte[][] f, final boolean h, final kcl[] g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = null;
        this.j = null;
        this.k = null;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof jpi) {
            final jpi jpi = (jpi)o;
            if (jvu.m(this.a, jpi.a) && Arrays.equals(this.b, jpi.b) && Arrays.equals(this.c, jpi.c) && Arrays.equals(this.d, jpi.d) && jvu.m(this.i, jpi.i) && jvu.m(this.j, jpi.j)) {
                final jpa k = jpi.k;
                if (jvu.m(null, null) && Arrays.equals(this.e, jpi.e) && Arrays.deepEquals(this.f, jpi.f) && Arrays.equals(this.g, jpi.g) && this.h == jpi.h) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.i, this.j, null, this.e, this.f, this.g, this.h });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        final byte[] b = this.b;
        String s;
        if (b == null) {
            s = null;
        }
        else {
            s = new String(b);
        }
        sb.append(s);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.i);
        sb.append(", ExtensionProducer: ");
        sb.append(this.j);
        sb.append(", VeProducer: ");
        sb.append((Object)null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 2, (Parcelable)this.a, n);
        jwn.q(parcel, 3, this.b);
        jwn.t(parcel, 4, this.c);
        jwn.w(parcel, 5, this.d);
        jwn.t(parcel, 6, this.e);
        jwn.r(parcel, 7, this.f);
        jwn.j(parcel, 8, this.h);
        jwn.y(parcel, 9, (Parcelable[])this.g, n);
        jwn.i(parcel, g);
    }
}
