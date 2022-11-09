import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class olv extends olx
{
    private static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public olv() {
    }
    
    static List a(final Object o, final long n) {
        return (List)ons.h(o, n);
    }
    
    private static List e(final Object o, final long n, final int n2) {
        List list = a(o, n);
        if (list.isEmpty()) {
            if (list instanceof olu) {
                list = new olt(n2);
            }
            else if (list instanceof omq && list instanceof olj) {
                list = ((olj)list).e(n2);
            }
            else {
                list = new ArrayList(n2);
            }
            ons.u(o, n, list);
        }
        else if (olv.c.isAssignableFrom(((olj)list).getClass())) {
            final ArrayList list2 = new ArrayList(list.size() + n2);
            list2.addAll(list);
            ons.u(o, n, list2);
            list = list2;
        }
        else if (list instanceof onn) {
            final olt olt = new olt(list.size() + n2);
            olt.addAll(list);
            ons.u(o, n, olt);
            list = olt;
        }
        else if (list instanceof omq && list instanceof olj) {
            final olj olj = (olj)list;
            if (!olj.c()) {
                final olj e = olj.e(list.size() + n2);
                ons.u(o, n, e);
                return e;
            }
        }
        return list;
    }
    
    @Override
    public final List b(final Object o, final long n) {
        return e(o, n, 10);
    }
    
    @Override
    public final void c(final Object o, final long n) {
        final List list = (List)ons.h(o, n);
        List<Object> list2;
        if (list instanceof olu) {
            list2 = ((olu)list).d();
        }
        else {
            if (olv.c.isAssignableFrom(((olu)list).getClass())) {
                return;
            }
            if (list instanceof omq && list instanceof olj) {
                final olj olj = (olj)list;
                if (olj.c()) {
                    olj.b();
                }
                return;
            }
            list2 = Collections.unmodifiableList((List<?>)list);
        }
        ons.u(o, n, list2);
    }
    
    @Override
    public final void d(final Object o, final Object o2, final long n) {
        List a = a(o2, n);
        final List e = e(o, n, a.size());
        final int size = e.size();
        final int size2 = a.size();
        if (size > 0 && size2 > 0) {
            e.addAll(a);
        }
        if (size > 0) {
            a = e;
        }
        ons.u(o, n, a);
    }
}
