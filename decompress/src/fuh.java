import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuh implements fut
{
    public static final nsd a;
    public final Handler b;
    private final fut c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/moments/TimeLimitedMomentsHdrPlusLauncher");
    }
    
    public fuh(final fut c, final Handler b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final int a() {
        this.c.a();
        return 1;
    }
    
    @Override
    public final void b(final kvs kvs, final fvn fvn, final fvd fvd, final fus fus) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final Object o = new Object();
        this.b.postDelayed((Runnable)new fuf(atomicBoolean, fus), o, 10000L);
        this.c.b(kvs, fvn, fvd, new fug(this, o, atomicBoolean, fus));
    }
    
    @Override
    public final boolean c(final kvs kvs, final gry gry) {
        return true;
    }
}
