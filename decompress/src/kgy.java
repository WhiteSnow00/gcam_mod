import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.wearable.ConnectionConfiguration;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgy extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final ConnectionConfiguration[] b;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(3);
    }
    
    public kgy(final int a, final ConnectionConfiguration[] b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.y(parcel, 3, (Parcelable[])this.b, n);
        jwn.i(parcel, g);
    }
}
