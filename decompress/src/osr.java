import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.vr.ndk.base.DaydreamApi;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osr implements Runnable
{
    final /* synthetic */ Runnable a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ DaydreamApi c;
    
    public osr(final DaydreamApi c, final Runnable a, final PendingIntent b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final DaydreamApi c = this.c;
        final ote f = c.f;
        if (f != null) {
            try {
                if (c.c >= 23) {
                    final Bundle bundle = new Bundle();
                    bundle.putParcelable("EXIT_VR_INTENT_KEY", (Parcelable)this.b);
                    bundle.putString("EXIT_VR_TEXT_KEY", (String)null);
                    final ote f2 = this.c.f;
                    final Parcel a = f2.a();
                    bjg.c(a, (Parcelable)bundle);
                    final Parcel y = f2.y(17, a);
                    final boolean f3 = bjg.f(y);
                    y.recycle();
                    if (!f3) {
                        Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                        this.a.run();
                    }
                }
                else {
                    final PendingIntent b = this.b;
                    final Parcel a2 = f.a();
                    bjg.c(a2, (Parcelable)b);
                    final Parcel y2 = f.y(10, a2);
                    final boolean f4 = bjg.f(y2);
                    y2.recycle();
                    if (!f4) {
                        Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                        this.a.run();
                    }
                }
                return;
            }
            catch (final RemoteException ex) {
                final String value = String.valueOf(ex);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 49);
                sb.append("Failed to exit VR: RemoteException while exiting:");
                sb.append(value);
                Log.e("DaydreamApi", sb.toString());
                this.a.run();
                return;
            }
        }
        Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
        this.a.run();
    }
}
