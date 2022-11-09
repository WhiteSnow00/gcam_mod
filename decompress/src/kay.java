import android.os.Parcel;
import android.os.SystemClock;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kay extends jwc
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    long b;
    float c;
    long d;
    int e;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(1);
    }
    
    public kay() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }
    
    public kay(final boolean a, final long b, final float c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kay)) {
            return false;
        }
        final kay kay = (kay)o;
        return this.a == kay.a && this.b == kay.b && Float.compare(this.c, kay.c) == 0 && this.d == kay.d && this.e == kay.e;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        final long d = this.d;
        if (d != Long.MAX_VALUE) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(d - elapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.j(parcel, 1, this.a);
        jwn.o(parcel, 2, this.b);
        jwn.l(parcel, 3, this.c);
        jwn.o(parcel, 4, this.d);
        jwn.n(parcel, 5, this.e);
        jwn.i(parcel, g);
    }
}
