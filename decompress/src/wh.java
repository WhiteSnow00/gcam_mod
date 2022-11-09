import java.util.Iterator;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wh
{
    public final ArrayDeque a;
    private final Runnable b;
    
    public wh() {
        this(null);
    }
    
    public wh(final Runnable b) {
        this.a = new ArrayDeque();
        this.b = b;
    }
    
    public final void a() {
        final Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            final wf wf = (wf)descendingIterator.next();
            if (wf.a) {
                final fi c = wf.c;
                c.Z(true);
                if (c.e.a) {
                    c.U();
                    return;
                }
                c.d.a();
                return;
            }
        }
        this.b.run();
    }
}
