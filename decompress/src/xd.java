import java.util.Map;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xd extends xf implements Iterator
{
    final /* synthetic */ xg a;
    private xc b;
    private boolean c;
    
    public xd(final xg a) {
        this.a = a;
        this.c = true;
    }
    
    public final Map.Entry a() {
        xc b;
        if (this.c) {
            this.c = false;
            b = this.a.b;
        }
        else {
            final xc b2 = this.b;
            if (b2 != null) {
                b = b2.c;
            }
            else {
                b = null;
            }
        }
        return this.b = b;
    }
    
    @Override
    public final void aF(xc d) {
        final xc b = this.b;
        if (d == b) {
            d = b.d;
            this.b = d;
            this.c = (d == null);
        }
    }
    
    @Override
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        final xc b = this.b;
        return b != null && b.c != null;
    }
}
