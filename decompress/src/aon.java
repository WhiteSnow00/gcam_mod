import java.util.concurrent.Executors;
import java.util.HashMap;
import java.util.concurrent.ThreadFactory;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aon
{
    public final ScheduledExecutorService a;
    public final Map b;
    public final Map c;
    public final Object d;
    private final ThreadFactory e;
    
    static {
        aiy.b("WorkTimer");
    }
    
    public aon() {
        final aok e = new aok();
        this.e = e;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(e);
    }
    
    public final void a(final String s) {
        synchronized (this.d) {
            if (this.b.remove(s) != null) {
                final aiy a = aiy.a();
                String.format("Stopping timer for %s", s);
                a.d(new Throwable[0]);
                this.c.remove(s);
            }
        }
    }
}
