import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgt extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(20);
    }
    
    public kgt(final int a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.j(parcel, 3, this.b);
        jwn.j(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
