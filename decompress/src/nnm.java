import java.util.Iterator;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnm extends nnv
{
    private final transient EnumMap a;
    
    public nnm(final EnumMap a) {
        this.a = a;
        njo.d(a.isEmpty() ^ true);
    }
    
    @Override
    public final nrv a() {
        return new npl(this.a.entrySet().iterator());
    }
    
    @Override
    public final nrv bR() {
        return nqb.v(this.a.keySet().iterator());
    }
    
    @Override
    public final boolean bS() {
        return false;
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        Object a = o;
        if (o instanceof nnm) {
            a = ((nnm)o).a;
        }
        return this.a.equals(a);
    }
    
    @Override
    public final Object get(final Object o) {
        return this.a.get(o);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    Object writeReplace() {
        return new nnl(this.a);
    }
}
