import android.os.Looper;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjm implements Executor
{
    public static final kjn a;
    public static final kjm b;
    private static final ThreadLocal c;
    private final kjn d;
    
    static {
        b = new kjm(a = new kjh(kpo.d(Looper.getMainLooper())));
        c = new kjl();
    }
    
    @Deprecated
    public kjm() {
        this(kjm.a);
    }
    
    public kjm(final kjn d) {
        this.d = d;
    }
    
    public static void a() {
        njo.p(c(), "Not main thread.");
    }
    
    public static boolean c() {
        final Boolean b = kjm.c.get();
        return b != null && b;
    }
    
    public final void b(final Runnable runnable) {
        if (c()) {
            runnable.run();
            return;
        }
        this.d.execute(runnable);
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.d.execute(runnable);
    }
}
