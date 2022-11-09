import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofp
{
    private String a;
    
    public ofp() {
        this.a = null;
    }
    
    public static String a(final String s, final Object... array) {
        return String.format(Locale.ROOT, s, array);
    }
    
    public static ThreadFactory b(final ofp ofp) {
        final String a = ofp.a;
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        AtomicLong atomicLong;
        if (a != null) {
            atomicLong = new AtomicLong(0L);
        }
        else {
            atomicLong = null;
        }
        return new ofo(defaultThreadFactory, a, atomicLong);
    }
    
    public final void c(final String a) {
        a(a, 0);
        this.a = a;
    }
}
