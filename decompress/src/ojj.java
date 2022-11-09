import java.util.RandomAccess;
import java.util.List;
import java.util.Collection;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ojj extends AbstractList implements olj
{
    public boolean a;
    
    public ojj() {
        this.a = true;
    }
    
    @Override
    public void add(final int n, final Object o) {
        this.bT();
        super.add(n, o);
    }
    
    @Override
    public boolean add(final Object o) {
        this.bT();
        return super.add(o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        this.bT();
        return super.addAll(n, collection);
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        this.bT();
        return super.addAll(collection);
    }
    
    @Override
    public final void b() {
        this.a = false;
    }
    
    protected final void bT() {
        if (this.a) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean c() {
        return this.a;
    }
    
    @Override
    public void clear() {
        this.bT();
        super.clear();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = this.size();
        if (size == list.size()) {
            for (int i = 0; i < size; ++i) {
                if (!this.get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    @Override
    public Object remove(final int n) {
        this.bT();
        return super.remove(n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        this.bT();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        this.bT();
        return super.removeAll(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        this.bT();
        return super.retainAll(collection);
    }
    
    @Override
    public Object set(final int n, final Object o) {
        this.bT();
        return super.set(n, o);
    }
}
