import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pje implements Iterator, j$.util.Iterator
{
    public boolean a;
    private final int b;
    private int c;
    private final int d;
    
    public pje() {
    }
    
    public pje(int c, final int b, final int d) {
        this.d = d;
        this.b = b;
        boolean a = false;
        Label_0037: {
            if (d > 0) {
                if (c > b) {
                    break Label_0037;
                }
            }
            else if (c < b) {
                break Label_0037;
            }
            a = true;
        }
        if (!(this.a = a)) {
            c = b;
        }
        this.c = c;
    }
    
    public final int a() {
        final int c = this.c;
        if (c == this.b) {
            if (!this.a) {
                throw new NoSuchElementException();
            }
            this.a = false;
        }
        else {
            this.c = this.d + c;
        }
        return c;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
