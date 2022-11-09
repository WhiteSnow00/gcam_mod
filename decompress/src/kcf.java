import android.os.Parcel;
import java.util.Map;
import java.util.Iterator;
import android.util.Log;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcf extends kbv
{
    public final kce t;
    
    public kcf(final Context context, final Looper looper, final jqu jqu, final jqv jqv, final juq juq) {
        super(context, looper, jqu, jqv, juq);
        this.t = new kce(context, this.a);
    }
    
    @Override
    public final boolean D() {
        return true;
    }
    
    @Override
    public final void j() {
        final kce t = this.t;
        monitorenter(t);
        try {
            if (this.l()) {
                try {
                    final kce t2 = this.t;
                    synchronized (t2.b) {
                        for (final kbo kbo : t2.b.values()) {
                            if (kbo != null) {
                                t2.e.b().e(kch.a(kbo, null));
                            }
                        }
                        t2.b.clear();
                        monitorexit(t2.b);
                        Map map = t2.d;
                        synchronized (t2.b) {
                            for (final kbl kbl : t2.d.values()) {
                                if (kbl != null) {
                                    t2.e.b().e(new kch(2, null, null, null, (IBinder)kbl, null));
                                }
                            }
                            t2.d.clear();
                            monitorexit(t2.b);
                            map = t2.c;
                            synchronized (t2.b) {
                                for (final kbi kbi : t2.c.values()) {
                                    if (kbi != null) {
                                        final kcc b = t2.e.b();
                                        final kbx kbx = new kbx(2, null, (IBinder)kbi, null);
                                        final Parcel a = b.a();
                                        bjg.c(a, (Parcelable)kbx);
                                        b.z(75, a);
                                    }
                                }
                                t2.c.clear();
                            }
                        }
                    }
                }
                catch (final Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
            super.j();
            monitorexit(t);
        }
        finally {
            monitorexit(t);
            while (true) {}
        }
    }
}
