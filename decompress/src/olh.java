import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class olh extends AbstractList
{
    private final List a;
    private final olg b;
    
    public olh(final List a, final olg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object get(final int n) {
        return this.b.a(this.a.get(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
