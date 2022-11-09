import android.os.Message;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ium extends Handler
{
    private final WeakReference a;
    
    public ium(final ShutterButton shutterButton) {
        this.a = new WeakReference((T)shutterButton);
    }
    
    public final void handleMessage(final Message message) {
        final ShutterButton shutterButton = (ShutterButton)this.a.get();
        if (shutterButton == null) {
            return;
        }
        switch (message.what) {
            default: {
                final int what = message.what;
                final StringBuilder sb = new StringBuilder(36);
                sb.append("Not supported state msg: ");
                sb.append(what);
                throw new IllegalArgumentException(sb.toString());
            }
            case 1002: {
                ShutterButton.access$002(iun.e);
                this.removeMessages(1001);
                ShutterButton.access$100(shutterButton, ShutterButton.access$000());
                return;
            }
            case 1001: {
                if (this.hasMessages(1002)) {
                    this.removeMessages(1001);
                    ShutterButton.access$002(iun.d);
                    ShutterButton.access$100(shutterButton, ShutterButton.access$000());
                    return;
                }
                ShutterButton.access$002(iun.d);
                ShutterButton.access$100(shutterButton, ShutterButton.access$000());
                return;
            }
            case 1000: {
                ShutterButton.access$002(iun.c);
                this.removeMessages(1001);
                ShutterButton.access$100(shutterButton, ShutterButton.access$000());
            }
        }
    }
}
