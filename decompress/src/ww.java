import android.os.Looper;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ww extends aaf
{
    public static final Executor a;
    private static volatile ww c;
    public final aaf b;
    private final aaf d;
    
    static {
        a = new krn(1);
    }
    
    private ww() {
        final wy wy = new wy();
        this.d = wy;
        this.b = wy;
    }
    
    public static ww a() {
        if (ww.c != null) {
            return ww.c;
        }
        synchronized (ww.class) {
            if (ww.c == null) {
                ww.c = new ww();
            }
            return ww.c;
        }
    }
    
    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
