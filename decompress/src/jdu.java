import java.util.TreeMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdu
{
    private static final TreeMap a;
    
    static {
        a = new TreeMap();
    }
    
    public static long a(long n) {
        synchronized (jdu.class) {
            final Long n2 = jdu.a.get(n);
            if (n2 != null) {
                n = n2;
            }
            else {
                n = System.currentTimeMillis();
            }
            return n;
        }
    }
    
    public static void b(final long n) {
        monitorenter(jdu.class);
        try {
            final TreeMap a = jdu.a;
            final Long value = n;
            if (!a.containsKey(value)) {
                a.put(value, System.currentTimeMillis());
            }
            while (true) {
                final TreeMap a2 = jdu.a;
                if (a2.size() <= 1800) {
                    break;
                }
                a2.pollFirstEntry();
            }
            monitorexit(jdu.class);
        }
        finally {
            monitorexit(jdu.class);
            while (true) {}
        }
    }
}
