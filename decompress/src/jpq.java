import android.os.Parcel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.EnumSet;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpq extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Integer j;
    public final boolean k;
    public final int l;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(14);
    }
    
    public jpq(final String a, final int b, final int c, final String d, final String e, final boolean f, final String g, final boolean h, final int i, final Integer j, final boolean k, final int l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Deprecated
    public jpq(final String a, int n, final String g, String d, final int n2, final EnumSet set) {
        jvu.a(a);
        this.a = a;
        this.b = n;
        this.c = -1;
        this.g = g;
        if (!set.contains(jpf.d)) {
            d = null;
        }
        this.d = d;
        this.e = null;
        this.f = set.contains(jpf.b);
        this.h = set.equals(jpf.f);
        if (n2 != 0) {
            this.i = n2 - 1;
            this.j = null;
            n = 0;
            this.k = false;
            if (!set.equals(jpf.e)) {
                final Iterator iterator = set.iterator();
                n = -1;
                while (iterator.hasNext()) {
                    n &= ~((jpf)iterator.next()).h;
                }
            }
            this.l = n;
            return;
        }
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof jpq) {
            final jpq jpq = (jpq)o;
            if (jvu.m(this.a, jpq.a) && this.b == jpq.b && this.c == jpq.c && jvu.m(this.g, jpq.g) && jvu.m(this.d, jpq.d) && jvu.m(this.e, jpq.e) && this.f == jpq.f && this.h == jpq.h && this.i == jpq.i && jvu.m(this.j, jpq.j) && this.k == jpq.k && this.l == jpq.l) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.g, this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[package=");
        sb.append(this.a);
        sb.append(",packageVersionCode=");
        sb.append(this.b);
        sb.append(",logSource=");
        sb.append(this.c);
        sb.append(",logSourceName=");
        sb.append(this.g);
        sb.append(",uploadAccount=");
        sb.append(this.d);
        sb.append(",loggingId=");
        sb.append(this.e);
        sb.append(",logAndroidId=");
        sb.append(this.f);
        sb.append(",isAnonymous=");
        sb.append(this.h);
        sb.append(",qosTier=");
        sb.append(this.i);
        sb.append(",appMobilespecId=");
        sb.append(this.j);
        sb.append(",scrubMccMnc=");
        sb.append(this.k);
        sb.append("piiLevelset=");
        sb.append(this.l);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.n(parcel, 3, this.b);
        jwn.n(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.v(parcel, 6, this.e);
        jwn.j(parcel, 7, this.f);
        jwn.v(parcel, 8, this.g);
        jwn.j(parcel, 9, this.h);
        jwn.n(parcel, 10, this.i);
        final Integer j = this.j;
        if (j != null) {
            jwn.m(parcel, 11, 4);
            parcel.writeInt((int)j);
        }
        jwn.j(parcel, 12, this.k);
        jwn.n(parcel, 13, this.l);
        jwn.i(parcel, g);
    }
}
