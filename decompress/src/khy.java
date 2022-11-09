import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khy extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(12);
    }
    
    public khy(final String a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.o(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
