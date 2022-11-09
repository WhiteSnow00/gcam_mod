import java.util.Comparator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nop implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparator a;
    final Object[] b;
    
    public nop(final Comparator a, final Object[] b) {
        this.a = a;
        this.b = b;
    }
    
    Object readResolve() {
        final Comparator a = this.a;
        final nog nog = new nog();
        a.getClass();
        nog.h(this.b);
        final noq p = noq.P(a, nog.b, nog.a);
        nog.b = p.size();
        nog.c = true;
        return p;
    }
}
