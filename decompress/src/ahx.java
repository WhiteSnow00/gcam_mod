import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahx implements aho
{
    public final aho a;
    public final ReentrantLock b;
    public final WeakHashMap c;
    
    public ahx(final aho a) {
        this.a = a;
        this.b = new ReentrantLock();
        this.c = new WeakHashMap();
    }
}
