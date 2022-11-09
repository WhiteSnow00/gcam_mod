import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class xe extends xf implements Iterator
{
    xc a;
    xc b;
    
    public xe(final xc b, final xc a) {
        this.a = a;
        this.b = b;
    }
    
    private final xc c() {
        final xc b = this.b;
        final xc a = this.a;
        if (b != a && a != null) {
            return this.b(b);
        }
        return null;
    }
    
    public abstract xc a(final xc p0);
    
    @Override
    public final void aF(final xc xc) {
        if (this.a == xc && xc == this.b) {
            this.b = null;
            this.a = null;
        }
        final xc a = this.a;
        if (a == xc) {
            this.a = this.a(a);
        }
        if (this.b == xc) {
            this.b = this.c();
        }
    }
    
    public abstract xc b(final xc p0);
    
    @Override
    public final boolean hasNext() {
        return this.b != null;
    }
}
