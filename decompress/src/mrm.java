import java.util.Set;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class mrm
{
    private static Thread a;
    private static volatile Handler b;
    
    public static Handler a() {
        if (mrm.b == null) {
            mrm.b = new Handler(Looper.getMainLooper());
        }
        return mrm.b;
    }
    
    public static void b() {
        if (!f()) {
            return;
        }
        throw new RuntimeException("Must be called on a background thread");
    }
    
    public static void d() {
        if (f()) {
            return;
        }
        throw new RuntimeException("Must be called on the UI thread");
    }
    
    public static void e(final Runnable runnable) {
        a().post(runnable);
    }
    
    public static boolean f() {
        if (mrm.a == null) {
            mrm.a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == mrm.a;
    }
    
    public static void g(final Throwable t, final StringBuilder sb, final Set set, final String s) {
        if (t != null && !set.contains(t)) {
            set.add(t);
            if (s != null) {
                sb.append(s);
            }
            sb.append(t.getClass().getName());
            sb.append(':');
            final StackTraceElement[] stackTrace = t.getStackTrace();
            final int length = stackTrace.length;
            final int n = 0;
            for (final StackTraceElement stackTraceElement : stackTrace) {
                sb.append("\n\tat ");
                sb.append(stackTraceElement);
            }
            final Throwable[] suppressed = t.getSuppressed();
            for (int length2 = suppressed.length, j = n; j < length2; ++j) {
                g(suppressed[j], sb, set, "\nSuppressed: ");
            }
            if (t.getCause() != null) {
                g(t.getCause(), sb, set, "\nCaused by: ");
            }
        }
    }
    
    public static int h(final int n) {
        return n - 1;
    }
}
