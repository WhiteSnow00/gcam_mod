import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class piv implements Iterator, j$.util.Iterator
{
    public Object a;
    public int b;
    private final ArrayDeque c;
    
    public piv() {
        this.b = 2;
    }
    
    public piv(final pkm pkm) {
        this.b = 2;
        final ArrayDeque c = new ArrayDeque();
        this.c = c;
        if (pkm.a.isDirectory()) {
            c.push(b(pkm.a));
            return;
        }
        if (pkm.a.isFile()) {
            c.push(new pkk(pkm.a));
            return;
        }
        this.a();
    }
    
    private static final pkj b(final File file) {
        return new pkj(file, null);
    }
    
    protected final void a() {
        this.b = 3;
    }
    
    @Override
    public final boolean hasNext() {
        final int b = this.b;
        if (b == 4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final File file = null;
        if (b == 0) {
            throw null;
        }
        switch (b - 1) {
            default: {
                this.b = 4;
                File a;
                while (true) {
                    final pkl pkl = this.c.peek();
                    if (pkl == null) {
                        a = file;
                        break;
                    }
                    a = pkl.a();
                    if (a == null) {
                        this.c.pop();
                    }
                    else {
                        if (plr.b(a, pkl.a) || !a.isDirectory() || this.c.size() >= Integer.MAX_VALUE) {
                            break;
                        }
                        this.c.push(b(a));
                    }
                }
                if (a != null) {
                    this.a = a;
                    this.b = 1;
                }
                else {
                    this.a();
                }
                return this.b == 1;
            }
            case 2: {
                return false;
            }
            case 0: {
                return true;
            }
        }
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.b = 2;
            return this.a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
