import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgv extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw();
    }
    
    public kgv(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
