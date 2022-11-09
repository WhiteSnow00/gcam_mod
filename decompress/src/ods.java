import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ods extends odj
{
    private List c;
    
    public ods(final nnj nnj, final boolean b) {
        super(nnj, b, true);
        List<Object> c;
        if (nnj.isEmpty()) {
            c = Collections.emptyList();
        }
        else {
            c = nqb.q(nnj.size());
        }
        for (int i = 0; i < nnj.size(); ++i) {
            c.add(null);
        }
        this.c = c;
        this.r();
    }
    
    @Override
    public final void g(final int n, final Object o) {
        final List c = this.c;
        if (c != null) {
            c.set(n, new odr(o));
        }
    }
    
    @Override
    public final void q() {
        final List c = this.c;
        if (c != null) {
            final ArrayList q = nqb.q(c.size());
            for (final odr odr : c) {
                Object a;
                if (odr != null) {
                    a = odr.a;
                }
                else {
                    a = null;
                }
                q.add(a);
            }
            this.o(Collections.unmodifiableList((List<?>)q));
        }
    }
    
    @Override
    public final void s(final int n) {
        super.s(n);
        this.c = null;
    }
}
