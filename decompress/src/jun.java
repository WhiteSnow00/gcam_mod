import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jun extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(1);
    }
    
    public jun(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof jun)) {
            return false;
        }
        final jun jun = (jun)o;
        return jun.a == this.a && jvu.m(jun.b, this.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 12);
        sb.append(a);
        sb.append(":");
        sb.append(b);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.v(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
