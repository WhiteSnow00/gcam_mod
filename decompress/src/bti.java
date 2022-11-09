import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bti
{
    private final List a;
    
    public bti() {
        this.a = new ArrayList();
    }
    
    public final void a() {
        final List a = this.a;
        monitorenter(a);
        try {
            for (final bth bth : this.a) {
                bth.a.aR(bth.b);
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void b(final klv klv) {
        synchronized (this.a) {
            this.a.add(new bth(klv));
        }
    }
}
