import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nkx implements npq
{
    private transient Set a;
    private transient Map b;
    public transient Collection c;
    public transient Collection d;
    
    @Override
    public final boolean equals(final Object o) {
        boolean b;
        if (o == this) {
            b = true;
        }
        else {
            if (o instanceof npq) {
                return this.q().equals(((npq)o).q());
            }
            b = false;
        }
        return b;
    }
    
    public Iterator f() {
        throw null;
    }
    
    public abstract Map h();
    
    @Override
    public final int hashCode() {
        return this.q().hashCode();
    }
    
    public abstract Set i();
    
    @Override
    public void p(final Object o, final Object o2) {
        throw null;
    }
    
    @Override
    public final Map q() {
        Map b;
        if ((b = this.b) == null) {
            b = this.h();
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final Set r() {
        Set a;
        if ((a = this.a) == null) {
            a = this.i();
            this.a = a;
        }
        return a;
    }
    
    @Override
    public final boolean s(final Object o, final Object o2) {
        final Collection collection = this.q().get(o);
        return collection != null && collection.contains(o2);
    }
    
    public final boolean t() {
        return this.e() == 0;
    }
    
    @Override
    public final String toString() {
        return this.q().toString();
    }
    
    @Override
    public final boolean u(final Object o, final Object o2) {
        final Collection collection = this.q().get(o);
        return collection != null && collection.remove(o2);
    }
}
