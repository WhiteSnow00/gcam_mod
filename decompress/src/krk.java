import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krk
{
    public static final Object a;
    public static final Map b;
    public static final Map c;
    
    static {
        a = new Object();
        b = new HashMap();
        c = new HashMap();
    }
    
    private krk() {
    }
    
    public static void a(final Class clazz) {
        b(clazz, null);
    }
    
    public static void b(final Class clazz, String o) {
        Object o2 = krk.a;
        synchronized (o2) {
            final String s = krk.c.get(clazz);
            if (s != null) {
                o = krk.b.get(s);
            }
            else if (o != null) {
                final Map b = krk.b;
                krj krj;
                if ((krj = b.get(o)) == null) {
                    krj = new krj((String)o);
                    b.put(o, krj);
                }
                o = krj;
            }
            else {
                o = null;
            }
            monitorexit(o2);
            if (o == null) {
                final String value = String.valueOf(clazz.getName());
                String concat;
                if (value.length() != 0) {
                    concat = "JniLoader was null for ".concat(value);
                }
                else {
                    concat = new String("JniLoader was null for ");
                }
                throw new IllegalStateException(concat);
            }
            try {
                ((krj)o).b();
            }
            catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                o2 = System.mapLibraryName(((krj)o).a);
                final String message = unsatisfiedLinkError.getMessage();
                if (message != null) {
                    final StringBuilder sb = new StringBuilder(String.valueOf(o2).length() + 16);
                    sb.append("couldn't find \"");
                    sb.append((String)o2);
                    sb.append("\"");
                    if (message.contains(sb.toString())) {
                        throw new UnsatisfiedLinkError(String.format(null, "Failed to resolve \"%s\" for \"%s\". Did you forget to include the .so or register it with %s.register(%s.class, %s)? \n%s", o2, clazz.getSimpleName(), krk.class.getSimpleName(), clazz.getSimpleName(), ((krj)o).a, unsatisfiedLinkError.getMessage()));
                    }
                }
                throw unsatisfiedLinkError;
            }
        }
    }
}
