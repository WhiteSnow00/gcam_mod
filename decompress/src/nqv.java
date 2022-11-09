import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqv
{
    public final Field a;
    
    public nqv(final Field a) {
        (this.a = a).setAccessible(true);
    }
    
    final void a(final Object o, final Object o2) {
        try {
            this.a.set(o, o2);
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
