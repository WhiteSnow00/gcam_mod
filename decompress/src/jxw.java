import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxw extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    int b;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(13);
    }
    
    public jxw() {
        this(3, 0);
    }
    
    public jxw(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.n(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
