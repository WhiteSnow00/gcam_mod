import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pja implements List, Serializable, RandomAccess
{
    public static final pja a;
    private static final long serialVersionUID = -7390468764508069838L;
    
    static {
        a = new pja();
    }
    
    private pja() {
    }
    
    private final Object readResolve() {
        return pja.a;
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        if (o instanceof Void) {
            o.getClass();
        }
        return false;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof List && ((List)o).isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (o instanceof Void) {
            o.getClass();
        }
        return -1;
    }
    
    @Override
    public final boolean isEmpty() {
        return true;
    }
    
    @Override
    public final Iterator iterator() {
        return piz.a;
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (o instanceof Void) {
            o.getClass();
        }
        return -1;
    }
    
    @Override
    public final ListIterator listIterator() {
        return piz.a;
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        if (n == 0) {
            return piz.a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(n);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return 0;
    }
    
    @Override
    public final List subList(int n, final int n2) {
        if (n == 0) {
            if (n2 == 0) {
                return this;
            }
            n = 0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(n);
        sb.append(", toIndex: ");
        sb.append(n2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final Object[] toArray() {
        return plp.a(this);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return plp.b(this, array);
    }
    
    @Override
    public final String toString() {
        return "[]";
    }
}
