import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrh
{
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int b(final int n) {
        return n - 2;
    }
    
    public static final int c(final lqv ex) {
        try {
            return (int)f((lqv)ex).getDeclaredField("MIN_VERSION").getLong(null);
        }
        catch (final IllegalAccessException ex) {}
        catch (final NoSuchFieldException ex2) {}
        throw new lqx("Failed to read host package version", ex);
    }
    
    public static final int d(final lqv ex) {
        try {
            return (int)f((lqv)ex).getDeclaredField("CURRENT_VERSION").getLong(null);
        }
        catch (final IllegalAccessException ex) {}
        catch (final NoSuchFieldException ex2) {}
        throw new lqx("Failed to read host package version", ex);
    }
    
    public static String e(final String s, final Object... array) {
        try {
            return String.format(Locale.US, s, array);
        }
        catch (final RuntimeException ex) {
            return String.format(Locale.US, "Unable to format log message: '%s' error:'%s'", s, ex);
        }
    }
    
    private static final Class f(final lqv lqv) {
        try {
            return lqv.b("com.google.android.libraries.lens.lenslite.dynamicloading.PackageVersion");
        }
        catch (final lqx lqx) {
            return lqv.b("com.google.android.libraries.lens.lenslite.dynamicloading.ApiVersion");
        }
    }
}
