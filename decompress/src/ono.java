import java.lang.reflect.Field;
import sun.misc.Unsafe;
import java.security.PrivilegedExceptionAction;

// 
// Decompiled by Procyon v0.6.0
// 

final class ono implements PrivilegedExceptionAction
{
    public ono() {
    }
    
    public static final Unsafe a() {
        for (final Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            final Object value = field.get(null);
            if (Unsafe.class.isInstance(value)) {
                return Unsafe.class.cast(value);
            }
        }
        return null;
    }
}
