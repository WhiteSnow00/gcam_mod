import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nud implements Iterator, j$.util.Iterator
{
    final /* synthetic */ nue a;
    private final nsx b;
    private int c;
    private int d;
    
    public nud(final nue a, final nsx b, final int n) {
        this.a = a;
        this.b = b;
        final int c = n & 0x1F;
        this.c = c;
        this.d = n >>> c + 5;
    }
    
    @Override
    public final boolean hasNext() {
        return this.c >= 0;
    }
    
    @Override
    public final Object next() {
        final Object d = this.b.d(this.a.e(this.c));
        final int d2 = this.d;
        if (d2 != 0) {
            final int n = Integer.numberOfTrailingZeros(d2) + 1;
            this.d >>>= n;
            this.c += n;
        }
        else {
            this.c = -1;
        }
        return d;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
