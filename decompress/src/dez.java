import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class dez implements ServiceConnection
{
    final /* synthetic */ dfb a;
    
    public dez(final dfb a) {
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this.a.c) {
            final dfb a = this.a;
            ngw g;
            if (binder == null) {
                g = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.systemui.elmyra.IElmyraService");
                if (queryLocalInterface instanceof ngw) {
                    g = (ngw)queryLocalInterface;
                }
                else {
                    g = new ngw(binder);
                }
            }
            a.g = g;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        synchronized (this.a.c) {
            this.a.g = null;
        }
    }
}
