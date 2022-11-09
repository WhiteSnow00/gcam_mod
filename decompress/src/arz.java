import android.os.Handler;
import android.hardware.Camera$ShutterCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arz implements Camera$ShutterCallback
{
    public final esn a;
    private final Handler c;
    
    public arz(final Handler c, final esn a) {
        this.c = c;
        this.a = a;
    }
    
    public final void onShutter() {
        this.c.post((Runnable)new ary(this));
    }
}
