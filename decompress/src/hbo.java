import android.os.IInterface;
import android.os.IBinder;
import android.content.ComponentName;
import com.google.android.apps.camera.remotecontrol.RemoteControlService;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbo implements ServiceConnection
{
    final /* synthetic */ RemoteControlService a;
    
    public hbo(final RemoteControlService a) {
        this.a = a;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        final RemoteControlService a = this.a;
        jle h;
        if (binder == null) {
            h = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.apps.photos.cameraassistant.ICameraAssistantService");
            if (queryLocalInterface instanceof jle) {
                h = (jle)queryLocalInterface;
            }
            else {
                h = new jle(binder);
            }
        }
        a.h = h;
        this.a.c = true;
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        final RemoteControlService a = this.a;
        a.h = null;
        a.c = false;
    }
}
