import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gyw implements gyu
{
    public final gyt a;
    public final Object b;
    
    public gyw() {
        njo.d(true);
        this.b = new Object();
        this.a = new gyt();
    }
    
    protected abstract Object a(final Object p0);
    
    protected Object b(final Object o) {
        throw null;
    }
    
    @Override
    public final gyv c(final Object o) {
        Object o2 = this.b;
        synchronized (o2) {
            final gyt a = this.a;
            synchronized (a.a) {
                Object remove;
                if (a.b.removeLastOccurrence(o)) {
                    final Queue queue = a.c.get(o);
                    queue.getClass();
                    remove = queue.remove();
                    final int d = a.d;
                    gyt.a();
                    a.d = d - 1;
                }
                else {
                    remove = null;
                }
                monitorexit(a.a);
                monitorexit(o2);
                o2 = remove;
                if (remove == null) {
                    o2 = this.a(o);
                }
                return new gyv(this, o, o2);
            }
        }
    }
}
