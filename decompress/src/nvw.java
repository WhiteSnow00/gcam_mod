// 
// Decompiled by Procyon v0.6.0
// 

public final class nvw
{
    private static final String[] a;
    private static final nvx b;
    
    static {
        final String[] array = a = new String[] { "com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter" };
        while (true) {
            for (int i = 0; i < 2; ++i) {
                final String s = array[i];
                nvx b2;
                try {
                    final nvx nvx = (nvx)Class.forName(s).asSubclass(nvx.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                }
                finally {
                    b2 = null;
                }
                if (b2 != null) {
                    b = b2;
                    return;
                }
            }
            nvx b2 = new nvy();
            continue;
        }
    }
    
    public static StackTraceElement a(final Class clazz) {
        oce.g(clazz, "target");
        return nvw.b.a(clazz);
    }
    
    public static StackTraceElement[] b(final Class clazz, final int n) {
        if (n <= 0 && n != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return nvw.b.b(clazz, n);
    }
}
