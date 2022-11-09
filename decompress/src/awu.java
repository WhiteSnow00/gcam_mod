import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awu
{
    private static final awq a;
    private final Map b;
    
    static {
        a = new aws();
    }
    
    public awu() {
        this.b = new HashMap();
    }
    
    public final awr a(final Object o) {
        monitorenter(this);
        try {
            bit.a(o);
            awq awq = this.b.get(o.getClass());
            if (awq == null) {
                for (final awq awq2 : this.b.values()) {
                    if (awq2.b().isAssignableFrom(o.getClass())) {
                        awq = awq2;
                        break;
                    }
                }
            }
            awq a;
            if ((a = awq) == null) {
                a = awu.a;
            }
            final awr a2 = a.a(o);
            monitorexit(this);
            return a2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final awq awq) {
        synchronized (this) {
            this.b.put(awq.b(), awq);
        }
    }
}
