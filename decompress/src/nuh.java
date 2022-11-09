import java.lang.reflect.InvocationTargetException;

// 
// Decompiled by Procyon v0.6.0
// 

final class nuh
{
    public static final nuj a;
    
    static {
        a = a(nuj.d);
    }
    
    private static nuj a(final String[] array) {
        nuj f;
        try {
            f = nvb.f();
        }
        catch (final NoClassDefFoundError noClassDefFoundError) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        final StringBuilder sb = new StringBuilder();
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final String s = array[i];
            try {
                return (nuj)Class.forName(s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            finally {
                final Throwable t;
                Throwable cause = t;
                if (t instanceof InvocationTargetException) {
                    cause = t.getCause();
                }
                sb.append('\n');
                sb.append(s);
                sb.append(": ");
                sb.append(cause);
                ++i;
                continue;
            }
            break;
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
