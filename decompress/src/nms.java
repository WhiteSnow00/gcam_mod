import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nms extends nml implements Set
{
    protected nms() {
    }
    
    protected abstract Set c();
    
    protected final boolean d(final Collection collection) {
        collection.getClass();
        return nrr.p(this, collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || this.c().equals(o);
    }
    
    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }
}
