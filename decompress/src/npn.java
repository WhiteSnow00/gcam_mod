import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

class npn extends nqw
{
    final Map b;
    
    public npn(final Map b) {
        b.getClass();
        this.b = b;
    }
    
    @Override
    public void clear() {
        this.b.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.b.containsKey(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return nqb.i(this.b.entrySet().iterator());
    }
    
    @Override
    public boolean remove(final Object o) {
        if (this.contains(o)) {
            this.b.remove(o);
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.b.size();
    }
}
