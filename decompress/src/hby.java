import java.util.concurrent.atomic.AtomicBoolean;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hby
{
    public static final nsd a;
    public final ReentrantReadWriteLock b;
    public final ConcurrentHashMap c;
    public final jdr d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/rewind/RewindBuffer");
    }
    
    public hby() {
        this.d = jxc.l(new hbx());
        this.b = new ReentrantReadWriteLock();
        this.c = new ConcurrentHashMap();
        new AtomicBoolean(false);
    }
}
