import java.util.Set;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class nlb extends nkt implements npq
{
    private static final long serialVersionUID = 7431625294878419160L;
    
    protected nlb(final Map map) {
        super(map);
    }
    
    @Override
    public final Collection c(final Object o, final Collection collection) {
        return new nks(this, o, (Set)collection);
    }
    
    public final Set d(final Object o) {
        return (Set)super.b(o);
    }
}
