import android.os.Message;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atc
{
    public final Runnable a;
    public final Object b;
    
    public atc() {
        this.b = new Object();
        this.a = new atb(this);
    }
    
    static void a(final Message message) {
        if (message == null) {
            return;
        }
        if (message.obj instanceof atc) {
            ((atc)message.obj).a.run();
        }
    }
}
