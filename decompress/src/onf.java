import java.util.Iterator;
import java.util.Map;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class onf extends AbstractSet
{
    final /* synthetic */ ong a;
    
    public onf(final ong a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(Object value) {
        final Map.Entry entry = (Map.Entry)value;
        value = this.a.get(entry.getKey());
        final Object value2 = entry.getValue();
        boolean b = false;
        if (value != value2) {
            if (value == null) {
                return b;
            }
            if (!value.equals(value2)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final Iterator iterator() {
        return new one(this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map.Entry entry = (Map.Entry)o;
        if (this.contains(entry)) {
            this.a.remove(entry.getKey());
            return true;
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
