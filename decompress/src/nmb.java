import java.util.NavigableSet;
import java.util.Iterator;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmb extends noq
{
    private final noq a;
    
    public nmb(final noq a) {
        super(nqd.b(a.b).a());
        this.a = a;
    }
    
    @Override
    public final noq bL() {
        return this.a;
    }
    
    @Override
    public final nrv bM() {
        return this.a.bN();
    }
    
    @Override
    public final nrv bN() {
        return this.a.bM();
    }
    
    @Override
    public final boolean bO() {
        return this.a.bO();
    }
    
    @Override
    public final Object ceiling(final Object o) {
        return this.a.floor(o);
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    @Override
    public final Object floor(final Object o) {
        return this.a.ceiling(o);
    }
    
    @Override
    public final Object higher(final Object o) {
        return this.a.lower(o);
    }
    
    @Override
    public final noq k() {
        throw new AssertionError((Object)"should never be called");
    }
    
    @Override
    public final Object lower(final Object o) {
        return this.a.higher(o);
    }
    
    @Override
    public final noq n(final Object o, final boolean b) {
        return this.a.s(o, b).bL();
    }
    
    @Override
    public final noq q(final Object o, final boolean b, final Object o2, final boolean b2) {
        return this.a.p(o2, b2, o, b).bL();
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final noq t(final Object o, final boolean b) {
        return this.a.m(o, b).bL();
    }
}
