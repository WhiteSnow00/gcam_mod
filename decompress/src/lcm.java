import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcm extends nqd
{
    private final nnx a;
    
    public lcm(final List list) {
        final nnt m = nnx.m(((nql)list).c);
        final nrw t = ((nns)list).t();
        int n = 0;
        while (t.hasNext()) {
            m.d(t.next(), n);
            ++n;
        }
        final nnx b = m.b();
        this.a = b;
    }
    
    private final int h(final Object o) {
        final Integer n = (Integer)this.a.get(o);
        if (n == null) {
            return ((nqq)this.a).c;
        }
        return n;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return this.h(o) - this.h(o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof lcm && this.a.equals(((lcm)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
