import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class ntt extends ntw
{
    private final Map a;
    private final Map b;
    private final ntu c;
    
    public ntt(final nts nts) {
        final HashMap a = new HashMap();
        this.a = a;
        final HashMap b = new HashMap();
        this.b = b;
        a.putAll(nts.c);
        b.putAll(nts.d);
        this.c = nts.f;
    }
    
    @Override
    protected final void a(final nsx nsx, final Object o, final Object o2) {
        final ntv ntv = this.a.get(nsx);
        if (ntv != null) {
            ntv.a(nsx, o, o2);
            return;
        }
        nsx.b(o, (nsw)o2);
    }
    
    @Override
    protected final void b(final nsx nsx, final Iterator iterator, final Object o) {
        final ntu ntu = this.b.get(nsx);
        if (ntu != null) {
            ntu.a(nsx, iterator, o);
            return;
        }
        if (this.c != null) {
            if (!this.a.containsKey(nsx)) {
                nsx.a(iterator, (nsw)o);
                return;
            }
        }
        while (iterator.hasNext()) {
            this.a(nsx, iterator.next(), o);
        }
    }
}
