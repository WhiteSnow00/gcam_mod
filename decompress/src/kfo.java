import android.os.Message;
import android.util.Log;
import android.content.ServiceConnection;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfo extends kax
{
    final /* synthetic */ kfu a;
    private boolean b;
    private final kfn c;
    
    public kfo(final kfu a, final Looper looper) {
        this.a = a;
        super(looper);
        this.c = new kfn();
    }
    
    private final void c() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            final kfu a = this.a;
            a.bindService(a.b, (ServiceConnection)this.c, 1);
            this.b = true;
        }
    }
    
    public final void a() {
        synchronized (this) {
            if (this.b) {
                try {
                    this.a.unbindService((ServiceConnection)this.c);
                }
                catch (final RuntimeException ex) {
                    Log.e("WearableLS", "Exception when unbinding from local service", (Throwable)ex);
                }
                this.b = false;
            }
        }
    }
    
    @Override
    protected final void b(final Message message) {
        this.c();
        try {
            super.b(message);
            if (!this.hasMessages(0)) {
                this.a();
            }
        }
        finally {
            if (!this.hasMessages(0)) {
                this.a();
            }
        }
    }
}
