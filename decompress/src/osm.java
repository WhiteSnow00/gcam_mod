import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.Parcelable;
import com.google.vr.ndk.base.DaydreamApi;
import android.content.ComponentName;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osm implements Runnable
{
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ ComponentName b;
    final /* synthetic */ DaydreamApi c;
    
    public osm(final DaydreamApi c, final PendingIntent a, final ComponentName b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ote f = this.c.f;
        if (f != null) {
            try {
                final PendingIntent a = this.a;
                final ComponentName b = this.b;
                final Parcel a2 = f.a();
                bjg.c(a2, (Parcelable)a);
                bjg.c(a2, (Parcelable)b);
                final Parcel y = f.y(7, a2);
                bjg.f(y);
                y.recycle();
                return;
            }
            catch (final RemoteException ex) {
                Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", (Throwable)ex);
                return;
            }
        }
        Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
        try {
            this.a.send();
        }
        catch (final Exception ex2) {
            Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", (Throwable)ex2);
        }
    }
}
