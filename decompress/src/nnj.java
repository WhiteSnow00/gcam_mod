import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.io.Serializable;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nnj extends AbstractCollection implements Serializable
{
    private static final Object[] oA;
    
    static {
        oA = new Object[0];
    }
    
    public Object[] A() {
        return null;
    }
    
    @Deprecated
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public abstract nrv bN();
    
    public abstract boolean bO();
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public abstract boolean contains(final Object p0);
    
    @Deprecated
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object[] toArray() {
        return this.toArray(nnj.oA);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        final int size = this.size();
        final int length = array.length;
        Object[] w;
        if (length < size) {
            final Object[] a = this.A();
            if (a != null) {
                return Arrays.copyOfRange(a, this.z(), this.y(), array.getClass());
            }
            w = nrr.w(array, size);
        }
        else {
            w = array;
            if (length > size) {
                array[size] = null;
                w = array;
            }
        }
        this.x(w, 0);
        return w;
    }
    
    public nns v() {
        throw null;
    }
    
    Object writeReplace() {
        return new nnq(this.toArray());
    }
    
    public int x(final Object[] array, int n) {
        final nrv bn = this.bN();
        while (bn.hasNext()) {
            array[n] = bn.next();
            ++n;
        }
        return n;
    }
    
    public int y() {
        throw new UnsupportedOperationException();
    }
    
    public int z() {
        throw new UnsupportedOperationException();
    }
}
