import java.lang.reflect.InvocationTargetException;
import android.os.IInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kaf
{
    private static final Object a;
    private static volatile kac b;
    
    static {
        a = new Object();
    }
    
    private kaf() {
    }
    
    public static IInterface a(final Context context, final String s, final kae kae) {
        kac kac;
        if ((kac = kaf.b) == null) {
            synchronized (kaf.a) {
                if ((kac = kaf.b) == null) {
                    kac = (kaf.b = b(context));
                }
            }
        }
        return kac.a(context, s, kae);
    }
    
    private static kac b(Context ex) {
        Label_0026: {
            try {
                final Class<?> clazz = kaf.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
                break Label_0026;
            }
            catch (final ClassNotFoundException ex2) {
                try {
                    final Class<?> clazz = kaf.class.getClassLoader().loadClass("kab");
                    try {
                        ex = (InvocationTargetException)clazz.getConstructor(Context.class).newInstance(ex);
                        return (kac)ex;
                    }
                    catch (final InvocationTargetException ex) {}
                    catch (final NoSuchMethodException ex) {}
                    catch (final InstantiationException ex) {}
                    catch (final IllegalAccessException ex3) {}
                    final String value = String.valueOf(ex.getMessage());
                    String concat;
                    if (value.length() != 0) {
                        concat = "Failed to create dynamite loader instance: ".concat(value);
                    }
                    else {
                        concat = new String("Failed to create dynamite loader instance: ");
                    }
                    throw new kad(concat, ex);
                }
                catch (final ClassNotFoundException ex4) {
                    final String value2 = String.valueOf(ex4.getMessage());
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "No dynamite loader found: ".concat(value2);
                    }
                    else {
                        concat2 = new String("No dynamite loader found: ");
                    }
                    throw new kad(concat2, ex4);
                }
            }
        }
    }
}
