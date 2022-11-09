import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class olp implements Entry
{
    public final Entry a;
    
    public olp(final Entry a) {
        this.a = a;
    }
    
    @Override
    public final Object getKey() {
        return this.a.getKey();
    }
    
    @Override
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        throw null;
    }
    
    @Override
    public final Object setValue(final Object o) {
        if (o instanceof omj) {
            final olr olr = this.a.getValue();
            final omj a = (omj)o;
            final omj a2 = olr.a;
            olr.b = null;
            olr.a = a;
            return a2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
