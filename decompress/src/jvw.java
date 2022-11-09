import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvw extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final IBinder b;
    public final jps c;
    public final boolean d;
    public final boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(7);
    }
    
    public jvw(final int a, final IBinder b, final jps c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final jvk a() {
        final IBinder b = this.b;
        if (b == null) {
            return null;
        }
        final IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        jvk jvk;
        if (queryLocalInterface instanceof jvk) {
            jvk = (jvk)queryLocalInterface;
        }
        else {
            jvk = new jvk(b);
        }
        return jvk;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof jvw)) {
            return false;
        }
        final jvw jvw = (jvw)o;
        return this.c.equals(jvw.c) && jvu.m(this.a(), jvw.a());
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.s(parcel, 2, this.b);
        jwn.u(parcel, 3, (Parcelable)this.c, n);
        jwn.j(parcel, 4, this.d);
        jwn.j(parcel, 5, this.e);
        jwn.i(parcel, g);
    }
}
