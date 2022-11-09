import java.lang.reflect.InvocationTargetException;
import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class dap
{
    private static void a(final Class clazz, final Exception ex) {
        final String value = String.valueOf(clazz);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(value);
        throw new RuntimeException(sb.toString(), ex);
    }
    
    public static void c(final krr krr, final oey oey, final String s, final String s2) {
        ofi.w(oey, new dao(krr, s, s2), odx.a);
    }
    
    public static GlideConfiguration d(String s) {
        try {
            final Class<?> forName = Class.forName(s);
            s = null;
            try {
                s = (String)forName.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            }
            catch (final InvocationTargetException ex) {
                a(forName, ex);
            }
            catch (final NoSuchMethodException ex2) {
                a(forName, ex2);
            }
            catch (final IllegalAccessException ex3) {
                a(forName, ex3);
            }
            catch (final InstantiationException ex4) {
                a(forName, ex4);
            }
            if (s instanceof GlideConfiguration) {
                return (GlideConfiguration)s;
            }
            s = String.valueOf(s);
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 44);
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(s);
            throw new RuntimeException(sb.toString());
        }
        catch (final ClassNotFoundException ex5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", ex5);
        }
    }
}
