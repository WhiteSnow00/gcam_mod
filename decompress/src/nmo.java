import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nmo extends nmq implements Entry
{
    protected nmo() {
    }
    
    protected abstract Entry b();
    
    @Override
    public final boolean equals(final Object o) {
        return this.b().equals(o);
    }
    
    @Override
    public final Object getKey() {
        return this.b().getKey();
    }
    
    @Override
    public final Object getValue() {
        return this.b().getValue();
    }
    
    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
    
    @Override
    public Object setValue(final Object value) {
        return this.b().setValue(value);
    }
}
