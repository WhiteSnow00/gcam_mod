import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfq implements Handler$Callback
{
    final /* synthetic */ bfr a;
    
    public bfq(final bfr a) {
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 1) {
            this.a.c((bfo)message.obj);
            return true;
        }
        if (message.what == 2) {
            this.a.c.f((bhy)message.obj);
        }
        return false;
    }
}
