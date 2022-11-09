import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkg
{
    public static final Method a;
    
    static {
        final Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        final int length = methods.length;
        final int n = 0;
        int n2 = 0;
        Method a2;
        while (true) {
            final Method method = null;
            Object o = null;
            if (n2 >= length) {
                a2 = method;
                break;
            }
            final Method method2 = methods[n2];
            method2.getClass();
            if (plr.b(method2.getName(), "addSuppressed")) {
                final Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                parameterTypes.getClass();
                if (parameterTypes.length == 1) {
                    o = parameterTypes[0];
                }
                if (plr.b(o, Throwable.class)) {
                    a2 = method2;
                    break;
                }
            }
            ++n2;
        }
        a = a2;
        for (int length2 = methods.length, i = n; i < length2; ++i) {
            final Method method3 = methods[i];
            method3.getClass();
            if (plr.b(method3.getName(), "getSuppressed")) {
                break;
            }
        }
    }
}
