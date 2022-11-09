import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import j$.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aps implements j$.util.Iterator, Iterator
{
    public final aqg a;
    public String b;
    private Iterator c;
    
    public aps(final apu apu) {
        this.b = null;
        this.c = null;
        final aqg a = new aqg();
        this.a = a;
        final apx a2 = apu.a;
        if (!a.h(256)) {
            this.c = new apq(this, a2, null, 1);
            return;
        }
        this.c = new apr(this, a2);
    }
    
    public final boolean hasNext() {
        return this.c.hasNext();
    }
    
    public final Object next() {
        return this.c.next();
    }
    
    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
