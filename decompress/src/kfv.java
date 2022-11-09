import android.os.Parcelable;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.content.IntentFilter;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfv extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final khj a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(2);
    }
    
    public kfv(final IBinder binder, final IntentFilter[] b, final String c, final String d) {
        if (binder != null) {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            khj a;
            if (queryLocalInterface instanceof khj) {
                a = (khj)queryLocalInterface;
            }
            else {
                a = new khh(binder);
            }
            this.a = a;
        }
        else {
            this.a = null;
        }
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public kfv(final kio a) {
        this.a = a;
        this.b = a.b;
        this.c = null;
        this.d = null;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        final khj a = this.a;
        IBinder binder;
        if (a == null) {
            binder = null;
        }
        else {
            binder = a.asBinder();
        }
        jwn.s(parcel, 2, binder);
        jwn.y(parcel, 3, (Parcelable[])this.b, n);
        jwn.v(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
