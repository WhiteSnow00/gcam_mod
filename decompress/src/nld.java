import java.util.NavigableSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nld extends nkz implements nra
{
    final Comparator b;
    private transient nra c;
    
    public nld() {
        this(nqc.a);
    }
    
    public nld(final Comparator b) {
        this.b = b;
    }
    
    @Override
    public final Comparator comparator() {
        return this.b;
    }
    
    @Override
    public final nps j() {
        final Iterator c = this.c();
        if (c.hasNext()) {
            return (nps)c.next();
        }
        return null;
    }
    
    @Override
    public final nps k() {
        final Iterator o = this.o();
        if (o.hasNext()) {
            return (nps)o.next();
        }
        return null;
    }
    
    @Override
    public final nps l() {
        final Iterator c = this.c();
        if (c.hasNext()) {
            final nps nps = c.next();
            final nps a = nqb.a(nps.b(), nps.a());
            c.remove();
            return a;
        }
        return null;
    }
    
    @Override
    public final nps m() {
        final Iterator o = this.o();
        if (o.hasNext()) {
            final nps nps = o.next();
            final nps a = nqb.a(nps.b(), nps.a());
            o.remove();
            return a;
        }
        return null;
    }
    
    @Override
    public final nra n() {
        nra c;
        if ((c = this.c) == null) {
            c = new nlc(this);
            this.c = c;
        }
        return c;
    }
    
    public abstract Iterator o();
    
    @Override
    public final NavigableSet p() {
        Set a;
        if ((a = super.a) == null) {
            a = this.e();
            super.a = a;
        }
        return (NavigableSet)a;
    }
    
    @Override
    public final nra q(final Object o, final int n, final Object o2, final int n2) {
        return this.s(o, n).r(o2, n2);
    }
}
