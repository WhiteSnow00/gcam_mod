import java.util.Iterator;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nqd implements Comparator
{
    protected nqd() {
    }
    
    public static nqd b(final Comparator comparator) {
        nqd nqd;
        if (comparator instanceof nqd) {
            nqd = (nqd)comparator;
        }
        else {
            nqd = new nlu(comparator);
        }
        return nqd;
    }
    
    public nqd a() {
        return new nqu(this);
    }
    
    public Object c(final Iterator iterator) {
        Object o = iterator.next();
        while (iterator.hasNext()) {
            o = this.d(o, iterator.next());
        }
        return o;
    }
    
    @Override
    public abstract int compare(final Object p0, final Object p1);
    
    public Object d(final Object o, final Object o2) {
        if (this.compare(o, o2) >= 0) {
            return o;
        }
        return o2;
    }
    
    public final Object e(final Iterable iterable) {
        return this.f(iterable.iterator());
    }
    
    public Object f(final Iterator iterator) {
        Object o = iterator.next();
        while (iterator.hasNext()) {
            o = this.g(o, iterator.next());
        }
        return o;
    }
    
    public Object g(final Object o, final Object o2) {
        if (this.compare(o, o2) <= 0) {
            return o;
        }
        return o2;
    }
}
