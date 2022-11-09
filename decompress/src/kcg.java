import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcg extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public static final List a;
    final LocationRequest b;
    final List c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final String h;
    final boolean i;
    final boolean j;
    public String k;
    final long l;
    
    static {
        a = Collections.emptyList();
        CREATOR = (Parcelable$Creator)new kbr(5);
    }
    
    public kcg(final LocationRequest b, final List c, final String d, final boolean e, final boolean f, final boolean g, final String h, final boolean i, final boolean j, final String k, final long l) {
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
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kcg) {
            final kcg kcg = (kcg)o;
            if (jvu.m(this.b, kcg.b) && jvu.m(this.c, kcg.c) && jvu.m(this.d, kcg.d) && this.e == kcg.e && this.f == kcg.f && this.g == kcg.g && jvu.m(this.h, kcg.h) && this.i == kcg.i && this.j == kcg.j && jvu.m(this.k, kcg.k)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 1, (Parcelable)this.b, n);
        jwn.z(parcel, 5, this.c);
        jwn.v(parcel, 6, this.d);
        jwn.j(parcel, 7, this.e);
        jwn.j(parcel, 8, this.f);
        jwn.j(parcel, 9, this.g);
        jwn.v(parcel, 10, this.h);
        jwn.j(parcel, 11, this.i);
        jwn.j(parcel, 12, this.j);
        jwn.v(parcel, 13, this.k);
        jwn.o(parcel, 14, this.l);
        jwn.i(parcel, g);
    }
}
