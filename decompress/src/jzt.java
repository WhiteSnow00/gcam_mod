import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzt
{
    private final nju a;
    private final long b;
    private final jzw c;
    private final jzv d;
    
    public jzt(final jzw c, final jzv d, final nju a) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = a.a();
    }
    
    public final void a(final String s) {
        final Status status = new Status(8, s);
        final long a = this.a.a();
        final long b = this.b;
        try {
            final jzv d = this.d;
            final Parcel a2 = d.a();
            bjg.c(a2, (Parcelable)status);
            a2.writeLong(a - b);
            d.z(3, a2);
        }
        catch (final RemoteException ex) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", (Throwable)ex);
            this.c.b();
        }
    }
    
    public final void b(final byte[] array, final byte[] array2) {
        final long a = this.a.a();
        final long b = this.b;
        try {
            final jzv d = this.d;
            final IInterface interface1 = null;
            Object b2;
            if (array == null) {
                b2 = null;
            }
            else {
                b2 = jww.b(array);
            }
            Object b3;
            if (array2 == null) {
                b3 = interface1;
            }
            else {
                b3 = jww.b(array2);
            }
            final Parcel a2 = d.a();
            bjg.e(a2, (IInterface)b2);
            bjg.e(a2, (IInterface)b3);
            a2.writeLong(a - b);
            d.z(2, a2);
        }
        catch (final RemoteException ex) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", (Throwable)ex);
            this.c.b();
        }
    }
}
