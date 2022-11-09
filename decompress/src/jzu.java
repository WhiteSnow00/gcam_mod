import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzu
{
    private final nju a;
    private final long b;
    private final jzx c;
    
    public jzu(final jzx c) {
        this.c = c;
        final nju a = nih.a;
        this.a = a;
        this.b = a.a();
    }
    
    public final void a(jyw jyw) {
        jyw.getClass();
        final long a = this.a.a();
        final long b = this.b;
        jyw = (jyw)new jzw(jyw, this.a);
        try {
            final jzx c = this.c;
            final Parcel a2 = c.a();
            bjg.e(a2, (IInterface)jyw);
            a2.writeLong(a - b);
            c.z(2, a2);
        }
        catch (final RemoteException ex) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", (Throwable)ex);
            ((jzw)jyw).b();
        }
    }
    
    public final void b(final String s) {
        final Status status = new Status(10, s);
        final long a = this.a.a();
        final long b = this.b;
        try {
            final jzx c = this.c;
            final Parcel a2 = c.a();
            bjg.c(a2, (Parcelable)status);
            a2.writeLong(a - b);
            c.z(3, a2);
        }
        catch (final RemoteException ex) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", (Throwable)ex);
        }
    }
}
