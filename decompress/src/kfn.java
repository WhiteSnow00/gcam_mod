import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfn implements ServiceConnection
{
    private final /* synthetic */ int a;
    
    public kfn() {
    }
    
    public kfn(final int a) {
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final int a = this.a;
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        final int a = this.a;
    }
}
