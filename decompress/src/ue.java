import java.lang.reflect.InvocationTargetException;
import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Method;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ue
{
    public static Method a;
    
    static {
        try {
            if (!(ue.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                ue.a.setAccessible(true);
            }
        }
        catch (final NoSuchMethodException ex) {}
    }
    
    public static void a(final View view) {
        try {
            final Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        }
        catch (final IllegalAccessException ex) {}
        catch (final InvocationTargetException ex2) {}
        catch (final NoSuchMethodException ex3) {}
    }
    
    public static boolean b(final View view) {
        return ik.f(view) == 1;
    }
}
