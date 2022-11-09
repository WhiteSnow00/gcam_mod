import android.os.HandlerThread;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chw implements krc
{
    public Handler a;
    private final cid b;
    private HandlerThread c;
    private kjh d;
    private boolean e;
    private final Object f;
    
    public chw(final cid b) {
        this.e = false;
        this.f = new Object();
        this.b = b;
    }
    
    public final kjh a() {
        this.b();
        final kjh d = this.d;
        d.getClass();
        return d;
    }
    
    public final void b() {
        synchronized (this.f) {
            if (this.e) {
                return;
            }
            (this.c = new HandlerThread("CamcorderCameraHandler")).start();
            this.a = kpo.d(this.c.getLooper());
            this.d = new kjh(this.a);
            this.b.a(cic.b).c(this);
            this.e = true;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            if (!this.e) {
                return;
            }
            final HandlerThread c = this.c;
            if (c != null) {
                c.quit();
            }
            this.c = null;
            this.a = null;
            this.d = null;
            this.e = false;
        }
    }
}
