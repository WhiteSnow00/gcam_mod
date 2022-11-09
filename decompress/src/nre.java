import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nre extends nri implements Entry
{
    private static final long serialVersionUID = 0L;
    
    public nre(final Entry entry, final Object o) {
        super(entry, o);
    }
    
    final Entry a() {
        return (Entry)super.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        synchronized (this.h) {
            return this.a().equals(o);
        }
    }
    
    @Override
    public final Object getKey() {
        synchronized (this.h) {
            return this.a().getKey();
        }
    }
    
    @Override
    public final Object getValue() {
        synchronized (this.h) {
            return this.a().getValue();
        }
    }
    
    @Override
    public final int hashCode() {
        synchronized (this.h) {
            return this.a().hashCode();
        }
    }
    
    @Override
    public final Object setValue(Object setValue) {
        synchronized (this.h) {
            setValue = this.a().setValue(setValue);
            return setValue;
        }
    }
}
