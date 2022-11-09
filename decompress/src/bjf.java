import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public class bjf extends Binder implements IInterface
{
    protected bjf(final String s) {
        this.attachInterface((IInterface)this, s);
    }
    
    public final IBinder asBinder() {
        return (IBinder)this;
    }
    
    public final boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n > 16777215) {
            if (super.onTransact(n, parcel, parcel2, n2)) {
                return true;
            }
        }
        else {
            parcel.enforceInterface(this.getInterfaceDescriptor());
        }
        return this.x(n, parcel, parcel2);
    }
    
    protected boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        return false;
    }
}
