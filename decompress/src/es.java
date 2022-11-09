// 
// Decompiled by Procyon v0.6.0
// 

public class es
{
    private static final zb a;
    
    static {
        a = new zb();
    }
    
    public static Class a(final ClassLoader classLoader, final String s) {
        try {
            return d(classLoader, s);
        }
        catch (final ClassCastException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new eg(sb.toString(), ex);
        }
        catch (final ClassNotFoundException ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": make sure class name exists");
            throw new eg(sb2.toString(), ex2);
        }
    }
    
    static boolean b(final ClassLoader classLoader, final String s) {
        try {
            return ei.class.isAssignableFrom(d(classLoader, s));
        }
        catch (final ClassNotFoundException ex) {
            return false;
        }
    }
    
    private static Class d(final ClassLoader classLoader, final String s) {
        final zb a = es.a;
        zb zb;
        if ((zb = (zb)a.get(classLoader)) == null) {
            zb = new zb();
            a.put(classLoader, zb);
        }
        final Class clazz = (Class)zb.get(s);
        if (clazz == null) {
            final Class<?> forName = Class.forName(s, false, classLoader);
            zb.put(s, forName);
            return forName;
        }
        return clazz;
    }
    
    public ei c(final String s) {
        throw null;
    }
}
