import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nuf extends nug
{
    private final Map a;
    
    public nuf(final ntp ntp, final ntp ntp2) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, ntp);
        d(linkedHashMap, ntp2);
        for (final Map.Entry<nsx, V> entry : linkedHashMap.entrySet()) {
            if (entry.getKey().b) {
                entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
            }
        }
        this.a = Collections.unmodifiableMap((Map<?, ?>)linkedHashMap);
    }
    
    private static void d(final Map map, final ntp ntp) {
        for (int i = 0; i < ntp.b(); ++i) {
            final nsx c = ntp.c(i);
            final Object value = map.get(c);
            if (c.b) {
                List list;
                if ((list = (List)value) == null) {
                    list = new ArrayList();
                    map.put(c, list);
                }
                list.add(c.d(ntp.e(i)));
            }
            else {
                map.put(c, c.d(ntp.e(i)));
            }
        }
    }
    
    @Override
    public final int a() {
        return this.a.size();
    }
    
    @Override
    public final Set b() {
        return this.a.keySet();
    }
    
    @Override
    public final void c(final ntw ntw, final Object o) {
        for (final Map.Entry<nsx, V> entry : this.a.entrySet()) {
            final nsx nsx = entry.getKey();
            final V value = entry.getValue();
            if (nsx.b) {
                ntw.b(nsx, ((List)value).iterator(), o);
            }
            else {
                ntw.a(nsx, value, o);
            }
        }
    }
}
