import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.content.Intent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdg extends jwc implements jrf
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public int b;
    public Intent c;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(15);
    }
    
    public kdg() {
        this(2, 0, null);
    }
    
    public kdg(final int a, final int b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Status a() {
        if (this.b == 0) {
            return Status.a;
        }
        return Status.e;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.u(parcel, 3, (Parcelable)this.c, n);
        jwn.i(parcel, g);
    }
}
