import java.util.Iterator;
import java.util.HashSet;
import java.util.Comparator;
import j$.util.List$_EL;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlz
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/featurecentral/extraction/FeatureExtractors");
    }
    
    public static List a(final Collection collection) {
        final ArrayList list = new ArrayList(collection);
        List$_EL.sort((List)list, (Comparator)bzj.d);
        return list;
    }
    
    public static dlu b(final dni dni) {
        return new dlu(dni);
    }
    
    public static void c(final String s, final Collection collection) {
        final HashSet set = new HashSet();
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            set.add(((dly)iterator.next()).a.b);
        }
        final Iterator iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            final dlb b = ((dly)iterator2.next()).a.b;
            for (final dlb dlb : b.c()) {
                if (!set.contains(dlb)) {
                    dlz.a.c().E(827).y("Extractor (%s) of type %s depends on foreign type %s! Feature values may be calculated out of order!", s, b, dlb);
                }
            }
        }
    }
}
