import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eea
{
    private static final Map a;
    
    static {
        a = new HashMap();
    }
    
    public static Object a(final Class clazz) {
        synchronized (eea.class) {
            final Object value = eea.a.get(clazz);
            if (value != null) {
                return value;
            }
            final String name = clazz.getName();
            final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35);
            sb.append("No instance for ");
            sb.append(name);
            sb.append(" has been provided.");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public static void b(final Class clazz, final Object o) {
        synchronized (eea.class) {
            eea.a.put(clazz, o);
        }
    }
}
