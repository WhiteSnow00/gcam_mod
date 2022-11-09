import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class nof extends nnj
{
    public final nnx a;
    
    public nof(final nnx a) {
        this.a = a;
    }
    
    @Override
    public final nrv bN() {
        return new noc(this);
    }
    
    @Override
    public final boolean bO() {
        throw null;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o != null) {
            final nrv bn = this.bN();
            while (bn.hasNext()) {
                if (o.equals(bn.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final nns v() {
        return new nod(this.a.s().v());
    }
    
    @Override
    Object writeReplace() {
        return new noe(this.a);
    }
}
