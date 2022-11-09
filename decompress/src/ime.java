import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class ime extends Handler
{
    final /* synthetic */ img a;
    
    public ime(final img a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 1) {
            final img a = this.a;
            a.b(false, a.a - 1);
        }
    }
}
