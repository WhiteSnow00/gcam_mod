import android.os.Parcelable;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.content.Context;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jyx extends Service
{
    private final Object a;
    private final jzy b;
    private jzz c;
    
    public jyx() {
        this.b = new jzy(this);
        this.a = new Object();
    }
    
    private final jzz a() {
        synchronized (this.a) {
            return this.c;
        }
    }
    
    public abstract void c(final String p0, final byte[] p1, final byte[] p2, final jzu p3);
    
    public final IBinder onBind(final Intent intent) {
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            final String value = String.valueOf(intent.getAction());
            String concat;
            if (value.length() != 0) {
                concat = "Received connection with unexpected action ".concat(value);
            }
            else {
                concat = new String("Received connection with unexpected action ");
            }
            return (IBinder)new kaa(concat);
        }
        Object o = this.a;
        synchronized (o) {
            jzz c = this.c;
            if (c == null) {
                try {
                    c = (jzz)kaf.a((Context)this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", kam.b);
                    try {
                        final jwx b = jww.b(this);
                        final jzy b2 = this.b;
                        final Parcel a = c.a();
                        bjg.e(a, (IInterface)b);
                        bjg.e(a, (IInterface)b2);
                        c.z(1, a);
                        this.c = c;
                    }
                    catch (final RemoteException ex) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", (Throwable)ex);
                        }
                        return (IBinder)new kaa("No IInAppExampleStoreProxy implementation found");
                    }
                }
                catch (final kad kad) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", (Throwable)kad);
                    }
                    return (IBinder)new kaa("No IInAppExampleStoreProxy implementation found");
                }
            }
            monitorexit(o);
            try {
                o = c.a();
                bjg.c((Parcel)o, (Parcelable)intent);
                final Parcel y = c.y(3, (Parcel)o);
                final IBinder strongBinder = y.readStrongBinder();
                y.recycle();
                return strongBinder;
            }
            catch (final RemoteException ex2) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", (Throwable)ex2);
                }
                return (IBinder)new kaa("No IInAppExampleStoreProxy implementation found");
            }
        }
    }
    
    public final void onDestroy() {
        final jzz a = this.a();
        if (a != null) {
            try {
                a.z(2, a.a());
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", (Throwable)ex);
                }
            }
        }
        super.onDestroy();
    }
    
    public final void onRebind(final Intent intent) {
        final jzz a = this.a();
        if (a != null) {
            try {
                final Parcel a2 = a.a();
                bjg.c(a2, (Parcelable)intent);
                a.z(6, a2);
                return;
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", (Throwable)ex);
                }
            }
        }
        super.onRebind(intent);
    }
    
    public final void onTrimMemory(final int n) {
        final jzz a = this.a();
        if (a != null) {
            try {
                final Parcel a2 = a.a();
                a2.writeInt(n);
                a.z(4, a2);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", (Throwable)ex);
                }
            }
        }
        super.onTrimMemory(n);
    }
    
    public final boolean onUnbind(final Intent intent) {
        final jzz a = this.a();
        if (a != null) {
            try {
                final Parcel a2 = a.a();
                bjg.c(a2, (Parcelable)intent);
                final Parcel y = a.y(5, a2);
                final boolean f = bjg.f(y);
                y.recycle();
                return f;
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", (Throwable)ex);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
