import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aze
{
    private boolean a;
    private final Handler b;
    
    public aze() {
        this.b = new Handler(Looper.getMainLooper(), (Handler$Callback)new azd());
    }
    
    public final void a(final aza aza, final boolean b) {
        synchronized (this) {
            if (!this.a && !b) {
                this.a = true;
                aza.e();
                this.a = false;
                return;
            }
            this.b.obtainMessage(1, (Object)aza).sendToTarget();
        }
    }
}
