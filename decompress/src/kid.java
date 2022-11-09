import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kid extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final byte[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(17);
    }
    
    public kid(final int a, final int b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.q(parcel, 3, this.c);
        jwn.i(parcel, g);
    }
}
