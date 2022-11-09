import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgo extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final List b;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(15);
    }
    
    public kgo(final int a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.z(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
