import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khw extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(10);
    }
    
    public khw(final String a, final String b, final int c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof khw && ((khw)o).a.equals(this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String a = this.a;
        final int c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 45 + String.valueOf(a).length());
        sb.append("Node{");
        sb.append(b);
        sb.append(", id=");
        sb.append(a);
        sb.append(", hops=");
        sb.append(c);
        sb.append(", isNearby=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.n(parcel, 4, this.c);
        jwn.j(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
