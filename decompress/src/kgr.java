import android.os.Parcelable;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgr extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final ParcelFileDescriptor b;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(18);
    }
    
    public kgr(final int a, final ParcelFileDescriptor b) {
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
