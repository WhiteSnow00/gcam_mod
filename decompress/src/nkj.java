import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkj extends npp
{
    final transient Map a;
    final /* synthetic */ nkt b;
    
    public nkj(final nkt b, final Map a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final Set a() {
        return new nkh(this);
    }
    
    @Override
    public final void clear() {
        final Map a = this.a;
        final nkt b = this.b;
        if (a == b.a) {
            b.j();
            return;
        }
        nqb.y(new nki(this));
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Map a = this.a;
        a.getClass();
        try {
            return a.containsKey(o);
        }
        catch (final NullPointerException ex) {}
        catch (final ClassCastException ex2) {}
        return false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || this.a.equals(o);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final Set keySet() {
        return this.b.r();
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
