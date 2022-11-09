import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import android.os.SystemClock;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzc
{
    private gzl a;
    private gzh b;
    private final Handler c;
    private long d;
    
    public gzc() {
        this.d = 0L;
        this.c = kpo.d(Looper.getMainLooper());
    }
    
    public final void a() {
        final gzl a = this.a;
        nov.z(a);
        a.b();
        this.f();
        this.g();
    }
    
    public final void b() {
        final gzl a = this.a;
        nov.z(a);
        a.a();
        this.f();
        this.g();
    }
    
    public final void c() {
        final gzh b = this.b;
        nov.z(b);
        if (SystemClock.uptimeMillis() - this.d > 300L) {
            b.b();
        }
        else {
            this.c.removeCallbacks((Runnable)new gzb(b));
            this.c.postDelayed((Runnable)new gzb(b), 300L);
        }
        this.f();
        this.g();
    }
    
    public final void d(final ProgressOverlay progressOverlay) {
        this.b = new gzh(progressOverlay);
        (this.a = new gzl(progressOverlay, this.b)).f();
    }
    
    public final void e() {
        this.d = SystemClock.uptimeMillis();
        final gzh b = this.b;
        nov.z(b);
        b.a();
        this.f();
        this.g();
    }
    
    public final void f() {
        final boolean b = this.a.b;
    }
    
    public final void g() {
        final boolean b = this.b.b;
    }
}
