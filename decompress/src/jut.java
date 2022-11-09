import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jut extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final jvy a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(3);
    }
    
    public jut(final jvy a, final boolean b, final boolean c, final int[] d, final int e, final int[] f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 1, (Parcelable)this.a, n);
        jwn.j(parcel, 2, this.b);
        jwn.j(parcel, 3, this.c);
        jwn.t(parcel, 4, this.d);
        jwn.n(parcel, 5, this.e);
        jwn.t(parcel, 6, this.f);
        jwn.i(parcel, g);
    }
}
