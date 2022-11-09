// 
// Decompiled by Procyon v0.6.0
// 

final class nly extends nma
{
    public static final nly a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new nly();
    }
    
    private nly() {
        super(null);
    }
    
    private Object readResolve() {
        return nly.a;
    }
    
    @Override
    public final int a(final nma nma) {
        if (nma == this) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }
    
    @Override
    public final Comparable c(final nmf nmf) {
        throw new AssertionError();
    }
    
    @Override
    public final Comparable d(final nmf nmf) {
        return ((nme)nmf).d();
    }
    
    @Override
    public final void e(final StringBuilder sb) {
        sb.append("(-\u221e");
    }
    
    @Override
    public final void f(final StringBuilder sb) {
        throw new AssertionError();
    }
    
    @Override
    public final boolean g(final Comparable comparable) {
        return true;
    }
    
    @Override
    public final nma h(final nmf nmf) {
        throw new IllegalStateException();
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }
    
    @Override
    public final nma i(final nmf nmf) {
        throw new AssertionError((Object)"this statement should be unreachable");
    }
    
    @Override
    public final String toString() {
        return "-\u221e";
    }
}
