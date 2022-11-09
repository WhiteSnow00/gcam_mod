import java.util.NoSuchElementException;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmy implements Iterator, j$.util.Iterator
{
    final /* synthetic */ pmz a;
    private int b;
    private int c;
    private int d;
    private pmc e;
    private int f;
    
    public pmy(final pmz a) {
        this.a = a;
        this.b = -1;
        final int g = poe.g(0, 0, a.a.length());
        this.c = g;
        this.d = g;
    }
    
    private final void a() {
        final int d = this.d;
        int n = 0;
        if (d < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        final pmz a = this.a;
        final int b = a.b;
        if ((b > 0 && ++this.f >= b) || d > a.a.length()) {
            this.e = new pmc(this.c, plr.i(this.a.a));
            this.d = -1;
        }
        else {
            final pmz a2 = this.a;
            final Object a3 = a2.c.a(a2.a, this.d);
            if (a3 == null) {
                this.e = new pmc(this.c, plr.i(this.a.a));
                this.d = -1;
            }
            else {
                final pim pim = (pim)a3;
                final int intValue = ((Number)pim.a).intValue();
                final int intValue2 = ((Number)pim.b).intValue();
                final int c = this.c;
                pmc d3;
                if (intValue <= Integer.MIN_VALUE) {
                    final pmc d2 = pmc.d;
                    d3 = pmc.d;
                }
                else {
                    d3 = new pmc(c, intValue - 1);
                }
                this.e = d3;
                final int c2 = intValue + intValue2;
                this.c = c2;
                if (intValue2 == 0) {
                    n = 1;
                }
                this.d = c2 + n;
            }
        }
        this.b = 1;
    }
    
    @Override
    public final boolean hasNext() {
        if (this.b == -1) {
            this.a();
        }
        return this.b == 1;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
