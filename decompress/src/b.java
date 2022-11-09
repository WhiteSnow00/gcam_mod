import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b
{
    public final Map a;
    final Map b;
    
    public b(final Map b) {
        this.b = b;
        this.a = new HashMap();
        for (final Map.Entry<K, g> entry : b.entrySet()) {
            final g g = entry.getValue();
            List list = this.a.get(g);
            if (list == null) {
                list = new ArrayList();
                this.a.put(g, list);
            }
            list.add(entry.getKey());
        }
    }
    
    public static void a(final List list, final k k, final g g, final Object o) {
        if (list != null) {
            int i = list.size() - 1;
            while (i >= 0) {
                final c c = list.get(i);
                try {
                    switch (c.a) {
                        default: {
                            c.b.invoke(o, k, g);
                            break;
                        }
                        case 1: {
                            c.b.invoke(o, k);
                            break;
                        }
                        case 0: {
                            c.b.invoke(o, new Object[0]);
                            break;
                        }
                    }
                    --i;
                    continue;
                }
                catch (final IllegalAccessException ex) {
                    throw new RuntimeException(ex);
                }
                catch (final InvocationTargetException ex2) {
                    throw new RuntimeException("Failed to call observer method", ex2.getCause());
                }
                break;
            }
        }
    }
}
