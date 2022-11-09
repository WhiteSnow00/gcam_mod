import java.util.ArrayList;
import java.util.Iterator;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lya
{
    public static volatile boolean a;
    public static final Map b;
    private static volatile boolean c;
    
    static {
        lya.a = false;
        lya.c = false;
        b = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public static int a(long a) {
        final Map b = lya.b;
        synchronized (b) {
            final Iterator iterator = b.values().iterator();
            if (!iterator.hasNext()) {
                return 0;
            }
            a = ((lxz)iterator.next()).a;
            throw null;
        }
    }
    
    public static void b(long a) {
        final ArrayList list = new ArrayList();
        Object o = lya.b;
        monitorenter(o);
        try {
            final Iterator iterator = ((Map)o).entrySet().iterator();
            if (!iterator.hasNext()) {
                monitorexit(o);
                for (int size = list.size(), i = 0; i < size; ++i) {
                    o = list.get(i);
                    lya.b.remove(o);
                }
                return;
            }
            a = ((Map.Entry<K, lxz>)iterator.next()).getValue().a;
            throw null;
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public static void c() {
    }
    
    public static void d() {
    }
}
