import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jos extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final int b;
    public final Bundle c;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(11);
    }
    
    public jos(final int a, final int b, final Bundle c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.p(parcel, 3, this.c);
        jwn.i(parcel, g);
    }
}
