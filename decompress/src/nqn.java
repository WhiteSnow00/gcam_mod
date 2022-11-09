import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqn extends noi
{
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient nnx d;
    
    public nqn(final nnx d, final Object[] a, final int b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final nns C() {
        return new nqm(this);
    }
    
    @Override
    public final nrv bN() {
        return this.v().t();
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.c;
    }
    
    @Override
    public final int x(final Object[] array, final int n) {
        return this.v().x(array, n);
    }
}
