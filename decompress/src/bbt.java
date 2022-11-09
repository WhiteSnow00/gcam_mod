import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbt
{
    private static final Queue a;
    private int b;
    private int c;
    private Object d;
    
    static {
        a = biv.h(0);
    }
    
    private bbt() {
    }
    
    public static bbt b(final Object d) {
        Object a = bbt.a;
        synchronized (a) {
            final bbt bbt = ((Queue<bbt>)a).poll();
            monitorexit(a);
            a = bbt;
            if (bbt == null) {
                a = new bbt();
            }
            ((bbt)a).d = d;
            ((bbt)a).c = 0;
            ((bbt)a).b = 0;
            return (bbt)a;
        }
    }
    
    public final void a() {
        final Queue a = bbt.a;
        synchronized (a) {
            a.offer(this);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof bbt) {
            final bbt bbt = (bbt)o;
            final int c = bbt.c;
            final int b = bbt.b;
            if (this.d.equals(bbt.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }
}
