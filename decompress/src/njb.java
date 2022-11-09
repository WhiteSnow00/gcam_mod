import java.util.Locale;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njb
{
    static {
        Logger.getLogger(njb.class.getName());
    }
    
    private njb() {
    }
    
    static niz a(final Class clazz, final String s) {
        final Map a = niq.a;
        monitorenter(a);
        try {
            Map map;
            if ((map = niq.a.get(clazz)) == null) {
                map = new HashMap();
                for (final Enum enum1 : EnumSet.allOf((Class<Enum>)clazz)) {
                    map.put(enum1.name(), new WeakReference(enum1));
                }
                niq.a.put(clazz, map);
            }
            monitorexit(a);
            final WeakReference weakReference = (WeakReference)map.get(s);
            niz niz;
            if (weakReference == null) {
                niz = nii.a;
            }
            else {
                niz = niz.i(clazz.cast(weakReference.get()));
            }
            return niz;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    static String b(final double n) {
        return String.format(Locale.ROOT, "%.4g", n);
    }
    
    public static String c(final String s) {
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        return s2;
    }
    
    public static boolean d(final String s) {
        return s == null || s.isEmpty();
    }
}
