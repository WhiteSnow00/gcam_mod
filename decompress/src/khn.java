import java.util.Iterator;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khn
{
    public final Map a;
    
    public khn() {
        this.a = new HashMap();
    }
    
    public final void a(IBinder binder) {
        final Map a = this.a;
        monitorenter(a);
        Label_0049: {
            if (binder == null) {
                binder = null;
                break Label_0049;
            }
            try {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                if (queryLocalInterface instanceof khk) {
                    binder = (IBinder)queryLocalInterface;
                }
                else {
                    binder = (IBinder)new khk(binder);
                }
                final kik kik = new kik();
                for (final Map.Entry<K, kio> entry : this.a.entrySet()) {
                    final kio kio = entry.getValue();
                    try {
                        ((khk)binder).e(kik, new kfv(kio));
                    }
                    catch (final RemoteException ex) {
                        final String value = String.valueOf(entry.getKey());
                        final String value2 = String.valueOf(kio);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32 + String.valueOf(value2).length());
                        sb.append("onPostInitHandler: Didn't add: ");
                        sb.append(value);
                        sb.append("/");
                        sb.append(value2);
                        Log.w("WearableClient", sb.toString());
                    }
                }
                monitorexit(a);
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
}
