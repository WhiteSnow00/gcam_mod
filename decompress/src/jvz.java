import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvz extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public List b;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(9);
    }
    
    public jvz(final int a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.z(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
