import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class lho extends lhq
{
    private final pii a;
    private Map b;
    private int c;
    
    public lho(final pii a) {
        this.a = a;
        this.c = 0;
        this.b = new HashMap();
    }
    
    @Override
    public final void a(final Object o, final lhu lhu) {
        synchronized (this) {
            final lic lic = this.b.get(lhu);
            lic lic3;
            if (lic == null) {
                final lic lic2 = (lic)this.a.get();
                this.b.put(lhu, lic2);
                lic3 = lic2;
            }
            else {
                lic3 = lic;
            }
            lic3.a(o);
            ++this.c;
        }
    }
    
    @Override
    public final void b(final lih lih, final lhz lhz) {
        monitorenter(this);
        try {
            if (this.c == 0) {
                monitorexit(this);
                return;
            }
            final Map b = this.b;
            this.b = new HashMap();
            this.c = 0;
            monitorexit(this);
            lih.a(lhz);
            for (final Map.Entry<K, lic> entry : b.entrySet()) {
                entry.getValue().b(lih, ((lhu)entry.getKey()).b);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
