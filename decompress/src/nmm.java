import java.util.ListIterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nmm extends nml implements List
{
    protected nmm() {
    }
    
    @Override
    public void add(final int n, final Object o) {
        this.c().add(n, o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        return this.c().addAll(n, collection);
    }
    
    protected abstract List c();
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || this.c().equals(o);
    }
    
    @Override
    public Object get(final int n) {
        return this.c().get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }
    
    @Override
    public int indexOf(final Object o) {
        return this.c().indexOf(o);
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        return this.c().lastIndexOf(o);
    }
    
    @Override
    public ListIterator listIterator() {
        return this.c().listIterator();
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        return this.c().listIterator(n);
    }
    
    @Override
    public Object remove(final int n) {
        return this.c().remove(n);
    }
    
    @Override
    public Object set(final int n, final Object o) {
        return this.c().set(n, o);
    }
    
    @Override
    public List subList(final int n, final int n2) {
        return this.c().subList(n, n2);
    }
}
