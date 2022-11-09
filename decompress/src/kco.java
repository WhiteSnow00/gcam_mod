import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kco extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final kcn c;
    public final boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(12);
    }
    
    public kco(final String a, final String b, final kcn c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a(final StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kco)) {
            return false;
        }
        final kco kco = (kco)o;
        return lwt.o(this.a, kco.a) && lwt.o(this.b, kco.b) && lwt.o(this.c, kco.c) && this.d == kco.d;
    }
    
    @Override
    public final String toString() {
        return this.a(new StringBuilder());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.u(parcel, 4, (Parcelable)this.c, n);
        jwn.j(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
