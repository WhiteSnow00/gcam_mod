import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class msm implements mrr
{
    public static final InputStream b(final mrq mrq) {
        final InputStream d = mrq.a.d(mrq.d);
        final ArrayList list = new ArrayList();
        list.add(d);
        if (!mrq.c.isEmpty()) {
            final List c = mrq.c;
            final ArrayList list2 = new ArrayList();
            final Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                final msq a = ((mss)iterator.next()).a();
                if (a != null) {
                    list2.add(a);
                }
            }
            Object o;
            if (!list2.isEmpty()) {
                o = new mrn(d, list2);
            }
            else {
                o = null;
            }
            if (o != null) {
                list.add(o);
            }
        }
        for (final mst mst : mrq.b) {
            final InputStream inputStream = (InputStream)nov.d(list);
            list.add(mst.c());
        }
        Collections.reverse(list);
        return (InputStream)list.get(0);
    }
}
