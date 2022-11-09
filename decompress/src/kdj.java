import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdj extends jwc implements jrf
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    public final String b;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(16);
    }
    
    public kdj(final List a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Status a() {
        if (this.b != null) {
            return Status.a;
        }
        return Status.e;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.x(parcel, 1, this.a);
        jwn.v(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
