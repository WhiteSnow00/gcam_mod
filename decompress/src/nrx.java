import java.util.NavigableSet;
import java.util.Comparator;
import java.util.Set;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class nrx extends nqa implements nra
{
    private static final long serialVersionUID = 0L;
    private transient nrx d;
    
    public nrx(final nra nra) {
        super(nra);
    }
    
    @Override
    public final Comparator comparator() {
        return ((nra)super.a).comparator();
    }
    
    @Override
    public final nps j() {
        return ((nra)super.a).j();
    }
    
    @Override
    public final nps k() {
        return ((nra)super.a).k();
    }
    
    @Override
    public final nps l() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final nps m() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final nra n() {
        nrx d;
        if ((d = this.d) == null) {
            d = new nrx(((nra)super.a).n());
            d.d = this;
            this.d = d;
        }
        return d;
    }
    
    @Override
    public final NavigableSet p() {
        return (NavigableSet)super.f();
    }
    
    @Override
    public final nra q(final Object o, final int n, final Object o2, final int n2) {
        return nqb.b(((nra)super.a).q(o, n, o2, n2));
    }
    
    @Override
    public final nra r(final Object o, final int n) {
        return nqb.b(((nra)super.a).r(o, n));
    }
    
    @Override
    public final nra s(final Object o, final int n) {
        return nqb.b(((nra)super.a).s(o, n));
    }
}
