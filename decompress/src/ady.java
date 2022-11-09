import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.FutureTask;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ady
{
    private static Handler a;
    public final FutureTask c;
    final AtomicBoolean d;
    final AtomicBoolean e;
    public volatile int f;
    
    public ady() {
        this.f = 1;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        this.c = new adw(this, new adv(this));
    }
    
    protected abstract Object a();
    
    protected void b(final Object o) {
        throw null;
    }
    
    protected void c() {
        throw null;
    }
    
    final void d(final Object o) {
        synchronized (ady.class) {
            if (ady.a == null) {
                ady.a = new Handler(Looper.getMainLooper());
            }
            final Handler a = ady.a;
            monitorexit(ady.class);
            a.post((Runnable)new adx(this, o));
        }
    }
    
    final void e(final Object o) {
        if (!this.e.get()) {
            this.d(o);
        }
    }
    
    public final boolean f() {
        return this.d.get();
    }
}
