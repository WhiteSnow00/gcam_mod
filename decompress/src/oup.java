import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oup extends ouk
{
    static {
        ouo.a(Collections.emptyMap());
    }
    
    public oup(final Map map) {
        super(map);
    }
    
    public final Map a() {
        final LinkedHashMap i = pjv.i(super.a.size());
        for (final Map.Entry<Object, V> entry : super.a.entrySet()) {
            i.put(entry.getKey(), ((pii)entry.getValue()).get());
        }
        return Collections.unmodifiableMap((Map<?, ?>)i);
    }
}
