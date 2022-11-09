import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class pmm extends pmn implements Iterator, j$.util.Iterator, pjl
{
    public pjl a;
    private int b;
    private Object c;
    private Iterator d;
    
    public pmm() {
    }
    
    private final Throwable c() {
        RuntimeException ex = null;
        switch (this.b) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state of the iterator: ");
                sb.append(this.b);
                ex = new IllegalStateException(sb.toString());
                break;
            }
            case 5: {
                ex = new IllegalStateException("Iterator has failed.");
                break;
            }
            case 4: {
                ex = new NoSuchElementException();
                break;
            }
        }
        return ex;
    }
    
    @Override
    public final Object a(final Object c, final pjl a) {
        this.c = c;
        this.b = 3;
        this.a = a;
        final pjs a2 = pjs.a;
        if (a2 == pjs.a) {
            return a2;
        }
        return piu.a;
    }
    
    @Override
    public final Object b(final Iterator d, final pjl a) {
        if (!d.hasNext()) {
            return piu.a;
        }
        this.d = d;
        this.b = 2;
        this.a = a;
        final pjs a2 = pjs.a;
        if (a2 == pjs.a) {
            return a2;
        }
        return piu.a;
    }
    
    public final pjq d() {
        return pjr.a;
    }
    
    public final void e(final Object o) {
        pip.b(o);
        this.b = 4;
    }
    
    @Override
    public final boolean hasNext() {
        while (true) {
            switch (this.b) {
                default: {
                    throw this.c();
                }
                case 4: {
                    return false;
                }
                case 2:
                case 3: {
                    return true;
                }
                case 1: {
                    final Iterator d = this.d;
                    d.getClass();
                    if (d.hasNext()) {
                        this.b = 2;
                        return true;
                    }
                    this.d = null;
                }
                case 0: {
                    this.b = 5;
                    final pjl a = this.a;
                    a.getClass();
                    this.a = null;
                    a.e(piu.a);
                    continue;
                }
            }
        }
    }
    
    @Override
    public final Object next() {
        switch (this.b) {
            default: {
                throw this.c();
            }
            case 3: {
                this.b = 0;
                final Object c = this.c;
                this.c = null;
                return c;
            }
            case 2: {
                this.b = 1;
                final Iterator d = this.d;
                d.getClass();
                return d.next();
            }
            case 0:
            case 1: {
                if (this.hasNext()) {
                    return this.next();
                }
                throw new NoSuchElementException();
            }
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
