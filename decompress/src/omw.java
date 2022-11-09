import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.ArrayDeque;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class omw implements Iterator, j$.util.Iterator
{
    private final ArrayDeque a;
    private oju b;
    
    public omw(final ojw ojw) {
        if (ojw instanceof omx) {
            final omx omx = (omx)ojw;
            (this.a = new ArrayDeque(omx.g)).push(omx);
            this.b = this.b(omx.e);
            return;
        }
        this.a = null;
        this.b = (oju)ojw;
    }
    
    private final oju b(ojw e) {
        while (e instanceof omx) {
            final omx omx = (omx)e;
            this.a.push(omx);
            final int[] a = omx.a;
            e = omx.e;
        }
        return (oju)e;
    }
    
    public final oju a() {
        final oju b = this.b;
        if (b != null) {
            oju b2;
            do {
                final ArrayDeque a = this.a;
                final oju oju = null;
                b2 = null;
                if (a == null) {
                    break;
                }
                if (a.isEmpty()) {
                    b2 = oju;
                    break;
                }
                final omx omx = this.a.pop();
                final int[] a2 = omx.a;
                b2 = this.b(omx.f);
            } while (b2.d() == 0);
            this.b = b2;
            return b;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b != null;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
