import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgx
{
    private final List a;
    
    public bgx() {
        this.a = new ArrayList();
    }
    
    public final avr a(final Class clazz) {
        monitorenter(this);
        try {
            while (true) {
                for (bgw bgw : this.a) {
                    if (bgw.a.isAssignableFrom(clazz)) {
                        final avr b = bgw.b;
                        monitorexit(this);
                        return b;
                    }
                }
                final avr b = null;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final Class clazz, final avr avr) {
        synchronized (this) {
            this.a.add(new bgw(clazz, avr));
        }
    }
}
