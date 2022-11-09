import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ous implements oun
{
    public static final oun a;
    private final List b;
    private final List c;
    
    static {
        a = ouo.a(Collections.emptySet());
    }
    
    public ous(final List b, final List c) {
        this.b = b;
        this.c = c;
    }
    
    public final Set a() {
        int size = this.b.size();
        final ArrayList list = new ArrayList(this.c.size());
        final int size2 = this.c.size();
        final int n = 0;
        for (int i = 0; i < size2; ++i) {
            final Collection collection = (Collection)this.c.get(i).get();
            size += collection.size();
            list.add(collection);
        }
        final HashSet set = new HashSet(pjv.h(size));
        for (int size3 = this.b.size(), j = 0; j < size3; ++j) {
            final Object value = this.b.get(j).get();
            value.getClass();
            set.add(value);
        }
        for (int size4 = list.size(), k = n; k < size4; ++k) {
            for (final Object next : (Collection)list.get(k)) {
                next.getClass();
                set.add(next);
            }
        }
        return Collections.unmodifiableSet((Set<?>)set);
    }
}
