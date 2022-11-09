import java.util.ArrayList;
import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.vr.ndk.base.DaydreamApi;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osl implements ServiceConnection
{
    final /* synthetic */ DaydreamApi a;
    
    public osl(final DaydreamApi a) {
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final DaydreamApi a = this.a;
        final ote ote = null;
        otg e;
        if (binder == null) {
            e = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.common.api.IVrCoreSdkService");
            if (queryLocalInterface instanceof otg) {
                e = (otg)queryLocalInterface;
            }
            else {
                e = new otg(binder);
            }
        }
        a.e = e;
        try {
            final DaydreamApi a2 = this.a;
            final otg e2 = a2.e;
            final Parcel y = e2.y(2, e2.a());
            final IBinder strongBinder = y.readStrongBinder();
            ote f;
            if (strongBinder == null) {
                f = ote;
            }
            else {
                final IInterface queryLocalInterface2 = strongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
                if (queryLocalInterface2 instanceof ote) {
                    f = (ote)queryLocalInterface2;
                }
                else {
                    f = new ote(strongBinder);
                }
            }
            y.recycle();
            a2.f = f;
        }
        catch (final RemoteException ex) {
            Log.e("DaydreamApi", "RemoteException in onServiceConnected");
        }
        if (this.a.f == null) {
            Log.w("DaydreamApi", "Daydream service component unavailable.");
        }
        final ArrayList b = this.a.b;
        for (int size = b.size(), i = 0; i < size; ++i) {
            ((Runnable)b.get(i)).run();
        }
        this.a.b.clear();
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.a.e = null;
    }
}
