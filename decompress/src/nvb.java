import com.google.common.flogger.backend.system.DefaultPlatform;
import com.google.common.flogger.backend.google.GooglePlatform;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;

// 
// Decompiled by Procyon v0.6.0
// 

public class nvb
{
    public static String d(String concat, String value, final boolean b) {
        String substring = value;
        Label_0080: {
            if (((String)concat).length() + value.length() > 23) {
                int i = value.length();
                final int n = -1;
                --i;
                while (true) {
                    while (i >= 0) {
                        final char char1 = value.charAt(i);
                        if (char1 == '.' || char1 == '$') {
                            substring = value.substring(i + 1);
                            break Label_0080;
                        }
                        --i;
                    }
                    i = n;
                    continue;
                }
            }
        }
        value = String.valueOf(substring);
        if (value.length() != 0) {
            concat = ((String)concat).concat(value);
        }
        else {
            concat = new String((String)concat);
        }
        if (!b) {
            return (String)concat;
        }
        return ((String)concat).substring(0, Math.min(((String)concat).length(), 23));
    }
    
    public static int e(final Level level) {
        final int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        if (intValue >= Level.FINE.intValue()) {
            return 3;
        }
        return 2;
    }
    
    public static nuj f() {
        try {
            return nut.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final NoSuchMethodException ex) {}
        catch (final InvocationTargetException ex2) {}
        catch (final InstantiationException ex3) {}
        catch (final IllegalAccessException ex4) {}
        catch (final NoClassDefFoundError noClassDefFoundError) {}
        try {
            return (nuj)GooglePlatform.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final NoSuchMethodException ex5) {}
        catch (final InvocationTargetException ex6) {}
        catch (final InstantiationException ex7) {}
        catch (final IllegalAccessException ex8) {}
        catch (final NoClassDefFoundError noClassDefFoundError2) {}
        try {
            return (nuj)DefaultPlatform.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final NoSuchMethodException ex9) {}
        catch (final InvocationTargetException ex10) {}
        catch (final InstantiationException ex11) {}
        catch (final IllegalAccessException ex12) {}
        catch (final NoClassDefFoundError noClassDefFoundError3) {}
        return null;
    }
    
    public static void g(final nse nse) {
        oce.g(nse, "lazy arg");
    }
    
    public static int h(final int n) {
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
    
    public static int i(final int n) {
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
    
    public static int j(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 3: {
                return 4;
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
    
    public static int k(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
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
    
    public ntp a() {
        return nto.a;
    }
    
    public nvk b() {
        return nvk.b;
    }
    
    public void c(final String s, final Level level, final boolean b) {
    }
}
