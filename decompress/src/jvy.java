import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvy extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(8);
    }
    
    public jvy(final int a, final boolean b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.j(parcel, 2, this.b);
        jwn.j(parcel, 3, this.c);
        jwn.n(parcel, 4, this.d);
        jwn.n(parcel, 5, this.e);
        jwn.i(parcel, g);
    }
}
