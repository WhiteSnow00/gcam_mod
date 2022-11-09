import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvq extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(5);
    }
    
    public jvq(final int a, final int b, final int c, final long d, final long e, final String f, final String g, final int h, final int i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.n(parcel, 3, this.c);
        jwn.o(parcel, 4, this.d);
        jwn.o(parcel, 5, this.e);
        jwn.v(parcel, 6, this.f);
        jwn.v(parcel, 7, this.g);
        jwn.n(parcel, 8, this.h);
        jwn.n(parcel, 9, this.i);
        jwn.i(parcel, g);
    }
}
