import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class onl implements ListIterator, j$.util.Iterator
{
    final ListIterator a;
    final /* synthetic */ int b;
    final /* synthetic */ onn c;
    
    public onl(final onn c, final int b) {
        this.c = c;
        this.b = b;
        this.a = c.a.listIterator(b);
    }
    
    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.a.nextIndex();
    }
    
    @Override
    public final int previousIndex() {
        return this.a.previousIndex();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
