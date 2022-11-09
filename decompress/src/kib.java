import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kib extends jwc
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    public final khj b;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(15);
    }
    
    public kib(final int a, final IBinder binder) {
        this.a = a;
        if (binder != null) {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            khj b;
            if (queryLocalInterface instanceof khj) {
                b = (khj)queryLocalInterface;
            }
            else {
                b = new khh(binder);
            }
            this.b = b;
            return;
        }
        this.b = null;
    }
    
    public kib(final khj b) {
        this.a = 1;
        this.b = b;
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        final khj b = this.b;
        IBinder binder;
        if (b == null) {
            binder = null;
        }
        else {
            binder = b.asBinder();
        }
        jwn.s(parcel, 2, binder);
        jwn.i(parcel, g);
    }
}
