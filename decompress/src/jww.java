import java.lang.reflect.Field;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jww extends bjf implements jwx
{
    private final Object a;
    
    public jww() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }
    
    private jww(final Object a) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = a;
    }
    
    public static jwx b(final Object o) {
        return new jww(o);
    }
    
    public static Object c(final jwx jwx) {
        if (jwx instanceof jww) {
            return ((jww)jwx).a;
        }
        final IBinder binder = jwx.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        Field field = null;
        int i = 0;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            jvu.a(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (final IllegalAccessException ex) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", ex);
                }
                catch (final NullPointerException ex2) {
                    throw new IllegalArgumentException("Binder object is null.", ex2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        final int length2 = declaredFields.length;
        final StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }
}
