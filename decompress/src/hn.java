import android.os.IInterface;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public class hn implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    hm a;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(15);
    }
    
    public hn(final Parcel parcel) {
        final IBinder strongBinder = parcel.readStrongBinder();
        hm a;
        if (strongBinder == null) {
            a = null;
        }
        else {
            final IInterface queryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && queryLocalInterface instanceof hm) {
                a = (hm)queryLocalInterface;
            }
            else {
                a = new hk(strongBinder);
            }
        }
        this.a = a;
    }
    
    protected void a() {
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new hl(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
