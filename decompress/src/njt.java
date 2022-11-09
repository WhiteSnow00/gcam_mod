import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njt
{
    private static final Object a;
    
    static {
        final Object o = a = e();
        if (o != null) {
            f("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (o == null) {
            return;
        }
        g(o);
    }
    
    @Deprecated
    public static RuntimeException a(final Throwable t) {
        d(t);
        throw new RuntimeException(t);
    }
    
    public static String b(final Throwable t) {
        final StringWriter stringWriter = new StringWriter();
        t.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
    
    public static void c(final Throwable t, final Class clazz) {
        if (!clazz.isInstance(t)) {
            d(t);
            return;
        }
        throw (Throwable)clazz.cast(t);
    }
    
    public static void d(final Throwable t) {
        t.getClass();
        if (t instanceof RuntimeException) {
            throw (RuntimeException)t;
        }
        if (!(t instanceof Error)) {
            return;
        }
        throw (Error)t;
    }
    
    private static Object e() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (final ThreadDeath threadDeath) {
            throw threadDeath;
        }
        finally {
            return null;
        }
    }
    
    private static Method f(final String s, final Class... array) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(s, (Class<?>[])array);
        }
        catch (final ThreadDeath threadDeath) {
            throw threadDeath;
        }
        finally {
            return null;
        }
    }
    
    private static void g(final Object o) {
        try {
            final Method f = f("getStackTraceDepth", Throwable.class);
            if (f == null) {
                return;
            }
            f.invoke(o, new Throwable());
        }
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex2) {}
        catch (final UnsupportedOperationException ex3) {}
    }
}
