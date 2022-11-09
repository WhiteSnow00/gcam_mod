import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnk extends nkv implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object a;
    final Object b;
    
    public nnk(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object getKey() {
        return this.a;
    }
    
    @Override
    public final Object getValue() {
        return this.b;
    }
    
    @Override
    public final Object setValue(final Object o) {
        throw new UnsupportedOperationException();
    }
}
