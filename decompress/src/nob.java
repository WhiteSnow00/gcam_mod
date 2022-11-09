import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nob extends not
{
    private final nnx a;
    
    public nob(final nnx a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final int n) {
        return this.a.s().v().get(n).getKey();
    }
    
    @Override
    public final nrv bN() {
        return this.a.bR();
    }
    
    @Override
    public final boolean bO() {
        return true;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    Object writeReplace() {
        return new noa(this.a);
    }
}
