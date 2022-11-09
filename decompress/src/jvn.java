import android.util.Log;
import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvn extends bjf implements IInterface
{
    private jum a;
    private final int b;
    
    public jvn() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public jvn(final jum a, final int b) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = a;
        this.b = b;
    }
    
    public final void b(final int n, final IBinder binder, final Bundle bundle) {
        jvu.j(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.y(n, binder, bundle, this.b);
        this.a = null;
    }
    
    @Override
    protected final boolean x(int int1, final Parcel parcel, final Parcel parcel2) {
        switch (int1) {
            default: {
                return false;
            }
            case 3: {
                int1 = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final jus n = (jus)bjg.a(parcel, jus.CREATOR);
                final jum a = this.a;
                jvu.j(a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                jvu.a(n);
                a.n = n;
                if (a.D()) {
                    final jut d = n.d;
                    final jvx a2 = jvx.a();
                    jvy a3;
                    if (d == null) {
                        a3 = null;
                    }
                    else {
                        a3 = d.a;
                    }
                    a2.b(a3);
                }
                this.b(int1, strongBinder, n.a);
                break;
            }
            case 2: {
                parcel.readInt();
                final Bundle bundle = (Bundle)bjg.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", (Throwable)new Exception());
                break;
            }
            case 1: {
                this.b(parcel.readInt(), parcel.readStrongBinder(), (Bundle)bjg.a(parcel, Bundle.CREATOR));
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
