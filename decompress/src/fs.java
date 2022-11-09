// 
// Decompiled by Procyon v0.6.0
// 

final class fs
{
    static final ft a;
    
    static {
        ft a2;
        try {
            a2 = (ft)Class.forName("afp").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            a2 = null;
        }
        a = a2;
    }
}
