import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class azd implements Handler$Callback
{
    public azd() {
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 1) {
            ((aza)message.obj).e();
            return true;
        }
        return false;
    }
}
