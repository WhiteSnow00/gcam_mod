import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqq
{
    private static ClassLoader a;
    private static volatile int b;
    
    static {
        lqq.b = 1;
    }
    
    static boolean a() {
        if (lqq.b == 1) {
            f();
        }
        return lqq.b == 3;
    }
    
    static boolean b() {
        if (lqq.b == 1) {
            f();
        }
        return lqq.b == 2;
    }
    
    static boolean c() {
        if (lqq.b == 1) {
            f();
        }
        return lqq.b == 5;
    }
    
    static void d() {
        if (lqq.b == 1) {
            f();
        }
    }
    
    static void e() {
        "robolectric".equals(Build.FINGERPRINT);
    }
    
    private static void f() {
        synchronized (lqq.class) {
            if (lqq.b != 1) {
                return;
            }
            if (lqq.a == null) {
                if ((lqq.a = lqp.class.getClassLoader()) == null) {
                    throw new RuntimeException("Classloader is null! This should never happen.");
                }
            }
            try {
                lqq.a.loadClass("com.google.android.libraries.lens.lenslite.configs.ReleaseLite");
                lqq.b = 4;
            }
            catch (final Exception ex) {
                try {
                    lqq.a.loadClass("com.google.android.libraries.lens.lenslite.configs.LinkZero");
                    lqq.b = 5;
                }
                catch (final Exception ex2) {
                    try {
                        lqq.a.loadClass("com.google.android.libraries.lens.lenslite.configs.Kent");
                        lqq.b = 6;
                    }
                    catch (final Exception ex3) {
                        try {
                            lqq.a.loadClass("com.google.android.libraries.lens.lenslite.configs.Experimental");
                            lqq.b = 2;
                        }
                        catch (final Exception ex4) {
                            try {
                                lqq.a.loadClass("com.google.android.libraries.lens.lenslite.configs.Dev");
                                lqq.b = 3;
                            }
                            catch (final Exception ex5) {
                                ex5.printStackTrace();
                                throw new RuntimeException("Failed to determine build type.", ex5);
                            }
                        }
                    }
                }
            }
        }
    }
}
