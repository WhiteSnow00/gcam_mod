import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class npc implements ListIterator, j$.util.Iterator
{
    boolean a;
    final /* synthetic */ ListIterator b;
    final /* synthetic */ npd c;
    
    public npc(final npd c, final ListIterator b) {
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final void add(final Object o) {
        this.b.add(o);
        this.b.previous();
        this.a = false;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.a = true;
            return this.b.previous();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }
    
    @Override
    public final Object previous() {
        if (this.hasPrevious()) {
            this.a = true;
            return this.b.next();
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final int previousIndex() {
        return this.nextIndex() - 1;
    }
    
    @Override
    public final void remove() {
        nqb.B(this.a);
        this.b.remove();
        this.a = false;
    }
    
    @Override
    public final void set(final Object o) {
        njo.o(this.a);
        this.b.set(o);
    }
}
