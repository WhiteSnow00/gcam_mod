import java.util.List;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class nke extends nkt implements npq
{
    private static final long serialVersionUID = 6588350623831699109L;
    
    protected nke(final Map map) {
        super(map);
    }
    
    @Override
    public final Collection c(final Object o, final Collection collection) {
        return this.g(o, (List)collection, null);
    }
    
    public final List d(final Object o) {
        return (List)super.b(o);
    }
}
