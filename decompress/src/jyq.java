import android.os.Parcelable;
import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyq extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final String b;
    final Intent c;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(16);
    }
    
    public jyq(final int a, final String b, final Intent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.u(parcel, 4, (Parcelable)this.c, n);
        jwn.i(parcel, g);
    }
}
