import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

class nrk extends nrd implements Set
{
    private static final long serialVersionUID = 0L;
    
    public nrk(final Set set, final Object o) {
        super(set, o);
    }
    
    public Set c() {
        return (Set)super.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        synchronized (this.h) {
            return this.c().equals(o);
        }
    }
    
    @Override
    public final int hashCode() {
        synchronized (this.h) {
            return this.c().hashCode();
        }
    }
}
