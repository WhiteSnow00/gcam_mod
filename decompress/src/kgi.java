import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgi extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(10);
    }
    
    public kgi(final int a) {
        this.a = a;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.i(parcel, g);
    }
}
