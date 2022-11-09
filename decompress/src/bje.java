import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public class bje implements IInterface
{
    public final IBinder a;
    private final String b;
    
    protected bje(final IBinder a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final void A(final int n, final Parcel parcel) {
        try {
            this.a.transact(n, parcel, (Parcel)null, 1);
        }
        finally {
            parcel.recycle();
        }
    }
    
    public final Parcel a() {
        final Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
    
    public final Parcel y(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            try {
                this.a.transact(n, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            }
            finally {}
        }
        catch (final RuntimeException ex) {
            final Parcel parcel2;
            parcel2.recycle();
            throw ex;
        }
        parcel.recycle();
    }
    
    public final void z(final int n, final Parcel parcel) {
        final Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(n, parcel, obtain, 0);
            obtain.readException();
        }
        finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
