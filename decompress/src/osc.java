import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osc
{
    public final HashMap a;
    public final HashMap b;
    
    public osc() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public osc(final osc osc) {
        this.a = new HashMap(osc.a);
        final HashMap b = new HashMap(osc.b);
        this.b = b;
        final Iterator iterator = b.entrySet().iterator();
        while (iterator.hasNext()) {
            if (((Map.Entry<K, orz>)iterator.next()).getValue().e.get()) {
                iterator.remove();
            }
        }
    }
}
