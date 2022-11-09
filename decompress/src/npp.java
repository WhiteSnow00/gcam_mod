import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class npp extends AbstractMap
{
    private transient Set a;
    private transient Set b;
    private transient Collection c;
    
    public npp() {
    }
    
    public abstract Set a();
    
    @Override
    public final Set entrySet() {
        Set a;
        if ((a = this.a) == null) {
            a = this.a();
            this.a = a;
        }
        return a;
    }
    
    @Override
    public Set keySet() {
        Set b;
        if ((b = this.b) == null) {
            b = new npn(this);
            this.b = b;
        }
        return b;
    }
    
    @Override
    public final Collection values() {
        Collection c;
        if ((c = this.c) == null) {
            c = new npo(this);
            this.c = c;
        }
        return c;
    }
}
