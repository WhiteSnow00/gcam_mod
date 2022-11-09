import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onn extends AbstractList implements RandomAccess, olu
{
    public final olu a;
    
    public onn(final olu a) {
        this.a = a;
    }
    
    @Override
    public final olu d() {
        return this;
    }
    
    @Override
    public final Object f(final int n) {
        return this.a.f(n);
    }
    
    @Override
    public final List h() {
        return this.a.h();
    }
    
    @Override
    public final void i(final ojw ojw) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Iterator iterator() {
        return new onm(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return new onl(this, n);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
