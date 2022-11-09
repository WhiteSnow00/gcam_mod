import java.util.Collection;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nrj extends nrd implements Queue
{
    private static final long serialVersionUID = 0L;
    
    public nrj(final Queue queue) {
        super(queue, null);
    }
    
    final Queue b() {
        return (Queue)super.a();
    }
    
    @Override
    public final Object element() {
        synchronized (this.h) {
            return this.b().element();
        }
    }
    
    @Override
    public final boolean offer(final Object o) {
        synchronized (this.h) {
            return this.b().offer(o);
        }
    }
    
    @Override
    public final Object peek() {
        synchronized (this.h) {
            return this.b().peek();
        }
    }
    
    @Override
    public final Object poll() {
        synchronized (this.h) {
            return this.b().poll();
        }
    }
    
    @Override
    public final Object remove() {
        synchronized (this.h) {
            return this.b().remove();
        }
    }
}
