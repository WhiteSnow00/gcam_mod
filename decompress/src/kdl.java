import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdl extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final jvv b;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(17);
    }
    
    public kdl(final int a, final jvv b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.u(parcel, 2, (Parcelable)this.b, n);
        jwn.i(parcel, g);
    }
}
