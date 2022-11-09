import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nnz extends noi
{
    public nnz() {
    }
    
    public abstract nnx a();
    
    @Override
    public final boolean bO() {
        return this.a().bS();
    }
    
    @Override
    public final boolean contains(Object value) {
        if (value instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)value;
            value = this.a().get(entry.getKey());
            if (value != null && value.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    @Override
    public final int size() {
        return this.a().size();
    }
    
    @Override
    public final boolean w() {
        return false;
    }
    
    @Override
    Object writeReplace() {
        return new nny(this.a());
    }
}
