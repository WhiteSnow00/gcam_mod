import android.os.Parcel;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.DaydreamApi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oso implements Runnable
{
    final /* synthetic */ DaydreamApi a;
    private final /* synthetic */ int b;
    
    public oso(final DaydreamApi a) {
        this.a = a;
    }
    
    public oso(final DaydreamApi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                Context context;
                if (this.a.a.getApplicationContext() != null) {
                    context = this.a.a.getApplicationContext();
                }
                else {
                    context = this.a.a;
                }
                context.unbindService(this.a.d);
                this.a.e = null;
                return;
            }
            case 0: {
                final ote f = this.a.f;
                if (f != null) {
                    try {
                        final Parcel y = f.y(8, f.a());
                        final boolean f2 = bjg.f(y);
                        y.recycle();
                        if (f2) {
                            return;
                        }
                        Log.e("DaydreamApi", "There is no VR homescreen installed.");
                        return;
                    }
                    catch (final RemoteException ex) {
                        final String value = String.valueOf(ex);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47);
                        sb.append("RemoteException while launching VR homescreen: ");
                        sb.append(value);
                        Log.e("DaydreamApi", sb.toString());
                        return;
                    }
                }
                Log.e("DaydreamApi", "Can't launch VR homescreen via DaydreamManager. Giving up trying to leave current VR activity...");
            }
        }
    }
}
