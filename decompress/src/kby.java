import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kby extends jwc implements jrf
{
    public static final Parcelable$Creator CREATOR;
    public final Status a;
    
    static {
        new kby(Status.a);
        CREATOR = (Parcelable$Creator)new kbr(4);
    }
    
    public kby(final Status a) {
        this.a = a;
    }
    
    @Override
    public final Status a() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 1, (Parcelable)this.a, n);
        jwn.i(parcel, g);
    }
}
