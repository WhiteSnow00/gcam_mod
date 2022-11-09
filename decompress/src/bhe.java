import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhe
{
    private final List a;
    
    public bhe() {
        this.a = new ArrayList();
    }
    
    public final awj a(final Class clazz) {
        monitorenter(this);
        try {
            while (true) {
                for (int size = this.a.size(), i = 0; i < size; ++i) {
                    final bhd bhd = this.a.get(i);
                    if (bhd.a.isAssignableFrom(clazz)) {
                        final awj b = bhd.b;
                        monitorexit(this);
                        return b;
                    }
                }
                final awj b = null;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void b(final Class clazz, final awj awj) {
        synchronized (this) {
            this.a.add(new bhd(clazz, awj));
        }
    }
}
