import java.util.ListIterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bss extends nmm implements List, krc
{
    private final ArrayList a;
    private boolean b;
    
    public bss() {
        this.a = new ArrayList();
    }
    
    @Override
    public final boolean addAll(final int n, final Collection collection) {
        njo.o(this.b ^ true);
        return this.a.addAll(n, collection);
    }
    
    @Override
    protected final List c() {
        return this.a;
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((krc)a.get(i)).close();
        }
        this.a.clear();
    }
    
    @Override
    public final int indexOf(final Object o) {
        njo.o(this.b ^ true);
        return this.a.indexOf(o);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        njo.o(this.b ^ true);
        return this.a.lastIndexOf(o);
    }
    
    @Override
    public final ListIterator listIterator() {
        njo.o(this.b ^ true);
        return this.a.listIterator();
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        njo.o(this.b ^ true);
        return this.a.listIterator(n);
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        njo.o(this.b ^ true);
        return this.a.subList(n, n2);
    }
}
