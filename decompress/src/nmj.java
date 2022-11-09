import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.Queue;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmj extends nmr implements Serializable
{
    private static final long serialVersionUID = 0L;
    final int a;
    private final Queue b;
    
    private nmj(final int a) {
        njo.g(a >= 0, "maxSize (%s) must >= 0", a);
        this.b = new ArrayDeque(a);
        this.a = a;
    }
    
    public static nmj c(final int n) {
        return new nmj(n);
    }
    
    @Override
    public final boolean add(final Object o) {
        o.getClass();
        if (this.a == 0) {
            return true;
        }
        if (this.size() == this.a) {
            this.b.remove();
        }
        this.b.add(o);
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        final int size = collection.size();
        if (size >= this.a) {
            this.clear();
            final int n = size - this.a;
            collection.getClass();
            njo.e(n >= 0, "number to skip cannot be negative");
            return nqb.z(this, new nmk(collection, n).iterator());
        }
        return nqb.z(this, collection.iterator());
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Queue b = this.b;
        o.getClass();
        return b.contains(o);
    }
    
    @Override
    protected final Queue d() {
        return this.b;
    }
    
    @Override
    public final boolean offer(final Object o) {
        this.add(o);
        return true;
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Queue b = this.b;
        o.getClass();
        return b.remove(o);
    }
}
