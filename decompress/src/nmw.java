import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmw extends nna
{
    final /* synthetic */ nnb a;
    
    public nmw(final nnb a) {
        this.a = a;
        super(a);
    }
    
    @Override
    public final boolean contains(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            final int b = this.a.b(key);
            if (b != -1 && nqb.E(value, this.a.b[b])) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean remove(Object key) {
        if (key instanceof Map.Entry) {
            final Map.Entry entry = (Map.Entry)key;
            key = entry.getKey();
            final Object value = entry.getValue();
            final int k = nov.k(key);
            final int c = this.a.c(key, k);
            if (c != -1 && nqb.E(value, this.a.b[c])) {
                this.a.h(c, k);
                return true;
            }
        }
        return false;
    }
}
