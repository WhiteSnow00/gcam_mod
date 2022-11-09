import java.util.Iterator;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqw
{
    private final ArrayDeque a;
    private float b;
    
    public kqw() {
        this.a = new ArrayDeque();
        this.b = 0.0f;
    }
    
    public final void a(final kqv kqv) {
        monitorenter(this);
        try {
            njo.e(true, "Sample cannot be null");
            this.b += kqv.b;
            this.a.add(kqv);
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final kqv kqv2 = (kqv)iterator.next();
                if (kqv2.a + 1000000L >= kqv.a) {
                    break;
                }
                iterator.remove();
                this.b -= kqv2.b;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
