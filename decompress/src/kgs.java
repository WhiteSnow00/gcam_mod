import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgs extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(19);
    }
    
    public kgs(final int a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.j(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
