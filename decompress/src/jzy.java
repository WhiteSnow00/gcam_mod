import android.os.IBinder;
import android.os.Parcel;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzy extends bjf implements IInterface
{
    final /* synthetic */ jyx a;
    
    public jzy() {
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }
    
    public jzy(final jyx a) {
        this.a = a;
        super("com.google.android.gms.learning.internal.IExampleStoreV2");
    }
    
    @Override
    protected final boolean x(final int n, final Parcel parcel, final Parcel parcel2) {
        if (n == 2) {
            final String string = parcel.readString();
            final IBinder strongBinder = parcel.readStrongBinder();
            final jzx jzx = null;
            jwx jwx;
            if (strongBinder == null) {
                jwx = null;
            }
            else {
                final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof jwx) {
                    jwx = (jwx)queryLocalInterface;
                }
                else {
                    jwx = new jwv(strongBinder);
                }
            }
            final IBinder strongBinder2 = parcel.readStrongBinder();
            jwx jwx2;
            if (strongBinder2 == null) {
                jwx2 = null;
            }
            else {
                final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface2 instanceof jwx) {
                    jwx2 = (jwx)queryLocalInterface2;
                }
                else {
                    jwx2 = new jwv(strongBinder2);
                }
            }
            final IBinder strongBinder3 = parcel.readStrongBinder();
            jzx jzx2;
            if (strongBinder3 == null) {
                jzx2 = jzx;
            }
            else {
                final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2");
                if (queryLocalInterface3 instanceof jzx) {
                    jzx2 = (jzx)queryLocalInterface3;
                }
                else {
                    jzx2 = new jzx(strongBinder3);
                }
            }
            this.a.c(string, (byte[])jww.c(jwx), (byte[])jww.c(jwx2), new jzu(jzx2));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
