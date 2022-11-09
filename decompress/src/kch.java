import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.app.PendingIntent;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kch extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    final kcg b;
    final kbp c;
    final PendingIntent d;
    final kbm e;
    final kcb f;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(6);
    }
    
    public kch(final int a, final kcg b, final IBinder binder, final PendingIntent d, final IBinder binder2, final IBinder binder3) {
        this.a = a;
        this.b = b;
        final kcb kcb = null;
        kbp c;
        if (binder == null) {
            c = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof kbp) {
                c = (kbp)queryLocalInterface;
            }
            else {
                c = new kbn(binder);
            }
        }
        this.c = c;
        this.d = d;
        kbm e;
        if (binder2 == null) {
            e = null;
        }
        else {
            final IInterface queryLocalInterface2 = binder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof kbm) {
                e = (kbm)queryLocalInterface2;
            }
            else {
                e = new kbk(binder2);
            }
        }
        this.e = e;
        kcb f;
        if (binder3 == null) {
            f = kcb;
        }
        else {
            final IInterface queryLocalInterface3 = binder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof kcb) {
                f = (kcb)queryLocalInterface3;
            }
            else {
                f = new kbz(binder3);
            }
        }
        this.f = f;
    }
    
    public static kch a(final kbp kbp, final kcb kcb) {
        Object o = kcb;
        if (kcb == null) {
            o = null;
        }
        return new kch(2, null, (IBinder)kbp, null, null, (IBinder)o);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.u(parcel, 2, (Parcelable)this.b, n);
        final kbp c = this.c;
        final IBinder binder = null;
        IBinder binder2;
        if (c == null) {
            binder2 = null;
        }
        else {
            binder2 = c.asBinder();
        }
        jwn.s(parcel, 3, binder2);
        jwn.u(parcel, 4, (Parcelable)this.d, n);
        final kbm e = this.e;
        IBinder binder3;
        if (e == null) {
            binder3 = null;
        }
        else {
            binder3 = e.asBinder();
        }
        jwn.s(parcel, 5, binder3);
        final kcb f = this.f;
        IBinder binder4;
        if (f == null) {
            binder4 = binder;
        }
        else {
            binder4 = f.asBinder();
        }
        jwn.s(parcel, 6, binder4);
        jwn.i(parcel, g);
    }
}
