import java.util.Queue;
import java.util.LinkedList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyv implements krc
{
    private final Object a;
    private final gyw b;
    private Object c;
    private Object d;
    
    public gyv(final gyw b, final Object c, final Object d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = new Object();
    }
    
    public final Object a() {
        synchronized (this.a) {
            return this.d;
        }
    }
    
    @Override
    public final void close() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final Object d = this.d;
            Label_0325: {
                if (d != null) {
                    final gyw b = this.b;
                    final Object c = this.c;
                    synchronized (b.b) {
                        final gyt a2 = b.a;
                        final Object b2 = b.b(d);
                        c.getClass();
                        synchronized (a2.a) {
                            a2.b.push(c);
                            Queue<?> queue;
                            if (!a2.c.containsKey(c)) {
                                queue = new LinkedList<Object>();
                                a2.c.put(c, queue);
                            }
                            else {
                                queue = a2.c.get(c);
                            }
                            queue.add(b2);
                            final int d2 = a2.d;
                            gyt.a();
                            a2.d = d2 + 1;
                            while (a2.d > 2 && !a2.b.isEmpty()) {
                                final Object removeLast = a2.b.removeLast();
                                if (removeLast == null) {
                                    break;
                                }
                                final Queue queue2 = a2.c.get(removeLast);
                                queue2.getClass();
                                queue2.remove();
                                if (queue2.size() <= 0) {
                                    a2.c.remove(removeLast);
                                }
                                final int d3 = a2.d;
                                gyt.a();
                                a2.d = d3 - 1;
                            }
                            if (a2.d >= 0 && (!a2.b.isEmpty() || a2.d == 0)) {
                                monitorexit(a2.a);
                                monitorexit(b.b);
                                this.d = null;
                                this.c = null;
                                break Label_0325;
                            }
                            throw new IllegalStateException("LruPool.sizeOf() is reporting inconsistent results!");
                        }
                    }
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
