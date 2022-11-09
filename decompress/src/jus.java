import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jus extends jwc
{
    public static final Parcelable$Creator CREATOR;
    Bundle a;
    jpu[] b;
    int c;
    public jut d;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(2);
    }
    
    public jus() {
    }
    
    public jus(final Bundle a, final jpu[] b, final int c, final jut d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.p(parcel, 1, this.a);
        jwn.y(parcel, 2, (Parcelable[])this.b, n);
        jwn.n(parcel, 3, this.c);
        jwn.u(parcel, 4, (Parcelable)this.d, n);
        jwn.i(parcel, g);
    }
}
