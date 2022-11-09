import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfc extends jva
{
    private final AtomicReference a;
    
    public kfc(final Context context, final Looper looper, final juq juq, final jqu jqu, final jqv jqv) {
        super(context, looper, 41, juq, jqu, jqv);
        this.a = new AtomicReference();
    }
    
    @Override
    public final boolean D() {
        return true;
    }
    
    @Override
    public final int a() {
        return 12600000;
    }
    
    @Override
    protected final String d() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }
    
    @Override
    protected final String e() {
        return "com.google.android.gms.usagereporting.service.START";
    }
    
    @Override
    public final jpu[] f() {
        return keq.c;
    }
    
    @Override
    public final void j() {
        try {
            final key key = this.a.getAndSet(null);
            if (key != null) {
                final kfb kfb = new kfb();
                final kez kez = (kez)this.u();
                final Parcel a = kez.a();
                bjg.e(a, (IInterface)key);
                bjg.e(a, (IInterface)kfb);
                kez.z(5, a);
            }
        }
        catch (final RemoteException ex) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", (Throwable)ex);
        }
        super.j();
    }
}
