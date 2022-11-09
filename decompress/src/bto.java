import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bto implements kjn
{
    public static final nsd a;
    public final BlockingQueue b;
    public final ThreadLocal c;
    public final ArrayList d;
    private final kjn e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/async/mainthread/EagerMainThreadExecutor");
    }
    
    public bto(final kjn e, final int n) {
        this.c = new btn();
        this.d = new ArrayList();
        this.b = new ArrayBlockingQueue(n);
        this.e = e;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.b.offer(runnable)) {
            if (!this.c.get()) {
                this.e.execute(new btm(this));
            }
            return;
        }
        this.e.execute(runnable);
    }
}
