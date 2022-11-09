import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlw
{
    public static volatile jlw a;
    public final Context b;
    public Thread.UncaughtExceptionHandler c;
    public volatile jlq d;
    private final jlt e;
    
    public jlw(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        jvu.a(applicationContext);
        this.b = applicationContext;
        this.e = new jlt(this);
        new CopyOnWriteArrayList();
        new jlp();
    }
    
    public static void a() {
        if (Thread.currentThread() instanceof jlv) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }
    
    public final void b(final Runnable runnable) {
        jvu.a(runnable);
        this.e.submit(runnable);
    }
}
