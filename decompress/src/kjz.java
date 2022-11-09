import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjz implements ThreadFactory
{
    final /* synthetic */ kjy a;
    final /* synthetic */ boolean b;
    private final AtomicInteger c;
    
    public kjz(final kjy a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicInteger(0);
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        final String value = String.valueOf(this.a.b);
        String string;
        if (this.b) {
            string = "";
        }
        else {
            final int incrementAndGet = this.c.incrementAndGet();
            final StringBuilder sb = new StringBuilder(12);
            sb.append("-");
            sb.append(incrementAndGet);
            string = sb.toString();
        }
        final String value2 = String.valueOf(string);
        String concat;
        if (value2.length() != 0) {
            concat = value.concat(value2);
        }
        else {
            concat = new String(value);
        }
        return new kiw(this.a.c, runnable, concat);
    }
}
