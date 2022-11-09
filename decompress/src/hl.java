import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hl extends Binder implements hm
{
    final /* synthetic */ hn a;
    
    public hl() {
        this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
    }
    
    public hl(final hn a) {
        this.a = a;
        this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            case 1: {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                    final Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                this.a.a();
                return true;
            }
        }
    }
}
