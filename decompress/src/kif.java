import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kif extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final long b;
    public final List c;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(19);
    }
    
    public kif(final int a, final long b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.o(parcel, 3, this.b);
        jwn.z(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
