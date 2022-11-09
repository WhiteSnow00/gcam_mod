import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.NavigableSet;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nmd extends nmp implements nra
{
    private transient Comparator a;
    private transient NavigableSet b;
    private transient Set c;
    
    public nmd() {
    }
    
    public abstract nra c();
    
    @Override
    public final Comparator comparator() {
        Comparator a;
        if ((a = this.a) == null) {
            a = nqd.b(this.c().comparator()).a();
            this.a = a;
        }
        return a;
    }
    
    public abstract Iterator e();
    
    @Override
    public final Set g() {
        Set c;
        if ((c = this.c) == null) {
            c = new nmc(this);
            this.c = c;
        }
        return c;
    }
    
    @Override
    public Iterator iterator() {
        return nqb.c(this);
    }
    
    @Override
    public final nps j() {
        return this.c().k();
    }
    
    @Override
    public final nps k() {
        return this.c().j();
    }
    
    @Override
    public final nps l() {
        return this.c().m();
    }
    
    @Override
    public final nps m() {
        return this.c().l();
    }
    
    @Override
    public final nra n() {
        return this.c();
    }
    
    @Override
    protected final npt o() {
        return this.c();
    }
    
    @Override
    public final NavigableSet p() {
        NavigableSet b;
        if ((b = this.b) == null) {
            b = new nrc(this);
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final nra q(final Object o, final int n, final Object o2, final int n2) {
        return this.c().q(o2, n2, o, n).n();
    }
    
    @Override
    public final nra r(final Object o, final int n) {
        return this.c().s(o, n).n();
    }
    
    @Override
    public final nra s(final Object o, final int n) {
        return this.c().r(o, n).n();
    }
    
    @Override
    public final Object[] toArray() {
        return this.u();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return nrr.x(this, array);
    }
    
    @Override
    public final String toString() {
        return this.g().toString();
    }
}
