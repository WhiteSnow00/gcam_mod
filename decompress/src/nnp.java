import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnp extends nns
{
    private final transient nns a;
    
    public nnp(final nns a) {
        this.a = a;
    }
    
    private final int B(final int n) {
        return this.size() - n;
    }
    
    private final int w(final int n) {
        return this.size() - 1 - n;
    }
    
    @Override
    public final nns a() {
        return this.a;
    }
    
    @Override
    public final nns b(final int n, final int n2) {
        njo.n(n, n2, this.size());
        return this.a.b(this.B(n2), this.B(n)).a();
    }
    
    @Override
    public final boolean bO() {
        return this.a.bO();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    @Override
    public final Object get(final int n) {
        njo.v(n, this.size());
        return this.a.get(this.w(n));
    }
    
    @Override
    public final int indexOf(final Object o) {
        final int lastIndex = this.a.lastIndexOf(o);
        if (lastIndex >= 0) {
            return this.w(lastIndex);
        }
        return -1;
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        final int index = this.a.indexOf(o);
        if (index >= 0) {
            return this.w(index);
        }
        return -1;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
