import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nkd extends nrv
{
    public int a;
    final /* synthetic */ Iterator b;
    final /* synthetic */ njc c;
    private Object d;
    
    protected nkd() {
        this.a = 2;
    }
    
    public nkd(final Iterator b, final njc c) {
        this.b = b;
        this.c = c;
        this.a = 2;
    }
    
    @Override
    public final boolean hasNext() {
        njo.o(this.a != 4);
        final int a = this.a;
        final Object o = null;
        if (a == 0) {
            throw null;
        }
        switch (a - 1) {
            default: {
                this.a = 4;
                while (true) {
                    while (this.b.hasNext()) {
                        final Object next = this.b.next();
                        if (this.c.a(next)) {
                            this.d = next;
                            if (this.a != 3) {
                                this.a = 1;
                                return true;
                            }
                            return false;
                        }
                    }
                    this.a = 3;
                    final Object next = o;
                    continue;
                }
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
            this.a = 2;
            final Object d = this.d;
            this.d = null;
            return d;
        }
        throw new NoSuchElementException();
    }
}
