import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czr implements bqp
{
    public final ConcurrentLinkedQueue a;
    
    public czr() {
        this.a = new ConcurrentLinkedQueue();
    }
    
    @Override
    public final void a() {
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((bqp)iterator.next()).a();
        }
    }
}
