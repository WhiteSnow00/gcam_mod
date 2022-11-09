import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmk implements Iterable
{
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;
    
    protected nmk() {
    }
    
    public nmk(final Iterable a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator iterator() {
        final Iterable a = this.a;
        if (a instanceof List) {
            final List list = (List)a;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        final Iterator iterator = a.iterator();
        nqb.u(iterator, this.b);
        return new nou(iterator);
    }
    
    @Override
    public final String toString() {
        final Iterator<Object> iterator = this.iterator();
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        int n = 1;
        while (iterator.hasNext()) {
            if (n == 0) {
                sb.append(", ");
            }
            sb.append(iterator.next());
            n = 0;
        }
        sb.append(']');
        return sb.toString();
    }
}
