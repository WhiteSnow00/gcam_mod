import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcz
{
    private final Map a;
    
    public jcz() {
        this.a = new HashMap();
    }
    
    public final float a(final jcy jcy, float n) {
        monitorenter(this);
        final boolean b = true;
        boolean b2;
        if (n >= 0.0f) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        try {
            njo.d(b2);
            this.a.put(jcy, n);
            final Iterator iterator = this.a.entrySet().iterator();
            n = 0.0f;
            float n2 = 0.0f;
            while (iterator.hasNext()) {
                final Map.Entry<jcy, V> entry = (Map.Entry<jcy, V>)iterator.next();
                final jcy jcy2 = entry.getKey();
                final float floatValue = (float)entry.getValue();
                final float a = jcy2.a;
                n2 += floatValue * a;
                n += a;
            }
            njo.p(n > 0.0f && b, "No progress to calculate");
            n = n2 / n;
            monitorexit(this);
            return n;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
