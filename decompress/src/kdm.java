import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdm extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final jps b;
    public final jvw c;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(18);
    }
    
    public kdm(final int a, final jps b, final jvw c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.u(parcel, 2, (Parcelable)this.b, n);
        jwn.u(parcel, 3, (Parcelable)this.c, n);
        jwn.i(parcel, g);
    }
}
