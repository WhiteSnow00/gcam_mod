import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class lvg implements List
{
    public final List a;
    
    public lvg(final List a) {
        this.a = a;
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.a.add(n, o);
    }
    
    @Override
    public final boolean add(final Object o) {
        return this.a.add(o);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        return this.a.addAll(n, collection);
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        return this.a.addAll(collection);
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return this.a.containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a.equals(o);
    }
    
    @Override
    public final Object get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final int indexOf(final Object o) {
        return this.a.indexOf(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        return this.a.lastIndexOf(o);
    }
    
    @Override
    public final ListIterator listIterator() {
        return this.a.listIterator();
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return this.a.listIterator(n);
    }
    
    @Override
    public final Object remove(final int n) {
        return this.a.remove(n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.a.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        return this.a.removeAll(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        return this.a.retainAll(collection);
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        return this.a.set(n, o);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public List subList(final int n, final int n2) {
        return this.a.subList(n, n2);
    }
    
    @Override
    public final Object[] toArray() {
        return this.a.toArray();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return this.a.toArray(array);
    }
}
