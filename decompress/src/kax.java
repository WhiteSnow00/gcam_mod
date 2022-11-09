import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class kax extends Handler
{
    public kax() {
    }
    
    public kax(final Looper looper) {
        super(looper);
    }
    
    public kax(final Looper looper, final Handler$Callback handler$Callback) {
        super(looper, handler$Callback);
    }
    
    protected void b(final Message message) {
        super.dispatchMessage(message);
    }
    
    public final void dispatchMessage(final Message message) {
        this.b(message);
    }
}
