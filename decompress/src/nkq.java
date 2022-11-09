import j$.util.Iterator;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nkq extends nko implements ListIterator, j$.util.Iterator
{
    final /* synthetic */ nkr d;
    
    public nkq(final nkr d) {
        this.d = d;
        super(d);
    }
    
    public nkq(final nkr d, final int n) {
        this.d = d;
        super(d, d.d().listIterator(n));
    }
    
    private final ListIterator b() {
        this.a();
        return (ListIterator)super.a;
    }
    
    @Override
    public final void add(final Object o) {
        final boolean empty = this.d.isEmpty();
        this.b().add(o);
        nkt.l(this.d.f);
        if (empty) {
            this.d.a();
        }
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.b().hasPrevious();
    }
    
    @Override
    public final int nextIndex() {
        return this.b().nextIndex();
    }
    
    @Override
    public final Object previous() {
        return this.b().previous();
    }
    
    @Override
    public final int previousIndex() {
        return this.b().previousIndex();
    }
    
    @Override
    public final void set(final Object o) {
        this.b().set(o);
    }
}
