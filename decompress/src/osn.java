import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import com.google.vr.ndk.base.DaydreamApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osn implements Runnable
{
    final /* synthetic */ DaydreamApi a;
    final /* synthetic */ otf b;
    
    public osn(final DaydreamApi a, final otf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ote f = this.a.f;
        if (f != null) {
            try {
                final otf b = this.b;
                final Parcel a = f.a();
                bjg.e(a, (IInterface)b);
                final Parcel y = f.y(9, a);
                final boolean f2 = bjg.f(y);
                y.recycle();
                if (f2) {
                    return;
                }
            }
            catch (final RemoteException ex) {
                Log.e("DaydreamApi", "RemoteException while launching VR transition: ", (Throwable)ex);
            }
        }
        Log.w("DaydreamApi", "Can't launch callbacks via DaydreamManager, sending manually");
        try {
            this.b.b();
        }
        catch (final RemoteException ex2) {}
    }
}
