import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbx extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final kbw b;
    final kbj c;
    final kcb d;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(3);
    }
    
    public kbx(final int a, final kbw b, final IBinder binder, final IBinder binder2) {
        this.a = a;
        this.b = b;
        final kcb kcb = null;
        kbj c;
        if (binder == null) {
            c = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof kbj) {
                c = (kbj)queryLocalInterface;
            }
            else {
                c = new kbh(binder);
            }
        }
        this.c = c;
        kcb d;
        if (binder2 == null) {
            d = kcb;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof kcb) {
                d = (kcb)queryLocalInterface2;
            }
            else {
                d = new kbz(binder2);
            }
        }
        this.d = d;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.u(parcel, 2, (Parcelable)this.b, n);
        final kbj c = this.c;
        final IBinder binder = null;
        IBinder binder2;
        if (c == null) {
            binder2 = null;
        }
        else {
            binder2 = c.asBinder();
        }
        jwn.s(parcel, 3, binder2);
        final kcb d = this.d;
        IBinder binder3;
        if (d == null) {
            binder3 = binder;
        }
        else {
            binder3 = d.asBinder();
        }
        jwn.s(parcel, 4, binder3);
        jwn.i(parcel, g);
    }
}
