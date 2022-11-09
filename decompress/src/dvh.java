import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvh
{
    public static final long a;
    public HashMap b;
    
    static {
        a = TimeUnit.SECONDS.toNanos(1L);
    }
    
    public dvh(final klj klj, final Executor executor, final kjk kjk) {
        this.b = new HashMap();
        kjk.c(klj.a(new dvg(this), executor));
    }
}
