import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bec
{
    public static volatile int a;
    private static final File b;
    private static volatile bec c;
    private int d;
    private boolean e;
    
    static {
        b = new File("/proc/self/fd");
        bec.a = -1;
    }
    
    public bec() {
        this.e = true;
        new AtomicBoolean(false);
    }
    
    public static bec a() {
        if (bec.c == null) {
            synchronized (bec.class) {
                if (bec.c == null) {
                    bec.c = new bec();
                }
            }
        }
        return bec.c;
    }
    
    private final boolean c() {
        synchronized (this) {
            int d = this.d;
            boolean e = true;
            ++d;
            this.d = d;
            if (d >= 50) {
                this.d = 0;
                final int length = bec.b.list().length;
                int a;
                if (bec.a != -1) {
                    a = bec.a;
                }
                else {
                    a = 20000;
                }
                final long n = a;
                if (length >= n) {
                    e = false;
                }
                this.e = e;
                if (!e && Log.isLoggable("Downsampler", 5)) {
                    final StringBuilder sb = new StringBuilder(135);
                    sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(n);
                    Log.w("Downsampler", sb.toString());
                }
            }
            return this.e;
        }
    }
    
    public final boolean b(final int n, final int n2, final boolean b, final boolean b2) {
        return b && !b2 && n >= 0 && n2 >= 0 && this.c();
    }
}
