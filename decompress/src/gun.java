import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gun implements gum
{
    private final Set a;
    
    public gun(final Set set) {
        this.a = noi.F(set);
    }
    
    @Override
    public final boolean a(final kvs kvs) {
        try {
            kwp.k(kvs);
            final ljm c = kvs.c();
            if (c == null) {
                return false;
            }
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (!((fyf)iterator.next()).a(c)) {
                    return false;
                }
            }
            return true;
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
