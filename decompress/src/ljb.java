import android.util.Log;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljb
{
    private final Method a;
    
    public ljb() {
        Method method = null;
        Method a = null;
        Label_0160: {
            Class<?> forName = null;
            Method method2 = null;
            try {
                forName = Class.forName("android.os.SystemProperties");
                method2 = (method = forName.getMethod("get", String.class, String.class));
                try {
                    final Class clazz = forName;
                    final String s = "set";
                    final int n = 2;
                    final Class[] array = new Class[n];
                    final int n2 = 0;
                    final Class<String> clazz2 = String.class;
                    array[n2] = clazz2;
                    final int n3 = 1;
                    final Class<String> clazz3 = String.class;
                    array[n3] = clazz3;
                    clazz.getMethod(s, (Class[])array);
                    method = method2;
                    final Class clazz4 = forName;
                    final String s2 = "getInt";
                    final int n4 = 2;
                    final Class[] array2 = new Class[n4];
                    final int n5 = 0;
                    final Class<String> clazz5 = String.class;
                    array2[n5] = clazz5;
                    final int n6 = 1;
                    final Class<Integer> clazz6 = Integer.TYPE;
                    array2[n6] = clazz6;
                    clazz4.getMethod(s2, (Class[])array2);
                    method = method2;
                    final Class clazz7 = forName;
                    final String s3 = "getLong";
                    final int n7 = 2;
                    final Class[] array3 = new Class[n7];
                    final int n8 = 0;
                    final Class<String> clazz8 = String.class;
                    array3[n8] = clazz8;
                    final int n9 = 1;
                    final Class<Long> clazz9 = Long.TYPE;
                    array3[n9] = clazz9;
                    clazz7.getMethod(s3, (Class[])array3);
                    final ljb ljb = this;
                    final Method method3 = method2;
                    ljb.a = method3;
                    return;
                }
                catch (final Exception ex) {}
            }
            catch (final Exception ex) {}
            finally {
                final Method method4;
                method = method4;
                break Label_0160;
            }
            try {
                final Class clazz = forName;
                final String s = "set";
                final int n = 2;
                final Class[] array = new Class[n];
                final int n2 = 0;
                final Class<String> clazz2 = String.class;
                array[n2] = clazz2;
                final int n3 = 1;
                final Class<String> clazz3 = String.class;
                array[n3] = clazz3;
                clazz.getMethod(s, (Class[])array);
                method = method2;
                final Class clazz4 = forName;
                final String s2 = "getInt";
                final int n4 = 2;
                final Class[] array2 = new Class[n4];
                final int n5 = 0;
                final Class<String> clazz5 = String.class;
                array2[n5] = clazz5;
                final int n6 = 1;
                final Class<Integer> clazz6 = Integer.TYPE;
                array2[n6] = clazz6;
                clazz4.getMethod(s2, (Class[])array2);
                method = method2;
                final Class clazz7 = forName;
                final String s3 = "getLong";
                final int n7 = 2;
                final Class[] array3 = new Class[n7];
                final int n8 = 0;
                final Class<String> clazz8 = String.class;
                array3[n8] = clazz8;
                final int n9 = 1;
                final Class<Long> clazz9 = Long.TYPE;
                array3[n9] = clazz9;
                clazz7.getMethod(s3, (Class[])array3);
                final ljb ljb = this;
                final Method method3 = method2;
                ljb.a = method3;
                return;
                method = method2;
                method = method2;
                final Exception ex;
                final IllegalStateException ex2 = new IllegalStateException("Unable to reflect SystemProperties.", ex);
                method = method2;
                throw ex2;
            }
            finally {
                a = method;
            }
        }
        this.a = a;
    }
    
    public final String a(String s) {
        s.getClass();
        final String s2 = null;
        try {
            final Method a = this.a;
            if (a != null) {
                s = (String)a.invoke(null, s, null);
                if ("".equals(s)) {
                    return null;
                }
            }
            else {
                s = s2;
            }
            return s;
        }
        catch (final Exception ex) {
            Log.e("CAM_SystemProperties", "get error", (Throwable)ex);
            return null;
        }
    }
}
