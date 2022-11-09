import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkb extends nms
{
    final Set a;
    final /* synthetic */ nkc b;
    
    public nkb(final nkc b) {
        this.b = b;
        this.a = b.b.keySet();
    }
    
    @Override
    protected final Set c() {
        return this.a;
    }
    
    @Override
    public final Iterator iterator() {
        return nqb.j(this.b.entrySet().iterator());
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
        final StringBuilder v = nov.v(this.size());
        v.append('[');
        final Iterator<Object> iterator = this.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final nkb next = iterator.next();
            if (n == 0) {
                v.append(", ");
            }
            if (next == this) {
                v.append("(this Collection)");
                n = 0;
            }
            else {
                v.append(next);
                n = 0;
            }
        }
        v.append(']');
        return v.toString();
    }
}
