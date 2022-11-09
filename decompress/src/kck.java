import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kck extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final byte[] a;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(9);
    }
    
    public kck(final byte[] a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.q(parcel, 2, this.a);
        jwn.i(parcel, g);
    }
}
