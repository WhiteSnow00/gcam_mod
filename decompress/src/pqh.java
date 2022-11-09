// 
// Decompiled by Procyon v0.6.0
// 

public final class pqh
{
    public static final pqe a;
    private static final plc b;
    private static final plc c;
    private static final plc d;
    
    static {
        a = new pqe("NO_THREAD_ELEMENTS");
        b = pjp.c;
        c = pjp.d;
        d = pjp.e;
    }
    
    public static final Object a(final pjq pjq) {
        pjq.getClass();
        final Object a = pjq.a(0, pqh.b);
        a.getClass();
        return a;
    }
    
    public static final Object b(final pjq pjq, final Object o) {
        pjq.getClass();
        Object a = o;
        if (o == null) {
            a = a(pjq);
        }
        Object o2;
        if (a == Integer.valueOf(0)) {
            o2 = pqh.a;
        }
        else if (a instanceof Integer) {
            o2 = pjq.a(new pqi(pjq, ((Number)a).intValue()), pqh.d);
        }
        else {
            if (a == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            o2 = ((pnz)a).f(pjq);
        }
        return o2;
    }
    
    public static final void c(final pjq pjq, final Object o) {
        pjq.getClass();
        if (o == pqh.a) {
            return;
        }
        if (o instanceof pqi) {
            final pqi pqi = (pqi)o;
            pjq.getClass();
            for (int i = pqi.d.length - 1; i >= 0; --i) {
                final pnz pnz = pqi.d[i];
                pnz.getClass();
                pnz.g(pjq, pqi.a[i]);
            }
            return;
        }
        final Object a = pjq.a(null, pqh.c);
        if (a != null) {
            ((pnz)a).g(pjq, o);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
