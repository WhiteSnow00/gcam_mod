import android.os.Handler;
import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jui implements ServiceConnection
{
    final /* synthetic */ jum a;
    private final int b;
    
    public jui(final jum a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onServiceConnected(final ComponentName componentName, IBinder binder) {
        if (binder == null) {
            final jum a = this.a;
            binder = (IBinder)a.e;
            synchronized (binder) {
                final int i = a.i;
                monitorexit(binder);
                int n;
                if (i == 3) {
                    a.m = true;
                    n = 5;
                }
                else {
                    n = 4;
                }
                binder = (IBinder)a.d;
                ((Handler)binder).sendMessage(((Handler)binder).obtainMessage(n, a.o.get(), 16));
                return;
            }
        }
        synchronized (this.a.f) {
            final jum a2 = this.a;
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            jvo r;
            if (queryLocalInterface != null && queryLocalInterface instanceof jvo) {
                r = (jvo)queryLocalInterface;
            }
            else {
                r = new jvo(binder);
            }
            a2.r = r;
            monitorexit(this.a.f);
            this.a.G(0, this.b);
        }
    }
    
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName = (ComponentName)this.a.f;
        synchronized (componentName) {
            this.a.r = null;
            monitorexit(componentName);
            componentName = (ComponentName)this.a.d;
            ((Handler)componentName).sendMessage(((Handler)componentName).obtainMessage(6, this.b, 1));
        }
    }
}
