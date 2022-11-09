import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jyh extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final String b;
    final String c;
    final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(15);
    }
    
    public jyh(final String a, final String b, final String d, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
