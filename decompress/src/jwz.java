import android.os.Looper;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwz
{
    private static volatile ClassLoader a;
    private static volatile Thread b;
    
    static {
        jwz.a = null;
        jwz.b = null;
    }
    
    public static ClassLoader a() {
        synchronized (jwz.class) {
            if (jwz.a == null) {
                jwz.a = b();
            }
            return jwz.a;
        }
    }
    
    private static ClassLoader b() {
        monitorenter(jwz.class);
        try {
            final Thread b = jwz.b;
            final ClassLoader classLoader = null;
            ClassLoader contextClassLoader = null;
            while (true) {
                Label_0037: {
                    if (b != null) {
                        break Label_0037;
                    }
                    jwz.b = c();
                    if (jwz.b != null) {
                        break Label_0037;
                    }
                    monitorexit(jwz.class);
                    return contextClassLoader;
                }
                final Thread b2 = jwz.b;
                monitorenter(b2);
                try {
                    try {
                        contextClassLoader = jwz.b.getContextClassLoader();
                    }
                    finally {
                        monitorexit(b2);
                        monitorexit(b2);
                        continue;
                        final String s;
                        String concat = "Failed to get thread context classloader ".concat(s);
                        Label_0093: {
                            break Label_0093;
                            concat = new String("Failed to get thread context classloader ");
                        }
                        Log.w("DynamiteLoaderV2CL", concat);
                        contextClassLoader = classLoader;
                    }
                }
                catch (final SecurityException ex) {}
                break;
            }
        }
        finally {
            monitorexit(jwz.class);
            while (true) {}
        }
    }
    
    private static Thread c() {
        monitorenter(jwz.class);
        try {
            final ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup == null) {
                monitorexit(jwz.class);
                return null;
            }
            monitorenter(Void.class);
            try {
            Label_0256:
                while (true) {
                    try {
                        final int activeGroupCount = threadGroup.activeGroupCount();
                        final ThreadGroup[] array = new ThreadGroup[activeGroupCount];
                        threadGroup.enumerate(array);
                        final int n = 0;
                        for (final ThreadGroup threadGroup2 : array) {
                            if ("dynamiteLoader".equals(threadGroup2.getName())) {
                                ThreadGroup threadGroup3 = threadGroup2;
                                if (threadGroup2 == null) {
                                    threadGroup3 = new ThreadGroup(threadGroup, "dynamiteLoader");
                                }
                                final int activeCount = threadGroup3.activeCount();
                                final Thread[] array2 = new Thread[activeCount];
                                threadGroup3.enumerate(array2);
                                while (true) {
                                    for (int j = n; j < activeCount; ++j) {
                                        Thread thread = array2[j];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            if (thread == null) {
                                                try {
                                                    final jwy jwy = new jwy(threadGroup3);
                                                    try {
                                                        jwy.setContextClassLoader(null);
                                                        jwy.start();
                                                        thread = jwy;
                                                    }
                                                    catch (final SecurityException ex) {
                                                        thread = jwy;
                                                    }
                                                }
                                                catch (final SecurityException ex) {
                                                    break Label_0256;
                                                }
                                            }
                                            break Label_0256;
                                        }
                                    }
                                    Thread thread = null;
                                    continue;
                                }
                            }
                        }
                        ThreadGroup threadGroup2 = null;
                    }
                    finally {
                        monitorexit(Void.class);
                        monitorexit(Void.class);
                        monitorexit(jwz.class);
                        return;
                        final String value;
                        String concat = "Failed to enumerate thread/threadgroup ".concat(value);
                        Label_0249: {
                            break Label_0249;
                            Label_0239: {
                                concat = new String("Failed to enumerate thread/threadgroup ");
                            }
                        }
                        Log.w("DynamiteLoaderV2CL", concat);
                        continue Label_0256;
                        final SecurityException ex;
                        value = String.valueOf(ex.getMessage());
                        iftrue(Label_0239:)(value.length() == 0);
                    }
                    break;
                }
            }
            catch (final SecurityException ex2) {}
        }
        finally {
            monitorexit(jwz.class);
            while (true) {}
        }
    }
}
