import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcq extends jwc implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(14);
    }
    
    public kcq(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final kcq kcq) {
        final int a = this.a;
        final int a2 = kcq.a;
        if (a < a2) {
            return -1;
        }
        if (a > a2) {
            return 1;
        }
        final int b = this.b;
        final int b2 = kcq.b;
        if (b < b2) {
            return -1;
        }
        if (b > b2) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kcq && this.a((kcq)o) == 0;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GenericDimension");
        sb.append("(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
