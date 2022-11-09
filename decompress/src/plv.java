import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plv
{
    public static void a(final Object o) {
        Label_0038: {
            if (o instanceof plq) {
                if (((plq)o).i() != 2) {
                    break Label_0038;
                }
            }
            else if (o instanceof pkn || o instanceof pky) {
                break Label_0038;
            }
            return;
        }
        final String name = o.getClass().getName();
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to kotlin.jvm.functions.Function2");
        final ClassCastException ex = new ClassCastException(sb.toString());
        plr.d(ex, plv.class.getName());
        throw ex;
    }
    
    public static pml b(final pml pml) {
        return new pmi(pml, pmq.a, pmt.b);
    }
    
    public static List c(final pml pml) {
        pml.getClass();
        pml.getClass();
        final ArrayList list = new ArrayList();
        pml.getClass();
        final Iterator a = pml.a();
        while (a.hasNext()) {
            list.add(a.next());
        }
        return pjf.d(list);
    }
    
    public static final Object d(final Object o, final pjl pjl) {
        pjl.getClass();
        Object a = o;
        if (o instanceof pnq) {
            Throwable t2;
            final Throwable t = t2 = ((pnq)o).b;
            if (pod.b) {
                t2 = t;
                if (pjl instanceof pjz) {
                    t2 = pqd.a(t, (pjz)pjl);
                }
            }
            a = pip.a(t2);
        }
        return a;
    }
    
    public static final Object e(final Object o) {
        final Throwable a = pio.a(o);
        if (a == null) {
            return o;
        }
        return new pnq(a);
    }
    
    public static final pne f(final long n) {
        return new pne(n);
    }
    
    public static final pnf g(final Object o) {
        return new pnf(o);
    }
    
    public static final pnd h() {
        return new pnd();
    }
    
    public static final pnc i() {
        return new pnc();
    }
}
