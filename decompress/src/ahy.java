import androidx.window.sidecar.SidecarWindowLayoutInfo;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahy implements SidecarInterface$SidecarCallback
{
    private final SidecarInterface$SidecarCallback a;
    private final ReentrantLock b;
    
    public ahy(final ahw ahw, final SidecarInterface$SidecarCallback a) {
        this.a = a;
        this.b = new ReentrantLock();
        new WeakHashMap();
    }
    
    public final void a(final SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        throw null;
    }
    
    public final void b(final IBinder binder, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        binder.getClass();
        sidecarWindowLayoutInfo.getClass();
        throw null;
    }
}
