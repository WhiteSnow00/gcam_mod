import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khx extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final kgg b;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(11);
    }
    
    public khx(final int a, final kgg b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.u(parcel, 3, (Parcelable)this.b, n);
        jwn.i(parcel, g);
    }
}
