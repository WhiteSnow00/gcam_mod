import java.util.Iterator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqu extends nqd implements Serializable
{
    private static final long serialVersionUID = 0L;
    final nqd a;
    
    public nqu(final nqd a) {
        this.a = a;
    }
    
    @Override
    public final nqd a() {
        return this.a;
    }
    
    @Override
    public final Object c(final Iterator iterator) {
        return this.a.f(iterator);
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return this.a.compare(o2, o);
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        return this.a.g(o, o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof nqu && this.a.equals(((nqu)o).a));
    }
    
    @Override
    public final Object f(final Iterator iterator) {
        return this.a.c(iterator);
    }
    
    @Override
    public final Object g(final Object o, final Object o2) {
        return this.a.d(o, o2);
    }
    
    @Override
    public final int hashCode() {
        return -this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 10);
        sb.append(value);
        sb.append(".reverse()");
        return sb.toString();
    }
}
