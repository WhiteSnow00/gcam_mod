import android.os.Parcelable;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbw extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public static final List a;
    public static final kay b;
    final kay c;
    final List d;
    final String e;
    
    static {
        a = Collections.emptyList();
        b = new kay(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
        CREATOR = (Parcelable$Creator)new kbr(2);
    }
    
    public kbw(final kay c, final List d, final String e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof kbw)) {
            return false;
        }
        final kbw kbw = (kbw)o;
        return jvu.m(this.c, kbw.c) && jvu.m(this.d, kbw.d) && jvu.m(this.e, kbw.e);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final String e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 77 + String.valueOf(value2).length() + String.valueOf(e).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(value);
        sb.append(", clients=");
        sb.append(value2);
        sb.append(", tag='");
        sb.append(e);
        sb.append("'}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 1, (Parcelable)this.c, n);
        jwn.z(parcel, 2, this.d);
        jwn.v(parcel, 3, this.e);
        jwn.i(parcel, g);
    }
}
