import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.wearable.ConnectionConfiguration;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class kgx extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final ConnectionConfiguration b;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(2);
    }
    
    public kgx(final int a, final ConnectionConfiguration b) {
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
