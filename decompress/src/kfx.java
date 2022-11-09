import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfx extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final byte a;
    public final byte b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(4);
    }
    
    public kfx(final byte b, final byte b2, final String c) {
        this.a = b;
        this.b = b2;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final kfx kfx = (kfx)o;
            return this.a == kfx.a && this.b == kfx.b && this.c.equals(kfx.c);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a + 31) * 31 + this.b) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final byte a = this.a;
        final byte b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 73);
        sb.append("AmsEntityUpdateParcelable{, mEntityId=");
        sb.append(a);
        sb.append(", mAttributeId=");
        sb.append(b);
        sb.append(", mValue='");
        sb.append(c);
        sb.append("'}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.k(parcel, 2, this.a);
        jwn.k(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
