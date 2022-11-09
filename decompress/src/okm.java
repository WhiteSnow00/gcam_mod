import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class okm
{
    static final okm a;
    private static volatile boolean c;
    private static volatile okm d;
    private static volatile okm e;
    public final Map b;
    
    static {
        okm.c = false;
        a = new okm(null);
    }
    
    public okm() {
        this.b = new HashMap();
    }
    
    public okm(final byte[] array) {
        this.b = Collections.emptyMap();
    }
    
    public static okm a() {
        final okm d;
        if ((d = okm.d) == null) {
            synchronized (okm.class) {
                if (okm.d == null) {
                    okm.d = okm.a;
                }
            }
        }
        return d;
    }
    
    public static okm b() {
        final okm e = okm.e;
        if (e != null) {
            return e;
        }
        synchronized (okm.class) {
            final okm e2 = okm.e;
            if (e2 != null) {
                return e2;
            }
            return okm.e = oks.b(okm.class);
        }
    }
    
    public static okm c() {
        return new okm();
    }
    
    public okk d(final omj omj, final int n) {
        return this.b.get(new okl(omj, n));
    }
}
